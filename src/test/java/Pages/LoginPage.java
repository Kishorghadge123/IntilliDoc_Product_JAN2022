package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver = null;

    //locator
    public By usererrmsg=By.xpath("//span[text()='User is inactive. Please contact Administration']");
    @FindBy (xpath="//label[text()='Email Id']//following::input[1]")
    WebElement userName;
    @FindBy (xpath="//input[@formcontrolname='password']")
    WebElement password;
    @FindBy (xpath="//button[@type='submit']")
    WebElement loginBtn;
    @FindBy (xpath="//span[@mattooltip='Logout']")
    WebElement Logout;
    @FindBy (xpath="//span[contains (text(),'Please Enter Valid Data ...!')]")
    WebElement ErrorMsgInvalidData;
    @FindBy (xpath="//span[contains (text(),'Something Went Wrong ...!')]")
    WebElement ErrorMsgDisableUser;
    @FindBy (xpath="//span[text()='User is inactive. Please contact Administration']")
    WebElement ErrorMsgIdPwdSame;
    @FindBy (xpath="//span[text()='Password cannot be email Id']")
    WebElement ErrMsgIdPwdSame;

    @FindBy (xpath="//span[contains (text(),'Please Enter Valid Data ...!')]")
    WebElement ErrorMsgBlankData;

    //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Step("EnterUsername")
    public void EnterUsername(String text) throws Exception
    {
        Custome_Wait.waitElement(driver,userName);
        driver.navigate().refresh();
        userName.sendKeys(text);
    }

    //Methods Declaration.
    @Step("setPassword")
    public void setPassword(String text) throws Exception{
        Custome_Wait.waitElement(driver,password);
        password.sendKeys(text);
    }


    @Step("clickLoginButtonForValidInput")
    public void clickLoginButtonForValidInput() throws Exception
    {

        loginBtn.click();
        Thread.sleep(10000);
    }

    @Step("clickOnLoginButtonForInvalidInput")
    public void clickOnLoginButtonForInvalidInput() throws Exception
    {
        Custome_Wait.waitElement(driver,loginBtn);
        loginBtn.click();
    }


    @Step("ClickLogoutBtn")
    public void ClickLogoutBtn() throws Exception
    {
        Thread.sleep(5000);
        Custome_Wait.waitElement(driver,Logout);
        Logout.click();
        Thread.sleep(5000);

    }

    public void ClearUserID() throws Exception{


        userName.clear();
    }

    public void ClearPWD() throws Exception{

        password.clear();
    }

    public void VerifyAssertError() {

        String actual_msg = ErrorMsgBlankData.getText();
        String expect = "Please Enter Valid Data ...!";
        Assert.assertEquals(actual_msg, expect);
    }
    public void VerifyAssertError1() {
        String actual_msg = ErrorMsgInvalidData.getText();
        String expect = "Something Went Wrong ...!";
        Assert.assertEquals(actual_msg, expect);
    }
    public void VerifyHomePage() throws Exception{ // url changehttps://alpha.neutrino-ai.com/#/home
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

    @Step(" click on RefreshPage")
    public void RefreshPage() throws Exception
    {
        driver.navigate().refresh();
        Thread.sleep(3000);
    }

    @Step(" click on NavigateBack")
    public void NavigateBack()
    {
        driver.navigate().back();
    }

    public void accessPermission(String TabName) throws Exception {
        switch (TabName){



            case "User":
            {
                Thread.sleep(3000);
                driver.findElement(CreateUserPage.UserBtn).click();
                driver.findElement(By.xpath("//*[text()=' Action ']//following::tr[1]/td[1]")).click();
                break;

            }

            case "Role":
            {
                AssertionsFunction.verifyElementPresent(CreateRolePage.RoleManagementBtn);
                driver.findElement(CreateRolePage.RoleManagementBtn).click();

                Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[text()='Roles ']")));
                AssertionsFunction.verifyElementPresent(CreateRolePage.CreateRoleBtn);

                driver.findElement(By.xpath("//tbody[@role='rowgroup']/tr[1]/td[5]")).click();

                AssertionsFunction.verifyElementPresent(CreateRolePage.ClickUpdateBtn);

                break;

            }

            case "Templates":
            {
                AssertionsFunction.verifyElementPresent(TemplatePage.TemplateBtn);
                driver.findElement(TemplatePage.TemplateBtn).click();
                Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[text()=' Templates ']")));
                AssertionsFunction.verifyElementPresent(TemplatePage.UploadTemplate);
                break;
            }

            case "Dataset":
            {

                AssertionsFunction.verifyElementPresent(DatasetPage.DatasetBtn);
                driver.findElement(DatasetPage.DatasetBtn).click();
                Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[text()=' Category ']")));
                AssertionsFunction.verifyElementPresent(DatasetPage.AddCategoryBtn);
                break;
            }
            case "Projects":
            {
                AssertionsFunction.verifyElementPresent(ProjectPage.ProjectBtn);
                driver.findElement(ProjectPage.ProjectBtn).click();
                Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']")));
                AssertionsFunction.verifyElementPresent(ProjectPage.CreateProject);
                break;
            }

            case "Documents":
            {
                AssertionsFunction.verifyElementPresent(DocumentPage.DocumentBtn);
                driver.findElement(DocumentPage.DocumentBtn).click();
                Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[text()=' Documents ']")));
                AssertionsFunction.verifyElementPresent(DocumentPage.DocumentTable);
                break;
            }
            case "Analytics":
            {
                AssertionsFunction.verifyElementPresent(AnalyticsPage.AnalyticsBtn);
                driver.findElement(AnalyticsPage.AnalyticsBtn).click();
                Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[text()='Project Statistics']")));
                AssertionsFunction.verifyElementPresent(AnalyticsPage.AnalyticsPageDisplay);
                break;
            }
            default:
            {
                System.out.println("Wrong Tab Name Entered");
            }

        }
    }


}