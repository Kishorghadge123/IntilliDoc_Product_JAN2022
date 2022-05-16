package Pages;

import Utilities.AssertionsFunction;
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
    public static By SelectMedicalChartProject = By.xpath("//span[contains(text(),'MedicalChart ')]");    By SelectMedicalChartProjectICD = By.xpath("//span[contains(text(),'J17012022')]");
    By SearchDocument = By.xpath("//mat-icon[contains(text(),'search')]");
    By CancelDoc2 = By.xpath("//span[contains(text(),'Cancel')]");
    By ViewDoc6 = By.xpath("//span[contains(text(),'33559446-2.pdf')]");
    By ViewFreeFormRejectedDoc = By.xpath("//span[contains(text(),'Pfizer10.jpg')]");
    By ViewStructuredReadyDoc = By.xpath("//span[contains(text(),'Pfizer10.jpg')]");

    By ViewDocument = By.xpath("//mat-icon[text()='visibility']");

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
    By SelectBREProject = By.xpath("//span[contains(text(),'QA-AutoProject-BRE-MedicalChart')]");

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
    public void ClickSelectBREProject(){driver.findElement(SelectBREProject).click();}
    public void ClickViewDocIcon6(){ driver.findElement(ViewDoc6).click();}



    public void assertAttributeValue () {
        String AttributeValue = driver.findElement(addAttributeValue).getText();
        System.out.println(AttributeValue);
        String ActualValue = AttributeValue;
        String ExpectedValue = "John Dey";
        Assert.assertEquals(ActualValue,ExpectedValue);
    }

    public void ClickDocumentBtn() {
        driver.findElement(DocumentBtn).click();
    }

    public void ClickDropDownBtn() {
        driver.findElement(DropDown).click();
        AssertionsFunction.verifyElementPresent(ProjectList);
    }

    public void ClickSearchProject(String text) {
        driver.findElement(SearchProject).sendKeys(text);
    }

    public void ClickSelectStructuredProject() {
        driver.findElement(SelectStructuredProject).click();
    }
    public void ClickSelectStructuredProjectTooltip() {
        driver.findElement(SelectStructuredProjectTooltip).click();
    }
    public void ClickSelectFreeFormProject() {driver.findElement(SelectFreeFormProject).click();}


    public void ClickSelectSemiStructuredProject() throws Exception {
        driver.findElement(SelectSemiStructuredProject).click();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementText("QA-AutoProject-SemiStructured",SelectSemiStructuredProject);

    }

    public void ClickSelectMedicalChartProject() {driver.findElement(SelectMedicalChartProject).click();}

    public void ClickSelectMedicalChartProjectICD() {
        driver.findElement(SelectMedicalChartProjectICD).click();
    }

    public void ClickSearchBox(String text) {
        driver.findElement(SearchBox).sendKeys(text);
    }

    public void ClickSearchDocument() {
        driver.findElement(SearchDocument).click();
    }

    public void ClickClearSearch() {
        driver.findElement(ClearSearchDocument).click();
    }

    public void ClickCancelDoc2() {
        driver.findElement(CancelDoc2).click();
    }

    public void ClickViewDocument() {
        driver.findElement(ViewDocument).click();
    }


    public void ClickExpansionPanel() {
        driver.findElement(ExpansionPanel).click();
    }

    public void ClickHideAnalytics() {
        driver.findElement(HideAnalytics).click();
    }

    public void ClickUnHideAnalytics() {
        driver.findElement(UnHideAnalytics).click();
    }

    public void ClickRefreshDocument() {
        driver.findElement(RefreshDocuments).click();
    }

    //Script Enhancement
    public void ClickFilterDoc() {
        driver.findElement(FilterDoc).click();
    }

    public void ClickSearchFilterDoc(String text) {
        driver.findElement(SearchFilterDoc).sendKeys(text);
    }

    public void ClickFilterSearchIcon() {
        driver.findElement(FilterSearchIcon).click();
    }

    public void ClickCancelFilterSearch() {
        driver.findElement(CancelFilterSearch).click();
    }

    public void ClickDocSort() {
        driver.findElement(DocSort).click();
    }

    public void ClickAssigneeSort() {
        driver.findElement(AssigneeSort).click();
    }

    public void ClickStatusSort() {
        driver.findElement(StatusSort).click();
    }

    public void ClickTypeSort() {
        driver.findElement(TypeSort).click();
    }

    public void ClickScoreSort() {
        driver.findElement(ScoreSort).click();
    }

    public void ClickSizeSort() {
        driver.findElement(SizeSort).click();
    }

    public void ClickUpdateSort() {
        driver.findElement(UpdateSort).click();
    }

    public void ClickReceivedSort() {
        driver.findElement(ReceivedSort).click();
    }

    //status filter
    public void ClickStatusFilter() {
        driver.findElement(StatusFilter).click();
    }

    public void ClickCheckProcessed() {
        driver.findElement(CheckProcessed).click();

    }

    public void ClickItemsPerPage() {
        driver.findElement(ItemsPerPage).click();
    }

    public void SelectItemsPerPage() {
        driver.findElement(SelectItems).click();
    }

    public void ClickNextPage() {
        driver.findElement(NextPage).click();
    }

    public void ClickLastPage() {
        driver.findElement(LastPage).click();
    }

    public void ClickPreviousPage() {
        driver.findElement(PreviousPage).click();
    }

    public void ClickFirstPage() {
        driver.findElement(FirstPage).click();
    }

    public void ClickAntiWiseIcon() {
        driver.findElement(ClickAntiClkWise).click();
    }

    public void ClickClockWiseIcon() {
        driver.findElement(ClickClkWise).click();
    }

    public void ClickZoomIN() {
        driver.findElement(ClickZoomIn).click();
    }

    public void ClickZoomOut() {
        driver.findElement(ClickZoomOut).click();
    }

    public void ClickNvgtRt() {
        driver.findElement(ClickNavigateRight).click();
    }

    public void ClickNvgtLft() {
        driver.findElement(ClickNavigateLeft).click();
    }

    public void ClickChronicCondition() {
        driver.findElement(ChronicCondition).click();
    }

    public void ClickAddCondition() {
        driver.findElement(AddCondition).click();
    }

    public void AddNPINumber() {
        driver.findElement(NPINo).sendKeys("3216549871");
    }

    public void AddPhysicianName() {
        driver.findElement(PhysicianName).sendKeys("Dr. Andrew");
    }

    public void ClickStartDate() {
        driver.findElement(StartDate).click();
    }

    public void SelectStartDate() {
        driver.findElement(SelectStartDate).click();
    }

    public void ClickEndDate() {
        driver.findElement(EndDate).click();
    }

    public void SelectEndDate() {
        driver.findElement(SelectEndDate).click();
    }

    public void SaveChronicCondition() {
        driver.findElement(SaveCondition).click();
    }

    public void ViewFreeFormRejectedDocument() {
        driver.findElement(ViewFreeFormRejectedDoc).click();
    }

    public void clickAddData() {
        driver.findElement(AddData).click();
    }

    public void clickAddAttributes() {
        driver.findElement(AddAttribute).click();
    }

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

    public void clickADD() {
        driver.findElement(clickAdd).click();
    }

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


    public void clickSaveDraft() {
        driver.findElement(SaveDraft).click();
    }


    public void clickSubmit() {
        driver.findElement(Submit).click();
    }

    public void clickSubmitChanges() {
        driver.findElement(SubmitChanges).click();
    }

    public void assertFreeFormDocument() {

        AssertionsFunction.verifyElementText("Processed",StatusOfDoc);
    }


    public void viewStructuredReadyDoc() {
        driver.findElement(ViewStructuredReadyDoc).click();
    }

    public void updateAttributeValue() {
        driver.findElement(UpdtAttributeValue).click();
        driver.findElement(SelectAddress).click();

    }

    public void verifytooltipOnHoverProjectSearchList()
    {
        AssertionsFunction.verify_ElementHover("QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View" ,HoverProjectSearch );
    }

    public void verifytooltipOnHoverProjectSearched ()
    {
        AssertionsFunction.verify_ElementHover("QA-AutProject-For-Tool-Tip-Testing-In-Document-Window-View" ,HoverSearcheProjectd );

    }

    public void verifytooltipOnHoverOnDocumentName ()
    {
        AssertionsFunction.verify_ElementHover("inputDocs_QA-AutoProject-Structured_Pfizer.jpg" ,HoverDocumentName );
    }





}