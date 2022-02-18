package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class DocProcessMedicalChartTest extends BasePage
{
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
        //TC 8.1 Search Project.
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
        DocPageObj.ClickSelectMedicalChartProject();
        Thread.sleep(2000);
        DocPageObj.ClickStatusFilter();
        Thread.sleep(2000);
        DocPageObj.ClickCheckProcessed();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void searchbox_document() throws Exception {
        //TC 8.2 SearchBox Document.
        DocPageObj.ClickSearchBox("Processed");
        Thread.sleep(2000);
        DocPageObj.ClickSearchDocument();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void update_document_cancel_and_check_Chart_level_flags() throws Exception {
        //TC 8.3 Update Document and Cancel it.
        DocPageObj.ClickViewDocIcon5();
        Thread.sleep(8000);
        DocPageObj.ClickOnChartLevelFlagsBtn();
        Thread.sleep(2000);
        DocPageObj.selectNONHCCBtn();
        Thread.sleep(2000);
        DocPageObj.ClickOnChartLevelFlagsBtn();
        Thread.sleep(2000);
        DocPageObj.selectInvalidRecordBtn();
        Thread.sleep(2000);
        DocPageObj.ClickOnChartLevelFlagsBtn();
        Thread.sleep(2000);
        DocPageObj.selectPatientNameMismatchBtn();
        Thread.sleep(2000);
        DocPageObj.ClickExpansionPanel();
        Thread.sleep(2000);
        DocPageObj.ClickCancelDoc2();
        Thread.sleep(2000);
        DocPageObj.ClickClearSearch();
        Thread.sleep(2000);
        DocPageObj.ClickRefreshDocument();
        Thread.sleep(5000);
    }
    @Test(priority = 4)
    public void hide_unhide_analytics() throws Exception {
        //TC 8.4 Hide and UnHide Analytics.
        DocPageObj.ClickHideAnalytics();
        Thread.sleep(2000);
        DocPageObj.ClickUnHideAnalytics();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void documents_filter() throws Exception {
        //TC 8.5 Documents filter.
        DocPageObj.ClickFilterDoc();
        Thread.sleep(2000);
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
    @Test(priority = 6)
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
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void items_page() throws Exception {
        //TC 8.7 Items Per Page.
        DocPageObj.ClickItemsPerPage();
        Thread.sleep(2000);
        DocPageObj.SelectItemsPerPage();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void next_page_previous_page_first_page_last_page() throws Exception {
        //TC 8.8 Next Page, Previous Page, Last Page and First Page.
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
    public void create_chronic_condition() throws Exception {
        //TC 8.9 Create Chronic condition.
        DocPageObj.ClickViewDocIcon2();
        Thread.sleep(6000);
        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(3000);
        DocPageObj.ClickChronicCondition();
        Thread.sleep(3000);
        DocPageObj.ClickAddCondition();
        Thread.sleep(3000);
        DocPageObj.AddNPINumber();
        Thread.sleep(2000);
        DocPageObj.AddPhysicianName();
        Thread.sleep(2000);
        DocPageObj.ClickStartDate();
        Thread.sleep(2000);
        DocPageObj.SelectStartDate();
        Thread.sleep(2000);
        DocPageObj.ClickEndDate();
        Thread.sleep(2000);
        DocPageObj.SelectEndDate();
        Thread.sleep(2000);
        DocPageObj.SaveChronicCondition();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(4000);
    }
}