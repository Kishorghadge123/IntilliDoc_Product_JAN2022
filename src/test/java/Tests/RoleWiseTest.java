package Tests;
import Base.BasePage;
import Pages.RoleAccessPage;
import Utilities.ReadProps;
import Utilities.AssertionsFunction;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import Utilities.Custome_Wait;
import org.testng.asserts.Assertion;

@Feature("Role Wise Test")
@Listeners(Utilities.TestListeners.class)
public class RoleWiseTest extends BasePage {
    static RoleAccessPage roleAccessObj;
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


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 - login_with_valid_username_password")
    @Description("verify user able to login_with_valid_username_password")
    @Test (priority=1,groups="smoke", description = " verify login_with_valid_username_password")

    public void login_with_valid_username_password() throws InterruptedException, IOException {
        roleAccessObj = new RoleAccessPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        //TC 19.1 Admin Role Login with valid Username and Valid password
        roleAccessObj.setUsername(ReadProps.readAttr("AdminUser"));
        roleAccessObj.setPassword(ReadProps.readAttr("AdminPwd"));
        roleAccessObj.clickLoginButton();
        Thread.sleep(10000);
        AssertionsFunction.verifyTargetPageURL(roleAccessObj.rolepageurl);

    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 - admin_role_access_users_tab")
    @Description("verify user able to admin_role_access_users_tab")
    @Test (priority=2,groups="smoke", description = " verify admin_role_access_users_tab")

    public void admin_role_access_users_tab() throws InterruptedException, IOException {
        //TC 19.2 Admin Role Access Users tab.

        roleAccessObj.Double_clickAdminUser();
        //   roleAccessObj.verify_admin_role_access_users_tab();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        Thread.sleep(2000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - admin_role_access_roles_tab")
    @Description("verify user able to admin_role_access_roles_tab")
    @Test (priority=3,groups="smoke", description = " verify admin_role_access_roles_tab")


    public void admin_role_access_roles_tab() throws InterruptedException, IOException {
        //TC 19.3 Admin Role Access Roles tab.

        roleAccessObj.clickAdminRole();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
        AssertionsFunction.verifyTargetPageURL(roleAccessObj.crateroleurl);
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004 - admin_role_access_templates_tab")
    @Description("verify user able to admin_role_access_templates_tab")
    @Test (priority=4,groups="smoke", description = " verify admin_role_access_templates_tab")

    public void admin_role_access_templates_tab() throws InterruptedException, IOException {
        //TC 19.4 Admin Role Access Templates tab.
        roleAccessObj.clickAdminTemplate();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//div[contains(text(),' Templates ')]")));
        roleAccessObj.verify_supervisor_role_access_template();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005 - admin_role_access_project_tab")
    @Description("verify user able to admin_role_access_project_tab")
    @Test (priority=5,groups="smoke", description = " verify admin_role_access_project_tab")

    public void admin_role_access_project_tab() throws InterruptedException, IOException {
        //TC 19.5 Admin Role Access Project tab.
        roleAccessObj.clickAdminProject();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        roleAccessObj.verify_admin_role_access_project_tab();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - admin_role_access_analytics_tab")
    @Description("verify user able to admin_role_access_analytics_tab")
    @Test (priority=6,groups="smoke", description = " verify admin_role_access_analytics_tab")


    public void admin_role_access_analytics_tab() throws InterruptedException, IOException {
        //TC 19.6 Admin Role Access Analytics tab.
        roleAccessObj.clickAdminAnalytic();
        Thread.sleep(5000);

    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 - admin_role_access_logout")
    @Description("verify user able to admin_role_access_logout")
    @Test (priority=7,groups="smoke", description = " verify admin_role_access_logout")

    public void admin_role_access_logout() throws InterruptedException, IOException {
        //TC 19.7 Admin Role Access logout.
        roleAccessObj.ClickLogout();
        Thread.sleep(5000);
        roleAccessObj.verify_admin_role_access_logout();
        Thread.sleep(3000);

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008 - supervisor_role_valid_login")
    @Description("verify user able to supervisor_role_valid_login")
    @Test (priority=8,groups="smoke", description = " verify supervisor_role_valid_login")

    public void supervisor_role_valid_login() throws InterruptedException, IOException {
        //TC 19.8 Supervisor ROle Valid login.

        roleAccessObj = new RoleAccessPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        roleAccessObj.setUsername(ReadProps.readAttr("SupervisorUser"));
        roleAccessObj.setPassword(ReadProps.readAttr("SupervisorPwd"));
        roleAccessObj.clickLoginButton();
        Thread.sleep(10000);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009 - supervisor_role_access_template")
    @Description("verify user able to supervisor_role_access_template")
    @Test (priority=9,groups="smoke", description = " verify supervisor_role_access_template")

    public void supervisor_role_access_template() throws InterruptedException, IOException {
        //TC 19.9 Supervisor ROle Access Template.
        roleAccessObj.Double_clickSupervisorTemplate();
        Thread.sleep(3000);


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010 - supervisor_role_access_document")
    @Description("verify user able to supervisor_role_access_document")
    @Test (priority=10,groups="smoke", description = " verify supervisor_role_access_document")

    public void supervisor_role_access_document() throws InterruptedException, IOException {
        //TC 19.10 Supervisor ROle Access Document.
        Thread.sleep(6000);
        roleAccessObj.superdocumnet();
        Thread.sleep(2000);


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 011 - supervisor_role_access_analytics")
    @Description("verify user able to supervisor_role_access_analytics")
    @Test (priority=11,groups="smoke", description = " verify supervisor_role_access_analytics")

    public void supervisor_role_access_analytics() throws InterruptedException, IOException {
        //TC 19.11 Supervisor ROle Access Analytics
        roleAccessObj.ClickLogout();
        Custome_Wait.wait(driver,RoleAccessPage.forgotpassword);

        Custome_Wait.page_load_wait(driver);

        roleAccessObj.verify_supervisor_role_access_analytics();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012 - operator_role_with_valid_login")
    @Description("verify user able to operator_role_with_valid_login")
    @Test (priority=12,groups="smoke", description = " verify operator_role_with_valid_login")

    public void operator_role_with_valid_login() throws Exception{
        //TC 19.12 Operator ROle Login with Valid ID and PWD.
        roleAccessObj = new RoleAccessPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        roleAccessObj.setUsername(ReadProps.readAttr("OperatorUser"));
        roleAccessObj.setPassword(ReadProps.readAttr("OperatorPwd"));
        roleAccessObj.clickLoginButton();
        Thread.sleep(3000);
        roleAccessObj.clickProfileIcon_operator_role();
        Thread.sleep(3000);


    }





    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013 - operator_role_access_document")
    @Description("verify user able to operator_role_access_document")
    @Test (priority=13,groups="smoke", description = " verify operator_role_access_document")

    public void operator_role_access_document() throws InterruptedException, IOException {
        //TC 19.13 Operator Role Access Document.

        Thread.sleep(7000);
        roleAccessObj.clickOperatorDocument();
        Thread.sleep(3000);

    }





    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 014 - operator_role_access_analytics")
    @Description("verify user able to operator_role_access_analytics")
    @Test (priority=14,groups="smoke", description = " verify operator_role_access_analytics")

    public void operator_role_access_analytics() throws InterruptedException, IOException {
        //TC 19.14 Operator Role Access Analytics.
      roleAccessObj .clickSupervisorAnalytics();
      Thread.sleep(3000);
        roleAccessObj.ClickLogout();
        Custome_Wait.wait(driver,RoleAccessPage.forgotpassword);
    }
}