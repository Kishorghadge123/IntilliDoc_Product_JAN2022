package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class CreateUserPlatformAdminTest extends BasePage {
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
    public void CreateUserPlatformAdminFlow() throws Exception {
            CreateUserPage UserPageObj = new CreateUserPage(driver);

            //TC 5.1 Blank Username and Blank ID.
            UserPageObj.ClickUserBtn();
            Thread.sleep(4000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(500);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//BlankNameID.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 5.2 Valid Username Blank ID.
            UserPageObj.EnterUserName(ReadProps.readAttr("CUName"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//ValidUserNameBlankID.jpg");
            // UserPageObj.UserBlankAssert();
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 5.3 Blank Username Valid ID.
            UserPageObj.EnterEmail(ReadProps.readAttr("CUEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            // UserPageObj.UserBlankAssert();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//BlankUsernameValidID.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 5.4 Invalid UserName Blank ID.
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            //UserPageObj.UserBlankAssert();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//InvalidUsernameBlankID.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 5.5 Blank UserName Invalid ID.
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            //UserPageObj.UserBlankAssert();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//BlankUserNameInvalidId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 5.6 Invalid Credentials.
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//InvalidCredentials.jpg");
            //UserPageObj.UserBlankAssert();
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 5.7 Create User with Existing Username and ID.
            UserPageObj.EnterUserName(ReadProps.readAttr("CUName"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//ValidUsernameValidID.jpg");
            //UserPageObj.UserExistAssert();
            Thread.sleep(2000);
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(5000);

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
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//PlatformAdminUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);
            UserPageObj.CreateUserAssert();
            Thread.sleep(2000);
            System.out.println("User Created");

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
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//AdminUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
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
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//SupervisorUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // At the time of create user need to remove comment from assertion
            UserPageObj.CreateTimeAssert();
            Thread.sleep(2000);
            System.out.println("Time Assert Pass ");

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
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUserCreation//OpratorUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            // At the time of create user need to remove comment from assertion*/


            //TC 5.8 Search for Created user.
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            UserPageObj.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUserCreation//OpenCreatedUser.jpg");
            Thread.sleep(2000);
            UserPageObj.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(5000);
            UserPageObj.LogOut();
            Thread.sleep(5000);
            driver.close();
    }
}


