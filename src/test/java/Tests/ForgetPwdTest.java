package Tests;
import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;

@Feature("Forget Pwd Test")
@Listeners(Utilities.TestListeners.class)
public class ForgetPwdTest extends BasePage {
    static ForgetPwdPage FwdPwdObj;
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
    @Story("story_id: 001  -click_on_cancel_button_on_forgot_password")
    @Description("verify user able to click_on_cancel_button_on_forgot_password")
    @Test (priority=1,groups="smoke", description = "verify click_on_cancel_button_on_forgot_password")

    public void click_on_cancel_button_on_forgot_password() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        Thread.sleep(8000);
        FwdPwdObj = new ForgetPwdPage(driver);
        //12.1 Click on Cancel button on Forgot Password Screen.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
        FwdPwdObj.ClickCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  -first_login_not_done")
    @Description("verify user able to check first_login_not_done")
    @Test (priority=2,groups="smoke", description = "verify first_login_not_done")

    public void first_login_not_done() throws Exception {
        //TC 12.2 First Login is not Done By the User.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
        FwdPwdObj.ClickSubmitBtn();
        Thread.sleep(3000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  - invalid_email")
    @Description("verify user unable to login with invalid_email")
    @Test (priority=3,groups="smoke", description = "verify invalid_email")

    public void invalid_email() throws Exception {
        //TC 12.3 Invalid EmailID.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid1"));
        FwdPwdObj.VerifyAssertEmailID();
        FwdPwdObj.ClickCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);


    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  - user_not_exists")
    @Description("verify user user_not_exists")
    @Test (priority=4,groups="smoke", description = "verify user_not_exists")

    public void user_not_exists() throws Exception {
        //12.4 User Does not Exist.
        FwdPwdObj.ClickForgetPwdBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid2"));
        Thread.sleep(3000);
        FwdPwdObj.ClickSubmitBtn();
        Thread.sleep(1000);
      // changes by priyanka  AssertionsFunction.verifyElementText(FwdPwdObj.errMsguserDoseNotExist,FwdPwdObj.userDoseNotExist);
        FwdPwdObj.ClickCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  - disable_user")
    @Description("verify user disable_user")
    @Test (priority=5,groups="smoke", description = "verify disable_user")
    public void disable_user() throws Exception {
            //TC 12.5 Disable user.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("DisabledUser"));
            Thread.sleep(1000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(2000);
            AssertionsFunction.verifyElementText(FwdPwdObj.errmsguserInactive,FwdPwdObj.userInactive);
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(4000);
            AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);
    }}