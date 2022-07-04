package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.Custome_Wait;
import Utilities.LoginUser;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.*;

@Feature("UpdateUserPlatformAdminTest")
@Listeners(Utilities.TestListeners.class)

public class UpdateUserPlatformAdminTest extends BasePage {
    static CreateUserPage UserPageObj1;
    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  -  update_user_enable_disable")
    @Description("verify user able to  update_user_enable_disable")
    @Test (priority=1,groups="smoke", description = "verify  update_user_enable_disable")

    public void update_user_enable_disable() throws Exception {
        UserPageObj1 = new CreateUserPage(driver);
        UserPageObj1.clickOnUserMenu();
        //TC 23.1 Update User enable, disable.
        //TC 23.10 Verify for platform admin that search request should get hit by entering name of user
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
        UserPageObj1.selectSearchedUser();
        UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj1.clickOnUpdateUserButton();
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
        UserPageObj1.selectSearchedUser();
        UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
        UserPageObj1.clickOnUpdateUserButton();
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
Thread.sleep(1000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  -  blank_name_valid_password")
    @Description("verify user able to  blank_name_valid_password")
    @Test (priority=2,groups="smoke", description = "verify blank_name_valid_password")

    public void blank_name_valid_password() throws Exception {
        //TC 23.2 Blank Name and Valid Password.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(4000);
        UserPageObj1.ClickOnCancelBtn();
Thread.sleep(4000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);

    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  -  update_user_enable_disable")
    @Description("verify user able to  update_user_enable_disable")
    @Test (priority=3,groups="smoke", description = "verify  update_user_enable_disable")

    public void blank_username_invalid_password() throws Exception {
        //TC 23.3 Blank UserName and Invalid Password.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("pwd"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);

        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);


    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  -  invalid_name_blank_password")
    @Description("verify user able to  invalid_name_blank_password")
    @Test (priority=4,groups="smoke", description = "verify  invalid_name_blank_password")

    public void invalid_name_blank_password() throws Exception {
        //TC 23.4 Invalid Name Blank Password.
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
        UserPageObj1.clearUserPassword();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText("Please enter only characters.",UserPageObj1.errormsgInvalidName);
        Thread.sleep(1000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  -blank_username_blank_password  ")
    @Description("verify user able to  blank_username_blank_password")
    @Test (priority=5,groups="smoke", description = "verify blank_username_blank_password")

    public void blank_username_blank_password() throws Exception {
        //TC 23.5 Blank UserName Blank Password.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.clearUserPassword();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);

        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006  -  invalid_username_invalid_password")
    @Description("verify user able to  invalid_username_invalid_password")
    @Test (priority=6,groups="smoke", description = "verify  invalid_username_invalid_password")

    public void invalid_username_invalid_password() throws Exception {
        //TC 23.6 Invalid UserName Invalid Password.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("pwd"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        //AssertionsFunction.verifyElementText("Please enter a valid user name.",UserPageObj1.errormsgBlankDataCreateRoleClick);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007  -  valid_name_and_blank_password")
    @Description("verify user able to  valid_name_and_blank_password")
    @Test (priority=7,groups="smoke", description = "verify  valid_name_and_blank_password")

    public void valid_name_and_blank_password() throws Exception {
        //TC 23.7 Valid Name and Blank password.//Not showing error by Automation
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
        Thread.sleep(1000);   }






    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008  -  password_field_contains_alphabet_digit_special_char")
    @Description("verify user able to  password_field_contains_alphabet_digit_special_char")
    @Test (priority=8,groups="smoke", description = "verify  password_field_contains_alphabet_digit_special_char")


    public void password_field_contains_alphabet_digit_special_char() throws Exception {
        //TC 23.9 The password field should only contain alphabets, digits, and special characters.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("SpecialCharPwd"));
        UserPageObj1.clickOnUpdateUserButton();
            Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(UserPageObj1.userTabUrl);
            Thread.sleep(1000);

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009  -  password_field_must_have_at_least_one_upper_lower_alphabet")
    @Description("verify user able to password_field_must_have_at_least_one_upper_lower_alphabet")
    @Test (priority=9,groups="smoke", description = "verify  password_field_must_have_at_least_one_upper_lower_alphabet")

    public void password_field_must_have_at_least_one_upper_lower_alphabet() throws Exception {
        //TC 23.10 The password field must have at least 1 uppercase and 1 lowercase alphabet.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("UpperLowerCasePwd"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010  - password_field_must_have_length_to_be_minimum_eight")
    @Description("verify user able to password_field_must_have_length_to_be_minimum_eight")
    @Test (priority=10,groups="smoke", description = "verify password_field_must_have_length_to_be_minimum_eight")

    public void password_field_must_have_length_to_be_minimum_eight() throws Exception {
        //TC 23.11 The password field length has to be minimum 8.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("UpperLowerCasePwd"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 011  - password_field_length_max_length_twelve")
    @Description("verify user able to password_field_length_max_length_twelve")
    @Test (priority=11,groups="smoke", description = "verify  password_field_length_max_length_twelve")

    public void password_field_length_max_length_twelve() throws Exception {
        //TC 23.12 The password field length has to be maximum 12.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("MaxLimit"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012  -  only_alphabets")
    @Description("verify user able to  only_alphabets")
    @Test (priority=12,groups="smoke", description = "verify  only_alphabets")

    public void only_alphabets() throws Exception {
        //TC 23.13 Only Alphabets.
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("OnlyAlphabets"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013  -  password_field_onlyDigits")
    @Description("verify user able to  update_user_enable_disable")
    @Test (priority=13,groups="smoke", description = "verify  password_field_onlyDigits")

    public void password_field_onlyDigits() throws Exception {

        //Only Digits
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("OnlyDigits"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
       UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);

        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  -  password_field_onlySpecial_charectors")
    @Description("verify user able to password_field_onlySpecial_charectors")
    @Test (priority=14,groups="smoke", description = "verify password_field_onlySpecial_charectors")

    public void password_field_onlySpecial_charectors() throws Exception {

        //Only SpecialCharacter
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("OnlySpecialChar"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgPWD);
        Thread.sleep(1000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);

    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 015  -  password_field_onlyUpperCase")
    @Description("verify password_field_onlyUpperCase")
    @Test (priority=15,groups="smoke", description = "verify  password_field_onlyUpperCase")

    public void password_field_onlyUpperCase() throws Exception
    {
        //Only UpperCase
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("OnlyUpperCase"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgOnlyUpperCaseChar);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 016  -  password_field_onlyLowerCase")
    @Description("verify user able to  password_field_onlyLowerCase")
    @Test (priority=16,groups="smoke", description = "verify password_field_onlyLowerCase")

    public void password_field_onlyLowerCase() throws Exception {

        //Only LowerCase
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("OnlyLowerCase"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgOnlylowerCaseChar);
        Thread.sleep(2000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 017  -  password_field_LessThan8CharLimit")
    @Description("verify user able to password_field_LessThan8CharLimit")
    @Test (priority=17,groups="smoke", description = "verify  password_field_LessThan8CharLimit")

    public void password_field_LessThan8CharLimit() throws Exception {


        // Only LessLowerLimit  less than minimum password length 7
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("LessLowerLimit"));
        UserPageObj1.clickOnUpdateUserButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(CreateUserPage.ErrMsgLwrLimitPWD);
        Thread.sleep(1000);
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);

        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);
    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 018  -  cancelUpdate")
    @Description("verify user able to  cancelUpdate")
    @Test (priority=18,groups="smoke", description = "verify cancelUpdate")

    public void cancelUpdate() throws Exception
    {

        UserPageObj1.selectSearchedUser();
        UserPageObj1.ClickOnCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(UserPageObj1.CreateUserBtn);
        Thread.sleep(1000);


    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 019  -  userUpdateValidData")
    @Description("verify userUpdateValidData")
    @Test (priority=19,groups="smoke", description = "verify  userUpdateValidData")

    public void userUpdateValidData() throws Exception {


        //Valid Update scenario required
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.EnterNewUserName(ReadProps.readAttr("ValidNameUP"));
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("ValidPWDUP"));
        UserPageObj1.clickOnUpdateUserButton();
Thread.sleep(2000);
        //Remove update for script maintained only
        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
        UserPageObj1.selectSearchedUser();
        UserPageObj1.clearUserName();
        UserPageObj1.EnterNewUserName(ReadProps.readAttr("Username"));
        UserPageObj1.clearUserPassword();
        UserPageObj1.enterUserPassword(ReadProps.readAttr("ValidPWD"));
        UserPageObj1.clickOnUpdateUserButton();
        AssertionsFunction.isPresent(UserPageObj1.UpdateUser);
        Thread.sleep(2000);

    }

}