package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TemplatePage {
    WebDriver driver = null;

    By TemplateBtn = By.xpath("//i[@aria-describedby='cdk-describedby-message-4']");
    By UploadTemplate = By.xpath("//*[contains (text(),'Upload Template')]");
    By CreateTemplate = By.xpath("//span[contains(text(),'Create Template')]");
    By CancelCreateTemplate = By.xpath("//*[@id='close-modal']/span[1]/mat-icon");
    By TemplateName = By.xpath("//*[@data-placeholder='Template Name']");
    By ChooseFile = By.xpath("//*[@id='faxDetailModal']/div/div/div[2]/div/form/div/input");
    By CloseBtn = By.xpath("//*[@id='close-modal']/span[1]/mat-icon");
    By SearchTemplate = By.xpath("//*[@data-placeholder='Search']");
    By ExpandTemplate = By.xpath("//tbody/tr[1]/td[1]");
    By ExpandTemplateMore = By.xpath("//td[contains(text(),'AutoSampleMPTemp')]");
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
    By MapErrorMsg = By.xpath("//*[text()=' Please select the portion on image for which the field name and validations have been given. ']");
    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By CompleteTraining = By.xpath("//*[contains(text(),'Complete Training')]");
    By ClickClassification = By.xpath("//*[@id='docClassificationField']");
    By SelectClassification= By.xpath("//body/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By ClickValidation = By.xpath("//*[@formcontrolname='validation']");
    By SelectValidation = By.xpath("//span[contains(text(),' Name ')]");
    By CancelTraining = By.xpath("//div[@class='tr-button white_bg']/button[3]");
    By NavigateNext = By.xpath("//*[contains(text(),'navigate_next')]");
    By NavigateBack = By.xpath("//*[contains(text(),'navigate_before')]");
    By TrainingStatus = By.xpath("//tbody/tr[1]/td[4]");

    By InvalidTemplateNameErr= By.xpath("//mat-error[text()='Only alphabets,digits,parenthesis and hyphens are allowed while naming a template.']");
    By ExistingTemplateNameErr= By.xpath("//div[text()='Template Name Already In Use.']");
    By CancelDeleteTemplate = By.xpath("//span[text()='Cancel']");
    //Methods
    public TemplatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickTemplateBtn() {
        driver.findElement(TemplateBtn).click();
    }

    public void ClickOnUploadTemplateBtn() {
        driver.findElement(UploadTemplate).click();
    }

    public void ClickCreateTemplate() {
        driver.findElement(CreateTemplate).click();
    }

    public void ClickCancelCreateTemplate() {
        driver.findElement(CancelCreateTemplate).click();
    }

    public void ClickOnTemplateName(String text) {
        driver.findElement(TemplateName).sendKeys(text);
        driver.findElement(TemplateName).click();

    }

    public void ClickOnChooseFileBtn() {
        driver.findElement(ChooseFile).click();
    }

    public void ClickOnCloseButton() {
        driver.findElement(CloseBtn).click();
    }

    public void ClickOnSearchTemplate(String tName) {
        driver.findElement(SearchTemplate).sendKeys(tName);
    }

    public void ClickOnExpandTemplate() {
        driver.findElement(ExpandTemplate).click();
    }
    public void ClickExpandMore(){
        driver.findElement(ExpandTemplateMore).click();
    }

    public void ClickOnTemplateDataInfo() {
        driver.findElement(TemplateDataInfo).click();
    }

    public void ClickCancel() {
        driver.findElement(Cancel).click();
    }

    public void DeleteTemplate() {
        driver.findElement(TemplateDelete).click();
    }

    public void ConfirmDeleteTemplate() {
        driver.findElement(ConfirmDeleteTemplate).click();
    }

    public void ClickOnTemplateGrid() {
        driver.findElement(TemplateOnGrid).click();
    }

    public void ClickOnZoomIn() {
        driver.findElement(ZoomInIcon).click();
    }

    public void ClickOnZoomOut() {
        driver.findElement(ZoomOutIcon).click();
    }

    public void ClickClassificationBox(){
        driver.findElement(ClickClassification).click();
    }

    public void SelectClassification()
    {
        driver.findElement(SelectClassification).click();
    }

    public void ClickValidation()
    {
        driver.findElement(ClickValidation).click();
    }

    public void SelectValidation()
    {
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



    public void ClickSaveDraft()
    {
        driver.findElement(SaveDraft).click();
    }

    public void ClickCompleteTraining()
    {
        driver.findElement(CompleteTraining).click();
    }

    public void ClickCancelTraining(){driver.findElement(CancelTraining).click();}

    public void ClickNavigateNext()
    {
        driver.findElement(NavigateNext).click();
    }


    public void ClickNavigateBack()
    {
        driver.findElement(NavigateBack).click();
    }
    public void ClickOnTemplateMorePagesInfo()
    {
        driver.findElement(TemplateDataInfo1).click();
    }

    public void verifyInvalidTemplatNameErr()
    {
        String ActualErrorInvalidTemplateName = driver.findElement(InvalidTemplateNameErr).getText();
        String ExpectedInvalidTemplateName = "Only alphabets,digits,parenthesis and hyphens are allowed while naming a template.";
        Assert.assertEquals(ActualErrorInvalidTemplateName,ExpectedInvalidTemplateName);

    }

    public void verifyExistingTemplateName()
    {
        String ActualErrorExistingTemplateName = driver.findElement(ExistingTemplateNameErr).getText();
        String ExpectedExistingTemplateName = "Template Name Already In Use.";
        Assert.assertEquals(ActualErrorExistingTemplateName,ExpectedExistingTemplateName);
    }
    public void verifyTemplateMap() {
        String ActualMapError = driver.findElement(MapErrorMsg).getText();
        String ExpectedMapError = "Please select the portion on image for which the field name and validations have been given.";
        Assert.assertEquals(ActualMapError, ExpectedMapError);
    }

    public void AssertTrainingStatus()
    {
        String ActualStaus = driver.findElement(TrainingStatus).getText();
        String ExpectedStatus = "In Progress";
        Assert.assertEquals(ActualStaus,ExpectedStatus);
    }

    public void verifySinglePageTemplateCreated() {
        String[] TemplateName = driver.findElement(ExpandTemplate).getText().split(" ");
        String ActualTemplate = TemplateName[1].trim();
        String ExpectedTemplate = "AutoSampleSPTemp";
        Assert.assertEquals(ActualTemplate, ExpectedTemplate);

    }

    public void verifySinglePageTemplateDelete() {
        String[] TemplateName = driver.findElement(ExpandTemplate).getText().split(" ");
        String ActualTemplate = TemplateName[1].trim();
        String ExpectedTemplate = "AutoSampleSPTemp";
        Assert.assertNotEquals(ActualTemplate, ExpectedTemplate);

    }

    public void verifyMultiPageTemplateCreated() {
        String[] TemplateName = driver.findElement(ExpandTemplate).getText().split(" ");
        String ActualTemplate = TemplateName[1].trim();
        String ExpectedTemplate = "AutoSampleMPTemp";
        Assert.assertEquals(ActualTemplate, ExpectedTemplate);

    }

    public void verifyMultiPageTemplateDelete() {

            String[] TemplateName = driver.findElement(ExpandTemplate).getText().split(" ");
            String ActualTemplate = TemplateName[1].trim();
            String ExpectedTemplate = "AutoSampleMPTemp";
            Assert.assertNotEquals(ActualTemplate, ExpectedTemplate);



    }

    public void verifyDeleteAssociatedTemplate()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=' Sample-page1 is associated with QA-AutoProject-Structured,QA-AutoProject-Structured4 projects ']")).isDisplayed());

    }

    public void cancelDeleteTemplate()
    {
        driver.findElement(CancelDeleteTemplate).click();
    }


}