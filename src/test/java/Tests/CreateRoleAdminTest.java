package Tests;

import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
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
public class CreateRoleAdminTest extends BasePage {
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
            Thread.sleep(1000);
            //Admin ROle
            CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(1000);
            CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(1000);
            CreateRolePageObj.ClickLoginButton();
            Thread.sleep(12000);
            CreateRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(5000);
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(5000);

            // Blank RoleName and Blank permission
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            //CreateRolePageObj.VerifyError();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankRoleNameCreated.jpg");
            System.out.println("Assert Verified Please check form data and permission cannot be empty");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            // Valid RoleName and Blank permission
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
            Thread.sleep(2000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(2000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
           // CreateRolePageObj.BlankPermission();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//ValidName_BLankPermissionRole.jpg");
            System.out.println("Assert Verified Permissions cannot be blank");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            Robot r = new Robot();
            //  Blank RoleName and Valid Permission
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(3000);
            //CreateRolePageObj.BlankName();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankName_ValidPermission.jpg");
            System.out.println(" Assert verified Please check form data");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            //Valid Role and Valid Permission
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
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//RoleCreatedSuccessfully.jpg");
            Thread.sleep(3000);

            // Repeated Role Doesn't allow
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
            Thread.sleep(2000);
            //CreateRolePageObj.RoleNameExist();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//RepeatedRole.jpg");
            System.out.println(" Assertion verified Role exist with name AE Admin");
            Thread.sleep(4000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);

            // TC 1.5 - Search role
            CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//SearchRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role searched");

            //update Role with Valid Data
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(2000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//UpdateRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(3000);
            CreateRolePageObj.UpdateTimeAssert();
            Thread.sleep(2000);

            //Remove all permission
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.ClickUpdateBtn();
            //CreateRolePageObj.BlankPermission();
            System.out.println("Assert Verified Permissions cannot be blank");
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankPermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(3000);

            //Disable the Status of role and update
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//ActiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(4000);

            //Enable the Status of role and update
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//InacvtiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateBtn();
            Thread.sleep(3000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(4000);
            driver.close();
            CreateRolePageObj.AssertAll();

    }
}
