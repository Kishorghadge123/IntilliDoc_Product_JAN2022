package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Random;

public class TemplatePage   {
    WebDriver driver = null;

    By superdocumnet=By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[3]");
    public static By TemplateBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[3]");
    public static  By UploadTemplate = By.xpath("//*[contains (text(),'Upload Template')]");
    By CreateTemplate = By.xpath("//span[contains(text(),'Create Template')]");
    By CancelCreateTemplate = By.xpath("//*[@id='close-modal']/span[1]/mat-icon");
    By TemplateName = By.xpath("//*[@data-placeholder='Template Name']");
    By ChooseFile = By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input");
    By CloseBtn = By.xpath("//*[@id='close-modal']/span[1]/mat-icon");
    By SearchTemplate = By.xpath("//*[@data-placeholder='Search']");
    public static By ExpandTemplate = By.xpath("//tbody/tr[1]/td[1]");
    By ExpandTemplateMore = By.xpath("//td[contains(text(),'AutoSample')]");
    By Cancel = By.xpath("//span[contains(text(),' Cancel ')]");
    By TemplateDataInfo = By.xpath("//td[contains(text(),'Template1')]");
    By TemplateDataInfo1 = By.xpath("//td[contains(text(),'Sample-page1')]");
    By TemplateDelete = By.xpath("//table[@matsortdirection='desc']/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[6]/button[2]");
    By ConfirmDeleteTemplate = By.xpath("//*[contains(text(),'Confirm')]");
    By TemplateOnGrid = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]");
    By ZoomInIcon = By.xpath("//button[@mattooltip='Zoom In']");
    By ZoomOutIcon = By.xpath("//button[@mattooltip='Zoom Out']");
    By CropDragIcon = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mx-1 mat-mini-fab mat-button-base mat-primary']/span[1]/mat-icon[1]");
    By FieldName = By.xpath("//input[@formcontrolname='attributeName']");
    By MapButton = By.xpath("//*[contains(text(),'Map')]");
    public static By MapErrorMsg = By.xpath("//*[text()=' Please select the portion on image for which the field name and validations have been given. ']");
    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By CompleteTraining = By.xpath("//*[contains(text(),'Complete Training')]");
    By ClickClassification = By.xpath("//*[@id='docClassificationField']");
    By SelectClassification = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By ClickValidation = By.xpath("//*[@formcontrolname='validation']");
    By SelectValidation = By.xpath("//span[contains(text(),' Name ')]");
    By CancelTraining = By.xpath("//div[@class='tr-button white_bg']/button[3]");
    By NavigateNext = By.xpath("//*[contains(text(),'navigate_next')]");
    By NavigateBack = By.xpath("//*[contains(text(),'navigate_before')]");
    By TrainingStatus = By.xpath("//tbody/tr[1]/td[4]");

    public static By InvalidTemplateNameErr = By.xpath("//mat-error[text()='Only alphabets,digits,parenthesis and hyphens are allowed while naming a template.']");
    public static By ExistingTemplateNameErr = By.xpath("//div[text()='Template Name Already In Use.']");
    By CancelDeleteTemplate = By.xpath("//span[text()='Cancel']");

    //Navigation Page
    By UploadTemplatePage = By.xpath("//span[text()='Create New Template']");
    By TemplateExpanded = By.xpath("//div[text()=' Classification ']");
    By ClassificationListBox = By.xpath("//div[@role='listbox']");
    By DeleteTemplatePage = By.xpath("//*[text()=' Do you want to delete Template1 ? ']");
    public static By TemplateStatus = By.xpath("//tbody/tr[1]/td[4]");
    public static By TemplateCreatedTime = By.xpath("//tbody/tr[1]/td[5]");
    public static By TemplateUpdatedTime = By.xpath("//tbody/tr[1]/td[6]");
    By TemplateNameSort = By.xpath("//div[text()=' Templates ']/parent::div/div[2]");
    By BeforeSort = By.xpath("//*[@aria-sort='none'][1]");
    By AfterSort = By.xpath("//th[@aria-sort='ascending']");
    By ProjectsSort = By.xpath("//div[text()=' Projects ']/parent::div/div[2]");
    By PagesSort = By.xpath("//div[text()=' Pages ']/parent::div/div[2]");
    By TrainingSort =By.xpath("//div[text()=' Training ']/parent::div/div[2]");
    By UpdatedSort =By.xpath("//div[text()=' Updated ']/parent::div/div[2]");
    By CreatedSort =By.xpath("//div[text()=' Created ']/parent::div/div[2]");

    String TemplatePageURL = "https://alpha.neutrino-ai.com/#/home/n-training";


    //Methods
    public TemplatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickTemplateBtn() throws Exception
    {
        Thread.sleep(3000);
        Custome_Wait.wait(driver,TemplateBtn);
        driver.findElement(TemplateBtn).click();
    }

    public void ClickOnUploadTemplateBtn() throws Exception
    {
        Thread.sleep(3000);
        Custome_Wait.wait(driver,UploadTemplate);
        driver.findElement(UploadTemplate).click();

    }

    public void ClickCreateTemplate() throws Exception
    {
        Thread.sleep(2000);
        Custome_Wait.wait(driver,CreateTemplate);
        driver.findElement(CreateTemplate).click();
        Thread.sleep(15000);
    }

    public void ClickCancelCreateTemplate()throws Exception
    {
        Custome_Wait.wait(driver,CancelCreateTemplate);
        driver.findElement(CancelCreateTemplate).click();
        Thread.sleep(1000);
    }
    public void  superdocumnet(){
        driver.findElement(superdocumnet).click();
    }

    public void ClickOnTemplateNameExisting(String text)
    {
        Custome_Wait.wait(driver,TemplateName);
        driver.findElement(TemplateName).sendKeys(text);
        driver.findElement(TemplateName).click();

    }

    public void ClickOnTemplateNameNew(String text)
    {
        Random r = new Random();
        char first_c = (char)(r.nextInt(26) + 'a');
        char second_c = (char)(r.nextInt(26) + 'a');
        driver.findElement(TemplateName).sendKeys(text+first_c+second_c);
        driver.findElement(TemplateName).click();

    }
    public void ClickOnChooseFileBtn() {
        driver.findElement(ChooseFile).click();
    }

    public void ClickOnCloseButton() {
        driver.findElement(CloseBtn).click();
    }

    public void ClickOnSearchSinglePageTemplate(String tName) throws InterruptedException {
        driver.findElement(SearchTemplate).sendKeys(tName);
        Thread.sleep(2000);

    }
    public void ClickOnSearchMultiplePageTemplate(String tName) throws InterruptedException {
        driver.findElement(SearchTemplate).sendKeys(tName);
        Thread.sleep(2000);

    }

    public void ClickOnSearchTemplate(String tName) throws InterruptedException {
        driver.findElement(SearchTemplate).sendKeys(tName);
        Thread.sleep(2000);

    }


    public void ClickOnExpandTemplate() throws InterruptedException {
        driver.findElement(ExpandTemplate).click();
        Thread.sleep(2000);

    }

    public void ClickExpandMore() {

        Custome_Wait.wait(driver,ExpandTemplateMore);
        driver.findElement(ExpandTemplateMore).click();
    }

    public void ClickOnTemplateDataInfo()
    {

        Custome_Wait.wait(driver,TemplateDataInfo);
        driver.findElement(TemplateDataInfo).click();
    }

    public void ClickCancel() throws Exception
    {
        Thread.sleep(6000);
        Custome_Wait.wait(driver,Cancel);
        driver.findElement(Cancel).click();
    }

    public void DeleteTemplate() {

        Custome_Wait.wait(driver,TemplateDelete);
        driver.findElement(By.xpath("//table[@matsortdirection='desc']/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[6]/button[2]")).click();
        //driver.findElement(TemplateDelete).click();
    }

    public void DeleteTemplateSinglePage() throws InterruptedException {
        driver.findElement(TemplateDelete).click();

    }



    public void ConfirmDeleteTemplate() {
        driver.findElement(ConfirmDeleteTemplate).click();
    }

    public void ClickOnTemplateGrid() {
        driver.findElement(TemplateOnGrid).click();
    }

    public void ClickOnZoomIn()  throws Exception
    {
        Thread.sleep(3000);
        driver.findElement(ZoomInIcon).click();
    }

    public void ClickOnZoomOut() {
        driver.findElement(ZoomOutIcon).click();
    }

    public void ClickClassificationBox () throws InterruptedException
    {
        driver.findElement(ClickClassification).click();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent (ClassificationListBox);

    }

    public void SelectClassification() {
        driver.findElement(SelectClassification).click();
    }

    public void ClickValidation() {
        driver.findElement(ClickValidation).click();
    }

    public void SelectValidation() {
        driver.findElement(SelectValidation).click();
    }

    public void ClickCropIcon() {
        driver.findElement(CropDragIcon).click();
    }

    public void EnterFieldName() {
        driver.findElement(FieldName).sendKeys("Verify");
    }


    public void ClickMap() {
        driver.findElement(MapButton).click();

    }


    public void ClickSaveDraft() {
        driver.findElement(SaveDraft).click();
    }

    public void ClickCompleteTraining() {
        driver.findElement(CompleteTraining).click();
    }

    public void ClickCancelTraining() throws Exception
    {
        Thread.sleep(5000);
        driver.findElement(CancelTraining).click();
        Thread.sleep(1000);

    }

    public void ClickNavigateNext() throws Exception{
        driver.findElement(NavigateNext).click();
        Thread.sleep(6000);
    }


    public void ClickNavigateBack() throws Exception
    {
        Thread.sleep(5000);
        driver.findElement(NavigateBack).click();
    }

    public void ClickOnTemplateMorePagesInfo() throws Exception
    {
        driver.findElement(TemplateDataInfo1).click();
        Thread.sleep(10000);
    }

    public void cancelDeleteTemplate() {
        driver.findElement(CancelDeleteTemplate).click();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void verifySortingOnTemplatePage(String SortingHeader) throws InterruptedException
    {
        switch ( SortingHeader)
        {
            case "TempalteName":
            {

                // AssertionsFunction.verifyElementPresent(BeforeSort);
                Thread.sleep(2000);
                driver.findElement(TemplateNameSort).click();
                  /*  Thread.sleep(5000);
                    AssertionsFunction.verifyElementPresent(AfterSort);*/
                break;

            }

            case "Projects":
            {

                AssertionsFunction.verifyElementPresent(BeforeSort);
                Thread.sleep(2000);
                driver.findElement(ProjectsSort).click();
                    /*Thread.sleep(5000);
                    AssertionsFunction.verifyElementPresent(AfterSort);*/
                break;

            }
            case "Pages":
            {

                AssertionsFunction.verifyElementPresent(BeforeSort);
                Thread.sleep(2000);
                driver.findElement(PagesSort).click();
                    /*Thread.sleep(5000);
                    AssertionsFunction.verifyElementPresent(AfterSort);*/
                break;

            }
            case "Training":
            {

                AssertionsFunction.verifyElementPresent(BeforeSort);
                Thread.sleep(2000);
                driver.findElement(TrainingSort).click();
                 /*   Thread.sleep(5000);
                    AssertionsFunction.verifyElementPresent(AfterSort);*/
                break;

            }
            case "Updated":
            {

                AssertionsFunction.verifyElementPresent(BeforeSort);
                Thread.sleep(2000);
                driver.findElement(UpdatedSort).click();
                    /*Thread.sleep(5000);
                    AssertionsFunction.verifyElementPresent(AfterSort);*/
                break;

            }

            case "Created":
            {

                AssertionsFunction.verifyElementPresent(BeforeSort);
                Thread.sleep(2000);
                driver.findElement(CreatedSort).click();
                    /*Thread.sleep(5000);
                    AssertionsFunction.verifyElementPresent(AfterSort);*/
                break;

            }


        }


    }


}