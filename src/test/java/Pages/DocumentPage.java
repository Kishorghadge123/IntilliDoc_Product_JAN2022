package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentPage {

    WebDriver driver = null;

    By DocumentBtn = By.xpath("//mat-sidenav[@id='sidenav']/div/mat-nav-list/mat-list-item[6]");
    By DropDown = By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By SearchProject = By.xpath("//div[@class='cdk-overlay-pane']/div/div/div/input");
    By SearchBox = By.xpath("//input[@data-placeholder='Search']");
    By SelectStructuredProject = By.xpath("//span[contains(text(),'QA-AutoProject-Structured')]");
    By SelectBREProject = By.xpath("//span[contains(text(),'QA-AutoProject-BRE-MedicalChart')]");

    By SelectSemiStructuredProject = By.xpath("//span[contains(text(),'QA-AutoProject-SemiStructured')]");
    By SelectFreeFormProject = By.xpath("//span[contains(text(),'QA-AutoProject-FreeForm')]");
    By SelectMedicalChartProject = By.xpath("//span[contains(text(),'QA-AutoProject-MedicalChart')]");
    By SelectMedicalChartProjectICD = By.xpath("//span[contains(text(),'J17012022')]");
    By SearchDocument = By.xpath("//mat-icon[contains(text(),'search')]");
    By CancelDoc2 = By.xpath("//span[contains(text(),'Cancel')]");
    By ViewDoc = By.xpath("//span[contains(text(),'BRE US Citizen.jpg')]");
    By ViewDoc1 = By.xpath("//span[contains(text(),'form 1040.pdf')]");
    By ViewDoc2 = By.xpath("//span[contains(text(),'AN - OOLU2604599081.pdf')]");
    By ViewDoc3 = By.xpath("//span[contains(text(),'4.tif')]");
    By ViewDoc4 = By.xpath("//span[contains(text(),'3.tif')]");
    By ViewDoc5 = By.xpath("//span[contains(text(),'Processed.pdf')]");
    By ViewDoc6 = By.xpath("//span[contains(text(),'33559446-2.pdf')]");
    By ViewFreeFormRejectedDoc = By.xpath("//span[contains(text(),'Pfizer31.jpg')]");
    By ViewStructuredReadyDoc = By.xpath("//span[contains(text(),'Pfizer31.jpg')]");
    By ExpansionPanel = By.xpath("//mat-expansion-panel-header/span[2]");
    By HideAnalytics = By.xpath("//mat-expansion-panel-header/span[2]");
    By UnHideAnalytics = By.xpath("//mat-expansion-panel-header/span[2]");
    By ClearSearchDocument = By.xpath("//mat-icon[contains(text(),'highlight_off')]");
    By RefreshDocuments = By.xpath("//mat-icon[contains(text(),'refresh')]");
    By FilterDoc = By.xpath("//div[contains(text(),'Documents')]/button");
    By SearchFilterDoc = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[3]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    By FilterSearchIcon = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/button[1]/span[1]");
    By CancelFilterSearch = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/button[2]/span[1]/mat-icon[1]");
    //sorting
    By DocSort = By.xpath("//thead/tr[1]/th[1]/div[1]/div[2]");
    By AssigneeSort = By.xpath("//div[contains(text(),'Assignee')]//following::div[1]");
    //By StatusSort = By.xpath("//div[contains(text(),'Status')]//following::div[1]");//
    By StatusSort = By.xpath("//div[contains(text(),' Status ')]");
    By TypeSort = By.xpath("//div[contains(text(),'Type')]//following::div[1]");
    By ScoreSort = By.xpath("//div[contains(text(),'Score')]//following::div[1]");
    By SizeSort = By.xpath("//div[contains(text(),'Size')]//following::div[1]");
    By UpdateSort = By.xpath("//div[contains(text(),'Update')]//following::div[1]");
    By ReceivedSort = By.xpath("//div[contains(text(),'Received')]//following::div[1]");
    //status filter
    By StatusFilter = By.xpath("//div[contains(text(),'Status')]/button");
    By CheckProcessed = By.xpath("//div[@role='listbox']/mat-option[3]");
    //Chart level Flags
    By chartLevelFlagDropdown = By.xpath("(//mat-select[@role='combobox'])[1]");
    By nonHCC = By.xpath("//span[contains(text(),' Non-HCC ')]");
    By invalidRecord = By.xpath("//span[contains(text(),' Invalid record ')]");
    By patientNameMismatch = By.xpath("//span[contains(text(),' Patient name mismatch ')]");


    By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");
    By SelectItems = By.xpath("//div[@role='listbox']/mat-option[1]");
    By NextPage = By.xpath("//button[@aria-label='Next page']");
    By LastPage = By.xpath("//button[@aria-label='Last page']");
    By PreviousPage = By.xpath("//button[@aria-label='Previous page']");
    By FirstPage = By.xpath("//button[@aria-label='First page']");
    By ClickAntiClkWise = By.xpath("//*[@id='rotate_left']/span[1]/i");
    By ClickClkWise = By.xpath("//*[@mattooltip='Clockwise']");
    By ClickZoomIn = By.xpath("//*[@mattooltip='Zoom In']");
    By ClickZoomOut = By.xpath("//*[@class='fa fa-search-minus']");
    By ClickNavigateRight = By.xpath("//*[@mattooltip='Navigate Right']");
    By ClickNavigateLeft = By.xpath("//*[@mattooltip='Navigate Left']");
    By ChronicCondition = By.xpath("//div[contains(text(),' Chronic Conditions ')]");
    By AddCondition = By.xpath("//mat-icon[contains(text(),'add')]");
    By NPINo = By.xpath("//input[@formcontrolname='npiNo']");
    By PhysicianName = By.xpath("//input[@formcontrolname='physicianName']");
    By StartDate = By.xpath("(//button[@aria-label='Open calendar'])[1]");
    By SelectStartDate = By.xpath("//div[contains(text(),'17')]");
    By EndDate = By.xpath("(//button[@aria-label='Open calendar'])[2]");
    By SelectEndDate = By.xpath("//div[contains(text(),'17')]");
    By SaveCondition = By.xpath("//*[@id='mat-dialog-0']/app-rcm-edit-header/div/form/div/div[2]/div[4]/button[2]/span[1]");
    By Data = By.xpath("//mat-label[contains(text(),'Data')]");
    By AddAttribute = By.xpath("//span[contains(text(),'Attribute')]");
    By AddPatientName = By.xpath("//span[contains(text(),' PatientName ')]");
    By AddDOB = By.xpath("//span[contains(text(),' DOB ')]");
    By AddAge = By.xpath("//span[contains(text(),' Age ')]");
    By AddAddress = By.xpath("//span[contains(text(),' Address ')]");
    By AddGender = By.xpath("//span[contains(text(),' Gender ')]");
    By AddPhone = By.xpath("//span[contains(text(),' Phone ')]");
    By AddMRN =   By.xpath("//span[contains(text(),' MRN ')]");
    By AddSSN =   By.xpath("//span[contains(text(),' SSN ')]");
    By AddEmail =   By.xpath("//span[contains(text(),' Email ')]");
    By clickAdd = By.xpath("//span[contains(text(),' Add ')]");
    By addAttributeValue = By.xpath("//mat-cell[contains(text(),'PatientName')]/following::input");
    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By Submit = By.xpath("//span[contains(text(),'Submit')]");
    By SubmitChanges = By.xpath("//*[@id='mat-dialog-0']/app-confirmation-dialog/div/div/div[2]/button[1]");
    By StatusFreeFormDoc = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    By UpdtAttributeValue = By.xpath("//mat-row[@id='tableRow'][2]/mat-cell[2]");
    By SelectAddress = By.xpath("//span[contains(text(),' 2472 Rose Peak Drive Dietz ')]");
    By PatientNameValue = By.xpath("//input[@pattern='^([a-zA-Z.s\\s])+([a-zA-Z.s\\s()]+)*(-[()a-zA-Z.s\\s]+)*$']");
    By ClassificationNameBtn = By.xpath("//mat-label[contains(text(),'Classification')]");
    By PatientNameBtn = By.xpath("(//mat-cell[contains(text(),' Patient Name ')])[2]");
    By DeleteRule1Condition1 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[2]/mat-icon[1]");
    By CNFDeleteRule1Condition1 = By.xpath("//span[contains(text(),'Delete')]");
    By DeleteFirstRule = By.xpath("(//mat-icon[contains(text(),'delete')])[3]");

    public DocumentPage(WebDriver driver) { this.driver = driver;}

    //Chart Level Flags
    public void ClickOnChartLevelFlagsBtn(){ driver.findElement(chartLevelFlagDropdown).click();}
    public void selectNONHCCBtn(){ driver.findElement(nonHCC).click();}
    public void selectInvalidRecordBtn(){ driver.findElement(invalidRecord).click();}
    public void selectPatientNameMismatchBtn(){ driver.findElement(patientNameMismatch).click();}

    public void ClickOnPatientNameValueBtn(){ driver.findElement(PatientNameValue).click();}
    public void ClickOnClearPatientNameValueBtn(){ driver.findElement(PatientNameValue).clear();}
    public void EnterNewPatientNameValueBtn(String text){ driver.findElement(PatientNameValue).sendKeys(text);}
    public void ClickOnClassificationNameBtn(){ driver.findElement(ClassificationNameBtn).click();}
    public void ClickOnPatientNameBtn(){ driver.findElement(PatientNameBtn).click();}

    public void ClickOnDeleteRule1Condition1(){ driver.findElement(DeleteRule1Condition1).click();}
    public void ClickOnCNFRule1Condition1(){ driver.findElement(CNFDeleteRule1Condition1).click();}
    public void ClickOnDeleteFirstRuleBtn(){ driver.findElement(DeleteFirstRule).click();}

    public void ClickDocumentBtn(){ driver.findElement(DocumentBtn).click();}
    public void ClickDropDownBtn(){ driver.findElement(DropDown).click();}
    public void ClickSearchProject(String text){ driver.findElement(SearchProject).sendKeys(text);}
    public void ClickSelectStructuredProject(){driver.findElement(SelectStructuredProject).click();}
    public void ClickSelectBREProject(){driver.findElement(SelectBREProject).click();}
    public void ClickSelectFreeFormProject(){driver.findElement(SelectFreeFormProject).click();}
    public void ClickSelectSemiStructuredProject(){driver.findElement(SelectSemiStructuredProject).click();}
    public void ClickSelectMedicalChartProject(){driver.findElement(SelectMedicalChartProject).click();}
    public void ClickSelectMedicalChartProjectICD(){driver.findElement(SelectMedicalChartProjectICD).click();}
    public void ClickSearchBox(String text){ driver.findElement(SearchBox).sendKeys(text);}
    public void  ClickSearchDocument(){driver.findElement(SearchDocument).click();}
    public void ClickClearSearch(){driver.findElement(ClearSearchDocument);}
    public void ClickCancelDoc2(){ driver.findElement(CancelDoc2).click();}
    public void ClickViewDocIcon(){ driver.findElement(ViewDoc).click();}
    public void ClickViewDocIcon1(){ driver.findElement(ViewDoc1).click();}
    public void ClickViewDocIcon2(){ driver.findElement(ViewDoc2).click();}
    public void ClickViewDocIcon3(){ driver.findElement(ViewDoc3).click();}
    public void ClickViewDocIcon4(){ driver.findElement(ViewDoc4).click();}
    public void ClickViewDocIcon5(){ driver.findElement(ViewDoc5).click();}
    public void ClickViewDocIcon6(){ driver.findElement(ViewDoc6).click();}
    public void ClickExpansionPanel(){driver.findElement(ExpansionPanel).click();}
    public void ClickHideAnalytics(){ driver.findElement(HideAnalytics).click();}
    public void ClickUnHideAnalytics(){ driver.findElement(UnHideAnalytics).click();}
    public void ClickRefreshDocument(){driver.findElement(RefreshDocuments).click();}

    //Script Enhancement
    public void ClickFilterDoc(){driver.findElement(FilterDoc).click();}
    public void ClickSearchFilterDoc(String text){driver.findElement(SearchFilterDoc).sendKeys(text);}
    public void ClickFilterSearchIcon(){driver.findElement(FilterSearchIcon).click();}
    public void ClickCancelFilterSearch(){driver.findElement(CancelFilterSearch).click();}
    public void ClickDocSort(){driver.findElement(DocSort).click();}
    public void ClickAssigneeSort(){driver.findElement(AssigneeSort).click();}
    public void ClickStatusSort(){driver.findElement(StatusSort).click();}
    public void ClickTypeSort(){driver.findElement(TypeSort).click();}
    public void ClickScoreSort(){driver.findElement(ScoreSort).click();}
    public void ClickSizeSort(){driver.findElement(SizeSort).click();}
    public void ClickUpdateSort(){driver.findElement(UpdateSort).click();}
    public void ClickReceivedSort(){driver.findElement(ReceivedSort).click();}

    //status filter
    public void ClickStatusFilter(){driver.findElement(StatusFilter).click();}
    public void ClickCheckProcessed(){driver.findElement(CheckProcessed).click();}
    public void ClickItemsPerPage(){driver.findElement(ItemsPerPage).click();}
    public void SelectItemsPerPage(){driver.findElement(SelectItems).click();}
    public void ClickNextPage(){driver.findElement(NextPage).click();}
    public void ClickLastPage(){driver.findElement(LastPage).click();}
    public void ClickPreviousPage(){driver.findElement(PreviousPage).click();}
    public void ClickFirstPage(){driver.findElement(FirstPage).click();}
    public void ClickAntiWiseIcon(){driver.findElement(ClickAntiClkWise).click();}
    public void ClickClockWiseIcon(){driver.findElement(ClickClkWise).click();}
    public void ClickZoomIN(){driver.findElement(ClickZoomIn).click();}
    public void ClickZoomOut(){driver.findElement(ClickZoomOut).click();}
    public void ClickNvgtRt(){driver.findElement(ClickNavigateRight).click();}
    public void ClickNvgtLft(){driver.findElement(ClickNavigateLeft).click();}
    public void ClickChronicCondition()
    {
        driver.findElement(ChronicCondition).click();
    }

    public void ClickAddCondition()
    {
        driver.findElement(AddCondition).click();
    }

    public void AddNPINumber ()
    {
        driver.findElement(NPINo).sendKeys("3216549871");
    }

    public void AddPhysicianName ()
    {
        driver.findElement(PhysicianName).sendKeys("Dr. Andrew");
    }
    public void  ClickStartDate()
    {
        driver.findElement(StartDate).click();
    }

    public  void SelectStartDate()
    {
        driver.findElement(SelectStartDate).click();
    }

    public void ClickEndDate()
    {
        driver.findElement(EndDate).click();
    }

    public void SelectEndDate()
    {
        driver.findElement(SelectEndDate).click();
    }

    public void SaveChronicCondition()
    {
        driver.findElement(SaveCondition).click();
    }

    public void ViewFreeFormRejectedDocument(){ driver.findElement(ViewFreeFormRejectedDoc).click();}
    public void clickOnDataBtn() {driver.findElement(Data).click();}
    public void clickAddAttributes() { driver.findElement(AddAttribute).click();}

    public void addAttributes() {
        driver.findElement(AddPatientName).click();
        driver.findElement(AddDOB).click();
        driver.findElement(AddAge).click();
        driver.findElement(AddAddress).click();
        driver.findElement(AddGender).click();
        driver.findElement(AddPhone).click();
        driver.findElement(AddMRN).click();
        driver.findElement(AddSSN).click();
        driver.findElement(AddEmail).click();
    }

    public void clickADD() {driver.findElement(clickAdd).click();}
    public void addAttributeValue() {driver.findElement(addAttributeValue).sendKeys("John Dey");}
    public void clickSaveDraft() {driver.findElement(SaveDraft).click();}
    public void clickSubmit() {driver.findElement(Submit).click();}
    public void clickSubmitChanges () {driver.findElement(SubmitChanges).click();}
    public void assertFreeFormDocument()
    {String FreeFormDocStatus = driver.findElement(StatusFreeFormDoc).getText();
        String ActualStatus = FreeFormDocStatus;
        String ExpectedStatus = "Processed";
        Assert.assertEquals(ActualStatus,ExpectedStatus);
    }

    public void assertAttributeValue () {
        String AttributeValue = driver.findElement(addAttributeValue).getText();
        System.out.println(AttributeValue);
        String ActualValue = AttributeValue;
        String ExpectedValue = "John Dey";
        Assert.assertEquals(ActualValue,ExpectedValue);
    }
    public void viewStructuredReadyDoc()
    {
        driver.findElement(ViewStructuredReadyDoc).click();
    }
    public void updateAttributeValue(){
        driver.findElement(UpdtAttributeValue).click();
        driver.findElement(SelectAddress).click();

    }
}