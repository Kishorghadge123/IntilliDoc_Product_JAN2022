package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage {

    WebDriver driver = null;

    By userName = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    By Logout = By.xpath("//span[@mattooltip='Logout']");
    By ErrorMsgBlankData = By.xpath("//span[contains (text(),'Please Enter Valid Data ...!')]");
    ////span[contains (text(),'Please Enter Valid Data ...!')]
    By ErrorMsgInvalidData = By.xpath("//span[contains (text(),'Something Went Wrong ...!')]");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods Declaration.


    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public void clickLoginButton() {
        driver.findElement(loginBtn).click();
    }

    public void ClickLogoutBtn() {
        driver.findElement(Logout).click();
    }

    public void ClearUserID() {
        driver.findElement(userName).clear();
    }

    public void ClearPWD() {
        driver.findElement(password).clear();
    }

    public void VerifyAssertError() {
        String actual_msg = driver.findElement(ErrorMsgBlankData).getText();
        String expect = "Please Enter Valid Data ...!";
        Assert.assertEquals(actual_msg, expect);
    }
    public void VerifyAssertError1() {
        String actual_msg = driver.findElement(ErrorMsgInvalidData).getText();
        String expect = "Something Went Wrong ...!";
        Assert.assertEquals(actual_msg, expect);
    }
    public void VerifyHomePage() { // url changehttps://alpha.neutrino-ai.com/#/home
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void VerifyHomePage1() { // added
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void VerifyAssertBack() {
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void VerifyAssertBack1() {  // added
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/login";
        Assert.assertEquals(actual_page, expected_page);
    }
    public void RefreshPage()
    {
        driver.navigate().refresh();
    }

    public void NavigateBack()
    {
        driver.navigate().back();
    }
}