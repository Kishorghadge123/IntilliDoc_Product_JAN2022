package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.*;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import javax.annotation.Priority;


public class UpdateUserAdminTest extends BasePage {
    static CreateUserPage UserPageObj1;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }

    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }



@Test(priority =1)
    public void UpdateUserAdminFlow() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();

        UserPageObj1 = new CreateUserPage(driver);
        //TC 22.1 Admin Login with Valid Credentials.
        LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
        Thread.sleep(10000);
        UserPageObj1.clickOnUserMenu();
        //UserPageObj1.SearchCreatedUser("Qa User");
        UserPageObj1.selectSearchedUser();
    Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.selectSearchedUser);
    Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void disable_user_update() throws Exception {
        //TC 22.2 Disable User and Update.
        UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj1.clickOnUpdateUserButton();
       // UserPageObj1.SearchCreatedUser("Qa User");
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void enable_user_update() throws Exception
    {
        //TC 22.3 Enable User and Update.
        //UserPageObj1.SearchCreatedUser("Qa User");
        UserPageObj1.selectSearchedUser();
        UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);

    }
    @Test(priority = 4)
    public void update_with_blank_name() throws Exception {
        //TC 22.4 Update with Blank Name.
       // UserPageObj1.SearchCreatedUser("Qa User");
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(3000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);

        Thread.sleep(1000);


    }
    @Test(priority = 5)
    public void update_with_invalid_username() throws Exception {
        //TC 22.5 Update with Invalid UserName.
     //   UserPageObj1.SearchCreatedUser("Qa User");
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(3000);
        UserPageObj1.ClickOnCancelBtn();
       Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);

Thread.sleep(1000);

    }
    @Test(priority = 6)
    public void update_with_valid_username() throws Exception {
        //TC 22.6 Update with Valid Name.
        //UserPageObj1.SearchCreatedUser("Qa User");
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.EnterNewUserName(ReadProps.readAttr("ValidNameUP")); // change name
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        // Created Updated time diff


    }
//    @Test(priority = 7)
//    public  void Sorting_User() throws Exception {
//        // 22.10 Sorting by Name, email,updated,created time
//        UserPageObj1.ClickOnSortUserArrow();
//        LoginUser.logoutUser(driver);
//
//    }
}