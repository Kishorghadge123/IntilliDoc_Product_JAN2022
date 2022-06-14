package Pages;

import Utilities.AssertionsFunction;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DocumentPage   {
    WebDriver driver = null;
                               ////mat-sidenav[@id='sidenav']/div/mat-nav-list/mat-list-item[6]
    public static By DocumentBtn = By.xpath("//mat-sidenav[@id='sidenav']/div/mat-nav-list/mat-list-item[6]");
    public static By DocumentTable= By.xpath("//div[@class='example-container documentTable']");
    By DropDown = By.xpath("//span[@class='mat-tooltip-trigger projectname']");
    By SearchProject = By.xpath("//div[@class='cdk-overlay-pane']/div/div/div/input");
    By SearchBox = By.xpath("//input[@data-placeholder='Search']");
    public static By SelectStructuredProject = By.xpath("//span[contains(text(),'QA-AutoProject-Structured')]");
    public static By SelectSemiStructuredProject = By.xpath("//span[contains(text(),'QA-AutoProject-SemiStructured')]");
    public static By SelectFreeFormProject = By.xpath("//span[contains(text(),'QA-AutoProject-FreeForm')]");
    public static By SelectMedicalChartProject = By.xpath("//span[contains(text(),'MedicalChart ')]");
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
    By ViewFreeFormRejectedDoc = By.xpath("//span[contains(text(),'Pfizer10.jpg')]");
    By ViewStructuredReadyDoc = By.xpath("//span[contains(text(),'Pfizer10.jpg')]");

    By ExpansionPanel = By.xpath("//mat-expansion-panel-header/span[2]");
    By HideAnalytics = By.xpath("//mat-expansion-panel-header/span[2]");
    By UnHideAnalytics = By.xpath("//mat-expansion-panel-header/span[2]");
    By ClearSearchDocument = By.xpath("//mat-icon[contains(text(),'highlight_off')]");
    By RefreshDocuments = By.xpath("//mat-icon[contains(text(),'refresh')]");

    By FilterDoc = By.xpath("//div[contains(text(),'Documents')]/button");
    public static By SearchFilterDoc = By.xpath("//div[@class='popover-body']/mat-form-field/div/div[1]/div[1]/input");
    By FilterSearchIcon = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/button[1]/span[1]");
    By CancelFilterSearch = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/button[2]/span[1]/mat-icon[1]");

    //sorting
    By DocSort = By.xpath("//thead/tr[1]/th[1]/div[1]/div[2]");
    By AssigneeSort = By.xpath("//div[contains(text(),'Assignee')]//following::div[1]");
    By StatusSort = By.xpath("//div[contains(text(),'Status')]/following::div[1]");
    By TypeSort = By.xpath("//div[contains(text(),'Type')]//following::div[1]");
    By ScoreSort = By.xpath("//div[contains(text(),'Score')]//following::div[1]");
    By SizeSort = By.xpath("//div[contains(text(),'Size')]//following::div[1]");
    By UpdateSort = By.xpath("//div[contains(text(),'Update')]//following::div[1]");
    By ReceivedSort = By.xpath("//div[contains(text(),'Received')]//following::div[1]");


    //status filter
    By StatusFilter = By.xpath("//div[contains(text(),'Status')]/button");
    public static By CheckProcessed = By.xpath("//div[@role='listbox']/mat-option[3]");


    By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");

     By SelectItems = By.xpath("//div[@role='listbox']/mat-option[1]");
    public static By ItemSelectedNumber =  By.xpath("//span[text()='10']");

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
    By StartDate = By.xpath("//*[@id='mat-dialog-0']/app-rcm-edit-header/div/form/div/div[2]/div[3]/div[1]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
    By SelectStartDate = By.xpath("//div[contains(text(),'10')]");
    By EndDate = By.xpath("//*[@id='mat-dialog-0']/app-rcm-edit-header/div/form/div/div[2]/div[3]/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
    By SelectEndDate = By.xpath("//div[contains(text(),'24')]");
    By SaveCondition = By.xpath("//*[@id='mat-dialog-0']/app-rcm-edit-header/div/form/div/div[2]/div[4]/button[2]/span[1]");

    By AddData = By.xpath("//mat-label[contains(text(),'Data')]");
    By AddAttribute = By.xpath("//span[contains(text(),'Attribute')]");
    By AddPatientName = By.xpath("//span[contains(text(),' PatientName ')]");
    By AddDOB = By.xpath("//span[contains(text(),' DOB ')]");
    By AddAge = By.xpath("//span[contains(text(),' Age ')]");
    By AddAddress = By.xpath("//span[contains(text(),' Address ')]");
    By AddGender = By.xpath("//span[contains(text(),' Gender ')]");
    By AddPhone = By.xpath("//span[contains(text(),' Phone ')]");
    By AddMRN = By.xpath("//span[contains(text(),' MRN ')]");
    By AddSSN = By.xpath("//span[contains(text(),' SSN ')]");
    By AddEmail = By.xpath("//span[contains(text(),' Email ')]");
    By clickAdd = By.xpath("//span[contains(text(),' Add ')]");
    By addAttributeValue = By.xpath("//mat-cell[contains(text(),'PatientName')]/following::input");
    By addAttributePatientName = By.xpath("//mat-cell[contains(text(),'PatientName')]/following::input");
    By addAttributeDOB = By.xpath("//mat-table[@role='grid']/mat-row[2]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributeAge = By.xpath("//mat-table[@role='grid']/mat-row[3]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributeAddress = By.xpath("//mat-table[@role='grid']/mat-row[4]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributeGender = By.xpath("//mat-table[@role='grid']/mat-row[5]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributePhone = By.xpath("//mat-table[@role='grid']/mat-row[6]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributeMRN = By.xpath("//mat-table[@role='grid']/mat-row[7]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributeSSN = By.xpath("//mat-table[@role='grid']/mat-row[8]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By AddAttributeEmail = By.xpath("//mat-table[@role='grid']/mat-row[9]/mat-cell[2]/div/mat-form-field/div/div[1]/div/input");
    By PatientNameErrorValidation = By.xpath("//*[text()='Acceptable entries are a-z, A-Z, space and dot.']");

    By SavedAttributeValue = By.xpath("//*[@id='tableRow'][1]/mat-cell[2]/div/mat-form-field/div/div[3]");

    By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
    By Submit = By.xpath("//span[contains(text(),'Submit')]");
    By SubmitChanges = By.xpath("//*[@id='mat-dialog-0']/app-confirmation-dialog/div/div/div[2]/button[1]");
    public static By StatusOfDoc = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");

    By UpdtAttributeValue = By.xpath("//mat-row[@id='tableRow'][2]/mat-cell[2]");
    By SelectAddress = By.xpath("//span[contains(text(),' 2472 Rose Peak Drive Dietz ')]");

    By HoverProjectSearch= By.xpath("//span[text()=' QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View ']");
    By HoverSearcheProjectd = By.xpath("//span[text()=' QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View ']");
    By HoverDocumentName = By.xpath("//div[@class='example-container documentTable']/table/tbody/tr[1]/td[1]");
    By SelectStructuredProjectTooltip = By.xpath("//span[contains(text(),'QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View')]");
    By SelectBREProject = By.xpath("//*[@class='mat-focus-indicator mat-menu-item']");

    //Chart level Flags
    By chartLevelFlagDropdown = By.xpath("(//mat-select[@role='combobox'])[1]");
    By nonHCC = By.xpath("//span[contains(text(),' Non-HCC ')]");
    By invalidRecord = By.xpath("//span[contains(text(),' Invalid record ')]");
    By patientNameMismatch = By.xpath("//span[contains(text(),' Patient name mismatch ')]");

    //public static  By PatientNameValue = By.xpath("//input[@pattern='^([a-zA-Z.s\\s])+([a-zA-Z.s\\s()]+)*(-[()a-zA-Z.s\\s]+)*$']");
    By ClassificationNameBtn = By.xpath("//mat-label[contains(text(),'Classification')]");
    By PatientNameBtn = By.xpath("(//mat-cell[contains(text(),' Patient Name ')])[2]");
    By DeleteRule1Condition1 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[2]/mat-icon[1]");
    By CNFDeleteRule1Condition1 = By.xpath("//span[contains(text(),'Delete')]");
    By DeleteFirstRule = By.xpath("(//mat-icon[contains(text(),'delete')])[3]");
    By patientDemographics=By.xpath("//div[@class='mat-ripple mat-tab-label mat-focus-indicator mat-tab-label-active ng-star-inserted']");
    public static String DocTabUrl="https://alpha.neutrino-ai.com/#/home/documents";
    public String ClickOnReadyDocumentUrl="https://alpha.neutrino-ai.com/#/home/documents/processed-forms?faxPageId=61cb126c08e93e32e4e2ec79&imageName=Processed.pdf&type=pdf&_st=Ready";
    By ProjectList = By.xpath("//div[@role='menu']");
    By ProjectSearch =By.xpath("//input[@class='p-2 theme_color']");
    By DocumentSearched = By.xpath("//span[text()=' AN - OOLU2604599081.pdf ']");
    public static By SearchedDocument = By.xpath("//span[text()=' AN - OOLU2604599081.pdf ']");
    public static By Anticlockwise = By.xpath("//img[@style='transform: rotate(0deg);']");
    public static By Clockwise     = By.xpath("//img[@style='transform: rotate(90deg);']");
    public static By DocView = By.xpath("//img[@id='image']");
    public static String  DocumentPageURL = "https://alpha.neutrino-ai.com/#/home/documents";
    public static By Analyticshide = By.xpath("//div[@style='height: 0px; visibility: hidden;']");
    public static By AnalyticsUnhide = By.xpath("//div[@style='visibility: visible;']");
    public static By ZoomInDoc= By.xpath("//div[@style='transform: translateX(-19.6%) scale(1.1);']");
    public static By ZoomOutDoc= By.xpath("//div[@style='transform: translateX(-21%) scale(1)']");
    By PatientNameValue = By.xpath("//*[text()=' Patient Name ']//following::input[1]");


    public DocumentPage(WebDriver driver) { this.driver = driver;}

    public By getpatientDemographics(){return this.patientDemographics;}
    //Chart Level Flags
    @Step("Click On Chart Level Flags Btn")
    public void ClickOnChartLevelFlagsBtn(){ driver.findElement(chartLevelFlagDropdown).click();}
    @Step("select NO NHCC Btn")
    public void selectNONHCCBtn(){ driver.findElement(nonHCC).click();}
    @Step("select Invalid Record Btn")
    public void selectInvalidRecordBtn(){ driver.findElement(invalidRecord).click();}
    @Step("select Patient NameMismatch Btn")
    public void selectPatientNameMismatchBtn(){ driver.findElement(patientNameMismatch).click();}
    @Step("Click On Patient Name Value Btn")

    public void ClickOnPatientNameValueBtn(){ driver.findElement(PatientNameValue).click();}
    @Step("Click On Clear Patient Name Value Btn")
    public void ClickOnClearPatientNameValueBtn(){ driver.findElement(PatientNameValue).clear();}
    @Step("Enter New Patient Name Value Btn")
    public void EnterNewPatientNameValueBtn(String text){ driver.findElement(PatientNameValue).sendKeys(text);}
    @Step("Click On Classification Name Btn")
    public void ClickOnClassificationNameBtn(){ driver.findElement(ClassificationNameBtn).click();}
    @Step("Click On Patient Name Btn")
    public void ClickOnPatientNameBtn(){ driver.findElement(PatientNameBtn).click();}
    @Step("Click On Delete Rule1 Condition1")

    public void ClickOnDeleteRule1Condition1(){ driver.findElement(DeleteRule1Condition1).click();}
    @Step("Click On CNF Rule1 Condition1")
    public void ClickOnCNFRule1Condition1(){ driver.findElement(CNFDeleteRule1Condition1).click();}
    @Step("Click On Delete First Rule Btn")
    public void ClickOnDeleteFirstRuleBtn(){ driver.findElement(DeleteFirstRule).click();}
    @Step("Click SelectBRE Project")
    public void ClickSelectBREProject(){driver.findElement(SelectBREProject).click();}
    @Step("Click View Doc Icon6")
    public void ClickViewDocIcon6(){ driver.findElement(ViewDoc6).click();}
    @Step("assert Attribute Value")
    public void assertAttributeValue () {
        String AttributeValue = driver.findElement(addAttributeValue).getText();
        System.out.println(AttributeValue);
        String ActualValue = AttributeValue;
        String ExpectedValue = "John Dey";
        Assert.assertEquals(ActualValue,ExpectedValue);
    }
    @Step("Click Document Btn")
    public void ClickDocumentBtn() {
        driver.findElement(DocumentBtn).click();
    }
    @Step("Click Drop Down Btn")
    public void ClickDropDownBtn() {
        driver.findElement(DropDown).click();
        AssertionsFunction.verifyElementPresent(ProjectList);
    }
    @Step("Click Search Project")
    public void ClickSearchProject(String text) {
        driver.findElement(SearchProject).sendKeys(text);
    }
    @Step("Click Select Structured Project")
    public void ClickSelectStructuredProject() {
        driver.findElement(SelectStructuredProject).click();
    }
    @Step("Click Select Structured Project Tool tip")
    public void ClickSelectStructuredProjectTooltip() {
        driver.findElement(SelectStructuredProjectTooltip).click();
    }
    @Step("Click Select Free Form Project")
    public void ClickSelectFreeFormProject() {driver.findElement(SelectFreeFormProject).click();}

    @Step("Click Select Semi Structured Project")
    public void ClickSelectSemiStructuredProject() throws Exception {
        driver.findElement(SelectSemiStructuredProject).click();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText("QA-AutoProject-SemiStructured",SelectSemiStructuredProject);

    }
    @Step("Click Select Medical Chart Project")
    public void ClickSelectMedicalChartProject() {driver.findElement(SelectMedicalChartProject).click();}
    @Step("Click Select Medical Chart ProjectICD")
    public void ClickSelectMedicalChartProjectICD() {
        driver.findElement(SelectMedicalChartProjectICD).click();
    }
    @Step("Click Search Box")
    public void ClickSearchBox(String text) {
        driver.findElement(SearchBox).sendKeys(text);
    }
    @Step("Click Search Document")
    public void ClickSearchDocument() {
        driver.findElement(SearchDocument).click();
    }
    @Step("Click Clear Search")
    public void ClickClearSearch() {
        driver.findElement(ClearSearchDocument).click();
    }
    @Step("Click Cancel Doc2")
    public void ClickCancelDoc2() {
        driver.findElement(CancelDoc2).click();
    }
    @Step("Click View Doc Icon")
    public void ClickViewDocIcon() {
        driver.findElement(ViewDoc).click();
    }
    @Step("Click View Doc Icon1")
    public void ClickViewDocIcon1() {
        driver.findElement(ViewDoc1).click();
    }
    @Step("Click View DocIcon 2")
    public void ClickViewDocIcon2()  {
        driver.findElement(ViewDoc2).click();

    }
    @Step("Click View DocIcon 3")
    public void ClickViewDocIcon3() {
        driver.findElement(ViewDoc3).click();
    }
    @Step("Click View  DocIcon 4")
    public void ClickViewDocIcon4() {
        driver.findElement(ViewDoc4).click();
    }
    @Step("Click View DocIcon 5")
    public void ClickViewDocIcon5() {
        driver.findElement(ViewDoc5).click();
    }
    @Step("Click Expansion Panel")
    public void ClickExpansionPanel() {
        driver.findElement(ExpansionPanel).click();
    }
    @Step("Click Hide Analytics")
    public void ClickHideAnalytics() {
        driver.findElement(HideAnalytics).click();
    }
    @Step("Click UnHide Analytics")
    public void ClickUnHideAnalytics() {
        driver.findElement(UnHideAnalytics).click();
    }
    @Step("Click Refresh Document")
    public void ClickRefreshDocument() {
        driver.findElement(RefreshDocuments).click();
    }
    @Step("Click Filter Doc")
    //Script Enhancement
    public void ClickFilterDoc() {
        driver.findElement(FilterDoc).click();
    }
    @Step("Click Search Filter Doc")
    public void  ClickSearchFilterDoc(String text) {
        driver.findElement(SearchFilterDoc).sendKeys(text);
    }
    @Step("Click Filter Search Icon")
    public void ClickFilterSearchIcon() {
        driver.findElement(FilterSearchIcon).click();
    }
    @Step("Click Cancel Filter Search")
    public void ClickCancelFilterSearch() {
        driver.findElement(CancelFilterSearch).click();
    }
    @Step("Click Doc Sort")
    public void ClickDocSort() {
        driver.findElement(DocSort).click();
    }
    @Step("Click Assignee Sort")
    public void ClickAssigneeSort() {
        driver.findElement(AssigneeSort).click();
    }
    @Step("Click Status Sort")
    public void ClickStatusSort() {
        driver.findElement(StatusSort).click();
    }
    @Step("Click Type Sort")
    public void ClickTypeSort() {
        driver.findElement(TypeSort).click();
    }
    @Step("Click Score Sort")
    public void ClickScoreSort() {
        driver.findElement(ScoreSort).click();
    }
    @Step("Click Size Sort")
    public void ClickSizeSort() {
        driver.findElement(SizeSort).click();
    }
    @Step("Click Up date Sort")
    public void ClickUpdateSort() {
        driver.findElement(UpdateSort).click();
    }
    @Step("Click Received Sort")
    public void ClickReceivedSort() {
        driver.findElement(ReceivedSort).click();
    }
    @Step("Click Status Filter")
    //status filter
    public void ClickStatusFilter() {
        driver.findElement(StatusFilter).click();
    }
    @Step("Click Check Processed")
    public void ClickCheckProcessed() {
        driver.findElement(CheckProcessed).click();
    }
    @Step("Click Items PerPage")
    public void ClickItemsPerPage() {
        driver.findElement(ItemsPerPage).click();
    }
    @Step("Select Items PerPage")
    public void SelectItemsPerPage() {
        driver.findElement(SelectItems).click();
    }
    @Step("Click Next Page")
    public void ClickNextPage() {
        driver.findElement(NextPage).click();
    }
    @Step("Click Last Page")
    public void ClickLastPage() {
        driver.findElement(LastPage).click();
    }
    @Step("Click Previous Page")
    public void ClickPreviousPage() {
        driver.findElement(PreviousPage).click();
    }
    @Step("Click First Page")
    public void ClickFirstPage() {
        driver.findElement(FirstPage).click();
    }
    @Step("Click AntiWise Icon")
    public void ClickAntiWiseIcon() {
        driver.findElement(ClickAntiClkWise).click();
    }
    @Step("Click AntiWise Icon")
    public void ClickClockWiseIcon() {
        driver.findElement(ClickClkWise).click();
    }
    @Step("Click ZoomIN")
    public void ClickZoomIN() {
        driver.findElement(ClickZoomIn).click();
    }
    @Step("Click ZoomOut")
    public void ClickZoomOut() {
        driver.findElement(ClickZoomOut).click();
    }
    @Step("Click NvgtRt")
    public void ClickNvgtRt() {
        driver.findElement(ClickNavigateRight).click();
    }
    @Step("Click Nvgt Lft")
    public void ClickNvgtLft() {
        driver.findElement(ClickNavigateLeft).click();
    }
    @Step("Click Chronic Condition")
    public void ClickChronicCondition() {
        driver.findElement(ChronicCondition).click();
    }
    @Step("Click Add Condition")
    public void ClickAddCondition() {
        driver.findElement(AddCondition).click();
    }
    @Step("Add NPI Number")
    public void AddNPINumber() {
        driver.findElement(NPINo).sendKeys("3216549871");
    }
    @Step("Add Physician Name")
    public void AddPhysicianName() {
        driver.findElement(PhysicianName).sendKeys("Dr. Andrew");
    }
    @Step("Click Start Date")
    public void ClickStartDate() {
        driver.findElement(StartDate).click();
    }
    @Step("Select Start Date")
    public void SelectStartDate() {
        driver.findElement(SelectStartDate).click();
    }
    @Step("Click End Date")
    public void ClickEndDate() {
        driver.findElement(EndDate).click();
    }
    @Step("Select End Date")
    public void SelectEndDate() {
        driver.findElement(SelectEndDate).click();
    }
    @Step("Save Chronic Condition")
    public void SaveChronicCondition() {
        driver.findElement(SaveCondition).click();
    }
    @Step("View Free Form Rejected Document")
    public void ViewFreeFormRejectedDocument() {
        driver.findElement(ViewFreeFormRejectedDoc).click();
    }
    @Step("click Add Data")
    public void clickAddData() {
        driver.findElement(AddData).click();
    }
    @Step("click Add Attributes")
    public void clickAddAttributes() {
        driver.findElement(AddAttribute).click();
    }
    @Step("add Attributes")
    public void addAttributes() throws InterruptedException {
        driver.findElement(AddPatientName).click();
        Thread.sleep(1000);
        driver.findElement(AddDOB).click();
        Thread.sleep(1000);
        driver.findElement(AddAge).click();
        Thread.sleep(1000);
        driver.findElement(AddAddress).click();
        Thread.sleep(1000);
        driver.findElement(AddGender).click();
        Thread.sleep(1000);
        driver.findElement(AddPhone).click();
        Thread.sleep(1000);
        driver.findElement(AddMRN).click();
        Thread.sleep(1000);
        driver.findElement(AddSSN).click();
        Thread.sleep(1000);
        driver.findElement(AddEmail).click();
        Thread.sleep(1000);

    }
    @Step("click ADD")
    public void clickADD() {
        driver.findElement(clickAdd).click();
    }
    @Step("add Attribute Value")
    public void addAttributeValue() throws InterruptedException {
        driver.findElement(addAttributePatientName).sendKeys("John Dey");
        Thread.sleep(2000);
        driver.findElement(addAttributeDOB).sendKeys("2/13/2000");
        Thread.sleep(2000);
        driver.findElement(AddAttributeAge).sendKeys("22");
        Thread.sleep(2000);
        driver.findElement(AddAttributeAddress).sendKeys("PO BOX 1938");
        Thread.sleep(2000);
        driver.findElement(AddAttributeGender).sendKeys("Male");
        Thread.sleep(2000);
        driver.findElement(AddAttributePhone).sendKeys("2211447788");
        Thread.sleep(2000);
        driver.findElement(AddAttributeMRN).sendKeys("10000");
        Thread.sleep(2000);
        driver.findElement(AddAttributeSSN).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(AddAttributeEmail).sendKeys("johndey@gmail.com");
        Thread.sleep(2000);
    }
    @Step("add Invalid Attribute")
    public void addInvalidAttribute() throws InterruptedException {
        driver.findElement(addAttributePatientName).sendKeys("123");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Acceptable entries are a-z, A-Z, space and dot.']")).isDisplayed());

        driver.findElement(addAttributeDOB).sendKeys("13/3/2000");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Please enter valid DOB.']")).isDisplayed());

        driver.findElement(AddAttributeAge).sendKeys("101");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Please enter valid age.']")).isDisplayed());

        driver.findElement(AddAttributeAddress).sendKeys("@@");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Acceptable entries are alphanumeric with no special characters.']")).isDisplayed());

        driver.findElement(AddAttributeGender).sendKeys("54321");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Acceptable entries are male,female or others.']")).isDisplayed());

        driver.findElement(AddAttributePhone).sendKeys("abc");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Please enter valid phone number']")).isDisplayed());

        driver.findElement(AddAttributeMRN).sendKeys("ABCD");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Please enter valid MRN number.']")).isDisplayed());

        driver.findElement(AddAttributeSSN).sendKeys("John Dey");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Please enter valid SSN number.']")).isDisplayed());

        driver.findElement(AddAttributeEmail).sendKeys("John Dey");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='An email address']")).isDisplayed());
        driver.navigate().refresh();
    }
    @Step("click Save Draft")
    public void clickSaveDraft() {
        driver.findElement(SaveDraft).click();
    }
    @Step("click Submit")

    public void clickSubmit() {
        driver.findElement(Submit).click();
    }
    @Step("click Submit Changes")
    public void clickSubmitChanges() {
        driver.findElement(SubmitChanges).click();
    }
    @Step("assert Free Form Document")
    public void assertFreeFormDocument() {

        AssertionsFunction.verifyElementText("Processed",StatusOfDoc);
    }

    @Step("view Structured Ready Doc")
    public void viewStructuredReadyDoc() {
        driver.findElement(ViewStructuredReadyDoc).click();
    }
    @Step("update Attribute Value")
    public void updateAttributeValue() {
        driver.findElement(UpdtAttributeValue).click();
        driver.findElement(SelectAddress).click();
    }
    @Step("verify tooltipOnHover Project SearchList")
    public void verifytooltipOnHoverProjectSearchList()
    {
        AssertionsFunction.verify_ElementHover("QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View" ,HoverProjectSearch );
    }
    @Step("verify tool tipOnHover Project Searched")
    public void verifytooltipOnHoverProjectSearched ()
    {
        AssertionsFunction.verify_ElementHover("QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View" ,HoverSearcheProjectd );

    }
    @Step("verify tool tipOnHover OnDocument Name")
    public void verifytooltipOnHoverOnDocumentName ()
    {
        AssertionsFunction.verify_ElementHover("inputDocs_QA-AutoProject-Structured_Pfizer.jpg" ,HoverDocumentName );
    }

}