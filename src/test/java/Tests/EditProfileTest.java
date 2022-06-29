package Tests;
import Base.BasePage;
import Pages.EditProfilePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.Custome_Wait;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
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

        EditProfileObj = new EditProfilePage(driver);
        loginPageObjects = new LoginPage(driver);
        ProjectPageObj = new ProjectPage(driver);
        //TC 11.1 Visible Password On.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        EditProfileObj.clickVisible();
        AssertionsFunction.verifyElementPresent(EditProfileObj.Visible);
        Thread.sleep(1000);


    }
    @Test(priority = 2)
    public void visible_password_off() throws Exception {
        //TC 11.2 Visible Password Off.
        EditProfileObj.clickVisible();
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(10000);
    }
    @Test(priority = 3)
    public void profile_icon() throws Exception {
        //TC 11.3 Profile Icon
        EditProfileObj.ProfileButton();
        EditProfileObj.verify_profile_icon();
    }

    @Test(priority = 4)
    public void edit_profile() throws Exception {
        //TC 11.5 Edit Profile.
        EditProfileObj.EditProfileButton();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//span[text()='Edit Profile']")));
        EditProfileObj.verify_edit_profile();

    }

    @Test(priority = 5)
    public void edit_profile_cancel() throws Exception {
        //TC 11.6 Edit Profile Cancel.
        EditProfileObj.CancelButton();
        EditProfileObj.verify_edit_profile_cancel();
    }
    @Test(priority = 6)
    public void edit_profile_save() throws Exception {
        EditProfileObj.ProfileButton();
        EditProfileObj.EditProfileButton();
        EditProfileObj.SaveButton();
        AssertionsFunction.isPresent(EditProfileObj.Save);
        Thread.sleep(10000);

    }

        @Test(priority = 7)
        public void add_theme() throws Exception{
        EditProfileObj.clickonsettingbtn();
        Thread.sleep(5000);
        EditProfileObj.clickontheme();
        EditProfileObj.clickonapplybtn();

        }
    }
