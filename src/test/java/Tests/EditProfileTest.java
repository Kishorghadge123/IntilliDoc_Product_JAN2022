package Tests;
import Base.BasePage;
import Pages.EditProfilePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)
public class EditProfileTest extends BasePage {
    static LoginPage loginPageObjects;
    static EditProfilePage EditProfileObj;
    static ProjectPage ProjectPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
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
    @Test(priority = 2)
    public void visible_password_off() throws Exception {
        //TC 11.2 Visible Password Off.
        EditProfileObj.clickVisible();
        Thread.sleep(2000);
        loginPageObjects.clickLoginButton();
        Thread.sleep(7000);
    }
    @Test(priority = 3)
    public void profile_icon() throws Exception {
        //TC 11.3 Profile Icon
        EditProfileObj.ProfileButton();
        Thread.sleep(2000);
        EditProfileObj.verify_profile_icon();
    }
        @Test(priority = 4)
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
        @Test(priority = 5)
            public void edit_profile() throws Exception {
        //TC 11.5 Edit Profile.
        EditProfileObj.EditProfileButton();
        Thread.sleep(3000);
        EditProfileObj.verify_edit_profile();

    }
    @Test(priority = 6)
    public void edit_profile_cancel() throws Exception {
            //TC 11.6 Edit Profile Cancel.
            EditProfileObj.CancelButton();
            Thread.sleep(2000);
            EditProfileObj.verify_edit_profile_cancel();
            Thread.sleep(2000);
        }
    @Test(priority = 7)
        public void edit_profile_save() throws Exception {
        EditProfileObj.ProfileButton();
        Thread.sleep(2000);
        EditProfileObj.EditProfileButton();
        Thread.sleep(3000);
        EditProfileObj.SaveButton();
            Thread.sleep(2000);

        }
    }
