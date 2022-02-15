package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class ManualInterventionDocument extends BasePage {
    static DocumentPage documentPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test (priority = 1)
    public void manual_intervention_freeform_rejected_document() throws Exception {
        //Object Creation
        documentPageObj = new DocumentPage(driver);
        Robot r = new Robot();
        Thread.sleep(1000);
       documentPageObj.ClickDocumentBtn();
        Thread.sleep(10000);
        documentPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
        documentPageObj.ClickSelectFreeFormProject();
        Thread.sleep(2000);
        documentPageObj.ClickSearchBox("Pfizer7.jpg");//rejected document for free from project.
        Thread.sleep(2000);
        documentPageObj.ClickSearchDocument();
        Thread.sleep(2000);
        documentPageObj.ViewFreeFormRejectedDocument();
        Thread.sleep(5000);
        documentPageObj.clickAddData();
        Thread.sleep(2000);
        documentPageObj.clickAddAttributes();
        Thread.sleep(2000);
        documentPageObj.addAttributes();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        documentPageObj.clickADD();
        Thread.sleep(2000);
        documentPageObj.addAttributeValue();
        Thread.sleep(4000);
        documentPageObj.clickSaveDraft();
        Thread.sleep(4000);
        documentPageObj.ViewFreeFormRejectedDocument();
        Thread.sleep(4000);
        documentPageObj.clickAddData();
        Thread.sleep(2000);
        documentPageObj.clickSubmit();
        Thread.sleep(2000);
        documentPageObj.clickSubmitChanges();
        Thread.sleep(4000);
        documentPageObj.ClickStatusFilter();
        Thread.sleep(2000);
        documentPageObj.ClickCheckProcessed();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(4000);
        documentPageObj.assertFreeFormDocument();
        Thread.sleep(2000);
    }}
//    @Test(priority = 2)
//    public void manual_intervention_structured_ready_document() throws Exception {
//        Robot r = new Robot();
//        documentPageObj.ClickDocumentBtn();
//        Thread.sleep(10000);
//        //documentPageObj.clearProject();
//        //Thread.sleep(2000);
//        documentPageObj.ClickDropDownBtn();
//        Thread.sleep(2000);
//        documentPageObj.ClickSelectStructuredProject();
//        Thread.sleep(2000);
//        documentPageObj.ClickSearchBox("Pfizer.jpg");//ready document for structured project.
//        Thread.sleep(2000);
//        documentPageObj.ClickSearchDocument();
//        Thread.sleep(3000);
//        documentPageObj.viewStructuredReadyDoc();
//       Thread.sleep(4000);
//        documentPageObj.clickAddData();
//        Thread.sleep(2000);
//        documentPageObj.updateAttributeValue();
//        Thread.sleep(6000);
//        documentPageObj.clickSaveDraft();
//        Thread.sleep(4000);
//        documentPageObj.viewStructuredReadyDoc();
//        Thread.sleep(4000);
//        documentPageObj.clickAddData();
//        Thread.sleep(2000);
//        documentPageObj.clickSubmit();
//        Thread.sleep(4000);
//        documentPageObj.clickSubmitChanges();
//        Thread.sleep(5000);
//        documentPageObj.ClickStatusFilter();
//        Thread.sleep(2000);
//        documentPageObj.ClickCheckProcessed();
//        Thread.sleep(2000);
//        r.keyPress(KeyEvent.VK_ESCAPE);
//        Thread.sleep(4000);
//        documentPageObj.assertFreeFormDocument();
//        Thread.sleep(2000);
//        documentPageObj.viewStructuredReadyDoc();
//        Thread.sleep(4000);
//        documentPageObj.clickAddData();
//        Thread.sleep(2000);
//        documentPageObj.updateAttributeValue();
//        Thread.sleep(6000);
//        documentPageObj.clickSubmit();
//        Thread.sleep(4000);
//        documentPageObj.clickSubmitChanges();
//        Thread.sleep(5000);
//    }
//}
