package Tests;
import Base.BasePage;
import Pages.AnalyticsPage;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)
public class AnalyticsTest extends BasePage
{
    @BeforeTest
    public void startUpTest() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @AfterTest
    public void cleanUpTest() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void test_organization_arrows_on_Analytics_page() throws Exception {

            //Object Creation
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            AnalyticsPageObj.ClickAnalyticsBtn();
            Thread.sleep(12000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//AnalyticsPage.jpg");
            // 1.1 Organization Statistics Hide and UnHide.
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//OrganizationStatisticsHide.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//OrganizationStatisticsUnHide.jpg");
            Thread.sleep(3000);}
    @Test(priority = 2)
    public void hover_total_users_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.2 Hover on Total Users.
            AnalyticsPageObj.HoverTotalUser();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverTotalUsers.jpg");
            Assert.fail();}
    @Test(priority = 3)
    public void hover_total_documents_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.3 Hover on Total Documents.
            AnalyticsPageObj.HoverDocuments();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverTotalDocuments.jpg");
            Thread.sleep(3000);}
    @Test(priority = 4)
    public void hover_processed_documents_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.4 Hover on Processed Documents.
            AnalyticsPageObj.HoverProcessed();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverProcessed.jpg");
            Thread.sleep(3000);}
    @Test(priority = 5)
    public void hover_ready_to_process_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.5 Hover on Ready to Process Documents.
            AnalyticsPageObj.HoverReadyToProcess();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverReadyToProcess.jpg");
            Thread.sleep(3000);}
    @Test(priority = 6)
    public void hover_ready_to_rejected_documents_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.6 Hover on Ready to Rejected Documents.
            AnalyticsPageObj.HoverRejected();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverRejected.jpg");
            Thread.sleep(3000);}
    @Test(priority = 7)
    public void hover_validation_time_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.7 Hover on Validation Time.
            AnalyticsPageObj.HoverValidationTime();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverValidationTime.jpg");
            Thread.sleep(3000);}
    @Test(priority = 8)
    public void hover_on_structured_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.8 Hover on Structured.
            AnalyticsPageObj.HoverStructuredBar();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverStructureBar.jpg");
            Thread.sleep(2000);}
    @Test(priority = 9)
    public void hover_on_semistructured_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.9 Hover on Semi-Structured.
            AnalyticsPageObj.HoverSemiStructured();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverSemi-StructureBar.jpg");
            Thread.sleep(3000);Assert.fail();
    }
    @Test(priority = 10)
    public void hover_on_freeform_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.10 Hover on Free-Form.
            AnalyticsPageObj.HoverFreeForm();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverFree-FormBar.jpg");
            Thread.sleep(3000);
    }
    @Test(priority = 11)
    public void hover_on_medicalchart_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            // 1.11 Hover on Medical-Chart.
            AnalyticsPageObj.HoverMedicalChart();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverMedicalChartBar.jpg");
            Thread.sleep(3000);
            //Project Statistics.
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//ProjectStatisticsVisible.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickProjectDownArrow();
            Thread.sleep(3000);
    }
    @Test(priority = 12)
    public void search_project_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            //1.12 Search Project.
            AnalyticsPageObj.ClickSearchProject();
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectProject();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//ProjectSelected.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(3000);
    }
    @Test(priority = 13)
    public void select_overall_data_on_Analytics_page() throws InterruptedException {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            //1.13 OverAll Data.
            AnalyticsPageObj.ClickSelectOverall();
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
    }
    @Test(priority = 14)
    public void select_monthly_data_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            //1.14 Monthly Data.
            AnalyticsPageObj.ClickSelectMonthly();
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//MonthlyStatus.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(3000);
    }
    @Test(priority = 15)
    public void select_weekly_data_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            //1.15 Weekly Data.
            AnalyticsPageObj.ClickSelectWeekly();
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//WeeklyStatus.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(3000);
    }
    @Test(priority = 16)
    public void select_daily_data_on_Analytics_page() throws Exception {
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            //1.16 Daily Data.
            AnalyticsPageObj.ClickSelectDaily();
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//DailyStatus.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickOnSortByReceived();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//SortByDocuments.jpg");
            Thread.sleep(3000);
            AnalyticsPageObj.ClickOnSortByDocuments();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//SortByReceived.jpg");
            Thread.sleep(4000);
            driver.close();
    }
}