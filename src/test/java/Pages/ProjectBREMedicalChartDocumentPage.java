package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProjectBREMedicalChartDocumentPage {

    WebDriver driver = null;

    //Element Locators
    By OpenReadyDocument = By.xpath("//span[contains(text(),'Processed.pdf')]");
    By OpenReadyDocumentICD = By.xpath("//span[contains(text(),'document (1).pdf')]");
    By OpenRejectedDocument = By.xpath("//span[contains(text(),'inputDocs.jpg')]");
    By ChartData = By.xpath("//mat-label[contains(text(),'Chart Data')]");
    By Address = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-processed-forms[1]/div[1]/div[1]/div[1]/as-split[1]/as-split-area[2]/div[4]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/mat-table[1]/mat-row[1]/mat-cell[2]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By ChronicConditions = By.xpath("//mat-tab-header/div[2]/div[1]/div[1]/div[2]/div[1]");
    By AddChronicCondition = By.xpath("//mat-icon[contains(text(),'add')]");
    By NPINumber = By.xpath("//input[@formcontrolname='npiNo']");
    By EncounterDetails = By.xpath("//span[contains(text(),'NPI No')]");
    By DoctorName = By.xpath("//input[@formcontrolname='physicianName']");
    By StartDate = By.xpath("//input[@formcontrolname='startDate']");
    By HCCCodes = By.xpath("//body[1]/div[1]/div[1]/div[1]/mat-dialog-container[1]/app-rcm-edit-dialog[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By EditICDCodeDetailsOnEditDiagnosisDetails = By.xpath("//input[@formcontrolname='icd_code']");

    By EditICDCodeDetails = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-processed-forms[1]/div[1]/div[1]/div[1]/as-split[1]/as-split-area[2]/div[4]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/mat-table[1]/mat-row[1]/mat-cell[5]/button[1]/mat-icon[1]");
    By PickCommentAdd = By.xpath("//span[contains(text(),'ADD')]");
    By EndDate = By.xpath("//input[@formcontrolname='endDate']");
    By ClickAddedChronicCondition = By.xpath("//mat-tab-body/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]");
    By SaveBtn = By.xpath("//app-rcm-edit-header/div[1]/form[1]/div[1]/div[2]/div[4]/button[2]");
    By DeleteCC = By.xpath("//mat-icon[contains(text(),'delete')]");
    By CancelCC = By.xpath("//app-rcm-edit-header/div[1]/form[1]/div[1]/div[2]/div[4]/button[1]");
    By EditEncounterDetails = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/button[1]/span[1]/mat-icon[1]");
    By EditEncounterDetailsCC = By.xpath("//mat-icon[contains(text(),'create')]");
    By SaveEditEncounterDetails = By.xpath("//app-rcm-edit-header/div[1]/form[1]/div[1]/div[2]/div[4]/button[2]/span[1]");
    By CancelEditEncounterDetails = By.xpath("//app-rcm-edit-header/div[1]/form[1]/div[1]/div[2]/div[4]/button[1]/span[1]");
    By AddDiagnosisDetails = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/button[2]/span[1]/mat-icon[1]");
    By CancelDiagnosisDetails = By.xpath("//button[@id='category-close-modal']");
    By SaveDiagnosisDetails = By.xpath("//body/div[1]/div[1]/div[1]/mat-dialog-container[1]/app-rcm-edit-dialog[1]/div[1]/form[1]/div[1]/div[2]/div[5]/button[2]");
    By RunRule = By.xpath("//span[contains(text(),'Run Rule')]");
    By AddComment = By.xpath("//span[contains(text(),'Add Comment')]");
    By CancelBtnICD = By.xpath("//span[contains(text(),'Cancel')]");
    By SelectICDCode = By.xpath("//span[contains(text(),'A00.9 Cholera, unspecified')]");
    By OpenReadyDocumentICD1 = By.xpath("//span[contains(text(),'Karis Garner_only 8 page.pdf')]");
    By CancelEditDiagnosisDetails = By.xpath("//body/div[1]/div[1]/div[1]/mat-dialog-container[1]/app-rcm-edit-dialog[1]/div[1]/form[1]/div[1]/div[2]/div[7]/button[1]/span[1]");
    By SaveEditDiagnosisDetails = By.xpath("//body/div[1]/div[1]/div[1]/mat-dialog-container[1]/app-rcm-edit-dialog[1]/div[1]/form[1]/div[1]/div[2]/div[7]/button[2]/span[1]");
    //Constructor
    public ProjectBREMedicalChartDocumentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
    public void ClickOnEncounterDetails() {
        driver.findElement(EncounterDetails).click();
    }
    public void ClickOnPickICDCode() {
        driver.findElement(SelectICDCode).click();
    }
    public void ClickOnReadyDocument() {
        driver.findElement(OpenReadyDocument).click();
    }
    public void ClickOnClearICDCode() {
        driver.findElement(EditICDCodeDetailsOnEditDiagnosisDetails).clear();
    }

    public void ClickOnEditICDCodeOnEditDiagnosisDetails() {
        driver.findElement(EditICDCodeDetails).click();
    }
    public void ClickOnSaveEditDiagnosisDetails() {
        driver.findElement(SaveEditDiagnosisDetails).click();
    }
    public void ClickOnCancelEditDiagnosisDetails() {
        driver.findElement(CancelEditDiagnosisDetails).click();
    }

    public void ClickOnReadyDocumentICD() {
        driver.findElement(OpenReadyDocumentICD).click();
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

    public void ClickOnChartData() {
        driver.findElement(ChartData).click();
    }

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
    public void ClickOnChronicConditions() {
        driver.findElement(ChronicConditions).click();
    }

    public void ClickOnAddChronicCondition() {
        driver.findElement(AddChronicCondition).click();
    }

    public void ClickOnEnterNPI(String text) {
        driver.findElement(NPINumber).sendKeys(text);
    }

    public void ClickOnEnterPhysicianName(String text) {
        driver.findElement(DoctorName).sendKeys(text);
    }
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

    public void ClickOnSaveChronicCondition() {
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
        driver.findElement(SaveEditEncounterDetails).click();
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
        driver.findElement(SaveDiagnosisDetails).click();
    }

    public void ClickOnRunRuleBtn() {
        driver.findElement(RunRule).click();
    }

    public void ClickOnCancelButtonICD() {
        driver.findElement(CancelBtnICD).click();
    }
}

