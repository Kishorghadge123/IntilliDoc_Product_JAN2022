package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentPage {

        WebDriver driver = null;

        By DocumentBtn = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/app-sidebar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-nav-list[1]/mat-list-item[6]/div[1]/i[1]");
        By DropDown = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[1]/div[1]/mat-toolbar[1]/button[1]/span[1]/i[1]");
        By SearchProject = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
        By SearchBox = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
        By SelectStructuredProject = By.xpath("//span[contains(text(),'QA-AutoProject-Structured')]");
        By SelectSemiStructuredProject = By.xpath("//span[contains(text(),'QA-AutoProject-SemiStructured')]");
        By SelectFreeFormProject = By.xpath("//span[contains(text(),'QA-AutoProject-FreeForm')]");
        By SemiStructureDocument= By.xpath("//span[contains(text(),'QA-Automation-SemiStructured')]");
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
        By ViewFreeFormRejectedDoc = By.xpath("//span[contains(text(),'Pfizer7.jpg')]");//rejected
        By ViewStructuredReadyDoc = By.xpath("//span[contains(text(),'Pfizer.jpg')]");//ready

        By ExpansionPanel = By.xpath("//mat-expansion-panel-header/span[2]");
        By ChangeEmail = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-processed-forms[1]/div[1]/div[1]/div[2]/div[4]/mat-expansion-panel[1]/div[1]/div[1]/mat-table[1]/mat-row[1]/mat-cell[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
        By SubmitDoc = By.xpath("//span[contains(text(),'Submit')]");
        By CancelEditDoc2 = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-processed-forms[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[4]/span[1]");
        By HideAnalytics = By.xpath("//mat-expansion-panel-header/span[2]");
        By UnHideAnalytics = By.xpath("//mat-expansion-panel-header/span[2]");
        By ClearSearchDocument = By.xpath("//mat-icon[contains(text(),'highlight_off')]");
        By RefreshDocuments = By.xpath("//mat-icon[contains(text(),'refresh')]");
        By DiscardUpdate = By.xpath("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-confirmation-dialog[1]/div[1]/div[1]/div[2]/button[2]");

        By FilterDoc = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]");
        By SearchFilterDoc = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[3]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
        By FilterSearchIcon = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/button[1]/span[1]");
        By CancelFilterSearch = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]/ngb-popover-window[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[2]/button[2]/span[1]/mat-icon[1]");

        //sorting
        By DocSort = By.xpath("//thead/tr[1]/th[1]/div[1]/div[2]");
        By AssigneeSort = By.xpath("//thead/tr[1]/th[2]/div[1]/div[2]");
        By StatusSort = By.xpath("//thead/tr[1]/th[3]/div[1]/div[2]");
        By TypeSort = By.xpath("//thead/tr[1]/th[4]/div[1]/div[2]");
        By ScoreSort = By.xpath("//thead/tr[1]/th[5]/div[1]/div[2]");
        By SizeSort = By.xpath("//thead/tr[1]/th[6]/div[1]/div[2]");
        By UpdateSort = By.xpath("//thead/tr[1]/th[7]/div[1]/div[2]");
        By ReceivedSort = By.xpath("//thead/tr[1]/th[8]/div[1]/div[2]");


        //status filter
        By StatusFilter = By.xpath("//thead/tr[1]/th[3]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]");
        By UncheckRejected = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/mat-pseudo-checkbox[1]");
        By CheckProcessed = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/mat-pseudo-checkbox[1]");



        By ArrowRight = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_right')]");
        By ArrowLeft = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_left')]");
        By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");

        By SelectItems = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
        By NextPage = By.xpath("//*[@aria-label='Next page']");
        By LastPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[3]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[4]/span[1]/*[1]");
        By PreviousPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[3]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[2]/span[1]/*[1]");
        By FirstPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/div[3]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[1]/span[1]/*[1]");

        By ClickPercentage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-documents[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/circle-progress[1]/*[1]");
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
        By SelectStartDate = By.xpath("//div[contains(text(),'26')]");//check in future
        By EndDate = By.xpath("//*[@id='mat-dialog-0']/app-rcm-edit-header/div/form/div/div[2]/div[3]/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
        By SelectEndDate = By.xpath("//div[contains(text(),'26')]");//check in future
        By SaveCondition = By.xpath("//*[@id='mat-dialog-0']/app-rcm-edit-header/div/form/div/div[2]/div[4]/button[2]/span[1]");

        By AddData = By.xpath("//mat-label[contains(text(),'Data')]");
        By AddAttribute = By.xpath("//span[contains(text(),'Attribute')]");
        By AddPatientName = By.xpath("//span[contains(text(),' PatientName ')]");
        By AddDOB = By.xpath("//span[contains(text(),' DOB ')]");
        By clickAdd = By.xpath("//span[contains(text(),' Add ')]");
        By addAttributeValue = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-processed-forms[1]/div[1]/div[1]/div[1]/as-split[1]/as-split-area[2]/div[4]/div[1]/mat-expansion-panel[1]/div[1]/div[1]/div[2]/mat-table[1]/mat-row[1]/mat-cell[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
        By SaveDraft = By.xpath("//span[contains(text(),'Save Draft')]");
        By Submit = By.xpath("//span[contains(text(),'Submit')]");
        By SubmitChanges = By.xpath("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-confirmation-dialog[1]/div[1]/div[1]/div[2]/button[1]/span[1]");
        By StatusFreeFormDoc = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
        By UpdtAttributeValue = By.xpath("//mat-row[@id='tableRow'][2]/mat-cell[2]");
        By SelectAddress = By.xpath("//span[contains(text(),' 2472 Rose Peak Drive Dietz ')]");

        //Constructor
        public DocumentPage(WebDriver driver) { this.driver = driver;}

        public void ClickDocumentBtn(){ driver.findElement(DocumentBtn).click();}
        public void ClickDropDownBtn(){ driver.findElement(DropDown).click();}
        public void ClickSearchProject(String text){ driver.findElement(SearchProject).sendKeys(text);}
        public void ClickSelectStructuredProject(){driver.findElement(SelectStructuredProject).click();}
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
        public void ClickDiscardUpdate(){driver.findElement(DiscardUpdate).click();}
        public void ClickExpansionPanel(){driver.findElement(ExpansionPanel).click();}
        public void ClickClearEmail(){driver.findElement(ChangeEmail).clear();}
        public void ChangeChangeEmail(String text){driver.findElement(ChangeEmail).sendKeys(text);}
        public void ClickUpdateDoc(){driver.findElement(SubmitDoc).click();}
        public void ClickCancelEditDoc2(){ driver.findElement(CancelEditDoc2).click();}
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
        public void clickAddData() {driver.findElement(AddData).click();}
        public void clickAddAttributes() { driver.findElement(AddAttribute).click();}
        public void addAttributes() {driver.findElement(AddPatientName).click();}
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

        public void assertAttributValue () {
                String AttributeValue = driver.findElement(addAttributeValue).getText();
                System.out.println(AttributeValue);
                //String ActualValue = AttributeValue;
                //String ExpectedValue = "John Dey";
                // Assert.assertEquals(ActualValue,ExpectedValue);
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