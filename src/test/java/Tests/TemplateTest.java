package Tests;

import Base.BasePage;
import Pages.TemplatePage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import Utilities.Scroll_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

@Listeners(Utilities.TestListeners.class)

public class TemplateTest extends BasePage {
    static TemplatePage TemplatePageObj;
    String TemplatePageURL = "https://alpha.neutrino-ai.com/#/home/n-training";



    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.LoginTest();
    }

    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }
    @Test(priority = 1)
    public void create_template_with_invalid_name() throws Exception {
        TemplatePageObj = new TemplatePage(driver);
        Robot r = new Robot();
        TemplatePageObj.ClickTemplateBtn();
Thread.sleep(4000);
        //TC 20.1 - Create Template with Invalid Name and Chosen File.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        Thread.sleep(2000);
        TemplatePageObj.ClickOnTemplateNameExisting(ReadProps.readAttr("TInvalidName"));
        TemplatePageObj.ClickCreateTemplate();
        WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-new-training[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        TemplatePageObj.ClickCancelCreateTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.CancelCreateTemplate);
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void create_template_with_valid_name_no_chosen_file() throws Exception {
        //TC 20.2 - Create Template with Valid Name and No Chosen file.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        Thread.sleep(2000);
        TemplatePageObj.ClickOnTemplateNameNew("TemplateName");
        TemplatePageObj.ClickCancelCreateTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.CancelCreateTemplate);
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void create_template_with_already_exists_name_no_chosen_file() throws Exception {
        //TC 20.3 - Create Template with Already Exists Name and Chosen file
        TemplatePageObj.ClickOnUploadTemplateBtn();
        Thread.sleep(2000);
        TemplatePageObj.ClickOnTemplateNameExisting(ReadProps.readAttr("TExistName"));
        WebElement upload_file = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        TemplatePageObj.ClickCreateTemplate();
        TemplatePageObj.ClickCancelCreateTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.CancelCreateTemplate);
        Thread.sleep(1000);
    }

    @Test(priority = 4)
    public void create_template_with_valid_name_chosen_file() throws Exception {
        //TC 20.4 - Create template with Valid Name and chosen file.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        Thread.sleep(2000);
        TemplatePageObj.ClickOnTemplateNameNew("TemplateNameTest");
        WebElement upload_file = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        TemplatePageObj.ClickCreateTemplate();
        TemplatePageObj.ClickCancel();
        AssertionsFunction.isPresent(TemplatePageObj.Cancel);
        Thread.sleep(1000);


    }

    @Test(priority = 5)
    public void search_created_template() throws Exception {
        //TC 20.5 Search Created template.
        TemplatePageObj.ClickOnSearchSinglePageTemplate(ReadProps.readAttr("TNameUnique")); //AutoSample
        TemplatePageObj.ClickOnExpandTemplate();
        TemplatePageObj.ClickOnTemplateDataInfo();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);

    }

    @Test(priority = 6)
    public void zoom_in() throws Exception {
        //TC 20.6 Zoom IN.
        TemplatePageObj.ClickOnZoomIn();
        TemplatePageObj.ClickOnZoomIn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
    }

    @Test(priority = 7)
    public void zoom_out() throws Exception {
        //TC 20.7 Zoom OUT.
        TemplatePageObj.ClickOnZoomOut();
        TemplatePageObj.ClickOnZoomOut();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        TemplatePageObj.ClickClassificationBox();
        TemplatePageObj.SelectClassification();
        TemplatePageObj.EnterFieldName();
        TemplatePageObj.ClickValidation();
        TemplatePageObj.SelectValidation();
        TemplatePageObj.ClickMap();
        TemplatePageObj.ClickCancelTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CancelTraining);
        Thread.sleep(1000);
    }

    @Test(priority = 8)
    public void delete_created_template_single_page() throws Exception {
        //TC 20.8 Delete created template (Single Page).
        TemplatePageObj.ClickOnSearchSinglePageTemplate(ReadProps.readAttr("TNameUnique"));
        TemplatePageObj.ClickOnExpandTemplate();
        TemplatePageObj.DeleteTemplate();
        TemplatePageObj.ConfirmDeleteTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.ConfirmDeleteTemplate);
        Thread.sleep(1000);
        TemplatePageObj.refreshPage();



    }
    @Test(priority = 9)
    public void create_template_with_more_pages() throws Exception {
        //TC 20.9 Create Template with more pages.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        Thread.sleep(2000);
        TemplatePageObj.ClickOnTemplateNameNew(ReadProps.readAttr("TNameMorePages"));
        WebElement upload_file1 = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
        upload_file1.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Sample.pdf");
        TemplatePageObj.ClickCreateTemplate();
        TemplatePageObj.ClickCancel();
        TemplatePageObj.ClickOnSearchMultiplePageTemplate(ReadProps.readAttr("TNameMorePages"));
        TemplatePageObj.ClickExpandMore();
        TemplatePageObj.ClickOnTemplateMorePagesInfo();
        TemplatePageObj.ClickOnZoomIn();
        TemplatePageObj.ClickOnZoomOut();
        AssertionsFunction.isPresent(TemplatePageObj.ZoomOutIcon);
        Thread.sleep(1000);

    }

    @Test(priority = 10)
    public void navigate_next() throws Exception {
        //TC 20.10 Navigate Next.
        TemplatePageObj.ClickNavigateNext();
        AssertionsFunction.isPresent(TemplatePageObj.NavigateNext);
        Thread.sleep(1000);


    }

    @Test(priority = 11)
    public void navigate_back() throws Exception {
        //TC 20.11 Navigate Back.
        TemplatePageObj.ClickNavigateBack();
        TemplatePageObj.ClickCancelTraining();
        TemplatePageObj.ClickOnSearchMultiplePageTemplate(ReadProps.readAttr("TNameMorePages"));
        TemplatePageObj.ClickExpandMore();
        AssertionsFunction.isPresent(TemplatePageObj.ExpandTemplateMore);
        Thread.sleep(1000);
    }

    @Test(priority = 12)
    public void delete_more_page_template() throws Exception {
        //TC 20.12 Delete More Pages Template.
        TemplatePageObj.DeleteTemplate();
        TemplatePageObj.ConfirmDeleteTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.ConfirmDeleteTemplate);
        Thread.sleep(1000);
        TemplatePageObj.refreshPage();

    }

    @Test(priority = 13)
    public void delete_template_assciatewithproject() throws Exception {
        TemplatePageObj.ClickTemplateBtn();
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        TemplatePageObj.DeleteTemplate();
        TemplatePageObj.cancelDeleteTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.CancelDeleteTemplate);
        Thread.sleep(1000);
    }

    @Test(priority = 14)
    public void sortingOnTemplatePage() throws Exception {

        TemplatePageObj.ClickTemplateBtn();
        TemplatePageObj.verifySortingOnTemplatePage("TempalteName");
        TemplatePageObj.verifySortingOnTemplatePage("Projects");
        TemplatePageObj.verifySortingOnTemplatePage("Pages");
        TemplatePageObj.verifySortingOnTemplatePage("Training");
        TemplatePageObj.verifySortingOnTemplatePage("Updated");
        TemplatePageObj.verifySortingOnTemplatePage("Created");
    }

    @Test(priority = 15)
    public void selected_template_loaded_or_not() throws Exception {
        //TC 20.5 Search Created template.
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        TemplatePageObj.ClickCompleteTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CompleteTraining);


    }


    @Test(priority = 16)
    public void fieldname_should_be_visiable_editable() throws Exception {
        //TC 20.5 Search Created template.
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(1000);
        TemplatePageObj.clickonName();
        Thread.sleep(2000);
        TemplatePageObj.ClickCompleteTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CompleteTraining);


    }

    @Test(priority = 17)
    public  void Validation_type_should_be_visible_and_delete() throws Exception{
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(9000);
        TemplatePageObj.deletefield();
        Thread.sleep(2000);
        TemplatePageObj.ClickCompleteTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CompleteTraining);

    }
    @Test(priority = 18)
    public  void Working_of_CancleUpdate_Button() throws Exception{
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(1000);
        TemplatePageObj.clickonName();
        Thread.sleep(2000);
        TemplatePageObj.clickoncancelupdatebtn();
        Thread.sleep(2000);
        TemplatePageObj.ClickCompleteTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CompleteTraining);


    }


    @Test(priority = 19)
    public  void Working_of_completetrainingbutton() throws Exception{
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        TemplatePageObj.ClickCompleteTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CompleteTraining);


    }
    @Test(priority = 20)
    public  void Working_of_savedraft() throws Exception{
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        TemplatePageObj.ClickSaveDraft();

    }
    @Test(priority = 21)
    public  void Working_of_cancelbutton() throws Exception{
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
        TemplatePageObj.ClickCancel();

    }
    @Test(priority = 22)
    public  void tempalte_name_should_display() throws Exception{
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        AssertionsFunction.isPresent(TemplatePageObj.TemplateDataInfo);
        Thread.sleep(1000);
        TemplatePageObj.clickoncompletedoc();
        Thread.sleep(15000);
      TemplatePageObj.getname();
      Thread.sleep(2000);
        TemplatePageObj.ClickCompleteTraining();
        AssertionsFunction.isPresent(TemplatePageObj.CompleteTraining);


    }


}
