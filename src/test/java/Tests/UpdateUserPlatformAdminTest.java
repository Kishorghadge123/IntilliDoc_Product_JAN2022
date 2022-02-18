package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)

public class UpdateUserPlatformAdminTest extends BasePage {
        static CreateUserPage UserPageObj1;

        @BeforeClass
        public void login() throws Exception {
                BasePage.driverInit();
                BasePage.LoginTest();
        }

        @AfterClass
        public void cleanUp() throws Exception {
                driver.quit();
        }

        @Test(priority = 1)
        public void update_user_enable_disable() throws Exception {
                UserPageObj1 = new CreateUserPage(driver);
                UserPageObj1.ClickUserBtn();
                Thread.sleep(5000);
                //TC 23.1 Update User enable, disable.
                UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
                Thread.sleep(2000);
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickDisableUser();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(5000);
                UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
                Thread.sleep(1000);
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickEnableUser();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(6000);
        }

        @Test(priority = 2)
        public void blank_name_valid_password() throws Exception {
                //TC 23.2 Blank Name and Valid Password.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                //UserPageObj1.UserBlankAssert();
                Thread.sleep(5000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(5000);
        }

        @Test(priority = 3)
        public void blank_username_invalid_password() throws Exception {
                //TC 23.3 Blank UserName and Invalid Password.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.ClearPassword();
                Thread.sleep(3000);
                UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(5000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(5000);
        }

        @Test(priority = 4)
        public void invalid_name_blank_password() throws Exception {
                //TC 23.4 Invalid Name Blank Password.
                UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
                Thread.sleep(2000);
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
                Thread.sleep(2000);
                UserPageObj1.ClearPassword();
                Thread.sleep(3000);
                UserPageObj1.ClickUpdateUser();
                //UserPageObj1.UserBlankAssert();
                Thread.sleep(5000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(5000);
        }

        @Test(priority = 5)
        public void blank_username_blank_password() throws Exception {
                //TC 23.5 Blank UserName Blank Password.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.ClearPassword();
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(2000);
                //UserPageObj1.UserBlankAssert();
                Thread.sleep(2000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(5000);
        }

        @Test(priority = 6)
        public void invalid_username_invalid_password() throws Exception {
                //TC 23.6 Invalid UserName Invalid Password.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClickToClearName();
                Thread.sleep(2000);
                UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
                Thread.sleep(2000);
                UserPageObj1.ClearPassword();
                Thread.sleep(2000);
                UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                //UserPageObj1.UserBlankAssert();
                Thread.sleep(2000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(5000);
        }

        @Test(priority = 7)
        public void valid_name_and_blank_password() throws Exception {
                //TC 23.7 Valid Name and Blank password.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClearPassword();
                Thread.sleep(3000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(5000);
                UserPageObj1.UpdateTimeAssert();
                Thread.sleep(2000);
        }

        @Test(priority = 8)
        public void all_combinations_of_password_policy_as_userid() throws Exception {
                //TC 23.8 All combination to verify password Policy-Password same as userid.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClearPassword();
                Thread.sleep(3000);
                UserPageObj1.EnterPassword(ReadProps.readAttr("MailPwd"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(2000);
                UserPageObj1.ClickOnCancelBtn();
                Thread.sleep(2000);
        }

        @Test(priority = 9)
        public void password_field_contains_alphabet_digit_special_char() throws Exception {
                //TC 23.9 The password field should only contain alphabets, digits, and special characters.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClearPassword();
                Thread.sleep(3000);
                UserPageObj1.EnterPassword(ReadProps.readAttr("SpecialCharPwd"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(4000);
        }

        @Test(priority = 10)
        public void password_field_must_have_at_least_one_upper_lower_alphabet()  throws Exception{
                //TC 23.10 The password field must have at least 1 uppercase and 1 lowercase alphabet.
                UserPageObj1.SelectSearchedUser();
                Thread.sleep(1000);
                UserPageObj1.ClearPassword();
                Thread.sleep(3000);
                UserPageObj1.EnterPassword(ReadProps.readAttr("UpperLowerCasePwd"));
                Thread.sleep(2000);
                UserPageObj1.ClickUpdateUser();
                Thread.sleep(5000);
        }

        @Test(priority = 11)
        public void password_field_must_have_length_to_be_minimum_eight() throws Exception{
        //TC 23.11 The password field length has to be minimum 8.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("UpperLowerCasePwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(5000);
}
@Test(priority = 12)
        public void password_field_length_max_length_twelve() throws Exception {
        //TC 23.12 The password field length has to be maximum 12.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("MaxLimit"));
        Thread.sleep(2000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(5000);
}
@Test(priority = 13)
        public void only_alphabets() throws Exception {
        //TC 23.13 Only Alphabets.
        UserPageObj1.SelectSearchedUser();
        Thread.sleep(2000);
        UserPageObj1.ClearPassword();
        Thread.sleep(3000);
        UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyAlphabets"));
        Thread.sleep(3000);
        UserPageObj1.ClickUpdateUser();
        Thread.sleep(3000);
}
//            //Only Digits
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(3000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyDigits"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//OnlyDigits.jpg");
//            Thread.sleep(3000);
//            UserPageObj1.ClickOnCancelBtn();
//            Thread.sleep(3000);
//
//            //Only SpecialCharacter
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(2000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("OnlySpecialChar"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//OnlySpecialChar.jpg");
//            Thread.sleep(2000);
//            UserPageObj1.ClickOnCancelBtn();
//            Thread.sleep(4000);
//
//            //The password field length has to be maximum 13
//
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(3000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("Password"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//Password.jpg");
//            Thread.sleep(2000);
//            UserPageObj1.ClickOnCancelBtn();
//            Thread.sleep(4000);
//
//            //Only UpperCase
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(3000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyUpperCase"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//OnlyUpperCase.jpg");
//            Thread.sleep(2000);
//            UserPageObj1.ClickOnCancelBtn();
//            Thread.sleep(4000);
//
//            //Only LowerCase
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(3000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyLowerCase"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//OnlyLowerCase.jpg");
//            Thread.sleep(2000);
//            UserPageObj1.ClickOnCancelBtn();
//            Thread.sleep(4000);
//
//            // Only LessLowerLimit  less than minimum password length 7
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(3000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("LessLowerLimit"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//LessLowerLimit.jpg");
//            Thread.sleep(2000);
//            UserPageObj1.ClickOnCancelBtn();
//            Thread.sleep(4000);
//
//            //Valid Update scenario required
//            UserPageObj1.SelectSearchedUser();
//            Thread.sleep(3000);
//            UserPageObj1.ClickToClearName();
//            Thread.sleep(5000);
//            UserPageObj1.EnterUserName(ReadProps.readAttr("ValidNameUP"));
//            Thread.sleep(2000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(2000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("ValidPWDUP"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(3000);
//            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//UpdateWithValid.jpg");
//            Thread.sleep(4000);
//
//
//            //Remove update for script maintained only
//            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
//            Thread.sleep(2000);
//            UserPageObj1.SelectUpdatedUser();
//            Thread.sleep(1000);
//            UserPageObj1.ClickToClearName();
//            Thread.sleep(2000);
//            UserPageObj1.EnterUserName(ReadProps.readAttr("Username"));
//            Thread.sleep(2000);
//            UserPageObj1.ClearPassword();
//            Thread.sleep(2000);
//            UserPageObj1.EnterPassword(ReadProps.readAttr("ValidPWD"));
//            Thread.sleep(2000);
//            UserPageObj1.ClickUpdateUser();
//            Thread.sleep(4000);
//            UserPageObj1.LogOut();

        }

