package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.*;

@Feature("Create User Platform Admin Test")
@Listeners(Utilities.TestListeners.class)
public class CreateUserPlatformAdminTest extends BasePage {
    static CreateUserPage UserPageObj;

    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
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
    @Story("story_id: 001  - blank_username_blank_password")
    @Description("verify user able to blank_username_blank_password")
    @Test (priority=1,groups="smoke", description = "verify blank_username_blank_password")
    public void blank_username_blank_password() throws Exception {
        UserPageObj = new CreateUserPage(driver);
        //TC 5.1 Blank Username and Blank Password.

       UserPageObj.clickOnUserMenu();
        Thread.sleep(3000);
        UserPageObj.ClickCreateUserBtn();
        UserPageObj.ClickCreateBtn();
        driver.navigate().refresh();
        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  - valid_username_blank_password")
    @Description("verify user able to valid_username_blank_password")
    @Test (priority=2,groups="smoke", description = "verify valid_username_blank_password")
    public void valid_username_blank_password() throws Exception {
        //TC 5.2 inValid Username no enter emailId.
        UserPageObj.EnterExistingUserName_or_InvalidUserName(ReadProps.readAttr("InvalidUsernameU"));
        UserPageObj.ClickCreateBtn();
        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
        Thread.sleep(2000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  - blank_username_valid_password")
    @Description("verify user able to blank_username_valid_password")
    @Test (priority=3,groups="smoke", description = "verify blank_username_valid_password")

    public void blank_username_valid_password() throws Exception {
        //TC 5.3 Blank Username Valid email.
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        UserPageObj.ClickCreateBtn();
        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
        Thread.sleep(2000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  - invalid_username_blank_password")
    @Description("verify user able to invalid_username_blank_password")
    @Test (priority=4,groups="smoke", description = "verify invalid_username_blank_password")

    public void invalid_username_blank_password() throws Exception {
        //TC 5.4 Invalid UserName Blank Password.
        UserPageObj.EnterExistingUserName_or_InvalidUserName(ReadProps.readAttr("InvalidUsernameU"));
        UserPageObj.ClickCreateBtn();
        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
        Thread.sleep(2000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  - blank_username_invalid_password")
    @Description("verify user able to blank_username_invalid_password")
    @Test (priority=5,groups="smoke", description = "verify blank_username_invalid_password")

    public void blank_username_invalid_password() throws Exception {
        //TC 5.5 Blank UserName Invalid Password.
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        UserPageObj.ClickCreateBtn();
        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
        Thread.sleep(2000);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  - invalid_credentials")
    @Description("verify user unable to login invalid_credentials")
    @Test (priority=6,groups="smoke", description = "verify user unable to login invalid_credentials")

    public void invalid_credentials() throws Exception {
        //TC 5.6 Invalid Credentials.
        UserPageObj.EnterExistingUserName_or_InvalidUserName(ReadProps.readAttr("InvalidUsernameU"));
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        UserPageObj.ClickCreateBtn();
        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
        Thread.sleep(2000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007  - create_user_with_existing_username_password")
    @Description("verify user able to create_user_with_existing_username_password")
    @Test (priority=7,groups="smoke", description = "verify create_user_with_existing_username_password")

    public void create_user_with_existing_username_password() throws Exception {
        //TC 5.7 Create User with Existing Username and Password.
        //TC 5.12 Verify the working of platform admin role for Create user button when"Active User" toggle button is enabled
        UserPageObj.EnterExistingUserName_or_InvalidUserName(ReadProps.readAttr("InvalidUsernameU"));
        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
        //added
        //TC 5.11 Verify the validation of Name textbox & Email ID textbox on New User creation Page.
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getValidationUserName()));
        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(2000);
        UserPageObj.ClickCreateBtn();
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
        Thread.sleep(2000);
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
          /*  // At the time of create user need to remove comment from assertion.
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



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009  - Click On Cancel button on User Creation Page")
    @Description("verify user able to Click On Cancel button on User Creation Page")
    @Test (priority=9,groups="smoke", description = "verify Click On Cancel button on User Creation Page") // below added
    public void ClickOnCancelbutton_on_User_Creation_Page() throws Exception {
        //TC 5.10 Verify functionality of Cancel button on User Creation Page.
        UserPageObj.ClickCreateUserBtn();
        Thread.sleep(2000);
        UserPageObj.ClickOnCancelBtn();
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
        Thread.sleep(2000);


    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 010  - search_user")
    @Description("verify user able to search_user")
    @Test (priority=10,groups="smoke", description = "verify search_user")



    public void search_user() throws Exception
    {
        //TC 5.8 Search for Created user.
        Thread.sleep(2000);
        UserPageObj.SearchCreatedUser(ReadProps.readAttr("UserNameDisabled"));
        Thread.sleep(2000);
        UserPageObj.selectSearchedUser();
        UserPageObj.ClickOnCancelBtn();
        AssertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - create_userWith_valid_credential")
    @Description("verify user able to create_userWith_valid_credential")
    @Test (priority=11,groups="smoke", description = "verify create_userWith_valid_credential")

    public void create_userWith_valid_credential_status_Disabled() throws Exception
     {
         //TC 5.13 Verify the working of platform admin role for Create user button when "Active User" toggle button is disabled
         UserPageObj.ClickCreateUserBtn();
         UserPageObj.EnterNewUserName(ReadProps.readAttr("UserNameDisabled"));// change this value
         UserPageObj.EnterEmail(ReadProps.readAttr("UseremailDisabled"));// change this value
         UserPageObj.ClickCreateBtn();
         Thread.sleep(2000);
     }

//    @Test(priority = 12)
//    public void create_userWith_valid_credential() throws Exception {
//
//        // 5.8 Verify the Users functionality of the Platform Admin to Create User with Valid Details.
//        Thread.sleep(2000);
//        UserPageObj.ClickCreateUserBtn();
//        Thread.sleep(2000);
//        UserPageObj.EnterNewUserName(ReadProps.readAttr("UserName")); // change this value
//        UserPageObj.EnterEmail(ReadProps.readAttr("Useremail")); // change this value
//        //TC 5.12 Verify the working of platform admin role for Create user button when"Active User" toggle button is enabled
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.ClickCreateBtn();
//        Thread.sleep(2000);
//        AssertionsFunction.isPresent(UserPageObj.CreateBtn);
//        Thread.sleep(2000);
//        UserPageObj.ClickOnCancelBtn();
//
//    }
//




}
