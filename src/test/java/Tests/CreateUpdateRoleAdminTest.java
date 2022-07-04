package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.Functions;
import io.qameta.allure.*;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static Pages.CreateRolePage.*;

@Feature("Create Update Role AdminTest")
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
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
    @Story("story_id: 001 - login with valid details")
    @Description("verify user able to login with valid details")
    @Test (priority=1,groups="smoke", description = "verify login with valid details")

    public void login_with_valid_details() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        CreateRolePageObj = new CreateRolePage(driver);
        //TC 2.1 Login with Valid Admin details.
        CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        CreateRolePageObj.ClickLoginButton();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        CreateRolePageObj.ClickRoleManagementBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);

        driver.navigate().back();
        Thread.sleep(3000);
        //Assert.assertEquals(errormsg,errormsgBlankDataCreateRoleClick);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - blank role name permission")
    @Description("verify user able to blank role name permission")
    @Test (priority=2,groups="smoke", description = "verify blank role name permission")
    public void blank_role_name_permission() throws Exception {
        //TC 2.2 Blank RoleName and Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        Thread.sleep(1000);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - valid role name blank permission")
    @Description("verify user able to valid role name blank permission")
    @Test (priority=3,groups="smoke", description = "verify valid role name blank permission")
    public void valid_role_name_blank_permission() throws Exception {
        //TC 2.3 Valid RoleName and Blank Permission.
        CreateRolePageObj.ClickCreateRoleBtn();

        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Custome_Wait.wait(driver,CreateRolePage.ActiveRole);
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);


    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004 - valid blank role name valid permission")
    @Description("verify user able to valid role name permission")
    @Test (priority=4,groups="smoke", description = "verify blank valid role name permission")
    public void blank_role_name_valid_permission() throws Exception {
        //TC 2.4 Blank RoleName and Valid Permission.
        //TC2.8  Verify the working of admin for Create role button when user status is enabled

        CreateRolePageObj.ClickCreateRoleBtn();
Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(3000);
        //Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' Create Template ' )]")));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(4000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);

    }
//
//    //need to change
@Severity(SeverityLevel.NORMAL)
@Story("story_id: 005 - valid_role_and_permission")
@Description("verify user able to valid_role_and_permission")
@Test (priority=5,groups="smoke", description = "verify valid role name permission")
    public void valid_role_and_permission() throws Exception {
        //TC 2.5 Valid Role and Valid Permission.
        CreateRolePageObj.ClickCreateRoleBtn();

        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u run
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        String expectedDate = Functions.getCurrentDate();
        System.out.println("expectedDate="+expectedDate);
        //System.out.println("driver.findElement(CreatedTime).getText()="+driver.findElement(CreatedTime).getText());
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(2000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006 - create role with existing rolename")
    @Description("verify user able to create role with existing rolename")
    @Test (priority=6,groups="smoke", description = "verify create role with existing rolename")
    public void create_role_with_existing_rolename() throws Exception {
        //TC 2.6 Create Role with Existing Role Name.

        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007 - search created role")
    @Description("verify user able to search created role")
    @Test (priority=7,groups="smoke", description = "verify search created rolen")

    public void search_created_role() throws Exception {
        //TC 2.7 Search the Created Role or not
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getSearch_created_role_element()));

        Thread.sleep(2000);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008 - update role with valid data")
    @Description("verify user able to update role with valid data")
    @Test (priority=8,groups="smoke", description = "verify update role with valid data")

    public void update_role_with_valid_data() throws Exception {
        //TC 2.8 Update Role with Valid Data.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009 - remove all permissions")
    @Description("verify user able to remove all permissions")
    @Test (priority=9,groups="smoke", description = "verify remove all permissions")
    public void remove_all_permissions() throws Exception {
        //TC 2.9 Remove All Permissions and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(2000);



    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0010 - disable the status of role update")
    @Description("verify user able to disable the status of role update")
    @Test (priority=10,groups="smoke", description = "verify disable the status of role update")
    public void disable_the_status_of_role_update() throws Exception {
        //TC 2.10 Disable the Status of Role and Update.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(CreateRolePageObj.ClickUpdateBtn);



    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0011 - disable the status of role update")
    @Description("verify user able to disable the status of role update")
    @Test (priority=11,groups="smoke", description = "verify disable the status of role update")
    public void enable_status_role_update() throws Exception {
        //TC 2.11 Enable the Status of Role and Update.
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(CreateRolePageObj.ClickUpdateBtn);
        Thread.sleep(1000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);



    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0012 - Creating role invalid data in RoleName Permissions")
    @Description("verify user able to Creating role invalid data in RoleName Permissions")
    @Test (priority=12,groups="smoke", description = "verify Creating role invalid data in RoleName Permissions")
    public void Creating_role_invalid_data_in_RoleName_Permissions() throws Exception {
        //TC-3.2 Verify the working of admin for Creating role by putting invalid data in Role name, blank Permissions
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0013 - Creating role invalid data with disabled status")
    @Description("verify user able to Creating role invalid data with disabled status")
    @Test (priority=13,groups="smoke", description = "verify Creating role invalid data with disabled status")
    public void Creating_role_invalid_data_with_disabled_status() throws Exception {
        //TC 3.5 Verify the working of admin for Create role button when user status is disabled

        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        Thread.sleep(1000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0014 - Updating role invalid data Rolename Permissions")
    @Description("verify user able to Updating role invalid data Rolename Permissions")
    @Test (priority=14,groups="smoke", description = "verify Updating role invalid data Rolename Permissions")
    public void Updating_role_invalid_data_RolenamePermissions() throws Exception {
        //TC 4.2  Verify the working of admin for Updating the role by putting invalid data in Role name,Permissions
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        Assert.assertTrue(AssertionsFunction.is_Enabled(CreateRolePageObj.RoleName));
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0015 - Sorting role")
    @Description("verify user able to Sorting role")
    @Test (priority=15,groups="smoke", description = "Sorting role")

    public void Sorting_role() throws InterruptedException {
        //TC 6.1 Sorting by role, permission,updated,created
        Thread.sleep(3000);
        CreateRolePageObj.ClickSortRoleBtn();
        Thread.sleep(3000);


    }




    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 0016- sorting_on_role_permission_updated_created")
    @Description("verify user able to Sorting role")
    @Test (priority=16,groups="smoke", description = "sorting_on_role_permission_updated_created")

    public  void sorting_on_role_permission_updated_created() throws Exception{
        //IN2.16 Sorting by role, permission,updated,created
        CreateRolePageObj.rolesorting();
        CreateRolePageObj.permissionsorting();
        CreateRolePageObj.updatedsorting();
        CreateRolePageObj.createdsorting();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);


    }

}