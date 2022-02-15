package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import org.testng.annotations.*;

@Listeners(Utilities.TestListeners.class)
public class CreateUserPlatformAdminTest extends BasePage {
    static CreateUserPage UserPageObj;
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
    public void blank_username_blank_password() throws Exception {
        UserPageObj = new CreateUserPage(driver);
        //TC 5.1 Blank Username and Blank Password.
        UserPageObj.ClickUserBtn();
        Thread.sleep(4000);
        UserPageObj.ClickCreateUserBtn();
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void valid_username_blank_password() throws Exception {
        //TC 5.2 Valid Username Blank Password.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        // UserPageObj.UserBlankAssert();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void blank_username_valid_password() throws Exception {
        //TC 5.3 Blank Username Valid Password.
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        // UserPageObj.UserBlankAssert();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 4)
    public void invalid_username_blank_password() throws Exception {
        //TC 5.4 Invalid UserName Blank Password.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        //UserPageObj.UserBlankAssert();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 5)
    public void blank_username_invalid_password() throws Exception {
        //TC 5.5 Blank UserName Invalid Password.
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        //UserPageObj.UserBlankAssert();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 6)
    public void invalid_credentials() throws Exception {
        //TC 5.6 Invalid Credentials.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        //UserPageObj.UserBlankAssert();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 7)
    public void create_user_with_existing_username_password() throws Exception {
        //TC 5.7 Create User with Existing Username and Password.
        UserPageObj.EnterUserName(ReadProps.readAttr("InvalidUsernameU"));
        Thread.sleep(2000);
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        Thread.sleep(2000);
        UserPageObj.ClickActiveUser();
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(1000);
        //UserPageObj.UserExistAssert();
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(5000);
    }
    //Creation Of User-Whenever we have to run on new env then these lines are used.
          /*  UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("UserEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(3000);
            Thread.sleep(2000);
            Thread.sleep(2000);
            UserPageObj.CreateUserAssert();
            Thread.sleep(2000);

            // At the time of create user need to remove comment from assertion.
            //1 AE Admin
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Admin");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("Admin@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // At the time of create user need to remove comment from assertion

          /*
            //2 AE Supervisor
           // UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Supervisor");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("supervisor@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            Thread.sleep(2000);
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            // At the time of create user need to remove comment from assertion
            UserPageObj.CreateTimeAssert();
            Thread.sleep(2000);

            //3 AE Operator
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName("AE Operator");
            Thread.sleep(2000);
            UserPageObj.EnterEmail("operator@Test.com");
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            Thread.sleep(2000);
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            // At the time of create user need to remove comment from assertion*/

    @Test(priority = 8)
    public void search_user() throws Exception {
        //TC 5.8 Search for Created user.
        UserPageObj.ClickUserBtn();
        Thread.sleep(3000);
        UserPageObj.SearchCreatedUser(ReadProps.readAttr("Username"));
        Thread.sleep(2000);
        UserPageObj.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(2000);
        UserPageObj.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj.ClickUpdateUser();
        Thread.sleep(5000);
        UserPageObj.LogOut();
        Thread.sleep(5000);
    }}


