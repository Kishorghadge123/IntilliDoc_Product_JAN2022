package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import Utilities.Custome_Wait;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import javax.print.Doc;
import java.awt.*;
import java.awt.event.KeyEvent;


    @Listeners(Utilities.TestListeners.class)
    public class DocProcessSemiStructuredTest extends BasePage {
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
            DocPageObj = new DocumentPage(driver);
            Robot r = new Robot();
            DocPageObj.ClickDocumentBtn();
            //TC 9.1 Search Project.
            Thread.sleep(10000);
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(3000);
            DocPageObj.ClickSearchProject(ReadProps.readAttr("SemiStructuredProjectName"));
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'QA-AutoProject-SemiStructured')]")));
            DocPageObj.ClickSelectSemiStructuredProject();
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate table-header-icon material-icons filter-icon mat-icon-no-color']")));
            AssertionsFunction.verifyElementText(ReadProps.readAttr("SemiStructuredProjectName"),DocPageObj.SelectSemiStructuredProject);
            Thread.sleep(1000);
            DocPageObj.ClickStatusFilter();
            Thread.sleep(10000);
            DocPageObj.ClickCheckProcessed();
            AssertionsFunction.verifyElementSelected(DocPageObj.CheckProcessed);
            r.keyPress(KeyEvent.VK_ESCAPE);

        }

        @Test(priority = 2)
        public void searchbox_document() throws Exception {
            //TC 9.2 SearchBox Document and status of the document should goes according to Document typw either Processed or Rejected .

            DocPageObj.ClickSearchBox("form 1040.pdf");
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
            DocPageObj.ClickSearchDocument();
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'highlight_off')]")));

            AssertionsFunction.verifyElementText("Processed",DocPageObj.StatusOfDoc);
            Thread.sleep(1000);
            DocPageObj.ClickClearSearch();
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//input[@data-placeholder='Search']")));
            DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
            DocPageObj.ClickSearchDocument();
            AssertionsFunction.verifyElementPresent(DocPageObj.SearchedDocument);
            AssertionsFunction.verifyElementText("Processed",DocPageObj.StatusOfDoc);
Thread.sleep(2000);

        }

        @Test(priority = 3)
        public void update_document_cancel() throws Exception {
            //TC 9.3 Update document and cancel it.
            DocPageObj.ClickViewDocIcon2();
            Thread.sleep(10000);
            DocPageObj.ClickCancel();
            Thread.sleep(4000);
            AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);
            DocPageObj.ClickClearSearch();
            DocPageObj.ClickRefreshDocument();
            Thread.sleep(5000);
        }
        @Test(priority = 4)
        public void hide_unhide_analytics() throws Exception {
            //TC 9.4 Hide and UnHide Analytics.
            DocPageObj.ClickHideAnalytics();
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
            AssertionsFunction.verifyElementPresent(DocPageObj.Analyticshide);
            DocPageObj.ClickUnHideAnalytics();
            Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
            AssertionsFunction.verifyElementPresent(DocPageObj.AnalyticsUnhide);


        }
        @Test(priority = 5)
        public void documents_filter() throws Exception {
            //TC 9.5 Documents filter.
            DocPageObj.ClickFilterDoc();
            AssertionsFunction.verifyElementPresent(DocPageObj.SearchFilterDoc);
            DocPageObj.ClickSearchFilterDoc("AN");
            DocPageObj.ClickFilterSearchIcon();
            Thread.sleep(2000);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            DocPageObj.ClickFilterDoc();
            DocPageObj.ClickCancelFilterSearch();
            r.keyPress(KeyEvent.VK_ESCAPE);

        }
        @Test(priority = 6)
        public void sorting() throws Exception {
            //TC 9.6 Sorting.
            DocPageObj.ClickDocSort();
            Thread.sleep(2000);
            DocPageObj.ClickAssigneeSort();
            DocPageObj.ClickStatusSort();
            DocPageObj.ClickTypeSort();
            DocPageObj.ClickScoreSort();
            DocPageObj.ClickSizeSort();
            DocPageObj.ClickUpdateSort();
            DocPageObj.ClickReceivedSort();
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
        }
        @Test(priority = 7)
        public void items_page() throws Exception {
            //TC 9.7 Items Per Page.
            DocPageObj.ClickItemsPerPage();
            DocPageObj.SelectItemsPerPage();
            AssertionsFunction.verifyElementText("10",DocPageObj.ItemSelectedNumber );
            Thread.sleep(1000);

        }
        @Test(priority = 8)
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
        @Test(priority = 9)
        public void anticlockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
            //TC 9.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
            DocPageObj.ClickSearchBox("4.tif");
            Thread.sleep(2000);
            DocPageObj.ClickSearchDocument();
            Thread.sleep(3000);
            DocPageObj = new DocumentPage(driver);
            Thread.sleep(3000);
            DocPageObj.ClickViewDocIcon3();
            Thread.sleep(6000);
            AssertionsFunction.verifyElementPresent(DocPageObj.DocView);
            Thread.sleep(2000);
            DocPageObj.ClickClockWiseIcon();
            AssertionsFunction.verifyElementPresent(DocPageObj.Clockwise);
            Thread.sleep(1000);
            DocPageObj.ClickAntiWiseIcon();
            AssertionsFunction.verifyElementPresent(DocPageObj.Anticlockwise);
            Thread.sleep(2000);



            // Zoom In.
            DocPageObj.ClickZoomIN();
            AssertionsFunction.verifyElementPresent(DocPageObj.ZoomInDoc);
           Thread.sleep(1000);


            // ZoomOut.
            DocPageObj.ClickZoomOut();
            // Navigate Right.
            DocPageObj.ClickNvgtRt();

            // Navigate Back.
            DocPageObj.ClickNvgtLft();
            Thread.sleep(2000);
            AssertionsFunction.verifyElementPresent(DocPageObj.ClickNavigateLeft);
        }
    }


