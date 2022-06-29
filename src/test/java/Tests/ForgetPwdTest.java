package Tests;
import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import Utilities.Custome_Wait;

@Listeners(Utilities.TestListeners.class)
public class ForgetPwdTest extends BasePage {
    static ForgetPwdPage FwdPwdObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
//    @AfterClass()
//    public void cleanUp() throws Exception {
//        driver.quit();
//    }

    @Test(priority = 1)
    public void click_on_cancel_button_on_forgot_password() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();

        FwdPwdObj = new ForgetPwdPage(driver);
        //12.1 Click on Cancel button on Forgot Password Screen.
        FwdPwdObj.ClickForgetPwdBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='email']")));
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
        FwdPwdObj.ClickCancelBtn();

        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);

    }

    @Test(priority = 2)
    public void first_login_not_done() throws Exception {
        //TC 12.2 First Login is not Done By the User.
        FwdPwdObj.ClickForgetPwdBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='email']")));

        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
        FwdPwdObj.ClickSubmitBtn();
        AssertionsFunction.isPresent(FwdPwdObj.Submit);
        Thread.sleep(3000);


    }

    @Test(priority = 3)
    public void user_not_exists() throws Exception {
        //12.4 User Does not Exist.
        Thread.sleep(4000);
        FwdPwdObj.ClickForgetPwdBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='email']")));
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid2"));
        FwdPwdObj.ClickSubmitBtn();
        // changes by priyanka  AssertionsFunction.verifyElementText(FwdPwdObj.errMsguserDoseNotExist,FwdPwdObj.userDoseNotExist);
        FwdPwdObj.ClickCancelBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='userName']")));

        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);

    }
    @Test(priority = 4)
    public void invalid_email() throws Exception {
        //TC 12.3 Invalid EmailID.

        FwdPwdObj.ClickForgetPwdBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='email']")));
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid1"));
        FwdPwdObj.VerifyAssertEmailID();
        FwdPwdObj.ClickCancelBtn();
        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);


    }
    @Test(priority = 5)
    public void disable_user() throws Exception {
        //TC 12.5 Disable user.
        FwdPwdObj.ClickForgetPwdBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='email']")));
        //AssertionsFunction.verifyTargetPageURL(FwdPwdObj.forgotPwdUrl);
        FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("DisabledUser"));
        FwdPwdObj.ClickSubmitBtn();
        //AssertionsFunction.verifyElementText(FwdPwdObj.errmsguserInactive,FwdPwdObj.userInactive);
        FwdPwdObj.ClickCancelBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//input[@formcontrolname='userName']")));

        AssertionsFunction.verifyTargetPageURL(FwdPwdObj.loginPageUrl);


    }



}