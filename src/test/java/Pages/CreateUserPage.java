package Pages;
import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class CreateUserPage extends BasePage
{
    By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    By CreateUserBtn = By.xpath("//button[@class='mat-focus-indicator font-17 float-right btn-xs-block mat-raised-button mat-button-base mat-primary ng-star-inserted']");
    By CreateBtn = By.xpath("//button[@class='mat-focus-indicator float-right button-cls mat-raised-button mat-button-base mat-primary']");
    By EnterUserName = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-user[1]/div[1]/form[1]/mat-card[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By EnterEmail  = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-user[1]/div[1]/form[1]/mat-card[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By ActiveUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By SearchBtn  = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-user-management[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By DisableUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By UpdateUser  = By.xpath("//button[@class='mat-focus-indicator float-right button-cls mat-raised-button mat-button-base mat-primary']");
    By Password  = By.xpath("//input[@type='password']");
    By PlatformUser = By.xpath("//td[contains(text(),' AutoSampleBB ')]");
    By UserUpdated = By.xpath("//td[contains(text(),' AutoSampleUpdate ')]");
    By AdminUser = By.xpath("//td[contains(text(),' AutoAdminUserS ')]");//Change everytime before u run.
    By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    By CreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");
    By logout = By.xpath("//span[@mattooltip='Logout']");
    By CancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    By username = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    //By BlankErrorMsg = By.xpath(("//span[contains(text(),'Please Check Form Detail ...!')]"));
    By ExistErrorMsg = By.xpath("//span[contains(text(),'User exists with email sampleemail@email.com')]");

    public CreateUserPage(WebDriver driver) {
        BasePage.driver = driver;
    }
    public  void ClickUserBtn(){driver.findElement(UserBtn).click();}
    public  void ClickOnCancelBtn(){driver.findElement(CancelButton).click();}
    //public void ClickCancelBtn(){driver.findElement(CancelBtn).click();}
    public void ClickCreateUserBtn(){driver.findElement(CreateUserBtn).click();}
    public void ClickCreateBtn(){driver.findElement(CreateBtn).click();}
    public void EnterUserName(String text) {driver.findElement(EnterUserName).sendKeys(text);}
    public void EnterEmail(String text){driver.findElement(EnterEmail).sendKeys(text);}
    public void ClickActiveUser(){driver.findElement(ActiveUser).click();}

    public  void SearchCreatedUser(String text){driver.findElement(SearchBtn).sendKeys(text);}
    public  void SelectSearchedUser(){driver.findElement(PlatformUser).click();}
    public  void SelectSearchedAdminUser(){driver.findElement(AdminUser).click();}//change this value
    public void ClickDisableUser(){driver.findElement(DisableUser).click();}
    public void ClickEnableUser(){driver.findElement(DisableUser).click();}
    public void ClickUpdateUser(){driver.findElement(UpdateUser).click();}
    public void ClickToClearName(){driver.findElement(EnterUserName).clear();}
    public  void ClearPassword(){driver.findElement(Password).clear();}
    public void EnterPassword(String text){driver.findElement(Password).sendKeys(text);}

    SoftAssert softAssert = new SoftAssert();

    public void CreateUserAssert() {
        String[] User = driver.findElement(PlatformUser).getText().split(" ");
        String ActualUser = User[1].trim();
        String ExpectedUser = "AutoSampleBB";
        softAssert.assertEquals(ActualUser, ExpectedUser);
    }
    public void CreateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        softAssert.assertEquals(UpdateTime, CreateTime);

    }
//    public void UserBlankAssert()
//    {
//        String ActBlankErrMsg=driver.findElement(BlankErrorMsg).getText();
//        String ExpctdBlankErrMsg="Please Check Form Detail ...!";
//        softAssert.assertEquals(ActBlankErrMsg, ExpctdBlankErrMsg);
//    }
    public void UserExistAssert()
    {
        String ActExistErrMsg = driver.findElement(ExistErrorMsg).getText();
        String ExpctdExistErrMsg ="User exists with email sampleemail@email.com";
        softAssert.assertEquals(ActExistErrMsg, ExpctdExistErrMsg);
    }
    public void UpdateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        softAssert.assertNotEquals(UpdateTime,CreateTime);
    }

    public void AssertAll()
    {
        softAssert.assertAll();
    }

    public void LogOut()
    {
        driver.findElement(logout).click();
    }

    public void setUsername(String text) {
        driver.findElement(username).sendKeys(text);
    }
    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }
    public void clickLoginButton() {
        driver.findElement(loginBtn).click();
    }
    public void SelectUpdatedUser()
    {
        driver.findElement(UserUpdated).click();
    }
}