package Pages;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
public class ProjectBREStructureChartDocumentPage {
    static WebDriver driver = null;
//locators
    By ele = By.xpath("//span[contains(text(),' text-overflowbythesystemadmin ')]");
    String currentDate = new SimpleDateFormat("dd").format(new Date());
    By Email=By.xpath("//input[@id='mat-input-15']");
    By email=By.xpath("//input[@class='mat-tooltip-trigger mat-input-element mat-form-field-autofill-control mat-autocomplete-trigger ellipsis ng-tns-c97-84 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']");
public String docurl="https://alpha.neutrino-ai.com/#/home/documents";
public String loginurl="https://alpha.neutrino-ai.com/#/login";
    By password=By.xpath("//button[@type='submit']//preceding::input[1]");
    By lButton=By.xpath("//input[@type='text']//following::button[1]");
    By CreateProject=By.xpath("//span[contains(text(),' Create Project ')]");
    By EnterOnTextField=By.xpath("//input[@formcontrolname='project']");
    By lead=By.xpath("//*[@formcontrolname='lead']");
    By SelectLead = By.xpath("//span[contains(text(),'qa1@email.com')]");
    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
    public static By SelectStructure = By.xpath("//span[contains(text(),'Structured')]");
    By ClickProcessingEngine = By.xpath("//*[@formcontrolname='processingEngine']/div[1]/div[2]");
    By SelectProcessingEngine = By.xpath("//span[contains(text(),'NN High')]");
    public static By SelectProcessingEngineNNLow = By.xpath("//span[contains(text(),'NN Low')]");
    public static By StraightThroughProcess = By.xpath("//*[@formcontrolname='staightThroughProcessing']/label/div");
    By DocumentScore = By.xpath("//input[@formcontrolname='score']");
    public static By Status = By.xpath("//*[@formcontrolname='status']/label/div");
    By Attributes = By.xpath("//span[contains(text(),'Attributes')]");
    public static By DocumentAutoAssign = By.xpath("//*[@formcontrolname='autoAssignment']/label/div");
    By ClickAddTemplate = By.xpath("//span[contains(text(),'Add Template')]");
    By SelectTemplate = By.xpath("//button[contains(text(),'PE_TEMPLATE')]");
    By ClickRoles = By.xpath("//span[contains(text(),'Roles')]");
    public static   By AddRoleAdmin = By.xpath("//span[contains(text(),'Add Role')]");
    public static By SelectRoleAdmin = By.xpath("//button[contains(text(),'AE Admin')]");
    public static By SelectedRoleAdmin = By.xpath("//*[text()=' AE Admin ']");
    By AddUser = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/project-info-section[1]/mat-accordion[1]/project-roles[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");
    By AddUserAdmin = By.xpath("//button[@class='mat-focus-indicator disabled-font-color mat-icon-button mat-button-base primary-font-color']");       //esc method
    public static By SelectUserAdmin = By.xpath("//span[contains(text(),'j1@gmail.com')]");

    By CraeteProjectButton=By.xpath("//span[contains(text(),' Next')]//preceding::button[2]");


    // By enterProjectName=By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c97-5 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']");
    By select_lead=By.xpath("//span[@class='mat-option-text']");
    By click_on_calendar=By.xpath("//button[@class='mat-focus-indicator mat-icon-button mat-button-base']");
    By click_on_calendar_arrow=By.xpath("//button[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']");
    By click_on_year=By.xpath("//button[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']");
    By ClickStartDate = By.cssSelector("button[aria-label='Open calendar'][tabindex='0']");
    By ClearStartDate = By.xpath("//input[@id='mat-input-3']");
    By SelectStartDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By ClickEndDate = By.xpath("/html/body/app-root/div/app-landing/div/div/main/div/app-create-project/div[2]/div/form/mat-card/div/div[4]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
    By ClearEndDate = By.xpath("//input[@id='mat-input-4']");
    By SelectEndDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By clickOnStructureChartData=By.xpath("//mat-label[contains(text(),'Data')]");
    By ClickNvgtRight=By.xpath("//*[@mattooltip='Navigate Right']");
    By CheckProcessedDocument = By.xpath("//div[@role='listbox']/mat-option[3]");
    By OpenStructureNewPdf=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(),'structrejected.pdf')]");
    By CancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    By clickOnCancel=By.xpath("//span[contains(text(),'Cancel')]");
    By ReleaseButton = By.xpath("//span[contains(text(),'Release')]");
    By submitButton = By.xpath("//span[contains(text(),'Submit')]");
    By submitButt = By.xpath("//span[contains(text(),'Submit')]");
    By ProcessedPdf = By.xpath("//span[contains(text(),'proceessdstruc1.pdf ')]");
    By RunRuleButton = By.xpath("//span[contains(text(),'Run Rule')]");
    By clickOnStructutrProject = By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By clickOnActionButton=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::tr[3]/td[9]");
    By clickOnStatusButton = By.xpath("//thead[@role='rowgroup']//preceding::tr[1]/th[3]/div[1]/div[1]/button");
    By selectStructureNewProject = By.xpath("//span[contains(text(),'New structre1 ')]");
    By  selectStructureProject = By.xpath("//span[contains(text(),' 7351structured ')]");
    public static  By Logout = By.xpath("//span[@mattooltip='Logout']");
    By OpenStructurePdf = By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(), ' readystruct.pdf ')]");

    public ProjectBREStructureChartDocumentPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void clickonCancel(){
        driver.findElement(submitButt).click();
    }

    @Step("click_on_search_project ")
    public void click_on_search_project() {
        driver.findElement(clickOnStructutrProject).click();
    }

    @Step("CheckProcessedDocument")
    public void CheckProcessedDocument() throws  Exception{
        Thread.sleep(3000);
        driver.findElement(CheckProcessedDocument).click();
    }

    @Step(" ClickNvgtRt")
    public  void  ClickNvgtRt(){
        driver.findElement(ClickNvgtRight).click();
    }
    @Step(" ClickLogoutBtn")
    public void ClickLogoutBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(Logout).click();
    }
    @Step("clickOnNameField")
    public void clickOnNameField(){
        driver.findElement(EnterOnTextField).sendKeys("text-overflowbythesystemadmin");
    }

    @Step("ClickOnEndDate")
    public void ClickOnEndDate() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickEndDate).click();
    }

    @Step(" SelectEndDate")
    public void SelectEndDate() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectEndDate).click();
    }

    @Step(" clickOnLead")
    public void clickOnLead(){
        driver.findElement(lead).click();
    }

    @Step("SelectOnLeadBtn")
    public void SelectOnLeadBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectLead).click();
    }
    public void click_on_dropdown(){
        driver.findElement(select_lead).click();
    }

    @Step("ClickOnStartDateBtn")
    public void ClickOnStartDateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickStartDate).click();
    }

    @Step(" SelectStartDateBtn")
    public void SelectStartDateBtn()throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectStartDate).click();
    }
    public void select_year(){
        driver.findElement(click_on_year).click();
    }


    public void select_structure_project() {
        driver.findElement(selectStructureProject).click();
    }

    public void select_new_Structured_Project(){
        driver.findElement(selectStructureNewProject).click();
    }

    @Step(" clickOnstructurePdf")
    public void clickOnstructurePdf() {
        driver.findElement(OpenStructurePdf).click();


    }

    @Step("ClickOnCreateProjectBtn")
    public void ClickOnCreateProjectBtn() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(CreateProject).click();


    }
    @Step("ClickOnDocumentStructureBtn")
    public void ClickOnDocumentStructureBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickDocumentStructure).click();
    }
    @Step("SelectDocumentStructureBtn")
    public void SelectDocumentStructureBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectStructure).click();
    }

    @Step("ClickOnProcessingEngineBtn")
    public void ClickOnProcessingEngineBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickProcessingEngine).click();
    }
    @Step("SelectOnProcessingEngineBtn")
    public void SelectOnProcessingEngineBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectProcessingEngine).click();
    }

    public void SelectOnProcessingEngineLowBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectProcessingEngineNNLow).click();
    }
    @Step("ClickOnStraightThroughProcessBtn")
    public void ClickOnStraightThroughProcessBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(StraightThroughProcess).click();
    }
    @Step("ClickOnDocumentScoreButton")
    public void ClickOnDocumentScoreButton()throws Exception{
        Thread.sleep(2000);
        driver.findElement(DocumentScore).sendKeys("60");
    }
    @Step("ClickOnStatusBtn")
    public void ClickOnStatusBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(Status).click();
    }
    @Step(" ClickOnDocumentAutoAssignBtn")
    public void ClickOnDocumentAutoAssignBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(DocumentAutoAssign).click();
    }
    @Step(" ClickOnAddTemplateBtn")
    public void ClickOnAddTemplateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickAddTemplate).click();
    }


    @Step("ClickOnTemplateBtn")
    public void ClickOnTemplateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectTemplate).click();
    }
    @Step("ClickOnRolesBtn")
    public void ClickOnRolesBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickRoles).click();
    }
    @Step("ClickOnAddRoleBtn")
    public void ClickOnAddRoleBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddRoleAdmin).click();
    }
    @Step("ClickOnSelectRoleBtn")
    public void ClickOnSelectRoleBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectRoleAdmin).click();
    }
    @Step("ClickOnAddUserBtn")
    public void ClickOnAddUserBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddUserAdmin).click();
    }

    @Step("ClickOnSelectUserBtn")
    public void ClickOnSelectUserBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectUserAdmin).click();
    }
    @Step("ClickOnCreate")
    public void ClickOnCreate() throws Exception{
        driver.findElement(CraeteProjectButton).click();
    }


    @Step("overOnProjectName")
    public  void  overOnProjectName() throws  Exception{
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(ele);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");

    }


    public void verifyUI() {
        String actual_page = driver.getCurrentUrl();
        String expected_page = "https://alpha.neutrino-ai.com/#/home/documents/processed-forms?faxPageId=6263d21f7e461f7615093dc9&imageName=readystruct.pdf&type=pdf&_st=Ready";
        Assert.assertEquals(actual_page, expected_page);
    }

    public void clickOnsubmit(){
        driver.findElement(clickOnCancel).click();
    }

    @Step("clickOnProcessedPdf")
    public  void clickOnProcessedPdf() throws  Exception{

        driver.findElement(ProcessedPdf).click();
        Thread.sleep(3000);
    }
    @Step("clickOnStatusButton")
    public void clickOnStatusButton() {
        driver.findElement(clickOnStatusButton).click();
    }

    @Step(" getCancelButton")
    public By getCancelButton() {
        return this.CancelButton;
    }
    @Step(" getReleaseButton")
    public By getReleaseButton() {
        return this.ReleaseButton;
    }
    @Step("getsubmitButton")
    public By getsubmitButton() {
        return this.submitButton;
    }

    @Step(" getEmail")
    public By getEmail() {
        return this.Email;
    }
    public By getemail() {
        return this.email;
    }
    public  void clickOnActionButton(){
        driver.findElement(clickOnActionButton).click();
    }
    @Step("getRunRuleButton")
    public By getRunRuleButton() {
        return this.RunRuleButton;
    }

    public  void clickOnNewStructurePdf(){
        driver.findElement(OpenStructureNewPdf).click();
    }

    @Step(" clickOnStructureChartData")
    public void clickOnStructureChartData(){
        driver.findElement(clickOnStructureChartData).click();
    }
}