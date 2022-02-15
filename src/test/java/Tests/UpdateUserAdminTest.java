package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)

public class UpdateUserAdminTest extends BasePage {
        static CreateUserPage UserPageObj1;

        @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void UpdateUserAdminFlow() throws InterruptedException, IOException {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            UserPageObj1 = new CreateUserPage(driver);
            //TC 22.1 Admin Login with Valid Credentials.
            UserPageObj1.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj1.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj1.clickLoginButton();
            Thread.sleep(8000);
            UserPageObj1.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(2000);
    }
        @Test(priority = 2)
        public void disable_user_update() throws InterruptedException, IOException {
                //TC 22.2 Disable User and Update.
                UserPageObj1.ClickDisableUser();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(2000);
                UserPageObj1.SelectSearchedAdminUser();
                Thread.sleep(2000);
        }
        @Test(priority = 3)
        public void enable_user_update() throws InterruptedException, IOException {
                //TC 22.3 Enable User and Update.
                UserPageObj1.ClickEnableUser();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(2000);
        }
        @Test(priority = 4)
        public void update_with_blank_name() throws InterruptedException, IOException {
                //TC 22.4 Update with Blank Name.
                UserPageObj1.SelectSearchedAdminUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(1000);
                //UserPageObj1.UserBlankAssert();
                Thread.sleep(2000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(6000);
        }
        @Test(priority = 5)
        public void update_with_invalid_username() throws InterruptedException, IOException {
                //TC 22.5 Update with Invalid UserName.
                UserPageObj1.SelectSearchedAdminUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                //UserPageObj1.UserBlankAssert();
                Thread.sleep(2000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(6000);
        }
        @Test(priority = 6)
        public void update_with_valid_username() throws InterruptedException, IOException {
            //TC 22.6 Update with Valid Name.
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(2000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            //Remove Update for script maintains only.
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.SelectUpdatedUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("AdminUserName"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(4000);
            UserPageObj1.LogOut();
            Thread.sleep(4000);
        }
    }

