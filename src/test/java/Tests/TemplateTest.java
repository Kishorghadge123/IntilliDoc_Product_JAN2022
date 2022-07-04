package Tests;
import Base.BasePage;
import Pages.TemplatePage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import Utilities.Scroll_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
@Feature("TemplateTest")
@Listeners(Utilities.TestListeners.class)

public class TemplateTest extends BasePage {
    static TemplatePage TemplatePageObj;
    String TemplatePageURL = "https://alpha.neutrino-ai.com/#/home/n-training";


    @Step("login started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.LoginTest();
    }
    @Step("browser close")
    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 - create_template_with_invalid_name")
    @Description("create_template_with_invalid_name")
    @Test (priority=1,groups="smoke", description = " create_template_with_invalid_name")

    public void create_template_with_invalid_name() throws Exception {
        TemplatePageObj = new TemplatePage(driver);
        Robot r = new Robot();
        TemplatePageObj.ClickTemplateBtn();

        //TC 20.1 - Create Template with Invalid Name and Chosen File.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        TemplatePageObj.ClickOnTemplateNameExisting(ReadProps.readAttr("TInvalidName"));
        TemplatePageObj.ClickCreateTemplate();
        WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-new-training[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        TemplatePageObj.ClickCancelCreateTemplate();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 - create_template_with_valid_name_no_chosen_file")
    @Description("create_template_with_valid_name_no_chosen_file")
    @Test (priority=2,groups="smoke", description = " create_template_with_valid_name_no_chosen_file")

    public void create_template_with_valid_name_no_chosen_file() throws Exception {
        //TC 20.2 - Create Template with Valid Name and No Chosen file.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        TemplatePageObj.ClickOnTemplateNameNew("TemplateName");
        TemplatePageObj.ClickCancelCreateTemplate();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - create_template_with_already_exists_name_no_chosen_file")
    @Description("create_template_with_already_exists_name_no_chosen_file")
    @Test (priority=3,groups="smoke", description = " create_template_with_already_exists_name_no_chosen_file")

    public void create_template_with_already_exists_name_no_chosen_file() throws Exception {
        //TC 20.3 - Create Template with Already Exists Name and Chosen file
        TemplatePageObj.ClickOnUploadTemplateBtn();
        TemplatePageObj.ClickOnTemplateNameExisting(ReadProps.readAttr("TExistName"));
        WebElement upload_file = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        TemplatePageObj.ClickCreateTemplate();
        TemplatePageObj.ClickCancelCreateTemplate();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004 - create_template_with_valid_name_chosen_file")
    @Description("create_template_with_valid_name_chosen_file")
    @Test (priority=4,groups="smoke", description = " create_template_with_valid_name_chosen_file")

    public void create_template_with_valid_name_chosen_file() throws Exception {
        //TC 20.4 - Create template with Valid Name and chosen file.
        TemplatePageObj.ClickOnUploadTemplateBtn();
        TemplatePageObj.ClickOnTemplateNameNew("TemplateNameTest");
        WebElement upload_file = driver.findElement(By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input"));
        upload_file.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\Template1.jpg");
        TemplatePageObj.ClickCreateTemplate();
        TemplatePageObj.ClickCancel();

    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005 - search_created_template")
    @Description("search_created_template")
    @Test (priority=6,groups="smoke", description = " search_created_template")
    public void search_created_template() throws Exception {
        //TC 20.5 Search Created template.
        TemplatePageObj.ClickOnSearchSinglePageTemplate(ReadProps.readAttr("TNameUnique")); //AutoSample
        TemplatePageObj.ClickOnExpandTemplate();
        TemplatePageObj.ClickOnTemplateDataInfo();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - zoom_in")
    @Description("zoom_in")
    @Test (priority=6,groups="smoke", description = " zoom_in")

    public void zoom_in() throws Exception {
        //TC 20.6 Zoom IN.
        TemplatePageObj.ClickOnZoomIn();
        TemplatePageObj.ClickOnZoomIn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 - zoom_out")
    @Description("zoom_out")
    @Test (priority=7,groups="smoke", description = " zoom_out")

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
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008 - delete_created_template_single_page")
    @Description("delete_created_template_single_page")
    @Test (priority=8,groups="smoke", description = "delete_created_template_single_page")

    public void delete_created_template_single_page() throws Exception {
        //TC 20.8 Delete created template (Single Page).
        TemplatePageObj.ClickOnSearchSinglePageTemplate(ReadProps.readAttr("NameUnique"));
        TemplatePageObj.ClickOnExpandTemplate();
        TemplatePageObj.DeleteTemplate();
        TemplatePageObj.ConfirmDeleteTemplate();
        TemplatePageObj.refreshPage();



    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 09 - create_template_with_more_pages")
    @Description("create_template_with_more_pages")
    @Test (priority=9,groups="smoke", description = " create_template_with_more_pages")

    public void create_template_with_more_pages() throws Exception {
        //TC 20.9 Create Template with more pages.
        TemplatePageObj.ClickOnUploadTemplateBtn();
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
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010 - navigate_next")
    @Description("navigate_next")
    @Test (priority=10,groups="smoke", description = " navigate_next")

    public void navigate_next() throws Exception {
        //TC 20.10 Navigate Next.
        TemplatePageObj.ClickNavigateNext();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 011 - navigate_back")
    @Description("navigate_back")
    @Test (priority=11,groups="smoke", description = " navigate_back")

    public void navigate_back() throws Exception {
        //TC 20.11 Navigate Back.
        TemplatePageObj.ClickNavigateBack();
        TemplatePageObj.ClickCancelTraining();
        TemplatePageObj.ClickOnSearchMultiplePageTemplate(ReadProps.readAttr("TNameMorePages"));
        TemplatePageObj.ClickExpandMore();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012 - delete_more_page_template")
    @Description("delete_more_page_template")
    @Test (priority=12,groups="smoke", description = " delete_more_page_template")

    public void delete_more_page_template() throws Exception {
        //TC 20.12 Delete More Pages Template.
        TemplatePageObj.DeleteTemplate();
        TemplatePageObj.ConfirmDeleteTemplate();
        // need to write code for dymanic handling
            /*TemplatePageObj.DeleteTemplate();
            TemplatePageObj.ConfirmDeleteTemplate();
            TemplatePageObj.DeleteTemplate();
            TemplatePageObj.ConfirmDeleteTemplate();
            TemplatePageObj.DeleteTemplate();
            TemplatePageObj.ConfirmDeleteTemplate();*/
        TemplatePageObj.refreshPage();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013 - delete_template_assciatewithproject")
    @Description("delete_template_assciatewithproject")
    @Test (priority=13,groups="smoke", description = " delete_template_assciatewithproject")

    public void delete_template_assciatewithproject() throws Exception {
        TemplatePageObj.ClickTemplateBtn();
        TemplatePageObj.ClickOnSearchTemplate("QA-AutoTemplate");
        TemplatePageObj.ClickOnExpandTemplate();
        TemplatePageObj.DeleteTemplate();
        TemplatePageObj.cancelDeleteTemplate();
    }

//    @Test(priority = 14)
//    public void sortingOnTemplatePage() throws Exception {
//
//        TemplatePageObj.ClickTemplateBtn();
//        TemplatePageObj.verifySortingOnTemplatePage("TempalteName");
//        TemplatePageObj.verifySortingOnTemplatePage("Projects");
//        TemplatePageObj.verifySortingOnTemplatePage("Pages");
//        TemplatePageObj.verifySortingOnTemplatePage("Training");
//        TemplatePageObj.verifySortingOnTemplatePage("Updated");
//        TemplatePageObj.verifySortingOnTemplatePage("Created");
//    }
}