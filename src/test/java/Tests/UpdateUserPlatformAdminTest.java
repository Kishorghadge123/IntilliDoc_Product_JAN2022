package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)
public class UpdateUserPlatformAdminTest extends BasePage {
    @Test
    public void PlatformAdminUpdateUserFlow() throws Exception {
            BasePage.LoginTest();
            CreateUserPage UserPageObj1 = new CreateUserPage(driver);
            test.log(LogStatus.INFO, "PlatformAdminUpdateUser");
            test.log(LogStatus.PASS, "TestPassed");
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
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//EditUserFile.jpg");
            Thread.sleep(5000);
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
            Thread.sleep(1000);
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClickEnableUser();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//EnableUser.jpg");
            Thread.sleep(6000);

            //TC 23.2 Blank Name and Valid Password.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//BlankName.jpg");
            //UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(5000);

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
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidPassword.jpg");
            Thread.sleep(5000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(5000);

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
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidName.jpg");
            //UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(5000);

            //TC 23.5 Blank UserName Blank Password.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//BlankCredentials.jpg");
            //UserPageObj1.UserBlankAssert();
            Thread.sleep(2000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(5000);

            //TC 23.6 Invalid UserName Invalid Password.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClickToClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidCredentialsErrMsg.jpg");
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(2000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidCredentials.jpg");
            //UserPageObj1.UserBlankAssert();
            Thread.sleep(2000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(5000);

            //TC 23.7 Valid Name and Blank password.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//BlankPwd.jpg");
            Thread.sleep(5000);
            UserPageObj1.UpdateTimeAssert();
            Thread.sleep(2000);

            //TC 23.8 All combination to verify password Policy-Password same as userid.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("MailPwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//PwdSameAsUserid.jpg");
            Thread.sleep(2000);
            UserPageObj1.ClickOnCancelBtn();
            Thread.sleep(2000);

            //TC 23.9 The password field should only contain alphabets, digits, and special characters.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("SpecialCharPwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//SpecialCharPwd.jpg");
            Thread.sleep(4000);

            //TC 23.10 The password field must have at least 1 uppercase and 1 lowercase alphabet.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("UpperLowerCasePwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//UpperLowerCasePwd.jpg");
            Thread.sleep(4000);

            //TC 23.11 The password field length has to be minimum 8.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("UpperLowerCasePwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//Min8char.jpg");
            Thread.sleep(4000);

            //TC 23.12 The password field length has to be maximum 12.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("MaxLimit"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//MaxLimit.jpg");
            Thread.sleep(4000);

            //TC 23.13 Only Alphabets.
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("OnlyAlphabets"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminUpdateUser//OnlyAlphabets.jpg");
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(3000);

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
            Thread.sleep(4000);
            driver.close();
    }
}
