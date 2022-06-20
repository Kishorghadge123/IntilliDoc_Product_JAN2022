package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgetPwdPage
{
        WebDriver driver = null;

        By ForgetPwd = By.xpath("//a[contains(text(),'Forgot Password?')]");
        By Cancel = By.xpath("//span[contains(text(),'Cancel')]");
        By email = By.xpath("//input[@formcontrolname='email']");
        By Submit = By.xpath("//span[contains(text(),'Submit')]");
        By ErrorMsgForSW = By.xpath("//span[contains(text(),'Something Went Wrong ...!')]");
        By ErrorMsgEmailID = By.xpath("//span[contains(text(),'*Please Check Email Id ')]");
        public By userDoseNotExist=By.xpath("//span[contains(text(),'User does not exist')]");
        public By userInactive=By.xpath("//span[contains(text(),'User is inactive. Please contact Administration')]");
        public String errmsguserInactive="User is inactive. Please contact Administration";
        public String errMsguserDoseNotExist="User does not exist";
        public String forgotPwdUrl="https://alpha.neutrino-ai.com/#/forgot-password";
        public String loginPageUrl="https://alpha.neutrino-ai.com/#/login";
        public ForgetPwdPage(WebDriver driver) { this.driver = driver;}
        @Step("Click Forget PwdBtn")
        public void ClickForgetPwdBtn(){ driver.findElement(ForgetPwd).click();}
        @Step("Click Cancel Btn")
        public void ClickCancelBtn(){ driver.findElement(Cancel).click();}
        @Step("Click Email Btn")
        public void ClickEmailBtn(String text){ driver.findElement(email).sendKeys(text);}
        @Step("Click Submit Btn")
        public void ClickSubmitBtn(){ driver.findElement(Submit).click();}

        public void VerifyAssertForErrorSW (){
                String actual_msg=driver.findElement(ErrorMsgForSW).getText();
                String expect="Something Went Wrong ...!";
                Assert.assertEquals(actual_msg, expect);
        }
        public void  VerifyAssertEmailID(){
                String actual_msg=driver.findElement(ErrorMsgEmailID).getText();
                String expect="*Please Check Email Id";
                Assert.assertEquals(actual_msg, expect);
        }
    }