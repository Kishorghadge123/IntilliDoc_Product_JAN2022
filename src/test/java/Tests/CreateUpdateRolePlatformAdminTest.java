package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRolePlatformAdminTest extends BasePage
{
        @BeforeTest
        public void startUpTest() throws Exception {
                BasePage.driverInit();
                BasePage.LoginTest();
        }

        @AfterTest
        public void cleanUpTest() throws Exception {
                driver.quit();
        }
    @Test
    public void CreateRolePlatformAdminFlow() throws Exception {

            CreateRolePage CreateRolePageObj = new CreateRolePage(driver);
            CreateRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(6000);
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//Role button clicked.jpg");
            Thread.sleep(2000);

            //TC 3.1 Create Role with Blank RoleName and Permission.
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankRoleNameCreated.jpg");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 3.2 Create Role with Valid RoleName and Blank Permission.
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//ValidName_BLankPermissionRole.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            Robot r = new Robot();

            //TC 3.3 Create Role with Blank RoleName and Valid Permission.
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankName_ValidPermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(4000);

         /*   // Create AE admin role
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("AdminRole"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
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
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid rolename valid permission");
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
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid RoleName valid permission");
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
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid rolename valid permission");
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);*/

            //TC 3.4 Create Role with Valid Role Name and Permission.
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//RoleCreatedSuccessfully.jpg");
            Thread.sleep(5000);

            //TC 3.5 Create Role with Existing Name.
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//RepeatedRole.jpg");
            Thread.sleep(4000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            //TC 3.6 Search the Created Role.
            CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleNamePA"));
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//SearchRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role searched");

            //TC 3.7 Update Role with Valid Data.
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//UpdateRole.jpg");
            Thread.sleep(3000);
            //CreateRolePageObj.UpdateTimeAssert();
            //Thread.sleep(2000);

            //TC 3.8 Remove all Permissions and Update.
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankPermission.jpg");
            Thread.sleep(2000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            //TC 3.9 Disable Status of Role and Update.
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//ActiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);

            //TC 3.10 Enable the Status of Role and Update.
            CreateRolePageObj.ClickEditRole1();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//InactiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(3000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(5000);
            driver.close();
    }
}
