package Tests;

import Base.BasePage;
import Pages.CreateRolePage;
import Pages.CreateUserPage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

@Listeners(Utilities.TestListeners.class)
public class LoginTest extends BasePage {
    static ProjectPage ProjectPageObj;
    static LoginPage loginPageObjects;
    static CreateUserPage userobj;
    static CreateRolePage CreateRolePageObj;


    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }

    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }


    @Test(priority = 1)
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
    @Test(priority = 2)
    public static void login_with_invalid_username_and_blank_password() throws Exception {
        //TC 14.2 - Login with Invalid Username and Blank Password for Platform Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("InvalidUsername"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Test(priority = 3)
    public static void login_with_blank_username_and_valid_password() throws Exception {
        //TC 14.3 - Login with Blank Username and Valid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Test(priority = 4)
    public static void login_with_blank_username_and_invalid_password() throws Exception {
        //TC 14.4 - Login with Blank Username and Invalid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Test(priority = 5)
    public static void login_with_valid_username_and_blank_password() throws Exception {
        //TC 14.5 - Login with Valid Username and Blank Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
        loginPageObjects.RefreshPage();
    }

    @Test(priority = 6)
    public static void login_with_invalid_username_and_password() throws Exception {
        //TC 14.6 - Login with Invalid Username and Password for Platform Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("InvalidUsername"));
        loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 7)
    public static void login_with_invalid_username_and_valid_password() throws Exception {
        //TC 14.7 - Login with Invalid Username and Valid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("InvalidUsername"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 8)
    public static void login_with_valid_username_and_invalid_password() throws Exception {
        //TC 14.8 - Login with Valid Username and Invalid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }
    @Test(priority = 9)
    public static void login_with_valid_username_and_usernameUseAsA_password() throws Exception {
        //TC 14.8 - Login with Valid Username and Invalid Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("UserID"));
        loginPageObjects.clickLoginButtonForValidInput();
    }


    @Test(priority = 10)
    public static void login_with_valid_username_and_password() throws Exception {
        //TC 14.9 Login with Valid Username and Password for Platform Admin.
        loginPageObjects.RefreshPage();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();


    }



    @Test(priority = 12)
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
    @Test(priority = 13)
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



    @Test(priority = 14)
    public static void navigate_backward() throws Exception {
        //TC 14.10 - Navigate Backward for Platform Admin.
        loginPageObjects.NavigateBack();


    }

    @Test(priority = 15)
    public static void logout_for_platform_admin() throws Exception
    {
        //TC 14.11 - Logout for Platform Admin.

        loginPageObjects.ClickLogoutBtn();
    }
    @Test(priority = 16)
    public static void login_with_invalid_username_password() throws Exception {
        //TC 14.2 - Admin Login with Invalid Username and Password.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Test(priority = 17)
    public static void login_with_invalid_username_and_valid_password_for_admin() throws Exception {
        //TC 14.13 - Admin Login with Invalid Username and Valid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("AdminInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();


    }

    @Test(priority = 18)
    public static void login_with_valid_username_and_invalid_password_admin() throws Exception {
        //TC 14.14 - Admin Login with Valid Username and Invalid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("AdminUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 19)
    public static void login_with_valid_username_and_password_admin() throws Exception {
        //TC 14.15 Admin Role Login with Valid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButtonForValidInput();


    }
    @Test(priority = 20)
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

    @Test(priority = 21)
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

    @Test(priority = 22)
    public static void login_with_invalid_username_and_password_supervisor() throws Exception {
        //TC 14.16 Supervisor Role Login with InValid Username and Password.
        loginPageObjects.RefreshPage();

        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();

    }

    @Test(priority = 23)
    public static void login_with_invalid_username_and_valid_password_supervisor() throws Exception {
        //TC 14.17 - Supervisor Role  Login with Invalid Username and Valid Password.
        loginPageObjects.RefreshPage();

        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 24)
    public static void login_with_valid_username_and_invalid_password_supervisor() throws Exception {
        //TC 14.18 - Supervisor Role  Login with Valid Username and Invalid Password.
        loginPageObjects.RefreshPage();

        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 25)
    public static void login_with_valid_username_and_password_supervisor() throws Exception {
        //TC 14.19 Supervisor Role Valid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("SupervisorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
        loginPageObjects.clickLoginButtonForValidInput();
        loginPageObjects.ClickLogoutBtn();
    }

    @Test(priority = 26)
    public static void login_with_invalid_username_and_password_for_operator() throws Exception {
        //TC 14.20 - Operator Role  Login with Invalid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 27)
    public static void login_with_invalid_username_and_valid_password_for_operator() throws Exception {
        //TC 14.21 - Operator Role  Login with Invalid Username and Valid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorInvalidUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 28)
    public static void login_with_valid_username_and_invalid_password_for_operator() throws Exception {
        //TC 14.22 - Operator ROle  Login with Valid Username and Invalid Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
        loginPageObjects.clickOnLoginButtonForInvalidInput();
    }

    @Test(priority = 29)
    public static void login_with_valid_username_and_password_for_operator() throws Exception {
        //TC 14.23 Operator Role Login with Valid Username and Password.
        loginPageObjects.RefreshPage();
        loginPageObjects.EnterUsername(ReadProps.readAttr("OperatorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
        loginPageObjects.clickLoginButtonForValidInput();

        Thread.sleep(4000);
    }

    @Test(priority = 30)
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

    @Test(priority = 31)
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
    @Test(priority = 32)
    public static  void password_contains_only_uppercase() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("uppercasepass"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);

    }
    @Test(priority =33)
    public static void password_contains_specialsymbols() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("specail"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);
    }
    @Test(priority =34)
    public static void password_contains_digit() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("digit"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);

    }
    @Test(priority =35)
    public static void password_should_same_as_loginid() throws Exception{
        loginPageObjects.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("UserID"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(3000);

    }


}