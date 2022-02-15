package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Utilities.ReadProps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class DocProcessFreeFormTest extends BasePage {
    static DocumentPage DocPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void search_project() throws Exception {
        Robot r = new Robot();
        DocPageObj = new DocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(5000);
        //TC 7.1 Search Project.
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
        DocPageObj.ClickSearchProject(ReadProps.readAttr("FreeFormProjectName"));
        Thread.sleep(2000);
        DocPageObj.ClickSelectFreeFormProject();
        Thread.sleep(2000);
        DocPageObj.ClickStatusFilter();
        Thread.sleep(2000);
        DocPageObj.ClickCheckProcessed();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void search_document() throws Exception {
        //TC 7.2 SearchBox Document.
        DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
        Thread.sleep(2000);
        DocPageObj.ClickSearchDocument();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void update_document_cancel_it() throws Exception {
        //TC 7.3 Update document and cancel it.
        DocPageObj.ClickViewDocIcon2();
        Thread.sleep(10000);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(3000);
        DocPageObj.ClickRefreshDocument();
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void hide_unhide_analytics() throws Exception {
        //TC 7.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        Thread.sleep(2000);
        DocPageObj.ClickUnHideAnalytics();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void documents_filter() throws Exception {
        //TC 7.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        Thread.sleep(2000);
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
    @Test(priority = 6)
    public void sorting() throws Exception {
        //TC 7.6 Sorting.
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
    @Test(priority = 7)
    public void items_per_page() throws Exception {
        //TC 7.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        Thread.sleep(2000);
        DocPageObj.SelectItemsPerPage();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 7.8 Next Page, Previous Page, Last Page and First Page.
        DocPageObj.ClickNextPage();
        Thread.sleep(2000);
        DocPageObj.ClickPreviousPage();
        Thread.sleep(2000);
        DocPageObj.ClickLastPage();
        Thread.sleep(2000);
        DocPageObj.ClickFirstPage();
        Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
        //TC 7.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
        DocPageObj.ClickSearchBox("3.tif");
        Thread.sleep(2000);
        DocPageObj.ClickSearchDocument();
        Thread.sleep(2000);
        DocPageObj.ClickViewDocIcon4();
        Thread.sleep(10000);
        DocPageObj.ClickAntiWiseIcon();
        Thread.sleep(2000);
        DocPageObj.ClickClockWiseIcon();
        Thread.sleep(2000);

        // Zoom In.
        DocPageObj.ClickZoomIN();
        Thread.sleep(2000);

        // ZoomOut.
        DocPageObj.ClickZoomOut();
        Thread.sleep(2000);

        // Navigate Right.
        DocPageObj.ClickNvgtRt();
        Thread.sleep(2000);

        // Navigate Back.
        DocPageObj.ClickNvgtLft();
        Thread.sleep(2000);
    }
}