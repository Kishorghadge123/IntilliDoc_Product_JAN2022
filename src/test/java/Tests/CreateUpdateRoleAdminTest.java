package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
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
    public void login_with_valid_details() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        Thread.sleep(8000);
        CreateRolePageObj = new CreateRolePage(driver);
        //TC 2.1 Login with Valid Admin details.
        CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        Thread.sleep(1000);
        CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        Thread.sleep(1000);
        CreateRolePageObj.ClickLoginButton();
        Thread.sleep(8000);
        CreateRolePageObj.ClickRoleManagementBtn();
        Thread.sleep(6000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
    }
    @Test(priority = 2)
    public void blank_role_name_permission() throws Exception {
        //TC 2.2 Blank RoleName and Permission.
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        //CreateRolePageObj.VerifyError();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(4000);
    }
    @Test(priority = 3)
    public void valid_role_name_blank_permission() throws Exception {
        //TC 2.3 Valid RoleName and Blank Permission.
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        // CreateRolePageObj.BlankPermission();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(4000);
    }
    @Test(priority = 4)
    public void blank_role_name_valid_permission() throws Exception {
        //TC 2.4 Blank RoleName and Valid Permission.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void valid_role_and_permission() throws Exception {
        //TC 2.5 Valid Role and Valid Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u run
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(5000);

    }
    @Test(priority = 6)
    public void create_role_with_existing_rolename() throws Exception {
        //TC 2.6 Create Role with Existing Role Name.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Thread.sleep(2000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        //CreateRolePageObj.RoleNameExist();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void search_created_role() throws Exception {
        //TC 2.7 Search the Created Role.
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void update_role_with_valid_data() throws Exception {
        //TC 2.8 Update Role with Valid Data.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(5000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Thread.sleep(2000);
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
        CreateRolePageObj.UpdateTimeAssert();
        Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void remove_all_permissions() throws Exception {
        //TC 2.9 Remove All Permissions and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(4000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        //CreateRolePageObj.BlankPermission();
        Thread.sleep(3000);
        CreateRolePageObj.ClickCancelButton();
        Thread.sleep(3000);
    }
    @Test(priority = 10)
    public void disable_the_status_of_role_update() throws Exception {
        //TC 2.10 Disable the Status of Role and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(5000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(4000);
    }
    @Test(priority = 11)
    public void enable_status_role_update() throws Exception {
            //TC 2.11 Enable the Status of Role and Update.
            CreateRolePageObj.ClickEditRole();//Change This
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(4000);
    }
}