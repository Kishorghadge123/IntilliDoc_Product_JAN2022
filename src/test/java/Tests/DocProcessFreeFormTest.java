package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class    DocProcessFreeFormTest extends BasePage {
    static DocumentPage DocPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass()
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void search_project() throws Exception {
        Robot r = new Robot();
        DocPageObj = new DocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//table[@class='mat-table cdk-table mat-sort']//following::th[8]")));
        //TC 7.1 Search Project.
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);

        DocPageObj.ClickSearchProject(ReadProps.readAttr("FreeFormProjectName"));
        DocPageObj.ClickSelectFreeFormProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'QA-AutoProject-FreeForm')]")));
        AssertionsFunction.verifyElementText(ReadProps.readAttr("FreeFormProjectName"),DocPageObj.SelectFreeFormProject);
        DocPageObj.ClickStatusFilter();
        DocPageObj.ClickCheckProcessed();
        AssertionsFunction.verifyElementSelected(DocPageObj.CheckProcessed);
        r.keyPress(KeyEvent.VK_ESCAPE);
    }
    @Test(priority = 2)
    public void search_document() throws Exception {
        //TC 7.2 SearchBox Document.
        DocPageObj.ClickSearchBox("Pfizer");
        DocPageObj.ClickSearchDocument();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[text()=' Pfizer36.jpg ']//following::td[2]")));
        AssertionsFunction.verifyElementText("Rejected",DocPageObj.StatusOfDoc);
        DocPageObj.ClickClearSearch();
        DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
        DocPageObj.ClickSearchDocument();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[text()=' AN - OOLU2604599081.pdf ']")));
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchedDocument);
        AssertionsFunction.verifyElementText("Processed",DocPageObj.StatusOfDoc);
    }
    @Test(priority = 3)
    public void update_document_cancel_it() throws Exception {
        //TC 7.3 Update document and cancel it.
        DocPageObj.ClickViewDocument();
        Thread.sleep(1000);
       // Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'Cancel')]//preceding::span[1]")));
        DocPageObj.ClickCancelDoc2();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[text()=' AN - OOLU2604599081.pdf ']")));
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);

    }
    @Test(priority = 4)
    public void hide_unhide_analytics() throws Exception {
        //TC 7.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        AssertionsFunction.verifyElementPresent(DocPageObj.Analyticshide);
        DocPageObj.ClickUnHideAnalytics();
        AssertionsFunction.verifyElementPresent(DocPageObj.AnalyticsUnhide);
    }
    @Test(priority = 5)
    public void documents_filter() throws Exception {
        //TC 7.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchFilterDoc);
        DocPageObj.ClickSearchFilterDoc("AN");
        DocPageObj.ClickFilterSearchIcon();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        DocPageObj.ClickFilterDoc();
        DocPageObj.ClickCancelFilterSearch();
        r.keyPress(KeyEvent.VK_ESCAPE);
    }
    @Test(priority = 6)
    public void sorting() throws Exception {
        //TC 7.6 Sorting.
        DocPageObj.ClickDocSort();
        DocPageObj.ClickAssigneeSort();
        DocPageObj.ClickStatusSort();
        DocPageObj.ClickTypeSort();
        DocPageObj.ClickScoreSort();
        DocPageObj.ClickSizeSort();
        DocPageObj.ClickUpdateSort();
        DocPageObj.ClickReceivedSort();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
    }
    @Test(priority = 7)
    public void items_per_page() throws Exception {
        //TC 7.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        DocPageObj.SelectItemsPerPage();
        AssertionsFunction.verifyElementText("10",DocPageObj.ItemSelectedNumber );
    }
    @Test(priority = 8)
    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 7.8 Next Page, Previous Page, Last Page and First Page.
        DocPageObj.ClickNextPage();
        DocPageObj.ClickPreviousPage();
        DocPageObj.ClickLastPage();
        DocPageObj.ClickFirstPage();
        Thread.sleep(2000);

    }
    @Test(priority = 9)
    public void anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
        //TC 7.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
        DocPageObj.ClickSearchBox("3.tif");
        DocPageObj.ClickSearchDocument();
        Thread.sleep(2000);
        DocPageObj.ClickViewDocument();
        Thread.sleep(10000);
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
    }
}