package Pages;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class ProjectBREMedicalChartDocumentPage {

    WebDriver driver = null;

    //Element Locators
    By userName = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    By CheckProcessedDocument = By.xpath("//div[@role='listbox']/mat-option[3]");
    By clickOnStatusButton=By.xpath("//thead[@role='rowgroup']//preceding::tr[1]/th[3]/div[1]/div[1]/button");

    By clickoneditencouter=By.xpath("//mat-tab-body/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-table[1]/mat-row[2]/mat-cell[5]/button[1]/mat-icon[1]");

    By clickOnMedicalProject=By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By clickOnStructutrProject=By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");

    By selectProject=By.xpath("//span[contains(text(),'MedicalProjectNew')]");



    By selectStructureProject=By.xpath("//span[contains(text(),' 735structured ')]");
    By OpenReadyDocument = By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(),'process.pdf ')]");
    By CancelButton=By.xpath("//span[contains(text(),'Cancel')]");
    By ReleaseButton=By.xpath("//span[contains(text(),'Release')]");
    By submitButton=By.xpath("//span[contains(text(),'Submit')]");
    By RunRuleButton=By.xpath("//span[contains(text(),'Run Rule')]");
    By openMedicalReadyDocument=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::tr[4]/td[3]/button");
    By OpenReadyDocumentICD = By.xpath("//span[contains(text(),'document (1).pdf')]");
    By OpenRejectedDocument = By.xpath("//span[contains(text(),'inputDocs.jpg')]");
    By ChartData = By.xpath("//mat-label[contains(text(),'Chart Data')]");
    By ClickOnStructureChartData=By.xpath("//mat-label[contains(text(),'Data')]");

    //By Address = By.xpath("//div[@class='mat-form-field-infix ng-tns-c97-11']");
    By Address= By.xpath("//input[@pattern=\"^([a-zA-Z0-9,\\s])+([a-zA-Z0-9\\s()]+)*(-[()a-zA-Z0-9\\s]+)*$\"]");
    By ClickOnRejectedDocument=By.xpath("//tbody[@role='rowgroup']//following::span[contains(text(),' t1if.tif ')]");

    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By ChronicConditions = By.xpath("//div[contains(text(),' Chronic Conditions ')]");

    By AddChronicCondition = By.xpath("//mat-icon[contains(text(),'add')]");

    By NPINumber = By.xpath("//input[@formcontrolname='npiNo']");
    By EncounterDetails = By.xpath("//span[contains(text(),'NPI No')]");
    By DoctorName = By.xpath("//input[@formcontrolname='physicianName']");
    By StartDate = By.xpath("//input[@formcontrolname='startDate']");
    By HCCCodes = By.xpath("//*[text()='HCC']");          //input[@formcontrolname='hcc_codes']
    By EditICDCodeDetailsOnEditDiagnosisDetails = By.xpath("//*[text()=' ICD ']//following::input[1]");

    By EditICDCodeDetails = By.xpath("//*[text()='Patient Demographics']//following::button[6]");
    By PickCommentAdd = By.xpath("//span[contains(text(),'ADD')]");
    By EndDate = By.xpath("//input[@formcontrolname='endDate']");
    By ClickAddedChronicCondition = By.xpath("//div[contains(text(),' Chronic Conditions ')]//following::button[1]/span/mat-icon");
    By SaveBtn = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By DeleteCC = By.xpath("//mat-icon[contains(text(),'delete')]");
    By CancelCC = By.xpath("//button[@class='mat-focus-indicator mr-2 mat-stroked-button mat-button-base mat-accent']");
    By EditEncounterDetails = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/button[1]/span[1]/mat-icon[1]");
    By EditEncounterDetailsCC = By.xpath("//div[contains(text(),'DOS End Date')]/following::button/span/mat-icon[contains(text(),'create')]");
    By clickOnTopEncounterDetail=By.xpath("(//div[contains(text(),'DOS End Date')])[1]");
    By ClickOnAddEncounterButton=By.xpath("(//div[contains(text(),'DOS End Date')])[1]//following::mat-icon[2]");
    By endDate=By.xpath("//div[contains(text(),'DOS End Date')]");
    By CancelEditEncounterDetails = By.xpath("//button[@class='mat-focus-indicator mr-2 mat-stroked-button mat-button-base mat-accent']");
    By AddDiagnosisDetails = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/button[2]/span[1]/mat-icon[1]");
    By CancelDiagnosisDetails = By.xpath("//button[@id='category-close-modal']");
    By RunRule = By.xpath("//*[@id='docImag']//following::button[2]");
    By AddComment = By.xpath("//span[contains(text(),'Add Comment')]");
    By CancelBtnICD = By.xpath("//span[text()='Cancel']");
    By SelectICDCode = By.xpath("//span[contains(text(),' Cholera due to Vibrio cholerae 01, biovar cholerae')]");
    By OpenReadyDocumentICD1 = By.xpath("//span[contains(text(),'Karis Garner_only 8 page.pdf')]");
    By npnNum=By.xpath("//mat-label[contains(text(),'NPI Number')]");

    By Diagnosis=By.xpath("//div[text()='Patient Demographics']/following::div[contains(text(),' Diagnosis')]");
    By DignosisPlusBtn=By.xpath("(//mat-icon[contains(text(),'add')])[1]");
    By CancelEncounterDetails=By.xpath("//span[contains(text(),' Cancel ')]");
    By AddHCCorNonHCCBtn=By.xpath("//div[text()='DOS End Date ']/following::button/span/mat-icon[contains(text(),' add')]");
    By LatestEncounter=By.xpath("(//*[contains(text(),'DOS End Date ')])[1]");
    By HCCdiagnosis=By.xpath("//input[@name='Diagnosis']");
    By PageNum=By.xpath("//input[@type='number']");
    By PageNumNonHCC=By.xpath("//div[text()='HCC']//following::div[text()='Non HCC']//following::mat-label[text()='Diagnosis']//following::input[@name='NonHccPageRange']");
    By AddICD=By.xpath("//span[contains(text(),'Add ICD')]");
    By ICD=By.xpath("(//input[@type='text'])[4]");
    By HCC=By.xpath("//*[text()=' HCC ']//following::input[2]");
    By SaveHCC=By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By cancelHCC=By.xpath("//button[@class='mat-focus-indicator mr-2 mat-stroked-button mat-button-base mat-accent']");
    By EditEncounter=By.xpath("//div[text()='DOS End Date ']/following::button/span/mat-icon[contains(text(),' create')]");
    By NonHCC=By.xpath("//div[text()='HCC']//following::div[text()='Non HCC']");
    By DignosisNonHCC=By.xpath("//div[text()='HCC']//following::div[text()='Non HCC']//following::mat-label[text()='Diagnosis']");
    By CommentNonHCC=By.xpath("//following::mat-label[text()='Diagnosis']//following::input[@name='NonHccPageRange']//following::mat-select[@name='NonHccComment']");
    By diagnosis_Tab = By.xpath("//*[text()='Patient Demographics']//following::div[1]");
    By addEncounterDetails = By.xpath("//*[text()='Cancel']//following::span[10]"); //+button
    By ICDDesctrionOption=By.xpath("//*[text()=' Description ']//following::span[3]//following::span[@class='mat-option-text']//following::span[text()=' Type 2 diabetes mellitus with ketoacidosis without coma']");
    //By createdCategory=By.xpath("//td[contains(text(),\""+ ReadProps.readAttr("DName")+"\")]");
    By createdICD=By.xpath("//span[text()='E1122'][1]");

    // By cratedEmail=By.xpath("//input[@class='mat-tooltip-trigger mat-input-element mat-form-field-autofill-control tooltip-input customEllipse ng-tns-c97-95 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']");
    By cratedEmail=By.xpath("//mat-cell[text()=' Email Address ']");
    By clickOnActionButton=By.xpath("//tbody[@role='rowgroup']//preceding::span[contains(text(), ' process.pdf ')]//following::mat-icon[2]");
    By ClickZoomIn = By.xpath("");
    By ClickZoomOut = By.xpath("//*[@class='fa fa-search-minus']");
    By imageName=By.xpath("//mat-label[@class='mat-tooltip-trigger float-left w-100 f-bold ellipsis font-17 ng-tns-c258-653']");
    By clickOnItemPage=By.xpath("//div[@class='mat-paginator-page-size-label']//following::div[6]");
    By PatientDemography=By.xpath("//div[text()='Patient Demographics']");

    By OpenMedicalPdf=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(),'  inputDocs_medical project_Hughes Nancy Jane1.pdf  ')]");
    By zoomIN=By.xpath("(//button[@id='default-btn-id'])[3]");
    By OpenStructurePdf=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(), 'structure 3.pdf ')]");
    By ProcessedPdf=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(), ' struct re 4.pdf ')]");
    By OpenReadyMedicalPdf=By.xpath("//tbody[@role='rowgroup']/tr[7]/td[1]");
    By clickOnLatestEncouter=By.xpath("//mat-expansion-panel-header[@class='mat-expansion-panel-header mat-focus-indicator ng-tns-c158-867 ng-tns-c157-866 ng-star-inserted mat-expanded']//following::mat-expansion-panel-header[1]");
    By clickOnMedicalChartData=By.xpath("//mat-label[contains(text(),'Chart Data')]");
    //Constructor
    public ProjectBREMedicalChartDocumentPage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    //Methods

    public  void enterUserName(String text){
        driver.findElement(userName).sendKeys(text);
    }

    public  void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
    }

    public  void clickOnLoginButton(){
        driver.findElement(loginBtn).click();
    }
    public void CheckProcessedDocument(){
        driver.findElement(CheckProcessedDocument).click();
    }

    public  void clickOnStatusButton(){
        driver.findElement(clickOnStatusButton).click();
    }
    public By getcreatedICD(){return this.createdICD;}
    public  By getcreatedEmail(){return  this.cratedEmail;}
    public  void clickOnActionButton(){
        driver.findElement(clickOnActionButton).click();
    }
    public void clickOnImagename(){
        Assert.assertTrue(driver.findElement(By.xpath("//mat-label[contains(text(),'t1if.tif')]")).isDisplayed());}

    public By getendDate(){return  this.endDate;}
    public By getnpnNum(){return this.npnNum;}
    public void ClickOnEncounterDetails() {
        driver.findElement(EncounterDetails).click();
    }
    public  void click_on_medicalProject(){
        driver.findElement(clickOnMedicalProject).click();

    }
    public  void click_on_structure_project(){
        driver.findElement(clickOnStructutrProject).click();
    }

    public void ClickOnPickICDCode() {
        driver.findElement(SelectICDCode).click();
    }

    public void ClickOnReadyDocument() {driver.findElement(OpenReadyDocument).click();
    }
    public  void clickOnrejectedDocument(){
        driver.findElement(ClickOnRejectedDocument).click();
    }
    public  void   ClickOnTopEncounterDetail(){
        driver.findElement(clickOnTopEncounterDetail).click();}


    public  void ClickOnMedicalDocument(){driver.findElement(openMedicalReadyDocument).click();}

    public By getCancelButton(){ return  this.CancelButton;}
    public By getReleaseButton(){ return  this.ReleaseButton;}
    public By getsubmitButton(){ return  this.submitButton;}
    public By getRunRuleButton(){ return  this.RunRuleButton;}


