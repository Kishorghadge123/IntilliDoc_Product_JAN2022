package Pages;
import Base.BasePage;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class CreateUserPage extends BasePage
{
    public static By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    public static By CreateUserBtn = By.xpath("//span[text()=' Create User ']");
    By CreateBtn = By.xpath("//span[text()='Create']");
    By EnterUserName = By.xpath("//input[@formcontrolname='name']");
    By EnterEmail  = By.xpath("//input[@formcontrolname='email']");
    By enableDisableUserButton = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By errorMessageForWrongInput=By.xpath("//simple-snack-bar[@class='mat-simple-snackbar ng-star-inserted']");
    By ValidationUserName=By.xpath("//mat-error[text()='Please enter only characters.']");
    By ValidationEmailID=By.xpath("//mat-error[text()='Please enter a valid email id.']");
    By searchUser  = By.xpath("//input[@data-placeholder='Search']");
    By selectSearchedUser=By.xpath("//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-star-inserted']");

    public static By UpdateUser  = By.xpath("//span[contains(text(),'Update')]");
    public static By updatedDateAndTime=By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    public static By createdDateAndTime =By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");
    By sortUserByName=By.xpath("//div[text()='Name ']");
    By Password  = By.xpath("//input[@formcontrolname='password']");
    By logout = By.xpath("//span[@mattooltip='Logout']");
    By ProfileIcon=By.xpath("//div[@class='profileImageIcon ng-star-inserted']");
    By cancelButton=By.xpath("//span[text()='Cancel']");
    public  String userTabUrl="https://alpha.neutrino-ai.com/#/home/user-management";
    public String createUserUrl="https://alpha.neutrino-ai.com/#/home/user-management/create-user";

    public CreateUserPage(WebDriver driver) throws IOException
    {
        BasePage.driver = driver;
    }
    @Step("click On Create Role Button")
    public void ProfileIconClick() throws Exception
    {
        driver.findElement(ProfileIcon).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
    }

    @Step("click On User Menu")
    public  void clickOnUserMenu()
    {
        driver.findElement(UserBtn).click();
    }

    public By getValidationEmailID()
    {
        return this.ValidationEmailID;
    }
    public By getValidationUserName()
    {
        return this.ValidationUserName;
    }
    public By getUser()
    {
        return this.selectSearchedUser;
    }
    public By getcreatedUser_withDisabledStatus()
    {
        return this.enableDisableUserButton;
    }
    public By GetcreatedUser()
    {
        return this.selectSearchedUser;
    }
    @Step("Click On Cancel Button")
    public  void ClickOnCancelBtn()throws Exception
    {

        driver.findElement(cancelButton).click();
    }
    @Step("click On createuser Button")
    public void ClickCreateUserBtn() throws Exception
    {
        Thread.sleep(5000);
        Custome_Wait.wait(driver,CreateUserBtn);
        driver.findElement(CreateUserBtn).click();
    }
    @Step("Click Create Button")
    public void ClickCreateBtn()throws Exception
    {
        Thread.sleep(5000);
        Custome_Wait.wait(driver,CreateBtn);
        driver.findElement(CreateBtn).click();
    }
    @Step("Enter New User Name")
    public void EnterNewUserName(String userName) throws Exception
    {
        Random r=new Random();
        char first_c = (char)(r.nextInt(26) + 'a');
        char second_c = (char)(r.nextInt(26) + 'a');
        driver.findElement(EnterUserName).sendKeys(userName+first_c+second_c);
    }
    @Step("Enter Existing UserName or InvalidUserName")
    public void EnterExistingUserName_or_InvalidUserName(String text) throws Exception
    {
        driver.findElement(EnterUserName).sendKeys(text);
    }
    @Step("Enter Email")
    public void EnterEmail(String emialID)throws Exception
    {
        Random r=new Random();
        char first_c = (char)(r.nextInt(26) + 'a');
        char second_c = (char)(r.nextInt(26) + 'a');
        driver.findElement(EnterEmail).sendKeys(first_c+second_c+emialID);
    }
    @Step("Search Created User")
    public  void SearchCreatedUser(String text)throws Exception
    {
        driver.findElement(searchUser).sendKeys(text);
    }
    @Step("select Searched User")
    public  void selectSearchedUser()throws Exception
    {
         Custome_Wait.wait(driver,selectSearchedUser);
        driver.findElement(selectSearchedUser).click();
        Thread.sleep(5000);

    }
    @Step("Click On Enable Or Disable User Selection Toggle")
    public void ClickOnEnableOrDisableUserSelectionToggle()throws Exception
    {
        Thread.sleep(1000);
        Custome_Wait.wait(driver,enableDisableUserButton);
        driver.findElement(enableDisableUserButton).click();
    }
    @Step("click On Update User Button")
    public void clickOnUpdateUserButton()throws Exception
    {
        driver.findElement(UpdateUser).click();
        Thread.sleep(5000);
    }
    @Step("Click On Sort User Arrow")
    public void ClickOnSortUserArrow()throws Exception
    {
        driver.findElement(sortUserByName).click();
    }
    @Step("clear User Name")
    public void clearUserName() throws Exception
    {
        driver.findElement(EnterUserName).clear();
    }
    @Step("clear User Password")
    public  void clearUserPassword()throws Exception
    {
        driver.findElement(Password).clear();
    }
    @Step("enter User Password")
    public void enterUserPassword(String text)throws Exception
    {
        driver.findElement(Password).sendKeys(text);
    }
    @Step("get Updated Time And Date")
    public String getUpdatedTimeAndDate()
    {
        return driver.findElement(updatedDateAndTime).getText();
    }
    public  String errmsg="Please enter all the details before submitting.";
    public  By errmsgBlankDataCreateRoleClick=By.xpath("//span[contains(text(),'Please enter all the details before submitting.')]");
    public static By ErrMsgOnlyDigitsPWD = By.xpath("//mat-error[text()=' A password should contain an uppercase and lowercase characters.  ']");
    public static By ErrMsgPWD = By.xpath("//mat-error[text()=' A password should contain an uppercase and lowercase characters. and in between 8 to 12  ']");
    public static By ErrMsgOnlyUpperCaseChar = By.xpath("//mat-error[text()=' A password should contain and lowercase characters.  ']");
    public static By ErrMsgOnlylowerCaseChar = By.xpath("//mat-error[text()=' A password should contain an uppercase  ']");
    public static By ErrMsgLwrLimitPWD = By.xpath("//mat-error[text()=' A password should be minimum 8 characters long.  ']");

}