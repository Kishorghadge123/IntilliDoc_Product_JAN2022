package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRolePlatformAdminTest extends BasePage
{
    static CreateRolePage CreateRolePageObj ;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void create_role_with_blank_rolename_permission() throws Exception {
        CreateRolePageObj = new CreateRolePage(driver);
        CreateRolePageObj.ClickRoleManagementBtn();
        Thread.sleep(6000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        //TC 3.1 Create Role with Blank RoleName and Permission.
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void create_role_with_valid_rolename_blank_permission() throws Exception {
        //TC 3.2 Create Role with Valid RoleName and Blank Permission.
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        Robot r = new Robot();
    }
    @Test(priority = 3)
    public void create_role_with_blank_rolename_valid_permission() throws Exception {
        //TC 3.3 Create Role with Blank RoleName and Valid Permission.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(4000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(4000);
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
    @Test(priority = 4)
    public void create_role_with_valid_rolename_permission() throws Exception {
        //TC 3.4 Create Role with Valid Role Name and Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(5000);
    }
    @Test(priority = 5)
    public void create_role_with_existing_name() throws Exception {
        //TC 3.5 Create Role with Existing Name.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(4000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void search_created_role() throws Exception {
        //TC 3.6 Search the Created Role.
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleNamePA"));
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void update_role_with_valid_data() throws Exception {
        //TC 3.7 Update Role with Valid Data.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        //CreateRolePageObj.UpdateTimeAssert();
        //Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void remove_all_permissions_update() throws Exception {
        //TC 3.8 Remove all Permissions and Update.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
    }
    @Test(priority = 9)
    public void disable_status_role_update() throws Exception {
        //TC 3.9 Disable Status of Role and Update.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
    }
    @Test(priority = 10)
    public void enable_status_role_update() throws Exception {
        //TC 3.10 Enable the Status of Role and Update.
        CreateRolePageObj.ClickEditRole1();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        CreateRolePageObj.ClickLogout();
        Thread.sleep(5000);
    }
}