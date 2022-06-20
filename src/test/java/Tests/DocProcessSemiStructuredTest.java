package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import javax.print.Doc;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Doc Process Semi Structured Test")
@Listeners(Utilities.TestListeners.class)
public class DocProcessSemiStructuredTest extends BasePage {
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
        DocPageObj = new DocumentPage(driver);
        Robot r = new Robot();
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(5000);
        //TC 9.1 Search Project.
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(1000);
        DocPageObj.ClickSearchProject(ReadProps.readAttr("SemiStructuredProjectName"));
        Thread.sleep(4000);
        DocPageObj.ClickSelectSemiStructuredProject();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementText(ReadProps.readAttr("SemiStructuredProjectName"),DocPageObj.SelectSemiStructuredProject);
        Thread.sleep(1000);
        DocPageObj.ClickStatusFilter();
        Thread.sleep(1000);
        DocPageObj.ClickCheckProcessed();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(DocPageObj.CheckProcessed);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  -searchbox_document")
    @Description("verify user able to searchbox_document")
    @Test (priority=2,groups="smoke", description = "verify searchbox_document")

    public void searchbox_document() throws Exception {
        //TC 9.2 SearchBox Document and status of the document should goes according to Document typw either Processed or Rejected .

        DocPageObj.ClickSearchBox("form 1040.pdf");
        Thread.sleep(2000);
        DocPageObj.ClickSearchDocument();
        Thread.sleep(6000);
        AssertionsFunction.verifyElementText("Rejected",DocPageObj.StatusOfDoc);
        Thread.sleep(4000);
        DocPageObj.ClickClearSearch();
        Thread.sleep(2000);
        DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
        Thread.sleep(2000);
        DocPageObj.ClickSearchDocument();
        Thread.sleep(6000);
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchedDocument);
        Thread.sleep(1000);
        AssertionsFunction.verifyElementText("Processed",DocPageObj.StatusOfDoc);
        Thread.sleep(3000);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  - update_document_cancelt")
    @Description("verify user able to update_document_cancel")
    @Test (priority=3,groups="smoke", description = "verify update_document_cancel ")

    public void update_document_cancel() throws Exception {
        //TC 9.3 Update document and cancel it.
        DocPageObj.ClickViewDocIcon2();
        Thread.sleep(10000);
        DocPageObj.ClickCancelDoc2();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);
        Thread.sleep(2000);
        DocPageObj.ClickClearSearch();
        Thread.sleep(2000);
        DocPageObj.ClickRefreshDocument();
        Thread.sleep(5000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  - hide_unhide_analytics")
    @Description("verify user able to hide_unhide_analytics")
    @Test (priority=4,groups="smoke", description = "verify hide_unhide_analytics ")

    public void hide_unhide_analytics() throws Exception {
        //TC 9.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.Analyticshide);
        DocPageObj.ClickUnHideAnalytics();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.AnalyticsUnhide);
        Thread.sleep(2000);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - documents_filters")
    @Description("verify user able to documents_filter")
    @Test (priority=5,groups="smoke", description = "verify documents_filter")

    public void documents_filter() throws Exception {
        //TC 9.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchFilterDoc);
        Thread.sleep(1000);
        DocPageObj.ClickSearchFilterDoc("AN");
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
    @Story("story_id: 006 - sorting")
    @Description("verify user able to sorting")
    @Test (priority=6,groups="smoke", description = "verify sorting")

    public void sorting() throws Exception {
        //TC 9.6 Sorting.
        DocPageObj.ClickDocSort();
        Thread.sleep(2000);
        DocPageObj.ClickAssigneeSort();
        Thread.sleep(2000);
        DocPageObj.ClickStatusSort();
        Thread.sleep(2000);
        DocPageObj.ClickTypeSort();
        Thread.sleep(2000);
        DocPageObj.ClickScoreSort();
        Thread.sleep(2000);
        DocPageObj.ClickSizeSort();
        Thread.sleep(2000);
        DocPageObj.ClickUpdateSort();
        Thread.sleep(2000);
        DocPageObj.ClickReceivedSort();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(3000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007 -items_page")
    @Description("verify user able to find value items_page")
    @Test (priority=7,groups="smoke", description = "verify items_page")

    public void items_page() throws Exception {
        //TC 9.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        Thread.sleep(2000);
        DocPageObj.SelectItemsPerPage();
        Thread.sleep(2000);
       AssertionsFunction.verifyElementText("10",DocPageObj.ItemSelectedNumber );
        Thread.sleep(1000);

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008 -next_page_previous_page_first_page_last_page")
    @Description("verify user able to next_page_previous_page_first_page_last_page")
    @Test (priority=8,groups="smoke", description = "verify next_page_previous_page_first_page_last_page")

    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 9.8 Next Page, Previous Page, Last Page and First Page.
        DocPageObj.ClickNextPage();
        Thread.sleep(2000);
        DocPageObj.ClickPreviousPage();
        Thread.sleep(2000);
        DocPageObj.ClickLastPage();
        Thread.sleep(2000);
        DocPageObj.ClickFirstPage();
        Thread.sleep(2000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009 -anticlockwise_clockwise_zoomin_zoomout_navigate_right_left")
    @Description("verify user able to anticlockwise_clockwise_zoomin_zoomout_navigate_right_left")
    @Test (priority=9,groups="smoke", description = "verify anticlockwise_clockwise_zoomin_zoomout_navigate_right_left")

    public void anticlockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
        //TC 9.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
        DocPageObj.ClickSearchBox("4.tif");
        Thread.sleep(2000);
        DocPageObj.ClickSearchDocument();
        Thread.sleep(2000);
        DocPageObj.ClickViewDocIcon3();
        Thread.sleep(6000);
        AssertionsFunction.verifyElementPresent(DocPageObj.DocView);
        Thread.sleep(2000);
        DocPageObj.ClickClockWiseIcon();
        Thread.sleep(4000);
        AssertionsFunction.verifyElementPresent(DocPageObj.Clockwise);
        Thread.sleep(1000);
        DocPageObj.ClickAntiWiseIcon();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.Anticlockwise);
        Thread.sleep(2000);



        // Zoom In.
        DocPageObj.ClickZoomIN();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.ZoomInDoc);
        Thread.sleep(1000);


        // ZoomOut.
        DocPageObj.ClickZoomOut();
        Thread.sleep(4000);

        // Navigate Right.
        DocPageObj.ClickNvgtRt();
        Thread.sleep(2000);

        // Navigate Back.
        DocPageObj.ClickNvgtLft();
        Thread.sleep(2000);
    }
}