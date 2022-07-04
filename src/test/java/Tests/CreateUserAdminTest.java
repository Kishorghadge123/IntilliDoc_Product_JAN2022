package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import io.qameta.allure.*;
import Utilities.AssertionsFunction;
import  Utilities.Custome_Wait;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import com.google.cloud.storage.Acl;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import static Pages.CreateRolePage.*;
@Feature("Create User Admin Test")
@Listeners(Utilities.TestListeners.class)

public class CreateUserAdminTest extends BasePage {
    static CreateUserPage UserPageObj;

    @Step("Login Test started")
    @BeforeClass
    public void driverinit() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001 - valid_login_with_admin_credentials")
    @Description("verify user able to login valid_login_with_admin_credentials")
    @Test (priority=1,groups="smoke", description = "verify login valid_login_with_admin_credentials")

    public void valid_login_with_admin_credentials() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        UserPageObj = new CreateUserPage(driver);
        //TC 4.1 Valid Login with Admin credentials.
        UserPageObj.ProfileIconClick();
        AssertionsFunction.verifyTargetPageURL(UserPageObj.homeurl);
        Thread.sleep(2000);


    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - create_user_with_blank_data")
    @Description("verify user able to create_user_with_blank_data")
    @Test (priority=2,groups="smoke", description = "verify create_user_with_blank_data")

    public void create_user_with_blank_data() throws Exception {
        //TC 4.2 Create User with Blank data.
        UserPageObj.clickOnUserMenu();
        Thread.sleep(6000);
        UserPageObj.ClickCreateUserBtn();
        UserPageObj.ClickCreateBtn();
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(1000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - create_user_with_valid_data")
    @Description("verify user able to create_user_with_valid_data")
    @Test (priority=3,groups="smoke", description = "verify create_user_with_valid_data")

    public void create_user_with_valid_data() throws Exception {
        //TC 4.3 Create User with Valid data.
        UserPageObj.ClickCreateUserBtn();
        UserPageObj.EnterNewUserName(ReadProps.readAttr("AdminUsername"));
        UserPageObj.EnterEmail(ReadProps.readAttr("AdminEmailID"));
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(1000);

        //4.8 Verify that created user by admin should display in available user list

    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004 -  create_user_with_invalid_data")
    @Description("verify user able to create_user_with_invalid_data")
    @Test (priority=4,groups="smoke", description = "verify create_user_with_invalid_data")

    public void create_user_with_invalid_data() throws Exception {
        //TC 4.4 Create user with Invalid data.
        UserPageObj.ClickCreateUserBtn();
        UserPageObj.EnterNewUserName(ReadProps.readAttr("InvalidUsernameU"));
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        UserPageObj.ClickCreateBtn();
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(1000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);

    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  -  disable_user")
    @Description("verify user able to disable_user")
    @Test (priority=5,groups="smoke", description = "verify disable_user")

    public void disable_user() throws Exception {
        //TC 4.5 Disable user.
        UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
        Thread.sleep(3000);
        UserPageObj.selectSearchedUser();
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj.clickOnUpdateUserButton();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  - enable_disabled_user")
    @Description("verify user able to enable_disabled_user")
    @Test (priority=6,groups="smoke", description = "verify enable_disabled_user")

    public void enable_disabled_user() throws Exception {
        //TC 4.6 Enable the Disabled user.
        Thread.sleep(3000);
        UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
        Thread.sleep(3000);
        UserPageObj.selectSearchedUser();
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(2000);

        UserPageObj.ClickOnCancelBtn();
        AssertionsFunction.isPresent(UserPageObj.cancelButton);
        Thread.sleep(5000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007  - create_user_with_valid_data_status_disabled")
    @Description("verify user able to create_user_with_valid_data_status_disabled")
    @Test (priority=7,groups="smoke", description = "verify create_user_with_valid_data_status_disabled")

    public void create_user_with_valid_data_status_disabled() throws Exception {
        //4.7 Verify the working of admin role for Create user button when user status is disabled
        UserPageObj.ClickCreateUserBtn();
        UserPageObj.EnterNewUserName(ReadProps.readAttr("AdminUsername"));
        UserPageObj.EnterEmail(ReadProps.readAttr("AdminEmailID"));
        UserPageObj.ClickCreateBtn();
        AssertionsFunction.verifyTargetPageURL(UserPageObj.createUserUrl);
        Thread.sleep(1000);
        UserPageObj.ClickOnCancelBtn();
        AssertionsFunction.isPresent(UserPageObj.cancelButton);
        Thread.sleep(5000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008  - enable_user")
    @Description("Verify enable_user")
    @Test (priority=8,groups="smoke", description = "Verify enable_user")

    public void enable_user() throws Exception {
        //TC 4.6 Enable the Disabled user.
        //TC4.8 Verify that created user by admin should display in available user list
        UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
        UserPageObj.selectSearchedUser();
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj.clickOnUpdateUserButton();
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
        Thread.sleep(1000);
    }



}
