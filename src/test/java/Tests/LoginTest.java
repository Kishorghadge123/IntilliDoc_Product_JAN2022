package Tests;

import Base.BasePage;
import Pages.CreateRolePage;
import Pages.CreateUserPage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
@Feature("Login Test")
@Listeners(Utilities.TestListeners.class)
public class LoginTest extends BasePage {
    static ProjectPage ProjectPageObj;
    static LoginPage loginPageObjects;
    static CreateUserPage userobj;
    static CreateRolePage CreateRolePageObj;

    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  - verification_of_title_logo_and_login_with_blank_details")
    @Description("verification_of_title_logo_and_login_with_blank_details")
    @Test (priority=1,groups="smoke", description = "verification_of_title_logo_and_login_with_blank_details")
    public static void verification_of_title_logo_and_login_with_blank_details() throws Exception {
        //Object creation
        loginPageObjects = new LoginPage(driver);
        ProjectPageObj = new ProjectPage(driver);
        userobj = new CreateUserPage(driver);
        CreateRolePageObj = new CreateRolePage(driver);
        driver.get(ReadProps.readAttr("URL"));
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "IntelliDoc";
        assertEquals(expectedTitle, actualTitle);
        System.out.println("Title Match");
        driver.manage().window().maximize();
        // Identify Logo
        WebElement i = driver.findElement(By.xpath("//img[contains(@class,'img-fluid login-logo')]"));
        Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
        //Verify logo Matched or not.
        if (p) {
            System.out.println("Logo Matched!");
        } else {
            System.out.println("Logo Unmatched!");
        }
        //TC 14.1 - Login with Blank Username and Blank Password for Platform Admin.
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - login_with_invalid_username_and_blank_password")
    @Description("Verify use unable to login_with_invalid_username_and_blank_password")
    @Test (priority=2,groups="smoke", description = " verify login_with_invalid_username_and_blank_password")
    public static void login_with_invalid_username_and_blank_password() throws Exception {
        //TC 14.2 - Login with Invalid Username and Blank Password for Platform Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("InvalidUsername"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  - login_with_blank_username_and_valid_password")
    @Description("Verify use unable to login_with_invalid_username_and_blank_password")
    @Test (priority=3,groups="smoke", description = " verify login_with_invalid_username_and_blank_password")

    public static void login_with_blank_username_and_valid_password() throws Exception {
        //TC 14.3 - Login with Blank Username and Valid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - login_with_blank_username_and_invalid_password")
    @Description("verification_login_with_blank_username_and_invalid_password")
    @Test (priority=4,groups="smoke", description = "verification_of_title_logo_and_login_with_blank_details")

    public static void login_with_blank_username_and_invalid_password() throws Exception {
        //TC 14.4 - Login with Blank Username and Invalid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - login_with_valid_username_and_blank_password")
    @Description("verification_login_with_valid_username_and_blank_password")
    @Test (priority=5,groups="smoke", description = "verification_login_with_valid_username_and_blank_password")
    public static void login_with_valid_username_and_blank_password() throws Exception {
        //TC 14.5 - Login with Valid Username and Blank Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
        loginPageObjects.RefreshPage();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006  - login_with_invalid_username_and_password")
    @Description("verification_login_with_invalid_username_and_password")
    @Test (priority=6,groups="smoke", description = "login_with_invalid_username_and_password")

    public static void login_with_invalid_username_and_password() throws Exception {
        //TC 14.6 - Login with Invalid Username and Password for Platform Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("InvalidUsername"));
        loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007  - login_with_invalid_username_and_valid_password")
    @Description("verification_login_with_invalid_username_and_valid_password")
    @Test (priority=7,groups="smoke", description = "login_with_invalid_username_and_valid_password")

    public static void login_with_invalid_username_and_valid_password() throws Exception {
        //TC 14.7 - Login with Invalid Username and Valid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("InvalidUsername"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008  - login_with_valid_username_and_invalid_password")
    @Description("verification_login_with_valid_username_and_invalid_password")
    @Test (priority=8,groups="smoke", description = "login_with_valid_username_and_invalid_password")
    public static void login_with_valid_username_and_invalid_password() throws Exception {
        //TC 14.8 - Login with Valid Username and Invalid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009  - login_with_valid_username_and_usernameUseAsA_password")
    @Description("verification_login_with_valid_username_and_usernameUseAsA_password")
    @Test (priority=9,groups="smoke", description = "login_with_valid_username_and_usernameUseAsA_password")

    public static void login_with_valid_username_and_usernameUseAsA_password() throws Exception {
        //TC 14.8 - Login with Valid Username and Invalid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("UserID"));
        loginPageObjects.clickLoginButtonForValidInput();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010  - login_with_valid_username_and_password")
    @Description("verification_login_with_valid_username_and_password")
    @Test (priority=10,groups="smoke", description = "login_with_valid_username_and_password")

    public static void login_with_valid_username_and_password() throws Exception {
        //TC 14.9 Login with Valid Username and Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012  - disableUserLogin")
    @Description("verification_disableUserLogin")
    @Test (priority=12,groups="smoke", description = "platfomrAdminAccess")

    public static void disableUserLogin() throws Exception
    {
        userobj.clickOnUserMenu();
        userobj.SearchCreatedUser("QAuser ");
        userobj.selectSearchedUser();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.clickOnUpdateUserButton();
        loginPageObjects.ClickLogoutBtn();

        loginPageObjects.EnterUsername("Qa Super");
        loginPageObjects.setPassword("Suwarna@123");
        loginPageObjects.clickOnLoginButtonForInvalidInput();

        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();
        userobj.clickOnUserMenu();
        userobj.selectSearchedUser();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.clickOnUpdateUserButton();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013  - disableProjectAccess")
    @Description("verification_disableProjectAccess")
    @Test (priority=13,groups="smoke", description = "Verify disableProjectAccess")

    public static void disableProjectAccess() throws Exception
    {
        ProjectPageObj.ClickOnProjectBtn();
        ProjectPageObj.SearchProjectForStatus("PRO");
        ProjectPageObj.ClickOnEditProject();
        //ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnUpdateProject();

        ProjectPageObj.SearchProjectForStatus("PRO");
        ProjectPageObj.TableStructure();
        ProjectPageObj.ClickOnEditProject();
        //ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnUpdateProject();
        driver.navigate().refresh();


    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 014  - navigate_backward")
    @Description("verification_navigate_backward")
    @Test (priority=14,groups="smoke", description = "Verify navigate_backward")

    public static void navigate_backward() throws Exception {
        //TC 14.10 - Navigate Backward for Platform Admin.
        loginPageObjects.NavigateBack();


    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 015  - logout_for_platform_admin")
    @Description("verification_logout_for_platform_admin")
    @Test (priority=15,groups="smoke", description = "Verify logout_for_platform_admin")

    public static void logout_for_platform_admin() throws Exception
    {
        //TC 14.11 - Logout for Platform Admin.

        loginPageObjects.ClickLogoutBtn();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 016  - login_with_invalid_username_password")
    @Description("verification_login_with_invalid_username_password")
    @Test (priority=16,groups="smoke", description = "Verify login_with_invalid_username_password")


    public static void login_with_invalid_username_password() throws Exception {
        //TC 14.2 - Admin Login with Invalid Username and Password.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 017  - login_with_invalid_username_and_valid_password_for_admin")
    @Description("verification_login_with_invalid_username_and_valid_password_for_admin")
    @Test (priority=17,groups="smoke", description = "Verify login_with_invalid_username_and_valid_password_for_admin")
    public static void login_with_invalid_username_and_valid_password_for_admin() throws Exception {
        //TC 14.13 - Admin Login with Invalid Username and Valid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("AdminInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();


    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 018  - login_with_valid_username_and_invalid_password_admin")
    @Description("verification_login_with_valid_username_and_invalid_password_admin")
    @Test (priority=18,groups="smoke", description = "Verify login_with_valid_username_and_invalid_password_admin")
    public static void login_with_valid_username_and_invalid_password_admin() throws Exception {
        //TC 14.14 - Admin Login with Valid Username and Invalid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("AdminUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 019  - login_with_valid_username_and_password_admin")
    @Description("verification_login_with_valid_username_and_password_admin")
    @Test (priority=19,groups="smoke", description = "Verify login_with_valid_username_and_password_admin")
    public static void login_with_valid_username_and_password_admin() throws Exception {
        //TC 14.15 Admin Role Login with Valid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 020  - disableUserLoginByAdmin")
    @Description("verification_disableUserLoginByAdmin")
    @Test (priority=20,groups="smoke", description = "Verify disableUserLoginByAdmin")
    public static void disableUserLoginByAdmin() throws Exception
    {

        userobj.clickOnUserMenu();
        Thread.sleep(3000);
        userobj.SearchCreatedUser("Qa");
        userobj.selectSearchedUser();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.clickOnUpdateUserButton();
        loginPageObjects.ClickLogoutBtn();
        Thread.sleep(6000);


        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(6000);
        userobj.clickOnUserMenu();
        Thread.sleep(3000);
        userobj.SearchCreatedUser("Qa");
        userobj.selectSearchedUser();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.clickOnUpdateUserButton();



    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 021  - disableProjectAccessAdmin")
    @Description("verification_disableProjectAccessAdmin")
    @Test (priority=21,groups="smoke", description = "Verify disableProjectAccessAdmin")


    public static void disableProjectAccessAdmin() throws Exception
    {

        ProjectPageObj.ClickOnProjectBtn();

        ProjectPageObj.SearchProjectForStatus("BRE");
        ProjectPageObj.ClickOnEditProject();
        //     ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnUpdateProject();

        ProjectPageObj.SearchProjectForStatus("BRE");
        ProjectPageObj.TableStructure();
        ProjectPageObj.ClickOnEditProject();
        //ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnUpdateProject();

        loginPageObjects.ClickLogoutBtn();



    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 022  - login_with_invalid_username_and_password_supervisor")
    @Description("verification_login_with_invalid_username_and_password_supervisor")
    @Test (priority=22,groups="smoke", description = "Verify login_with_invalid_username_and_password_supervisor")

    public static void login_with_invalid_username_and_password_supervisor() throws Exception {
        //TC 14.16 Supervisor Role Login with InValid Username and Password.
        loginPageObjects.RefreshPage();

        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 023  - login_with_invalid_username_and_valid_password_supervisor")
    @Description("verification_login_with_invalid_username_and_valid_password_supervisor")
    @Test (priority=23,groups="smoke", description = "Verify login_with_invalid_username_and_valid_password_supervisor")

    public static void login_with_invalid_username_and_valid_password_supervisor() throws Exception {
        //TC 14.17 - Supervisor Role  Login with Invalid Username and Valid Password.
        loginPageObjects.RefreshPage();

        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 024  - login_with_valid_username_and_invalid_password_supervisor")
    @Description("verification_login_with_valid_username_and_invalid_password_supervisor")
    @Test (priority=24,groups="smoke", description = "Verify login_with_valid_username_and_invalid_password_supervisor")

    public static void login_with_valid_username_and_invalid_password_supervisor() throws Exception {
        //TC 14.18 - Supervisor Role  Login with Valid Username and Invalid Password.
        loginPageObjects.RefreshPage();

        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 025  - login_with_valid_username_and_password_supervisor")
    @Description("verification_login_with_valid_username_and_password_supervisor")
    @Test (priority=25,groups="smoke", description = "Verify login_with_valid_username_and_password_supervisor")

    public static void login_with_valid_username_and_password_supervisor() throws Exception {
        //TC 14.19 Supervisor Role Valid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
        loginPageObjects.clickLoginButtonForValidInput();
        loginPageObjects.ClickLogoutBtn();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 026  - login_with_invalid_username_and_password_for_operator")
    @Description("verification_login_with_valid_username_and_password_supervisor")
    @Test (priority=26,groups="smoke", description = "Verify login_with_valid_username_and_password_supervisor")
    public static void login_with_invalid_username_and_password_for_operator() throws Exception {
        //TC 14.20 - Operator Role  Login with Invalid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 027  - login_with_invalid_username_and_valid_password_for_operator")
    @Description("verification_login_with_invalid_username_and_valid_password_for_operator")
    @Test (priority=27,groups="smoke", description = "Verify login_with_invalid_username_and_valid_password_for_operator")


    public static void login_with_invalid_username_and_valid_password_for_operator() throws Exception {
        //TC 14.21 - Operator Role  Login with Invalid Username and Valid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 028  - login_with_valid_username_and_invalid_password_for_operator")
    @Description("verification_login_with_valid_username_and_invalid_password_for_operator")
    @Test (priority=28,groups="smoke", description = "Verify login_with_valid_username_and_invalid_password_for_operator")

    public static void login_with_valid_username_and_invalid_password_for_operator() throws Exception {
        //TC 14.22 - Operator ROle  Login with Valid Username and Invalid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 029  - login_with_valid_username_and_password_for_operator")
    @Description("verification_login_with_valid_username_and_password_for_operator")
    @Test (priority=29,groups="smoke", description = "Verify login_with_valid_username_and_password_for_operator")

    public static void login_with_valid_username_and_password_for_operator() throws Exception {
        //TC 14.23 Operator Role Login with Valid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
        loginPageObjects.clickLoginButtonForValidInput();

        Thread.sleep(4000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 030  - disable_created_user")
    @Description("disable_created_user")
    @Test (priority=30,groups="smoke", description = "Verify disable_created_user")

    public static void disable_created_user() throws Exception {

        userobj.clickOnUserMenu();
        Thread.sleep(4000);
        userobj.SearchCreatedUser(" Qa");
        userobj.selectSearchedUser();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.clickOnUpdateUserButton();
        Thread.sleep(4000);
        loginPageObjects.ClickLogoutBtn();
        Thread.sleep(4000);


    }






    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 031  - disable_created_role")
    @Description("disable_created_role")
    @Test (priority=31,groups="smoke", description = "Verify disable_created_role")

    public static void disable_created_role() throws Exception {
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();

        Thread.sleep(4000);
        CreateRolePageObj.ClickRoleManagementBtn();
       Thread.sleep(4000);
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("role1"));//Change everytime before u ran
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getSearch_created_role_element()));
        Thread.sleep(1000);
        CreateRolePageObj.clickOncreatedrole();
        Thread.sleep(2000);
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        userobj.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(3000);
        userobj.clickOnUpdateUserButton();
       Thread.sleep(3000);
        loginPageObjects.ClickLogoutBtn();
        Thread.sleep(3000);
        loginPageObjects.EnterUsername(ReadProps.readAttr("Roleusername"));
        loginPageObjects.setPassword(ReadProps.readAttr("Rolepassword"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);


    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 032  - password_contains_only_uppercase")
    @Description("password_contains_only_uppercase")
    @Test (priority=32,groups="smoke", description = "Verify disable_created_role")

    public static  void password_contains_only_uppercase() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("uppercasepass"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 033  - password_contains_specialsymbols")
    @Description("password_contains_specialsymbols")
    @Test (priority=33,groups="smoke", description = "Verify disable_created_role")

    public static void password_contains_specialsymbols() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("specail"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 034  -  password_contains_digit")
    @Description(" password_contains_digit")
    @Test (priority=34,groups="smoke", description = "Verify  password_contains_digit")

    public static void password_contains_digit() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("digit"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 035  -   password_should_same_as_loginid")
    @Description(" password_should_same_as_loginid")
    @Test (priority=35,groups="smoke", description = "Verify   password_should_same_as_loginid")

    public static void password_should_same_as_loginid() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("UserID"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);

    }


}