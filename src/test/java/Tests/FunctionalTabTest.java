package Tests;
import Base.BasePage;
import Pages.FunctionalTabPage;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.*;
@Feature("Functional Tab Test")
@Listeners(Utilities.TestListeners.class)

public class FunctionalTabTest extends BasePage
{
    SoftAssert s= new SoftAssert();
    static FunctionalTabPage FunctionalTabObj;

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
    @Story("story_id: 001  -click_on_n_icon")
    @Description("verify user able to click_on_n_icon")
    @Test (priority=1,groups="smoke", description = "verify click_on_n_icon")

    public void click_on_n_icon() throws Exception {
        FunctionalTabObj = new FunctionalTabPage(driver);
        //TC 13.1 Click on N-Icon.
        FunctionalTabObj.ClickNIcon();
        Thread.sleep(2000);
        FunctionalTabObj.verifyNtab();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  - horizontal_users_tab")
    @Description("verify user able to click_horizontal_users_tab")
    @Test (priority=2,groups="smoke", description = "verify horizontal_users_tab")

    public void horizontal_users_tab() throws Exception {
        //TC 13.2 Horizontal Users Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalUser();
        Thread.sleep(2000);
        FunctionalTabObj.verify_horizontal_users_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  - horizontal_roles_tab")
    @Description("verify user able to click_horizontal_roles_tab")
    @Test (priority=3,groups="smoke", description = "verify horizontal_roles_tab")

    public void horizontal_roles_tab() throws Exception {
        //TC 13.3 Horizontal Roles Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalRoles();
        Thread.sleep(2000);
        FunctionalTabObj.verify_horizontal_roles_tab();
        driver.navigate().back();
        Thread.sleep(5000);
        FunctionalTabObj.verifyNtab();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  - horizontal_templates_tab")
    @Description("verify user able to click_horizontal_templates_tab")
    @Test (priority=4,groups="smoke", description = "verify horizontal_templates_tab")

    public void horizontal_templates_tab() throws Exception {
        //TC 13.4 Horizontal Templates Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalTemplates();
        Thread.sleep(2000);
        FunctionalTabObj.verify_horizontal_templates_tab();
        driver.navigate().back();
        Thread.sleep(2000);
        FunctionalTabObj.verifyNtab();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  - horizontal_datasets_tab")
    @Description("verify user able to click_horizontal_datasets_tab")
    @Test (priority=5,groups="smoke", description = "verify horizontal_datasets_tab")

    public void horizontal_datasets_tab() throws Exception {
        //TC 13.5 Horizontal DataSets Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalDataset();
        Thread.sleep(3000);
        FunctionalTabObj.verify_horizontal_datasets_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  - horizontal_projects_tab")
    @Description("verify user able to seen horizontal_projects_tab")
    @Test (priority=6,groups="smoke", description = "verify horizontal_projects_tab")

    public void horizontal_projects_tab() throws Exception {
        //TC 13.6 Horizontal Projects Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalProjects();
        Thread.sleep(3000);
        FunctionalTabObj.verify_horizontal_projects_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007  - horizontal_documents_tab")
    @Description("verify user able to seen horizontal_documents_tab")
    @Test (priority=7,groups="smoke", description = "verify horizontal_projects_tab")

    public void horizontal_documents_tab() throws Exception {
        //TC 13.7 Horizontal Documents Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalDocuments();
        Thread.sleep(3000);
        FunctionalTabObj.verify_horizontal_documents_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008  - horizontal_analytics_tab")
    @Description("verify user able to seen horizontal_analytics_tab")
    @Test (priority=8,groups="smoke", description = "verify horizontal_analytics_tab")

    public void horizontal_analytics_tab() throws Exception {
        //TC 13.8 Horizontal Analytics Tab and Navigate Backward.
        FunctionalTabObj.ClickHorizontalAnalytics();
        Thread.sleep(3000);
        FunctionalTabObj.verify_horizontal_analytics_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009  - vertical_users_tab")
    @Description("verify user able to seen vertical_users_tab")
    @Test (priority=9,groups="smoke", description = "verify vertical_users_tab")

    public void vertical_users_tab() throws Exception {
        //TC 13.9 Vertical Users and Navigate Backward.
        FunctionalTabObj.ClickVerticalUser();
        Thread.sleep(3000);
        FunctionalTabObj.verify_vertical_users_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 010  - vertical_roles_tab")
    @Description("verify user able to seen vertical_roles_tab")
    @Test (priority=10,groups="smoke", description = "verify vertical_roles_tab")

    public void vertical_roles_tab() throws Exception {
        //TC 13.10 Vertical Roles Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalRoles();
        Thread.sleep(3000);
        FunctionalTabObj.verify_vertical_roles_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - vertical_templates_tab")
    @Description("verify user able to seen vertical_templates_tab")
    @Test (priority=11,groups="smoke", description = "verify vertical_templates_tab")

    public void vertical_templates_tab() throws Exception {
        //TC 13.11 Vertical Templates Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalTemplates();
        Thread.sleep(3000);
        FunctionalTabObj.verify_vertical_templates_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 012  - vertical_datasets_tab")
    @Description("verify user able to seen vertical_datasets_tab")
    @Test (priority=12,groups="smoke", description = "verify vertical_datasets_tab")
    public void vertical_datasets_tab() throws Exception {
        //TC 13.12 Vertical Data Sets Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalDataset();
        Thread.sleep(3000);
        FunctionalTabObj.verify_vertical_datasets_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 013  - vertical_projects_tab")
    @Description("verify user able to seen vertical_projects_tab")
    @Test (priority=13,groups="smoke", description = "verify vertical_projects_tab")

    public void vertical_projects_tab() throws Exception {
        //TC 13.13 Vertical Projects Tab and Navigate Backward.
        FunctionalTabObj.ClickVerticalProjects();
        Thread.sleep(3000);
        FunctionalTabObj.verify_vertical_projects_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 014  - vertical_Documents_tab")
    @Description("verify user able to seen vertical_Documents_tab")
    @Test (priority=14,groups="smoke", description = "verify vertical_Documents_tab")
    public void vertical_Documents_tab() throws Exception
    {//TC 13.14 Vertical Documents and Navigate Backward.
        FunctionalTabObj.ClickVerticalDocuments();
        Thread.sleep(3000);
        FunctionalTabObj.verify_vertical_Documents_tab();
        driver.navigate().back();
        Thread.sleep(3000);
        FunctionalTabObj.verifyNtab();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 015  - vertical_analytics_tab")
    @Description("verify user able to seen vertical_analytics_tab")
    @Test (priority=15,groups="smoke", description = "verify vertical_analytics_tab")
    public void vertical_analytics_tab() throws Exception {
        //TC 13.15 Vertical Analytics and Navigate Backward.
        FunctionalTabObj.ClickVerticalAnalytics();
        Thread.sleep(2000);
        FunctionalTabObj.vertical_analytics_tab();
        driver.navigate().back();
        Thread.sleep(3000);

    }
}