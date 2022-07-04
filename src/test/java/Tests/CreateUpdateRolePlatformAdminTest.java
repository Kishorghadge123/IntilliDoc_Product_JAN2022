package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.Custome_Wait;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static Pages.CreateRolePage.*;
import static Pages.CreateRolePage.errormsgBlankDataCreateRoleClick;

@Feature("Create Update Role Platform AdminTest")
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRolePlatformAdminTest extends BasePage
{
    static CreateRolePage CreateRolePageObj ;

    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001 - create role with blank rolename permission")
    @Description("verify user able to create role with blank rolename permission")
    @Test (priority=1,groups="smoke", description = "verify create role with blank rolename permission")
    public void create_role_with_blank_rolename_permission() throws Exception {
        CreateRolePageObj = new CreateRolePage(driver);
        CreateRolePageObj.ClickRoleManagementBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        //TC 3.1 Create Role with Blank RoleName and Permission.
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(CreateRolePageObj.ClickCreate);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - create role with_valid_rolename_blank_permission")
    @Description("verify user able to create role with blank rolename permission")
    @Test (priority=2,groups="smoke", description = "verify create role with blank rolename permission")

    public void create_role_with_valid_rolename_blank_permission() throws Exception {
        //TC 3.2 Create Role with Valid RoleName and Blank Permission.
        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(CreateRolePageObj.ClickCreate);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - create_role_with_blank_rolename_valid permission")
    @Description("verify user able to create_role_with_blank_rolename_valid_permission")
    @Test (priority=3,groups="smoke", description = "verify create_role_with_blank_rolename_valid_permission")
    public void create_role_with_blank_rolename_valid_permission() throws Exception {
        //TC 3.3 Create Role with Blank RoleName and Valid Permission.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(4000);
        CreateRolePageObj.AddPermissionPlusBtn();
        CreateRolePageObj.SelectViewDocumentPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(CreateRolePageObj.ClickCreate);
        Thread.sleep(1000);
    }
         /*   // Create AE admin role
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("AdminRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectCreateUserPermission();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateProject();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewUser();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateProject();
            Thread.sleep(1000);
            CreateRolePageObj.SelectUpdateUser();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateTemplate();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateRole();
            Thread.sleep(1000);
            CreateRolePageObj.SelectViewAnalytics();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);
*/

    // Create AE supervisor Role
        /*    CreateRolePageObj.EnterRoleName(ReadProps.readAttr("SupervisorRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            CreateRolePageObj.SelectCreateTemplate();
            Thread.sleep(1000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);*/

    /* //Create AE Operator Role
     CreateRolePageObj.EnterRoleName(ReadProps.readAttr("OperatorRole"));
     Thread.sleep(4000);
     CreateRolePageObj.ClickActiveRole();
     Thread.sleep(4000);
     CreateRolePageObj.AddPermissionPlusBtn();
     Thread.sleep(4000);
     CreateRolePageObj.SelectViewDocumentPermission();
     Thread.sleep(1000);
     CreateRolePageObj.ClickProcessDocPermission();
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_ESCAPE);
     Thread.sleep(3000);
     CreateRolePageObj.ClickCreateButton();
     Thread.sleep(4000);*/


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004 - create_role_with_valid_rolename_permission")
    @Description("verify user able to create_role_with_valid_rolename_permission")
    @Test (priority=4,groups="smoke", description = "verify create_role_with_valid_rolename_permission")
    public void create_role_with_valid_rolename_permission() throws Exception {
        //TC 3.4 Create Role with Valid Role Name and Permission.
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        CreateRolePageObj.AddPermissionPlusBtn();
        CreateRolePageObj.SelectViewDocumentPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(5000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - create_role_with_existing_name")
    @Description("verify user able to create_role_with_existing_name")
    @Test (priority=5,groups="smoke", description = "verify create_role_with_existing_name")
    public void create_role_with_existing_name() throws Exception {
        //TC 3.5 Create Role with Existing Name.
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        Thread.sleep(3000);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("RoleNamePA"));
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(4000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006 - search_created_role")
    @Description("verify user able to search_created_role")
    @Test (priority=6,groups="smoke", description = "verify search_created_role ")
    public void search_created_role() throws Exception {
        //TC 3.6 Search the Created Role.
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleNamePA"));
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getSearch_created_role_element()));
    }
 // added
 @Severity(SeverityLevel.NORMAL)
 @Story("story_id: 007 - ClickOnCancelBtnOn_RoleUpdation")
 @Description("verify user able to ClickOnCancelBtnOn_RoleUpdation")
 @Test (priority=7,groups="smoke", description = "verify ClickOnCancelBtnOn_RoleUpdation")

 public void ClickOnCancelBtnOn_RoleUpdation() throws Exception {
        //3.15 Verify functionality of Cancel button on Role Updation Page.
        Thread.sleep(2000);
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008 - update_role_with_valid_data")
    @Description("verify user able to update_role_with_valid_data")
    @Test (priority=8,groups="smoke", description = "verify update_role_with_valid_data ")
    public void update_role_with_valid_data() throws Exception {
        //TC 3.7 Update Role with Valid Data.
        //Tc 3.15Verify functionality of Cancel button on Role Updation Page.
        Thread.sleep(2000);
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(3000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009 - remove_all_permissions_update")
    @Description("verify user able to remove_all_permissions_update")
    @Test (priority=9,groups="smoke", description = "verify remove_all_permissions_update ")
    public void remove_all_permissions_update() throws Exception {
        //TC 3.8 Remove all Permissions and Update.
        Thread.sleep(2000);
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        AssertionsFunction.isPresent(CreateRolePageObj.ClickUpdateBtn);
        Thread.sleep(2000);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 010 - adding_new_permission")
    @Description("verify user able to adding_new_permission")
    @Test (priority=10,groups="smoke", description = "verify adding_new_permission ")

    public void adding_new_permission() throws InterruptedException, AWTException {
        CreateRolePageObj.AddPermissionPlusBtn();
        CreateRolePageObj.ClickViewApiConfig();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011 - disable_status_role_update")
    @Description("verify user able to disable_status_role_update")
    @Test (priority=11,groups="smoke", description = "verify disable_status_role_update ")

    public void disable_status_role_update() throws Exception {
        //TC 3.9 Disable Status of Role and Update.
        Thread.sleep(2000);
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 012 - enable_status_role_update")
    @Description("verify user able to enable_status_role_update")
    @Test (priority=12,groups="smoke", description = "verify enable_status_role_update ")

    public void enable_status_role_update() throws Exception {
        //TC 3.10 Enable the Status of Role and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 013 - CreateRole_with_Valid_Rolename_Valid_Permission_with_Active")
    @Description("verify user able to CreateRole_with_Valid_Role-name_Valid_Permission_with_Active")
    @Test (priority=13,groups="smoke", description = "verify CreateRole_with_Valid_Rolename_Valid_Permission_with_Active ")

    public void  CreateRole_with_Valid_Rolename_Valid_Permission_with_Active() throws Exception {
        //TC 3.2 Verify the Roles functionality of the Platform Admin to Create Role with  Valid Rolename and Valid Permission with Active.
        Thread.sleep(4000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleNamePAA"));//Change everytime before u ran
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.AddPermissionPlusBtn();
        CreateRolePageObj.SelectViewDocumentPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.isPresent(CreateRolePageObj.Cancel);
        Thread.sleep(4000);


    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 014 - ClickOn_Cancel_button_on_Role_Creation_Page")
    @Description("verify user able to ClickOn_Cancel_button_on_Role_Creation_Pagee")
    @Test (priority=14,groups="smoke", description = "verify ClickOn_Cancel_button_on_Role_Creation_Page ")

    public void ClickOn_Cancel_button_on_Role_Creation_Page() throws Exception {
        //TC 3.7  Verify functionality of Cancel button on Role Creation Page.
        Thread.sleep(4000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.isPresent(CreateRolePageObj.Cancel);
        Thread.sleep(4000);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 015 - validation_Role_Name_New_Role_creation_Page")
    @Description("verify user able to validation_Role_Name_New_Role_creation_Page")
    @Test (priority=15,groups="smoke", description = "verify validation_Role_Name_New_Role_creation_Page ")
    public void validation_Role_Name_New_Role_creation_Page() throws Exception {
        //TC 3.8 Verify the validation of Role Name textbox on New Role creation Page.
        Thread.sleep(10000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.AddPermissionPlusBtn();
        CreateRolePageObj.SelectViewDocumentPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getViewDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.isPresent(CreateRolePageObj.Cancel);
        Thread.sleep(4000);
    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 016 - Creating_role_with_invalid_data")
    @Description("verify user able to Creating_role_with_invalid_data")
    @Test (priority=16,groups="smoke", description = "verify Creating_role_with_invalid_data ")
    public void Creating_role_with_invalid_data() throws Exception {
        //3.14 Verify the working of platform admin for Creating role by putting invalid data.
        Thread.sleep(10000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(1000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
        CreateRolePageObj.ClickLogout();
        Thread.sleep(9000);
        AssertionsFunction.verifyTargetPageURL(loginPage_url);
    }
}