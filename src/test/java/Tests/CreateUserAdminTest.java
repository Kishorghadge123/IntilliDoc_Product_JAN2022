package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class CreateUserAdminTest extends BasePage {
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
    public void CreateUserAdminFlow() throws Exception {
            CreateUserPage UserPageObj = new CreateUserPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(2000);

            //TC 4.1 Valid Login with Admin credentials.
            UserPageObj.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj.clickLoginButton();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUserCreation//AdminValidLoginSuccess.jpg");
            Thread.sleep(2000);

            //TC 4.2 Create User with Blank data.
            UserPageObj.ClickUserBtn();
            Thread.sleep(4000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUserCreation//AdminBlankUserCreate.jpg");
            //UserPageObj.UserBlankAssert();
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(4000);

            //TC 4.3 Create User with Valid data.
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("AdminUserName"));//Change everytime before u ran
            Thread.sleep(1000);
            UserPageObj.EnterEmail(ReadProps.readAttr("AdminID"));//Change everytime before u ran
            Thread.sleep(1000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(1000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//AdminUserCreation//AdminUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(5000);

            //TC 4.4 Create user with Invalid data.
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            TakesScreen.takeSnapShot(driver, "test-output//AdminUserCreation//AdminInvalidCredentials.jpg");
            Thread.sleep(2000);
            UserPageObj.ClickOnCancelBtn();
            Thread.sleep(3000);

            //TC 4.5 Disable user.
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUserName"));
            Thread.sleep(3000);
            UserPageObj.SelectSearchedAdminUser();//change this every time u run
            Thread.sleep(2000);
            UserPageObj.ClickDisableUser();
            Thread.sleep(2000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(4000);

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
            driver.close();
    }
}