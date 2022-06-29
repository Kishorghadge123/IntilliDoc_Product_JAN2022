package Tests;
import Base.BasePage;
import Pages.FunctionalTabPage;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners(Utilities.TestListeners.class)

public class FunctionalTabTest extends BasePage
{
    SoftAssert s= new SoftAssert();
    static FunctionalTabPage FunctionalTabObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception
    {

        driver.quit();
    }
    @Test(priority = 1)
    public void click_on_n_icon() throws Exception {
        FunctionalTabObj = new FunctionalTabPage(driver);
        //TC 13.1 Click on N-Icon.
        FunctionalTabObj.ClickNIcon();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 2)
    public void horizontal_users_tab() throws Exception {
        //TC 13.2 Horizontal Users Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalUser();
        Thread.sleep(6000);
        FunctionalTabObj.verify_horizontal_users_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 3)
    public void horizontal_roles_tab() throws Exception {
        //TC 13.3 Horizontal Roles Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalRoles();
        Thread.sleep(6000);
        FunctionalTabObj.verify_horizontal_roles_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 4)
    public void horizontal_templates_tab() throws Exception {
        //TC 13.4 Horizontal Templates Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalTemplates();
        Thread.sleep(8000);
        FunctionalTabObj.verify_horizontal_templates_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 5)
    public void horizontal_datasets_tab() throws Exception {
        //TC 13.5 Horizontal DataSets Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalDataset();
        Thread.sleep(6000);
        FunctionalTabObj.verify_horizontal_datasets_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 6)
    public void horizontal_projects_tab() throws Exception {
        //TC 13.6 Horizontal Projects Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalProjects();
        Thread.sleep(8000);
        FunctionalTabObj.verify_horizontal_projects_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 7)
    public void horizontal_documents_tab() throws Exception {
        //TC 13.7 Horizontal Documents Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalDocuments();
        Thread.sleep(6000);
        FunctionalTabObj.verify_horizontal_documents_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();
    }
    @Test(priority = 8)
    public void horizontal_analytics_tab() throws Exception {
        //TC 13.8 Horizontal Analytics Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalAnalytics();
        Thread.sleep(6000);
        FunctionalTabObj.verify_horizontal_analytics_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();

    }
    @Test(priority = 9)
    public void vertical_users_tab() throws Exception {
        //TC 13.9 Vertical Users and Navigate Backward.
        FunctionalTabObj.ClickVerticalUser();
        Thread.sleep(6000);
        FunctionalTabObj.verify_vertical_users_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();
    }
    @Test(priority = 10)
    public void vertical_roles_tab() throws Exception {
        //TC 13.10 Vertical Roles Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalRoles();
        Thread.sleep(6000);
        FunctionalTabObj.verify_vertical_roles_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();
    }
    @Test(priority = 11)
    public void vertical_templates_tab() throws Exception {
        //TC 13.11 Vertical Templates Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalTemplates();
        Thread.sleep(8000);
        FunctionalTabObj.verify_vertical_templates_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();
    }
    @Test(priority = 12)
    public void vertical_datasets_tab() throws Exception {
        //TC 13.12 Vertical Data Sets Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalDataset();
        Thread.sleep(6000);
        FunctionalTabObj.verify_vertical_datasets_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();
    }
    @Test(priority = 13)
    public void vertical_projects_tab() throws Exception {
        //TC 13.13 Vertical Projects Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalProjects();
        Thread.sleep(8000);
        FunctionalTabObj.verify_vertical_projects_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();
    }
    @Test(priority = 14)
    public void vertical_Documents_tab() throws Exception
    {//TC 13.14 Vertical Documents and Navigate Backward.
        FunctionalTabObj.ClickVerticalDocuments();
        Thread.sleep(6000);
        FunctionalTabObj.verify_vertical_Documents_tab();
        driver.navigate().back();
        Thread.sleep(4000);
        FunctionalTabObj.verifyNtab();
    }

    @Test(priority = 15)
    public void vertical_analytics_tab() throws Exception {
        //TC 13.15 Vertical Analytics and Navigate Backward.
        FunctionalTabObj.ClickVerticalAnalytics();
        Thread.sleep(6000);
        FunctionalTabObj.vertical_analytics_tab();
        driver.navigate().back();
        Thread.sleep(4000);

    }
}