//    public void click_On_Window(){
//        driver.findElement(windowWidth).click();
//    }

    public void clickOnLatestEncounter()
    {
        driver.findElement(clickOnLatestEncouter).click();
    }
    public void clickOnEditEncounter(){
        driver.findElement(clickoneditencouter).click();
    }
    public void ClickOnClearICDCode() {
        driver.findElement(EditICDCodeDetailsOnEditDiagnosisDetails).clear();
    }
    public void ClickOnendDate(){driver.findElement(endDate).click();}
    public void ClickOnEditICDCodeOnEditDiagnosisDetails() {
        driver.findElement(EditICDCodeDetails).click();
    }
    public void ClickOnSaveEditDiagnosisDetails() {
        driver.findElement(SaveBtn).click();
    }
    public void ClickOnCancelEditDiagnosisDetails() {
        driver.findElement(CancelCC).click();
    }

    public void ClickOnReadyDocumentICD() {
        driver.findElement(OpenReadyDocumentICD).click();
    }
    public  void clickOnPdf(){
        driver.findElement(OpenMedicalPdf).click();
    }
    public  void clickOnstructurePdf(){
        driver.findElement(OpenStructurePdf).click();

    }
    public  void clickOnProcessedPdf(){
        driver.findElement(ProcessedPdf).click();
    }
    public  void clickOnMedicalPdf(){
        driver.findElement(OpenReadyMedicalPdf).click();
    }
    public void select_medical_project(){
        driver.findElement(selectProject).click();
    }
    public void select_structure_project(){
        driver.findElement(selectStructureProject).click();
    }
    public void ClickOnReadyDocumentICD1() {
        driver.findElement(OpenReadyDocumentICD1).click();
    }
    public void ClickOnEditICDDetails() {
        driver.findElement(EditICDCodeDetails).click();
    }
    public void ClickOnRejectedDocument() {
        driver.findElement(OpenRejectedDocument).click();
    }
    public void ClickOnEditEncounterDetails() {
        driver.findElement(EditEncounterDetails).click();
    }

    public void ClickOnChartData() {driver.findElement(ChartData).click();}
    public  void  ClickOnStructureChartData(){driver.findElement(ClickOnStructureChartData).click();}
    public  void  clickOnMedicalProjectChartData()
    {driver.findElement(clickOnMedicalChartData).click();}

    public void ClickOnClearAddress() {
        driver.findElement(Address).clear();
    }

    public void ClickOnEnterAddress(String text) {
        driver.findElement(Address).sendKeys(text);
    }
    public void ClickOnEnterHCCCodes(String text) {
        driver.findElement(HCCCodes).sendKeys(text);
    }

    public void ClickOnSaveDraft() {
        driver.findElement(SaveDraft).click();
    }
    public void ClickOnAddComment() {
        driver.findElement(AddComment).click();
    }
    public void ClickOnDiagnosisTab() {
        driver.findElement(diagnosis_Tab).click();
    }
    public void verifyUI()
    {
        String actual_page = driver.getCurrentUrl();
        String expected_page="https://alpha.neutrino-ai.com/#/home/documents/processed-forms?faxPageId=61ee411f70d5f50479efa7c4&imageName=structure%203.pdf&type=pdf&_st=Ready";
        Assert.assertEquals(actual_page, expected_page);
    }

    public void ClickOnAddChronicCondition() {
        driver.findElement(AddDiagnosisDetails).click();
    }

    public void clickOnEnterNPI(String text) {driver.findElement(NPINumber).sendKeys(text);}
    public void clearNPINUM(){driver.findElement(NPINumber).clear();}
    public void ClickOnEnterNPI(String text) {
        driver.findElement(NPINumber).sendKeys(text);
    }
    public  void zoomIN(){
        driver.findElement(zoomIN).click();
    }


    public void ClickOnEnterPhysicianName(String text) {driver.findElement(DoctorName).sendKeys(text);}
    public void clearPhysicianName(){driver.findElement(DoctorName).clear();}
    public void ClickOnEnterInvalidICDCode(String text) {
        driver.findElement(EditICDCodeDetailsOnEditDiagnosisDetails).sendKeys(text);
    }
    public void ClearDoctorName() {
        driver.findElement(DoctorName).clear();
    }

    public void ClickOnEnterStarDate(String text) {
        driver.findElement(StartDate).sendKeys(text);
    }

    public void ClickOnEnterEndDate(String text) {
        driver.findElement(EndDate).sendKeys(text);
    }
    public void ClickOnAddEncounterButton(){
        driver.findElement(ClickOnAddEncounterButton).click();
    }

    public void clickOnSaveDiagonis() {
        driver.findElement(SaveBtn).click();
    }
    public void ClickOnSaveDiagosisConditionButton() {
        driver.findElement(SaveBtn).click();
    }



    public void ClickOnCancelChronicCondition() {
        driver.findElement(CancelCC).click();
    }

    public void ClickOnAddedChronicCondition() {
        driver.findElement(ClickAddedChronicCondition).click();
    }

    public void ClickOnDeleteChronicCondition() {
        driver.findElement(DeleteCC).click();
    }

    public void ClickOnEditChronicCondition() {
        driver.findElement(EditEncounterDetailsCC).click();
    }

    public void ClickOnSaveEditEncounterDetails() {
        driver.findElement(SaveBtn).click();
    }

    public void ClickOnCancelEditEncounterDetails() {
        driver.findElement(CancelEditEncounterDetails).click();
    }

    public void ClickOnAddDiagnosisDetails() {
        driver.findElement(AddDiagnosisDetails).click();
    }
    public void ClickOnSelectCommentAdd() {
        driver.findElement(PickCommentAdd).click();
    }
    public void ClickOnCancelDiagnosisDetails() {
        driver.findElement(CancelDiagnosisDetails).click();
    }
    public void ClickOnSaveDiagnosisDetails() {
        driver.findElement(SaveBtn).click();
    }
    public void ClickOnRunRuleBtn() {driver.findElement(RunRule).click();}
    public void ClickOnCancelButtonICD() {driver.findElement(CancelBtnICD).click();}
    public void ClickOnPatientDemography(){driver.findElement(PatientDemography).click();}

    public void clickOnDiagnosis(){driver.findElement(Diagnosis).click();}
    public void clickOnAddEncounter(){driver.findElement(DignosisPlusBtn).click();}
    public void clickOnCancelAddEncounter(){driver.findElement(CancelEncounterDetails).click();}
    public void clickLatestEncounter(){driver.findElement(LatestEncounter).click();}
    public void clickOnAddHCCorNonHCCplusBtn(){driver.findElement(AddHCCorNonHCCBtn).click();}
    public void enterDiagnosisForHCC(String text){driver.findElement(HCCdiagnosis).sendKeys(text);}
    public void enterPageNum(String text){driver.findElement(PageNum).sendKeys(text);}

    public void selectCommentDropdown() throws InterruptedException {
        WebElement CommentDropdown=driver.findElement(By.xpath("//span[text()='Add Comment']"));
        CommentDropdown.click();
        Thread.sleep(1000);
        WebElement option=driver.findElement(By.xpath("//span[text()=' Dx listed but not Monitored/Evaluated/Assessed/Treated ']"));
        option.click();
    }
    public void clickOnAddICD(){driver.findElement(AddICD).click();}
    public void enterICDCode(String text){driver.findElement(ICD).sendKeys(text);}
    public void enterICDCodeClick(){driver.findElement(ICD).click();}
    public void enterICDCodeClear(){driver.findElement(ICD).clear();}


    public void enterHCC(String text){driver.findElement(HCC).sendKeys(text);}

    public void selectICDDisciptionDropdown() throws InterruptedException {
        WebElement ICDDiscription = driver.findElement(By.xpath("//*[text()=' Description ']//following::span[3]"));
        ICDDiscription.click();
    }
    public void clickICDDesctrionOption()
    {
        driver.findElement(ICDDesctrionOption).click();
    }
    public void clickOnsaveBtnHCC(){driver.findElement(SaveHCC).click();}
    public void clickOnCancelHCC(){driver.findElement(cancelHCC).click();}
    public void clickOnNonHCC(){driver.findElement(NonHCC).click();}
    public void addDiagnosisNonHCC(String text){driver.findElement(DignosisNonHCC).sendKeys(text);}
    public void enterPageNumNonHCC(String text){driver.findElement(PageNumNonHCC).sendKeys(text);}
    public void clickOnCommentNonHCC() throws InterruptedException {
        driver.findElement(CommentNonHCC).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='NonHccPageRange']//following::mat-select[@name='NonHccComment']//following::span[text()=' No valid records found ']")).click();
    }
    public  void clickOnItemPerPage(){
        driver.findElement(clickOnItemPage).click();
    }
    public  void clickOnSave(){driver.findElement(SaveBtn).click();}
}
