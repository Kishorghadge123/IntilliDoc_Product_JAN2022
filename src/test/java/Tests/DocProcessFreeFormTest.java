
package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import io.qameta.allure.*;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Doc Process Free Form Test")
@Listeners(Utilities.TestListeners.class)
public class    DocProcessFreeFormTest extends BasePage {
    static DocumentPage DocPageObj;

    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception {
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
        Thread.sleep(2000);
        //TC 7.1 Search Project.
        DocPageObj.ClickDropDownBtn();

        DocPageObj.ClickSearchProject(ReadProps.readAttr("FreeFormProjectName"));
        Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),'QA-AutoProject-FreeForm')]")));
        DocPageObj.ClickSelectFreeFormProject();
        Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
        AssertionsFunction.verifyElementText(ReadProps.readAttr("FreeFormProjectName"), DocPageObj.SelectFreeFormProject);
        Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
        DocPageObj.ClickStatusFilter();
        Thread.sleep(2000);
        DocPageObj.ClickCheckProcessed();
        AssertionsFunction.verifyElementSelected(DocPageObj.CheckProcessed);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002  - search_document")
    @Description("verify user able to search_document")
    @Test (priority=2,groups="smoke", description = "verify search_document")

    public void search_document() throws Exception {
        //TC 7.2 SearchBox Document.
        DocPageObj.ClickSearchBox("Pfizer");
        DocPageObj.ClickSearchDocument();
        Thread.sleep(2000);
        DocPageObj.ClickClearSearch();
        Thread.sleep(2000);
        DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        DocPageObj.ClickSearchDocument();
         Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'highlight_off')]")));
        // AssertionsFunction.verifyElementPresent(DocPageObj.SearchedDocument);
        AssertionsFunction.verifyElementText("Rejected",DocPageObj.StatusOfDoc);
        Thread.sleep(2000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003  - update_document_cancel_it")
    @Description("verify user able to update_document_cancel_it")
    @Test (priority=3,groups="smoke", description = "verify update_document_cancel_it")

    public void update_document_cancel_it() throws Exception {
        //TC 7.3 Update document and cancel it.

        DocPageObj.ClickViewDocIcon2();
        Thread.sleep(2000);
        DocPageObj.ClickCancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);
        Thread.sleep(1000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  - hide_unhide_analytics")
    @Description("verify user able to hide_unhide_analytics")
    @Test (priority=4,groups="smoke", description = "verify hide_unhide_analytics")
        public void hide_unhide_analytics() throws Exception {
        //TC 7.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
        AssertionsFunction.verifyElementPresent(DocPageObj.Analyticshide);
        DocPageObj.ClickUnHideAnalytics();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
        AssertionsFunction.verifyElementPresent(DocPageObj.AnalyticsUnhide);
        Thread.sleep(1000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  - documents_filter")
    @Description("verify user able to documents_filter")
    @Test (priority=5,groups="smoke", description = "verify documents_filter")

    public void documents_filter() throws Exception {
        //TC 7.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control theme_color ng-tns')]")));
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchFilterDoc);
        DocPageObj.ClickSearchFilterDoc("AN");
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]")));
        DocPageObj.ClickFilterSearchIcon();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),'Documents')]/button")));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(4000);
        DocPageObj.ClickFilterDoc();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[2]")));
        DocPageObj.ClickCancelFilterSearch();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  - sorting")
    @Description("verify user able to sorting")
    @Test (priority=6,groups="smoke", description = "verify sorting")

    public void sorting() throws Exception {
        //TC 7.6 Sorting.
        DocPageObj.ClickDocSort();
        Thread.sleep(2000);
        DocPageObj.ClickAssigneeSort();
        DocPageObj.ClickStatusSort();
        DocPageObj.ClickTypeSort();
        DocPageObj.ClickScoreSort();
        DocPageObj.ClickSizeSort();
        DocPageObj.ClickUpdateSort();
        DocPageObj.ClickReceivedSort();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(1000);
    }




    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007  - items_per_page")
    @Description("verify items_per_page")
    @Test (priority=7,groups="smoke", description = "verify items_per_page")

    public void items_per_page() throws Exception {
        //TC 7.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        DocPageObj.SelectItemsPerPage();
        AssertionsFunction.verifyElementText("10",DocPageObj.ItemSelectedNumber );
        Thread.sleep(1000);
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008  - next_page_previous_page_first_page_last_page")
    @Description("verify items_per_page")
    @Test (priority=8,groups="smoke", description = "verify next_page_previous_page_first_page_last_page")

    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 7.8 Next Page, Previous Page, Last Page and First Page.
        DocPageObj.ClickNextPage();
        DocPageObj.ClickPreviousPage();
        DocPageObj.ClickLastPage();
        DocPageObj.ClickFirstPage();
        AssertionsFunction.isPresent(DocPageObj.FirstPage);
        Thread.sleep(1000);

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 009  - anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left")
    @Description("verify items_per_page")
    @Test (priority=9,groups="smoke", description = "anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left")

    public void anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
        //TC 7.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
        DocPageObj.ClickSearchBox("3.tif");
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        DocPageObj.ClickSearchDocument();
        Thread.sleep(300);
        DocPageObj.ClickViewDocIcon4();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(DocPageObj.DocView);
        DocPageObj.ClickClockWiseIcon();
        AssertionsFunction.verifyElementPresent(DocPageObj.Clockwise);
        DocPageObj.ClickAntiWiseIcon();
        AssertionsFunction.verifyElementPresent(DocPageObj.Anticlockwise);
        DocPageObj.ClickZoomIN();
        AssertionsFunction.verifyElementPresent(DocPageObj.ZoomInDoc);
        DocPageObj.ClickZoomOut();
        DocPageObj.ClickNvgtRt();
        DocPageObj.ClickNvgtLft();
        AssertionsFunction.isPresent(DocPageObj.ClickNavigateLeft);
        Thread.sleep(2000);
    }




}
