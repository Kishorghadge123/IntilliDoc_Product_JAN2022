package Tests;
import Base.BasePage;
import Pages.EditProfilePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;
@Feature("Edit Profile Test")
@Listeners(Utilities.TestListeners.class)

public class EditProfileTest extends BasePage {
    static LoginPage loginPageObjects;
    static EditProfilePage EditProfileObj;
    static ProjectPage ProjectPageObj;
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
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001  - visible_password_on")
    @Description("verify user able to visible_password_on")
    @Test (priority=1,groups="smoke", description = "verify visible_password_on")

    public void visible_password_on() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(7000);
            EditProfileObj = new EditProfilePage(driver);
            loginPageObjects = new LoginPage(driver);
            ProjectPageObj = new ProjectPage(driver);
            //TC 11.1 Visible Password On.
           ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(2000);
            EditProfileObj.clickVisible();
            Thread.sleep(2000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  - visible_password_off")
    @Description("verify user able to visible_password_off")
    @Test (priority=2,groups="smoke", description = "verify visible_password_off")

    public void visible_password_off() throws Exception {
        //TC 11.2 Visible Password Off.
        EditProfileObj.clickVisible();
        Thread.sleep(2000);
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(9000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  - profile_icon")
    @Description("verify user able to profile_icon")
    @Test (priority=3,groups="smoke", description = "verify profile_icon")
    public void profile_icon() throws Exception {
        //TC 11.3 Profile Icon
        EditProfileObj.ProfileButton();
        Thread.sleep(2000);
        EditProfileObj.verify_profile_icon();
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 4  - night_mode_day_mode")
    @Description("verify user able to do night_mode_day_mode")
    @Test (priority=4,groups="smoke", description = "verify night_mode_day_mode")

        public void night_mode_day_mode() throws Exception {
            //TC 11.4 Night Mode , Day Mode
            EditProfileObj.NightModeButton();
            Thread.sleep(2000);
             EditProfileObj.verify_Day_Mode();
            Thread.sleep(2000);
            EditProfileObj.DayModeButton();
            Thread.sleep(2000);
            EditProfileObj.verify_night_mode();
        }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 5  - edit_profile")
    @Description("verify user able to edit_profile")
    @Test (priority=5,groups="smoke", description = "verify night_mode_day_mode")
    public void edit_profile() throws Exception {
        //TC 11.5 Edit Profile.
        EditProfileObj.EditProfileButton();
        Thread.sleep(3000);
        EditProfileObj.verify_edit_profile();

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 6  - edit_profile_cancel")
    @Description("verify user able to edit_profile_cancel")
    @Test (priority=6,groups="smoke", description = "verify edit_profile_cancel")

    public void edit_profile_cancel() throws Exception {
            //TC 11.6 Edit Profile Cancel.
            EditProfileObj.CancelButton();
            Thread.sleep(2000);
            EditProfileObj.verify_edit_profile_cancel();
            Thread.sleep(2000);
        }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 7  - edit_profile_save")
    @Description("verify user able to edit_profile_save")
    @Test (priority=7,groups="smoke", description = "verify edit_profile_save")

        public void edit_profile_save() throws Exception {
        EditProfileObj.ProfileButton();
        Thread.sleep(2000);
        EditProfileObj.EditProfileButton();
        Thread.sleep(3000);
        EditProfileObj.SaveButton();
        Thread.sleep(2000);
     }
    }
