package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)

public class CreateUserAdminTest extends BasePage {
        static CreateUserPage UserPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void valid_login_with_admin_credentials() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            UserPageObj = new CreateUserPage(driver);
            //TC 4.1 Valid Login with Admin credentials.
            UserPageObj.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj.clickLoginButton();
            Thread.sleep(8000);
    }
        @Test(priority = 2)
        public void create_user_with_blank_data() throws Exception {
                //TC 4.2 Create User with Blank data.
                UserPageObj.ClickUserBtn();
                Thread.sleep(4000);
                UserPageObj.ClickCreateUserBtn();
                Thread.sleep(2000);
                UserPageObj.ClickCreateBtn();
                Thread.sleep(1000);
                //UserPageObj.UserBlankAssert();
                UserPageObj.ClickOnCancelBtn();
                Thread.sleep(4000);
        }
        @Test(priority = 3)
        public void create_user_with_valid_data() throws Exception {
                //TC 4.3 Create User with Valid data.
                UserPageObj.ClickCreateUserBtn();
                Thread.sleep(2000);
                UserPageObj.EnterUserName(ReadProps.readAttr("AdminUserName"));
                 Thread.sleep(2000);
                UserPageObj.EnterEmail(ReadProps.readAttr("AdminID"));
                 Thread.sleep(2000);
                UserPageObj.ClickActiveUser();
                Thread.sleep(2000);
                UserPageObj.ClickCreateBtn();
                Thread.sleep(6000);
        }
        @Test(priority = 4)
        public void create_user_with_invalid_data() throws Exception {
                //TC 4.4 Create user with Invalid data.
                UserPageObj.ClickCreateUserBtn();
                Thread.sleep(2000);
                UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
                Thread.sleep(2000);
                UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
                Thread.sleep(2000);
                UserPageObj.ClickCreateBtn();
                Thread.sleep(2000);
                UserPageObj.ClickOnCancelBtn();
                Thread.sleep(3000);
        }
        @Test(priority = 5)
        public void disable_user() throws Exception {
                //TC 4.5 Disable user.
                UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUserName"));
                Thread.sleep(3000);
                UserPageObj.SelectSearchedAdminUser();//change this every time u run
                Thread.sleep(2000);
                UserPageObj.ClickDisableUser();
                Thread.sleep(2000);
                UserPageObj.ClickUpdateUser();
                Thread.sleep(4000);
        }
        @Test(priority = 6)
        public void enable_disabled_user() throws Exception {
            //TC 4.6 Enable the Disabled user.
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUserName"));
            Thread.sleep(2000);
            UserPageObj.SelectSearchedAdminUser();
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(3000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(4000);
            UserPageObj.LogOut();
            Thread.sleep(5000);
        }
    }