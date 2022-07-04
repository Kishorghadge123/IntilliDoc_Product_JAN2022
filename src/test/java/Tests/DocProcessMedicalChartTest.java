package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import io.qameta.allure.*;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Doc Process Medical Chart Test")
@Listeners(Utilities.TestListeners.class)

public class DocProcessMedicalChartTest extends BasePage
{
    static DocumentPage DocPageObj;
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
@Severity(SeverityLevel.NORMAL)
@Story("story_id: 001  - search_project")
@Description("verify user able to search_project")
@Test (priority=1,groups="smoke", description = "verify search_project")
    public void search_project() throws Exception {
        Robot r = new Robot();
        DocPageObj = new DocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(3000);
        //TC 8.1 Search Project.
        DocPageObj = new DocumentPage(driver);
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(1000);
        DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectName"));
        Thread.sleep(1000);
        DocPageObj.ClickSelectMedicalChartProject();
        //  Thread.sleep(3000);
        AssertionsFunction.verifyElementText(ReadProps.readAttr("MedicalChartProjectName"),DocPageObj.SelectMedicalChartProject);
        Thread.sleep(2000);
        DocPageObj.ClickStatusFilter();
        Thread.sleep(2000);
        DocPageObj.ClickCheckProcessed();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(DocPageObj.CheckProcessed);
        r.keyPress(KeyEvent.VK_ESCAPE);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  -searchbox_document")
    @Description("verify user able to searchbox_document")
    @Test (priority=2,groups="smoke", description = "verify searchbox_document")

    public void searchbox_document() throws Exception {
        //TC 8.2 SearchBox Document.
        DocPageObj.ClickSearchBox("Processed");
        Thread.sleep(2000);
        AssertionsFunction.isPresent(DocPageObj.SearchBox);
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - update_document_cancel_and_check_Chart_level_flags")
    @Description("verify user able to update_document_cancel_and_check_Chart_level_flags")
    @Test (priority=3,groups="smoke", description = "verify update_document_cancel_and_check_Chart_level_flags")

    public void update_document_cancel_and_check_Chart_level_flags() throws Exception {
        //TC 8.3 Update Document and Cancel it.
        DocPageObj.ClickViewDocIcon5();
        Thread.sleep(3000);
        //   Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[@class='col-md-6 pr-4 ng-tns-c278-31']")));
        DocPageObj.ClickOnChartLevelFlagsBtn();
        // Thread.sleep(2000);

        DocPageObj.selectNONHCCBtn();
        // Thread.sleep(2000);
        DocPageObj.ClickOnChartLevelFlagsBtn();
        // Thread.sleep(2000);
        DocPageObj.selectInvalidRecordBtn();
        //  Thread.sleep(2000);
        DocPageObj.ClickOnChartLevelFlagsBtn();
        // Thread.sleep(2000);

        DocPageObj.selectPatientNameMismatchBtn();
        // Thread.sleep(2000);
        DocPageObj.ClickExpansionPanel();
        // Thread.sleep(2000);
        DocPageObj.ClickCancelDoc2();
        Thread.sleep(3000);
        DocPageObj.ClickRefreshDocument();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);
    }




    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  -hide_unhide_analytics")
    @Description("verify user able to searchbox_document")
    @Test (priority=4,groups="smoke", description = "hide_unhide_analytics")

    public void hide_unhide_analytics() throws Exception {
        //TC 8.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        Thread.sleep(2000);
        DocPageObj.ClickUnHideAnalytics();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(DocPageObj.UnHideAnalytics);
    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  -documents_filter")
    @Description("verify user able to filter document")
    @Test (priority=5,groups="smoke", description = "verify searchbox_document")

    public void documents_filter() throws Exception {
        //TC 8.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchFilterDoc);
        Thread.sleep(1000);
        DocPageObj.ClickSearchFilterDoc("Processed");
        Thread.sleep(2000);
        DocPageObj.ClickFilterSearchIcon();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        DocPageObj.ClickFilterDoc();
        Thread.sleep(2000);
        DocPageObj.ClickCancelFilterSearch();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  -sorting")
    @Description("verify user able to do sorting")
    @Test (priority=6,groups="smoke", description = "verify searchbox_document")

    public void sorting() throws Exception {
        //TC 8.6 sorting.
        DocPageObj.ClickDocSort();
        Thread.sleep(2000);
        DocPageObj.ClickAssigneeSort();
        Thread.sleep(2000);
        DocPageObj.ClickStatusSort();
        Thread.sleep(2000);
        DocPageObj.ClickTypeSort();
        Thread.sleep(2000);
        DocPageObj.ClickSizeSort();
        Thread.sleep(2000);
        DocPageObj.ClickUpdateSort();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)", "");
        Thread.sleep(4000);
    }



    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007 -verify items_per_page")
    @Description("verify user able to verify items_per_page")
    @Test (priority=7,groups="smoke", description = "verify items_per_page")

    public void items_page() throws Exception {
        //TC 8.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        Thread.sleep(2000);
        DocPageObj.SelectItemsPerPage();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText("10",DocPageObj.ItemSelectedNumber );
        Thread.sleep(1000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008 -verify next_page_previous_page_first_page_last_page")
    @Description("verify user able to verify next_page_previous_page_first_page_last_page")
    @Test (priority=8,groups="smoke", description = "verify items_per_page")

    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 8.8 Next Page, Previous Page, Last Page and First Page.
        DocPageObj.ClickNextPage();
        Thread.sleep(2000);
        DocPageObj.ClickPreviousPage();
        Thread.sleep(2000);
        DocPageObj.ClickLastPage();
        Thread.sleep(2000);
        DocPageObj.ClickFirstPage();
        Thread.sleep(3000);
    }
    @Test(enabled = false)
    public void create_chronic_condition() throws Exception {
        //TC 8.9 Create Chronic condition.
        DocPageObj.ClickViewDocIcon2();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        DocPageObj.ClickChronicCondition();
        Thread.sleep(1000);
        DocPageObj.ClickAddCondition();
        Thread.sleep(1000);
        DocPageObj.AddNPINumber();
        DocPageObj.AddPhysicianName();
        DocPageObj.ClickStartDate();
        DocPageObj.SelectStartDate();
        DocPageObj.ClickEndDate();
        DocPageObj.SelectEndDate();
        Thread.sleep(2000);
        DocPageObj.SaveChronicCondition();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);
        Thread.sleep(2000);
    }
}