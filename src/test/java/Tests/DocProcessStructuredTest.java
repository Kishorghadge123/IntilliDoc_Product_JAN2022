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
import java.io.IOException;

@Listeners(Utilities.TestListeners.class)

public class DocProcessStructuredTest extends BasePage {
    static DocumentPage DocPageObj;

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
    public void search_project() throws Exception {
        DocPageObj = new DocumentPage(driver);
        Robot r = new Robot();
        DocumentPage DocPageObj = new DocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        //TC 10.1 Search Project.
        Thread.sleep(10000);
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(5000);
        DocPageObj.ClickSearchProject(ReadProps.readAttr("StructuredProjectName"));
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' QA-AutoProject-Structured11 ')]")));
        DocPageObj.ClickSelectStructuredProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate table-header-icon material-icons filter-icon mat-icon-no-color']")));
        AssertionsFunction.verifyElementText(ReadProps.readAttr("StructuredProjectName"),DocPageObj.SelectStructuredProject);
        Thread.sleep(1000);
        DocPageObj.ClickStatusFilter();
Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' Processed ')]")));
        DocPageObj.ClickCheckProcessed();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(DocPageObj.CheckProcessed);
        r.keyPress(KeyEvent.VK_ESCAPE);

    }

    @Test(priority = 2)
    public void searchbox_document() throws Exception {
        //TC 10.2 SearchBox Document.

        DocPageObj.ClickSearchBox("4.tif");
     Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        DocPageObj.ClickSearchDocument();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        //AssertionsFunction.verifyElementText("Rejected", DocPageObj.StatusOfDoc);
        Thread.sleep(1000);
        DocPageObj.ClickClearSearch();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//input[@data-placeholder='Search']")));
        DocPageObj.ClickSearchBox("BRE US Citizen.jpg");
     Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        DocPageObj.ClickSearchDocument();
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchDocument);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void update_document_cancel() throws Exception {
        //TC 10.3 Update Document and Cancel it.
        DocPageObj.ClickViewDocIcon();
        Thread.sleep(10000);
        DocPageObj.ClickExpansionPanel();
        Thread.sleep(2000);
        DocPageObj.ClickCancel();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocumentPageURL);
        DocPageObj.ClickClearSearch();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//input[@data-placeholder='Search']")));
        DocPageObj.ClickRefreshDocument();
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void hide_unhide_analytics() throws Exception {
        //TC 10.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
        AssertionsFunction.verifyElementPresent(DocPageObj.Analyticshide);
        DocPageObj.ClickUnHideAnalytics();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Documents ')]")));
        AssertionsFunction.verifyElementPresent(DocPageObj.AnalyticsUnhide);
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void documents_filter() throws Exception {
        //TC 10.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control theme_color ng-tns')]")));
        AssertionsFunction.verifyElementPresent(DocPageObj.SearchFilterDoc);
        Thread.sleep(1000);
        DocPageObj.ClickSearchFilterDoc("BRE");
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]")));
        DocPageObj.ClickFilterSearchIcon();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),'Documents')]/button")));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        DocPageObj.ClickFilterDoc();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[2]")));
        DocPageObj.ClickCancelFilterSearch();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void sorting() throws Exception {
        //TC 10.6 sorting.
        DocPageObj.ClickDocSort();
        Thread.sleep(4000);
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
    public void items_page() throws Exception {
        //TC 10.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        DocPageObj.SelectItemsPerPage();
        AssertionsFunction.verifyElementText("10", DocPageObj.ItemSelectedNumber);


    }

    @Test(priority = 8)
    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 10.8 Next Page, Previous Page, Last Page and First Page.
        DocPageObj.ClickNextPage();
        Thread.sleep(2000);
        DocPageObj.ClickPreviousPage();
        Thread.sleep(2000);
        DocPageObj.ClickLastPage();
        Thread.sleep(2000);
        DocPageObj.ClickFirstPage();
            Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.FirstPage);
        Thread.sleep(3000);

    }

    @Test(priority = 9)
    public void anticlockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
        //TC 10.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
       //TC 10.11 Verify  the  Zoom In Functionality for the Structured Project for the Platform Admin.
        //TC 10.12 Verify  the  Zoom out Functionality for the Structured Project for the Platform Admin.
        //TC-10.13 Verify the Navigate Right (Next Page) Functionality for the Structured Project for th
        //TC 10.14 Verify the Navigate left Functionality for the Structured Project for th
        //TC10.10 Verify  the Clock  Wise  Functionality for the Structured Project for the Platform Admin.
        DocPageObj.ClickSearchBox("form 1040.pdf");
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")));
        DocPageObj.ClickSearchDocument();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-icon[contains(text(),'highlight_off')]")));
        DocPageObj = new DocumentPage(driver);
        Robot r = new Robot();
        DocumentPage DocPageObj = new DocumentPage(driver);
        Thread.sleep(7000);
        DocPageObj.ClickViewDocIcon1();
        Thread.sleep(10000);
        DocPageObj.ClickClockWiseIcon();
        AssertionsFunction.verifyElementPresent(DocPageObj.Clockwise);
        Thread.sleep(1000);
        DocPageObj.ClickAntiWiseIcon();
        AssertionsFunction.verifyElementPresent(DocPageObj.Anticlockwise);
        Thread.sleep(1000);
        //Zoom In.
        DocPageObj.ClickZoomIN();

        //ZoomOut.
        DocPageObj.ClickZoomOut();


        //Navigate Right.
        DocPageObj.ClickNvgtRt();


        //Navigate Back.
        DocPageObj.ClickNvgtLft();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(DocPageObj.ClickNavigateLeft);

    }

    @Test(priority = 10)
    public void verify_tooltip() throws InterruptedException, IOException, AWTException {
        DocPageObj.ClickDocumentBtn();
        //TC 10.1 Search Project.
        //TC 10.16 Verify Tooltip should display for long text Project Name which is selected
        //TC 10.15 Verify Tooltip should display for long text Project Name in Project Name List
       //TC 10.17 Verify Tooltip should display for long text Document Name in Document list
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(5000);
        DocPageObj.ClickSearchProject("QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View");
        DocPageObj.verifytooltipOnHoverProjectSearchList();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        DocPageObj.ClickSelectStructuredProjectTooltip();
        DocPageObj.verifytooltipOnHoverProjectSearched();
        Thread.sleep(1000);
        DocPageObj.verifytooltipOnHoverOnDocumentName();
        Thread.sleep(1000);
    }


}