package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;
@Feature("Update User Admin Test")
@Listeners(Utilities.TestListeners.class)

public class UpdateUserAdminTest extends BasePage {
        static CreateUserPage UserPageObj1;
    @Step("Login Test started")
        @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @Step("Closed the Browser")
@AfterClass
    public void cleanUp() throws Exception
    {
    driver.quit();
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 - Update User Admin Flow")
    @Description("verify user able to Update User Admin Flow")
    @Test (priority=1,groups="smoke", description = " verify UpdateUserAdminFlow")
    public void UpdateUserAdminFlow() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            UserPageObj1 = new CreateUserPage(driver);
            //TC 22.1 Admin Login with Valid Credentials.
            LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
            UserPageObj1.clickOnUserMenu();
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 - disable_user_update")
    @Description("verify user able to disable_user_update")
    @Test (priority=2,groups="smoke", description = " verify disable_user_update")
        public void disable_user_update() throws Exception {
                //TC 22.2 Disable User and Update.
                UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
                UserPageObj1.clickOnUpdateUserButton();
                UserPageObj1.SearchCreatedUser("Qa User");
                UserPageObj1.selectSearchedUser();
                UserPageObj1.clickOnUpdateUserButton();
        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - enable_user_update")
    @Description("verify user able to enable_user_update")
    @Test (priority=3,groups="smoke", description = " verify enable_user_update")
        public void enable_user_update() throws Exception
        {
                //TC 22.3 Enable User and Update.
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
            UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
            UserPageObj1.clickOnUpdateUserButton();

        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004 - update_with_blank_name")
    @Description("verify user able to update_with_blank_name")
    @Test (priority=4,groups="smoke", description = " verify update_with_blank_name")
        public void update_with_blank_name() throws Exception {
                //TC 22.4 Update with Blank Name.
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
            UserPageObj1.clearUserName();
            UserPageObj1.clickOnUpdateUserButton();
            UserPageObj1.ClickOnCancelBtn();
        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005 - update_with_invalid_username")
    @Description("verify user able to update_with_invalid_username")
    @Test (priority=5,groups="smoke", description = " verify update_with_invalid_username")
        public void update_with_invalid_username() throws Exception {
                //TC 22.5 Update with Invalid UserName.
                UserPageObj1.SearchCreatedUser("Qa User");
                UserPageObj1.selectSearchedUser();
                UserPageObj1.clearUserName();
                UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
                UserPageObj1.clickOnUpdateUserButton();
                UserPageObj1.ClickOnCancelBtn();
        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - update_with_valid_username")
    @Description("verify user able to update_with_valid_username")
    @Test (priority=6,groups="smoke", description = " verify update_with_valid_username")
        public void update_with_valid_username() throws Exception {
            //TC 22.6 Update with Valid Name.
            UserPageObj1.SearchCreatedUser("Qa User");
            UserPageObj1.selectSearchedUser();
            UserPageObj1.clearUserName();
            UserPageObj1.EnterNewUserName(ReadProps.readAttr("ValidNameUP")); // change name
            UserPageObj1.clickOnUpdateUserButton();

            // Created Updated time diff
            String expectedDate = Functions.getCurrentDate();
            System.out.println("expectedDate="+expectedDate);
            System.out.println(UserPageObj1.getUpdatedTimeAndDate());
        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 - Sorting_User")
    @Description("verify user able to Sorting_User")
    @Test (priority=7,groups="smoke", description = " verify Sorting_User")
        public  void Sorting_User() throws Exception {
            // 22.10 Sorting by Name, email,updated,created time
        UserPageObj1.ClickOnSortUserArrow();
        LoginUser.logoutUser(driver);

        }
    }

