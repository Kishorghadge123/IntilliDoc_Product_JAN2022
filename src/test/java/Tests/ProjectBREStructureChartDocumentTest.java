package Tests;
import Pages.*;
import Base.BasePage;
import Utilities.AssertionsFunction;
import Utilities.LoginUser;
import Utilities.ReadProps;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;


@Listeners(Utilities.TestListeners.class)

public class ProjectBREStructureChartDocumentTest extends BasePage {
    public static ProjectBREStructureChartDocumentPage ProjectBREStructureChartDocumentPageobj;
    public DocumentPage DocPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        // BasePage.LoginTest();
    }

    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }


    @Test(priority = 1)
    public void verifyUI() throws Exception {

        //IN 510 Revamp of the screen for the documents of the status 'Rejected'.
        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
        //read.sleep(9000);
        DocPageObj = new DocumentPage(driver);
        ProjectBREStructureChartDocumentPageobj = new ProjectBREStructureChartDocumentPage(driver);
        Thread.sleep(5000);

        DocPageObj.ClickDocumentBtn();
        Thread.sleep(300);
        ProjectBREStructureChartDocumentPageobj.clickOnstructurePdf();
        Thread.sleep(2000);
        //Search Medical Chart Project
        driver.navigate().back();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.docurl);
Thread.sleep(1000);

    }

    @Test(priority = 2)
    public void Verify_Button_Are_Available() throws Exception {
//IN 581 Creation of permission to edit the 'Processed Document'
        ProjectBREStructureChartDocumentPageobj.clickOnStatusButton();
        Thread.sleep(3000);
        ProjectBREStructureChartDocumentPageobj.CheckProcessedDocument();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.clickOnProcessedPdf();
        Thread.sleep(3000);
        ProjectBREStructureChartDocumentPageobj.getCancelButton();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getCancelButton())));
        Thread.sleep(1000);
        ProjectBREStructureChartDocumentPageobj.getReleaseButton();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getReleaseButton())));
        Thread.sleep(1000);
        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
        Thread.sleep(1000);
        ///IN 559 Once the document has been processed, for semi structured, free form, the values should be in read only mode
        ProjectBREStructureChartDocumentPageobj.getEmail();
        Thread.sleep(2000);
        Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
        //Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));

        driver.navigate().back();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.docurl);
        Thread.sleep(1000);

    }
    @Test(priority = 3)
    public void verify_data_extracted_from_Each_page() throws  Exception{
///471 AIML Engine multithreading bug fix
        Thread.sleep(3000);
        ProjectBREStructureChartDocumentPageobj.clickOnProcessedPdf();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
        ProjectBREStructureChartDocumentPageobj.ClickNvgtRt();

        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Thread.sleep(2000);
        Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
        ProjectBREStructureChartDocumentPageobj.ClickNvgtRt();

        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Thread.sleep(2000);
        Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
        ProjectBREStructureChartDocumentPageobj.ClickNvgtRt();
        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Thread.sleep(2000);
        Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
        ProjectBREStructureChartDocumentPageobj.ClickNvgtRt();
        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickNvgtRt();
        driver.navigate().back();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.docurl);
        Thread.sleep(1000);



    }

    @Test(priority = 4)
    public void Verify_data_and_buttons_available_on_page() throws  Exception{
//IN 682  Once the document is in processed state, buttons like edit, add should not be available, the page should contain only the processed data and on the top right corner, 'Cancel' button should be made available
        Thread.sleep(1000);
        ProjectBREStructureChartDocumentPageobj.clickOnstructurePdf();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.getCancelButton();
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getCancelButton())));
        ProjectBREStructureChartDocumentPageobj.getReleaseButton();
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getReleaseButton())));
        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
        //459 Matching non matched key using fuzzy wuzzy in structured document
        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.getEmail();
        Thread.sleep(2000);
        Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
        driver.navigate().back();
        Thread.sleep(1000);
        ProjectBREStructureChartDocumentPageobj.ClickLogoutBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.loginurl);


    }




    @Test(priority = 5)
    public void Observe_tooltip_for_text_overflow() throws  Exception{
        //In 736 Tooltip consistency in Document Navigator and Document Viewer
        //838 Revamp of the screen, when, no projects/templates/roles are available, ie, when the screen is blank in the respective sections
        Robot r=new Robot();
        LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
        Thread.sleep(2000);

        ProjectBREStructureChartDocumentPageobj.ClickOnCreateProjectBtn();
        Thread.sleep(400);
        ProjectBREStructureChartDocumentPageobj.clickOnNameField();

        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.clickOnLead();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnStartDateBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.SelectStartDateBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnEndDate();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.SelectEndDate();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnProcessingEngineBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.SelectOnProcessingEngineBtn();
        Thread.sleep(2000);

        ProjectBREStructureChartDocumentPageobj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnDocumentScoreButton();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj. ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnAddUserBtn();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(200);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(10000);
        ProjectBREStructureChartDocumentPageobj.ClickOnCreate();
        Thread.sleep(7000);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.click_on_search_project();
        Thread.sleep(2000);
        ProjectBREStructureChartDocumentPageobj.overOnProjectName();
        Thread.sleep(2000);
    }
}

