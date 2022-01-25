package Tests;

import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
        @BeforeTest
        public void startUpTest() throws Exception {
                BasePage.driverInit();
        }

        @AfterTest
        public void cleanUpTest() throws Exception {
                driver.quit();
        }
    @Test
    public void CreateRoleAdminFlow() throws Exception {
            CreateRolePage CreateRolePageObj = new CreateRolePage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(2000);

            //TC 2.1 Login with Valid Admin details.
            CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(1000);
            CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(1000);
            CreateRolePageObj.ClickLoginButton();
            Thread.sleep(9000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//SuccessfulAdminLogin.jpg");
            CreateRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(6000);
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);

            //TC 2.2 Blank RoleName and Permission.
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            //CreateRolePageObj.VerifyError();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankRoleName.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 2.3 Valid RoleName and Blank Permission.
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            // CreateRolePageObj.BlankPermission();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//ValidName_BLankPermissionRole.jpg");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            Robot r = new Robot();

            //TC 2.4 Blank RoleName and Valid Permission.
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(1000);
            //CreateRolePageObj.BlankName();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankName_ValidPermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

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
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//RoleCreatedSuccessfully.jpg");
            Thread.sleep(1000);

            //TC 2.6 Create Role with Existing Role.
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(2000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(1000);
            //CreateRolePageObj.RoleNameExist();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//RepeatedRole.jpg");
            Thread.sleep(2000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);

            //TC 2.7 Search the Created Role.
            CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//SearchCreatedRole.jpg");
            Thread.sleep(3000);

            //TC 2.8 Update Role with Valid Data.
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(2000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//UpdateRolePermission.jpg");
            Thread.sleep(1000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);
            CreateRolePageObj.UpdateTimeAssert();
            Thread.sleep(2000);

            //TC 2.9 Remove All Permissions and Update.
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            //CreateRolePageObj.BlankPermission();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankPermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            //TC 2.10 Disable the Status of Role and Update.
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//ActiveRole.jpg");
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);

            //TC 2.11 Enable the Status of Role and Update.
            CreateRolePageObj.ClickEditRole();//Change This
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//InactiveRole.jpg");
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(4000);
            driver.close();

    }
}
