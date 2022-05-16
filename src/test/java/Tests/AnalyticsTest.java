package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
import Utilities.AssertionsFunction;
import Utilities.LoginUser;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;


@Listeners(Utilities.TestListeners.class)

public class AnalyticsTest extends BasePage
{
    static AnalyticsPage AnalyticsPageObj;
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
    public void test_organization_arrows_on_analytics_page() throws Exception {
        //Object Creation.
        AnalyticsPageObj = new AnalyticsPage(driver);
        AnalyticsPageObj.ClickAnalyticsBtn();


        // 1.1 Organization Statistics and Project Statistics Hide and UnHide.
        AnalyticsPageObj.ClickOrganizationArrow();

        AssertionsFunction.verifyElementPresent(AnalyticsPage.StatisticsHidden);

        AnalyticsPageObj.clickProjectStatisticsarrow();

        AnalyticsPageObj.ClickOrganizationArrow();

        AnalyticsPageObj.clickProjectStatisticsarrow();




    }
    @Test(priority = 2)
    public void hover_total_users_on_Analytics_page() throws Exception {
        // 1.2 Hover on Total Users.
        AnalyticsPageObj.HoverTotalUser();


    }
    @Test(priority = 3)
    public void hover_total_documents_on_Analytics_page() throws Exception {
        // 1.3 Hover on Total Documents.
        AnalyticsPageObj.HoverDocuments();

    }
    @Test(priority = 4)
    public void hover_processed_documents_on_Analytics_page() throws Exception {
        // 1.4 Hover on Processed Documents.
        AnalyticsPageObj.HoverProcessed();

    }
    @Test(priority = 5)
    public void hover_ready_to_process_on_Analytics_page() throws Exception {
        // 1.5 Hover on Ready to Process Documents.
        AnalyticsPageObj.HoverReadyToProcess();

    }
    @Test(priority = 6)
    public void hover_ready_to_rejected_documents_on_Analytics_page() throws Exception {
        // 1.6 Hover on Ready to Rejected Documents.
        AnalyticsPageObj.HoverRejected();

    }
    @Test(priority = 7)
    public void hover_validation_time_on_Analytics_page() throws Exception {
        // 1.7 Hover on Validation Time.
        AnalyticsPageObj.HoverValidationTime();

    }
    @Test(priority = 8)
    public void hover_on_structured_on_Analytics_page() throws Exception {
        // 1.8 Hover on Structured.
        AnalyticsPageObj.HoverStructuredBar();

    }
    @Test(priority = 9)
    public void hover_on_semistructured_on_Analytics_page() throws Exception {
        // 1.9 Hover on Semi-Structured.
        AnalyticsPageObj.HoverSemiStructured();

    }
    @Test(priority = 10)
    public void hover_on_freeform_on_Analytics_page() throws Exception {
        // 1.10 Hover on Free-Form.
        AnalyticsPageObj.HoverFreeForm();

    }
    @Test(priority = 11)
    public void hover_on_medicalchart_on_Analytics_page() throws Exception {
        // 1.11 Hover on Medical-Chart.
        AnalyticsPageObj.HoverMedicalChart();

        //Project Statistics.
        AnalyticsPageObj.ClickProjectDownArrow();




    }
    @Test(priority = 12)
    public void search_project_on_Analytics_page() throws Exception {
        //1.12 Search Project.
        AnalyticsPageObj.ClickSearchProject();

        AnalyticsPageObj.ClickSelectProject();


    }
    @Test(priority = 13)
    public void select_overall_data_on_Analytics_page() throws Exception {
        //1.13 OverAll Data.

        AnalyticsPageObj.ClickSelectDropDown();

        AnalyticsPageObj.ClickSelectOverall();

        AnalyticsPageObj.ClickSelectDropDown();

    }
    @Test(priority = 14)
    public void select_monthly_data_on_Analytics_page() throws Exception {
        //1.14 Monthly Data.

        AnalyticsPageObj.ClickSelectMonthly();

        AnalyticsPageObj.ClickSelectDropDown();

    }
    @Test(priority = 15)
    public void select_weekly_data_on_Analytics_page() throws Exception {
        //1.15 Weekly Data.
        AnalyticsPageObj.ClickSelectWeekly();

        AnalyticsPageObj.ClickSelectDropDown();

    }
    @Test(priority = 16)
    public void select_daily_data_on_Analytics_page() throws Exception {
        //1.16 Daily Data.
        AnalyticsPageObj.ClickSelectDaily();
        Thread.sleep(2000);
        AnalyticsPageObj.ClickOnSortByReceived();

        AnalyticsPageObj.ClickOnSortByDocuments();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");

        LoginUser.logoutUser(driver);

    }
}