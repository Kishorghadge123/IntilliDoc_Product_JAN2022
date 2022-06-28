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


@Listeners(Utilities.TestListeners.class)
public class RoleWiseTest extends BasePage {
    static RoleAccessPage roleAccessObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }

    @Test(priority = 1)
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



    @Test(priority = 2)
    public void admin_role_access_users_tab() throws InterruptedException, IOException {
        //TC 19.2 Admin Role Access Users tab.

        roleAccessObj.Double_clickAdminUser();
        //   roleAccessObj.verify_admin_role_access_users_tab();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        Thread.sleep(2000);
    }


    @Test(priority = 3)
    public void admin_role_access_roles_tab() throws InterruptedException, IOException {
        //TC 19.3 Admin Role Access Roles tab.

        roleAccessObj.clickAdminRole();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
        AssertionsFunction.verifyTargetPageURL(roleAccessObj.crateroleurl);
    }



    @Test(priority = 4)
    public void admin_role_access_templates_tab() throws InterruptedException, IOException {
        //TC 19.4 Admin Role Access Templates tab.
        roleAccessObj.clickAdminTemplate();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//div[contains(text(),' Templates ')]")));
        roleAccessObj.verify_supervisor_role_access_template();


    }

    @Test(priority = 5)
    public void admin_role_access_project_tab() throws InterruptedException, IOException {
        //TC 19.5 Admin Role Access Project tab.
        roleAccessObj.clickAdminProject();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        roleAccessObj.verify_admin_role_access_project_tab();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

    }



    @Test(priority = 6)
    public void admin_role_access_analytics_tab() throws InterruptedException, IOException {
        //TC 19.6 Admin Role Access Analytics tab.
        roleAccessObj.clickAdminAnalytic();
        Thread.sleep(5000);

    }


    @Test(priority = 7)
    public void admin_role_access_logout() throws InterruptedException, IOException {
        //TC 19.7 Admin Role Access logout.
        roleAccessObj.ClickLogout();
        Thread.sleep(5000);
        roleAccessObj.verify_admin_role_access_logout();
        Thread.sleep(3000);

    }



    @Test(priority = 8)
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

    @Test(priority = 9)
    public void supervisor_role_access_template() throws InterruptedException, IOException {
        //TC 19.9 Supervisor ROle Access Template.
        roleAccessObj.Double_clickSupervisorTemplate();
        Thread.sleep(3000);


    }


    @Test(priority = 10)
    public void supervisor_role_access_document() throws InterruptedException, IOException {
        //TC 19.10 Supervisor ROle Access Document.
        Thread.sleep(6000);
        roleAccessObj.superdocumnet();
        Thread.sleep(2000);


    }



    @Test(priority = 11)
    public void supervisor_role_access_analytics() throws InterruptedException, IOException {
        //TC 19.11 Supervisor ROle Access Analytics
        roleAccessObj.ClickLogout();
        Custome_Wait.wait(driver,RoleAccessPage.forgotpassword);

        Custome_Wait.page_load_wait(driver);

        roleAccessObj.verify_supervisor_role_access_analytics();
    }


    @Test(priority = 12)
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





    @Test(priority = 13)
    public void operator_role_access_document() throws InterruptedException, IOException {
        //TC 19.13 Operator Role Access Document.

        Thread.sleep(7000);
        roleAccessObj.clickOperatorDocument();
        Thread.sleep(3000);

    }





    @Test(priority = 14)
    public void operator_role_access_analytics() throws InterruptedException, IOException {
        //TC 19.14 Operator Role Access Analytics.
      roleAccessObj .clickSupervisorAnalytics();
      Thread.sleep(3000);
        roleAccessObj.ClickLogout();
        Custome_Wait.wait(driver,RoleAccessPage.forgotpassword);
    }
}