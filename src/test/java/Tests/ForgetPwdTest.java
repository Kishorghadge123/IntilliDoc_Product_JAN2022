package Tests;
import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)
public class ForgetPwdTest extends BasePage {
    static ForgetPwdPage FwdPwdObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void click_on_cancel_button_on_forgot_password() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        Thread.sleep(8000);
        FwdPwdObj = new ForgetPwdPage(driver);
        //12.1 Click on Cancel button on Forgot Password Screen.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        FwdPwdObj.ClickCancelBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void first_login_not_done() throws Exception {
        //TC 12.2 First Login is not Done By the User.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
        FwdPwdObj.ClickSubmitBtn();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void invalid_email() throws Exception {
        //TC 12.3 Invalid EmailID.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid1"));
        FwdPwdObj.VerifyAssertEmailID();
        FwdPwdObj.ClickCancelBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void user_not_exists() throws Exception {
        //12.4 User Does not Exist.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid2"));
        Thread.sleep(3000);
        FwdPwdObj.ClickSubmitBtn();
        Thread.sleep(1000);
        FwdPwdObj.ClickCancelBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void disable_user() throws Exception {
            //TC 12.5 Disable user.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("DisabledUser"));
            Thread.sleep(1000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(4000);
        }}