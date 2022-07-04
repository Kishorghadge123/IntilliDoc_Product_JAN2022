package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Feature("Analytics Test")
@Listeners(Utilities.TestListeners.class)
public class AnalyticsTest extends BasePage
{
    static AnalyticsPage AnalyticsPageObj;

    @Step("login test stated")
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
    @Story("story_id: 001 - test organization arrows on analytics page")
    @Description("verify user able to click organization arrows on analytics page")
    @Test(priority = 1,groups="smoke", description = "verify test organization arrows on analytics page")
    public void test_organization_arrows_on_analytics_page() throws Exception {
        //Object Creation.
        //1.1. Verify the analytics functionality of the Platform Admin to Hide and UnHide organization statistics.
        //1.16 To check whether navigate to Analytics section
        //1.17 Verify project statistics displayed
        //1.18Verify the working of dropdown button project statistics displayed
        AnalyticsPageObj = new AnalyticsPage(driver);
       Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

        AnalyticsPageObj.ClickAnalyticsBtn();

Thread.sleep(4000);
        // 1.1 Organization Statistics and Project Statistics Hide and UnHide.
        AnalyticsPageObj.ClickOrganizationArrow();
        AssertionsFunction.verifyElementPresent(AnalyticsPage.StatisticsHidden);
        AnalyticsPageObj.clickProjectStatisticsarrow();
        AnalyticsPageObj.ClickOrganizationArrow();
        AnalyticsPageObj.clickProjectStatisticsarrow();
        AssertionsFunction.verifyElementPresent(AnalyticsPage.ProjectStatistics);
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 - hover total users on Analytics page")
    @Description("verify user able to hover mouse on total users on Analytics page")
    @Test(priority = 2,groups="smoke", description = "verify hover the mouse on total users on Analytics page")
    public void hover_total_users_on_Analytics_page() throws Exception {
        // 1.2 Hover on Total Users.
        AnalyticsPageObj.HoverTotalUser();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.TotalUser));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);



    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  hover total documents on Analytics page")
    @Description("verify user able to hover a mouse on total documents on Analytics page")
    @Test(priority = 3,groups="smoke", description = "verify hover the mouse on total documents on Analytics page")

    public void hover_total_documents_on_Analytics_page() throws Exception {
        // 1.3 Hover on Total Documents.
        AnalyticsPageObj.HoverDocuments();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.Document));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);


    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  hover processed documents on Analytics page")
    @Description("verify user able to hover a mouse on processed documents on Analytics page")
    @Test(priority = 4,groups="smoke", description = "verify hover the mouse on processed documents on Analytics page")
    public void hover_processed_documents_on_Analytics_page() throws Exception {
        // 1.4 Hover on Processed Documents.
        AnalyticsPageObj.HoverProcessed();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.Processed));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);



    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  hover ready to process on Analytics page")
    @Description("verify user able to hover a mouse on ready to process on Analytics page")
    @Test(priority = 5,groups="smoke", description = "verify hover the mouse on ready to process on Analytics page")
    public void hover_ready_to_process_on_Analytics_page() throws Exception {
        // 1.5 Hover on Ready to Process Documents.
        AnalyticsPageObj.HoverReadyToProcess();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.ReadyToProcess));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);



    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  hover on ready to rejected documents on Analytics page")
    @Description("verify user able to hover a mouse on ready to rejected documents on Analytics page")
    @Test(priority = 6,groups="smoke", description = "verify hover the mouse on ready to rejected documents on Analytics page")
    public void hover_ready_to_rejected_documents_on_Analytics_page() throws Exception {
        // 1.6 Hover on Ready to Rejected Documents.
        AnalyticsPageObj.HoverRejected();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.Rejected));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);


    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007  hover on validation time on Analytics page")
    @Description("verify user able to hover a mouse on validation time on Analytics page")
    @Test(priority = 7,groups="smoke", description = "verify hover the mouse on validation time on Analytics page")

    public void hover_validation_time_on_Analytics_page() throws Exception {
        // 1.7 Hover on Validation Time.
        AnalyticsPageObj.HoverValidationTime();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.ValidationTime));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008  hover on structured on Analytics page")
    @Description("verify user able to hover a mouse on structured on Analytics page")
    @Test(priority = 8,groups="smoke",description = "verify hover the mouse on structured on Analytics page")
    public void hover_on_structured_on_Analytics_page() throws Exception {
        // 1.8 Hover on Structured.
        AnalyticsPageObj.HoverStructuredBar();
       AssertionsFunction.verifyColor(AnalyticsPageObj.SProcessedBar,"#86db46");

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009  hover on semistructured on Analytics page")
    @Description("verify user able to hover a mouse on semistructured on Analytics page")
    @Test(priority = 9,groups="smoke",description = "verify hover the mouse on semistructured on Analytics page")


    public void hover_on_semistructured_on_Analytics_page() throws Exception {
        // 1.9 Hover on Semi-Structured.
        AnalyticsPageObj.HoverSemiStructured();
        AssertionsFunction.verifyColor(AnalyticsPageObj.SSProcessedBar,"#e9ecef");


    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 010  hover on freeform on Analytics page")
    @Description("verify user able to hover a mouse on freeform on Analytics page")
    @Test(priority = 10,groups="smoke",description = "verify hover the mouse on freeform on Analytics page")

    public void hover_on_freeform_on_Analytics_page() throws Exception {
        // 1.10 Hover on Free-Form.
        AnalyticsPageObj.HoverFreeForm();
        AssertionsFunction.verifyColor(AnalyticsPageObj.FFProcessedBar,"#86db46");


    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011 hover on medicalchart on Analytics page")
    @Description("verify user able to hover a mouse on medicalchart on Analytics page")
    @Test(priority = 11,groups="smoke",description = "verify hover the mouse on medicalchart on Analytics page")


    public void hover_on_medicalchart_on_Analytics_page() throws Exception {
        // 1.11 Hover on Medical-Chart.
        AnalyticsPageObj.HoverMedicalChart();

        //Project Statistics.
        AnalyticsPageObj.ClickProjectDownArrow();
        AssertionsFunction.verifyElementPresent(AnalyticsPage.ProjectDownArrow);
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012 search project on Analytics page")
    @Description("verify user able to search project on Analytics page")
    @Test(priority = 12,groups="smoke",description = "verify search project on Analytics page")

    public void search_project_on_Analytics_page() throws Exception {
        //1.12 Search Project.
        AnalyticsPageObj.ClickSearchProject();
Thread.sleep(2000);
        AnalyticsPageObj.ClickSelectProject();
        Thread.sleep(2000);

      }
//    @Test(priority = 13)
//    public void select_overall_data_on_Analytics_page() throws Exception {
//        //1.13 OverAll Data.
//
//        AnalyticsPageObj.ClickSelectDropDown();
//        AnalyticsPageObj.ClickSelectOverall();
//        AnalyticsPageObj.ClickSelectDropDown();
//        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.SelectDropDown));
//        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//
//
//    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013 select monthly data on analytics age")
    @Description("verify user able to select monthly data on Analytics page")
    @Test(priority = 14,groups="smoke",description = "verify select monthly data on Analytics page")
    public void select_monthly_data_on_Analytics_page() throws Exception {
        //1.14 Monthly Data.

        AnalyticsPageObj.ClickSelectMonthly();
        AnalyticsPageObj.ClickSelectDropDown();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.SelectDropDown));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);


    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 0015 select weekly data on Analytics page")
    @Description("verify user able to select weekly data on Analytics page")
    @Test(priority = 15,groups="smoke",description = "verify select weekly data on Analytics page")

    public void select_weekly_data_on_Analytics_page() throws Exception {
        //1.15 Weekly Data.
        AnalyticsPageObj.ClickSelectWeekly();
        AnalyticsPageObj.ClickSelectDropDown();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.SelectDropDown));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 0016 select daily data on Analytics page")
    @Description("verify user able to select daily data on Analytics page")
    @Test(priority = 16,groups="smoke",description = "verify select daily data on Analytics page")
    public void select_daily_data_on_Analytics_page() throws Exception {
        //1.16 Daily Data.
        //1.19Verify the working of Vertical Scroll bar
        AnalyticsPageObj.ClickSelectDaily();
        Thread.sleep(2000);
        AnalyticsPageObj.ClickOnSortByReceived();
        AnalyticsPageObj.ClickOnSortByDocuments();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(10000);
//        LoginUser.logoutUser(driver);
//       Thread.sleep(8000);
//        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.loginurl);

    }
//    @Test(priority = 17)
//    public void BRE_Analytics_Implementation() throws Exception{
//        //IN832 BRE Analytics- Implementation
//
//        AssertionsFunction.verifyElementPresent(AnalyticsPage.ProjectStatistics);
//AnalyticsPageObj.ClickProjectDownArrow();
//
//        AnalyticsPageObj.ClickSearchProjectNew(ReadProps.readAttr("ProjectBRE"));//change this name in Obj file.
//        Thread.sleep(2000);
//        AnalyticsPageObj.ClickSelectNewProject();
//        Thread.sleep(4000);
//        AnalyticsPageObj.ClickSelectDropDown();
//        AnalyticsPageObj.ClickSelectOverall();
//        AssertionsFunction.isPresent(AnalyticsPageObj.SelectOverall);
//Thread.sleep(1000);
//
//
//
//    }
}