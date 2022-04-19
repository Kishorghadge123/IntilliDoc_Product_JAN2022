package Pages;

import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectPage   {
    String currentDate = new SimpleDateFormat("dd").format(new Date());
    WebDriver driver = null;


    //Define Project
    public static String ProjectPageURl = "https://alpha.neutrino-ai.com/#/home/project-management";
    public  String  EditProjectURL = "https://alpha.neutrino-ai.com/#/home/project-management/edit-project/6221eeaa994e456345dd1030";
    public String EditProjectAdmin = "https://alpha.neutrino-ai.com/#/home/project-management/edit-project/6200fd11cc453f40a6baf157";

    public static By ProjectBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    public static By CreateProject = By.xpath("//span[contains(text(),' Create Project ')]");
    By ProjectName = By.xpath("//input[@formcontrolname='project']");
    By Lead = By.xpath("//*[@formcontrolname='lead']");
    By SearchLead = By.xpath("//input[@placeholder='Search']");
    By SelectLeadSample = By.xpath("//span[contains(text(),'new@gmail.com')]");
    By SelectLeadAdmin = By.xpath("//span[contains(text(),' admin@test.com ')]");
    By SelectLead = By.xpath("//span[contains(text(),'qa1@email.com')]");
    public static By DisableRoleSearchError = By.xpath("//div[contains(text(),' No Records Found ! ')]");
    By ClickStartDate = By.cssSelector("button[aria-label='Open calendar'][tabindex='0']");
    By ClearStartDate = By.xpath("//input[@id='mat-input-3']");
    By SelectStartDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By ClickEndDate = By.xpath("/html/body/app-root/div/app-landing/div/div/main/div/app-create-project/div[2]/div/form/mat-card/div/div[4]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
    By ClearEndDate = By.xpath("//input[@id='mat-input-4']");
    By SelectEndDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
    public static By SelectStructure = By.xpath("//span[contains(text(),'Structured')]");
    public static By SelectMedical = By.xpath("//span[contains(text(),'Medical Chart')]");
    public static By ProjectCreated = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[1]");

    public static By SelectFreeForm = By.xpath("//span[contains(text(),'Free-Form')]");
    public static  By SelectSemiStructure = By.xpath("//span[contains(text(),'Semi-Structured')]");
    By AddEntity = By.xpath("//span[contains(text(),' Add Entity ')]");


    By PatientDemoGraphics = By.xpath("//button[contains(text(),' Patient Demographics')]");
    By HCCConditions = By.xpath("//button[contains(text(),' HCC Conditions')]");
    public static By PatientDemoGraphicsSelected = By.xpath("//*[text()=' Patient Demographics ']");
    public static By HCCCConditionsSelected = By.xpath("//*[text()=' HCC Conditions ']");


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
    public static By TemplateSelected = By.xpath("//*[@role='gridcell'][1]");

    //*[@role='gridcell'][1]
    By AddFields = By.xpath("//span[contains(text(),' Add Fields ')]");
    By SelectField = By.xpath("//button[contains(text(),'PatientName')]");
    public static By SelectedPatientNameField = By.xpath("//*[contains(text(),'PatientName')]");



    By ClickRoles = By.xpath("//span[contains(text(),'Roles')]");
    public static   By AddRoleAdmin = By.xpath("//span[contains(text(),'Add Role')]");
    public static By SelectRoleAdmin = By.xpath("//button[contains(text(),'AE Admin')]");
    public static By SelectedRoleAdmin = By.xpath("//*[text()=' AE Admin ']");


    By SelectRoleSuperVisor = By.xpath("//button[contains(text(),'AE Supervisor')]");
    By AddUser = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/project-info-section[1]/mat-accordion[1]/project-roles[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");
    By AddUserAdmin = By.xpath("//button[@class='mat-focus-indicator disabled-font-color mat-icon-button mat-button-base primary-font-color']");       //esc method
    public static By SelectUserAdmin = By.xpath("//span[contains(text(),'j1@gmail.com')]");
    By UpdateProject = By.xpath("//project-info-section/following-sibling::div/button/span[text()=' Update']/parent::button");
    By UpdatePrjectOnRulePage = By.xpath("//project-rule-section/following-sibling::div/button/span[text()=' Update ']/parent::button");
    By RoleUserDisableEnable = By.xpath("//div[@class='row']/div[3]/mat-slide-toggle");
    By SupervisorRoleDisable = By.xpath("//project-roles/mat-expansion-panel/div/div/div[1]/div[3]/div/div[3]/mat-slide-toggle/label[@class='mat-slide-toggle-label']");
    By RulesPage = By.xpath("//span[text()='Next']");
    By CreateButtonOnProjectPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/div[1]/button[1]/span[1]");


    By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");
    By SelectItems = By.xpath("//span[contains(text(),'50')]");
    By NextPage = By.xpath("//span[contains(text(),' Next')]");

    By CancelOnProject = By.xpath("//*[contains(text(),'Cancel')]");
    By ErrorMsgBlank = By.xpath("//span[contains(text(),'Please add the attributes before creating the project.')]");
    By ErrorMsgRoleUser = By.xpath("//span[contains(text(),'Role cannot have empty users')]");
    By ErrorMsgTemplate = By.xpath("//span[contains(text(),'Please add the template before creating the project.')]");
    By ErrorMsgData = By.xpath("//span[contains(text(),'Please check form data')]");
    By ErrorMsgRole = By.xpath("//span[contains(text(),'Role(s) cannot be empty')]");
    By ErrorMsgDisableRole = By.xpath("//span[contains(text(),'AE Supervisor role is Disabled')]");
    By ErrorMsgDataRole = By.xpath("//span[contains(text(),'Please check form data and role(s) cannot be empty')]");
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");
    By SearchProject = By.xpath("//input[@data-placeholder='Search']");


    By RoleManagementBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-id-card m-0 side-icon ng-star-inserted']");
    By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    By EditRole = By.xpath("//*[text()='Roles ']//following::span[1]");// updated
    By ActiveRole = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By ClickUpdateBtn = By.xpath("//span[contains(text(),'Update' )]");
    By ClickSearchBox = By.xpath("//input[@placeholder='Search']");
    By EditProjectBtn = By.xpath("//mat-icon[contains(text(),'create')]");

    By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By LoginBtn = By.xpath("//button[@type='submit']");
    By Username = By.xpath("//input[@formcontrolname='userName']");
    By Password = By.xpath("//input[@formcontrolname='password']");
    By EditProject = By.xpath("//mat-icon[contains(text(),'create')]");
    By DeleteAttributeFieldName = By.xpath("//mat-table[@role='grid']/mat-row[1]/mat-cell[3]/button");
    public static By DeletedInvoiceAttribute = By.xpath("//*[@role='grid']/mat-row[1]");
    public static By DisableProjectSearchMesage = By.xpath("//*[text()='No Records Found !']");



    // User Update
    By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    By User = By.xpath("//td[contains(text(),' AE Admin ')]");
    By SearchBtn = By.xpath("//input[@data-placeholder='Search']");
    By DisableUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By UpdateUser = By.xpath("//span[text()='Update']");
    By BackButtonRulePage = By.xpath("//project-rule-section/following-sibling::div/button/span[text()='Back']/parent::button");
    By BackButtonDataPage = By.xpath("//project-data-section/following-sibling::div/button/span[text()='Back']/parent::button");
    By ErrorMsgEntities = By.xpath("//span[contains(text(),'Please add the entities before creating the project.')]");
    public static By DisableUserToggle = By.xpath("//*[@class='mat-slide-toggle mat-primary ng-valid ng-touched ng-dirty']");
    public static By ProjectNameInList = By.xpath("//tbody/tr[1]/td[1]");
    public static By DataPageDispaly = By.xpath("//*[@class='mat-accordion example-headers-align']/parent::project-data-section");
    public static By RulePageDispaly = By.xpath("//*[@class='mat-accordion example-headers-align']/parent::project-data-section");

    public String projectTabUrl="https://alpha.neutrino-ai.com/#/home/project-management";
    public String createProjectUrl="https://alpha.neutrino-ai.com/#/home/project-management/create-project";

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    SoftAssert softAssert = new SoftAssert();

    public void ClickOnDeleteAttributeFieldName() {
        driver.findElement(DeleteAttributeFieldName).click();
    }

    public By GetSelectUserAdmin(){return this.SelectUserAdmin;}
    public By GetSelectRoleAdmin(){return this.SelectRoleAdmin;}
    public By GetHCCConditions(){
        System.out.println(HCCConditions);
        return this.HCCConditions;}
    public By getPatientDemoGraphics(){
        System.out.println(PatientDemoGraphics);
        return this.PatientDemoGraphics;}
    public By GetSelectMedical(){return this.SelectMedical;}
    public By GetLead(){return this.Lead;}
    public By GetselectLead(){return this.SelectLead;}
    public void ClickOnProjectBtn() throws  InterruptedException{
        driver.findElement(ProjectBtn).click();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL ("https://alpha.neutrino-ai.com/#/home/project-management");

    }

    public void ClickOnCreateProjectBtn() throws InterruptedException {
        driver.findElement(CreateProject).click();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL ("https://alpha.neutrino-ai.com/#/home/project-management/create-project");
    }

    public void ClickOnProjectNameBtn(String text) throws Exception{

        Thread.sleep(2000);
        driver.findElement(ProjectName).sendKeys(text);
    }

    public void ClickOnLeadBtn() throws Exception{

        Thread.sleep(2000);
        driver.findElement(Lead).click();
    }

    public void SelectPatientGraphics() throws Exception{
        Thread.sleep(2000);
        driver.findElement(PatientDemoGraphics).click();
    }

    public void SelectHCCConditions() throws Exception{
        Thread.sleep(2000);
        driver.findElement(HCCConditions).click();
    }


    public void ClickOnAddEntity() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddEntity).click();
    }

    public void ClickSearchLead(String text) throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchLead).sendKeys(text);
    }

    public void ClearSearchLead() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchLead).clear();
    }

    public void SelectOnLeadBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectLead).click();
    }

    public void SelectOnLeadSampleBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectLeadSample).click();
    }

    public void SelectOnLeadAdminBtn()throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectLeadAdmin).click();
    }


    public void ClickOnStartDateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickStartDate).click();
    }

    public void SelectStartDateBtn()throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectStartDate).click();
    }

    public void ClickOnDocumentStructureBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickDocumentStructure).click();
    }

    public void SelectDocumentStructureBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectStructure).click();
    }


    public void SelectDocumentStructureMedicalBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectMedical).click();
    }


    public void SelectOnSemiStructure() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectSemiStructure).click();
    }

    public void SelectOnFreeFormStructure() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectFreeForm).click();
    }

    public void ClickOnProcessingEngineBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickProcessingEngine).click();
    }

    public void SelectOnProcessingEngineBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectProcessingEngine).click();
    }

    public void SelectOnProcessingEngineLowBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectProcessingEngineNNLow).click();
    }

    public void ClickOnStraightThroughProcessBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(StraightThroughProcess).click();
    }

    public void ClickOnDocumentScoreBtn(String text)throws Exception{
        Thread.sleep(2000);
        driver.findElement(DocumentScore).sendKeys(text);
    }

    public void ClickOnStatusBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(Status).click();
    }

    public void ClickOnDocumentAutoAssignBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(DocumentAutoAssign).click();
    }

    public void ClickOnAddTemplateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickAddTemplate).click();
    }

    public void ClickOnAddFieldBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddFields).click();
    }

    public void SelectFieldValue() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectField).click();
    }

    public void ClickOnRoleUserDisableEnable() throws Exception{
        Thread.sleep(2000);
        driver.findElement(RoleUserDisableEnable).click();
    }

    public void ClickOnSupervisorRoleDisable() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SupervisorRoleDisable).click();
    }

    public void ClickOnTemplateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectTemplate).click();
    }

    public void ClickOnRolesBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickRoles).click();
    }

    public void ClickOnAddRoleBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddRoleAdmin).click();
    }

    public void ClickOnSelectRoleBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectRoleAdmin).click();
    }

    public void ClickOnSelectSupervisorRoleBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectRoleSuperVisor).click();
    }

    public void ClickUpdateBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickUpdateBtn).click();
    }


    public void ClickOnAddUserBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddUserAdmin).click();
    }

    public void ClickOnAddUser() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddUser).click();
    }

    public void ClickOnSelectUserBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectUserAdmin).click();
    }


    public void ClickItemsPerPage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ItemsPerPage).click();
    }

    public void SelectItemsPerPage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectItems).click();
    }

    public void ClickNextPage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(NextPage).click();
    }


    public void ClickRulesPage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(RulesPage).click();
    }

    public void ClickOnCreate()  throws Exception{
        Thread.sleep(2000);
        driver.findElement(CreateButtonOnProjectPage).click();
    }

    public void ClickOnCancelProject() throws  InterruptedException
    {
        driver.findElement(CancelOnProject).click();
    }

    public void VerifyAssertForBlank()
    {
        AssertionsFunction.verifyElementText("Please add the attributes before creating the project.",ErrorMsgBlank);
    }

    public void VerifyAssertForUser()
    {
        AssertionsFunction.verifyElementText("Role cannot have empty users",ErrorMsgRoleUser);
    }

    public void VerifyAssertForNoTemplate()
    {

        AssertionsFunction.verifyElementText("Please add the template before creating the project.",ErrorMsgTemplate);

    }

    public void VerifyAssertForData()
    {

        AssertionsFunction.verifyElementText("Please check form data",ErrorMsgData);

    }

    public void VerifyAssertForDataAndRole()
    {
        AssertionsFunction.verifyElementText("Please check form data and role(s) cannot be empty",ErrorMsgDataRole);

    }

    public void VerifyAssertForRole() {

        AssertionsFunction.verifyElementText("Role(s) cannot be empty",ErrorMsgRole);

    }


    public void VerifyAssertForLeadAdmin() {
        String actual_msg = driver.findElement(SelectLeadAdmin).getText();
        String expect = "admin@test.com";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForRoleDisable() {
        String actual_msg = driver.findElement(ErrorMsgDisableRole).getText();
        String expect = "AE Supervisor role is Disabled";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForEntities() {

        AssertionsFunction.verifyElementText("Please add the entities before creating the project.",ErrorMsgEntities);

    }



    public void ClickOnEndDate() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickEndDate).click();
    }

    public void SelectEndDate() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SelectEndDate).click();
    }

    public void TableStructure() throws Exception{
        Thread.sleep(2000);
        driver.findElement(TableStructure).click();
    }

    public void SearchProject() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchProject).sendKeys("QA-AutoProject-Structured10");
    }

    public void SearchProjectAdmin() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchProject).sendKeys("QA-AutoAdmin1");
    }
    public void SearchProjectForStatus() throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchProject).sendKeys("QA-AutoAdminProject");
    }


    public void ClickRoleManagementBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(RoleManagementBtn).click();
    }

    public void SearchCreatedRole(String text)throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchRole).sendKeys(text);
    }

    public void ClickEditRole() throws Exception{
        Thread.sleep(2000);
        driver.findElement(EditRole).click();
    }

    public void ClickActiveRole() throws Exception{
        Thread.sleep(2000);
        driver.findElement(ActiveRole).click();
    }

    public void ClickLogout() throws Exception{
        Thread.sleep(2000);
        driver.findElement(Logout).click();
    }

    //Admin Login
    public void EnterUsername(String text) throws Exception{
        Thread.sleep(2000);
        driver.findElement(Username).sendKeys(text);
    }

    public void EnterPassword(String text) throws Exception{
        Thread.sleep(2000);
        driver.findElement(Password).sendKeys(text);
    }

    public void ClickLoginButton() throws Exception{
        Thread.sleep(2000);
        driver.findElement(LoginBtn).click();
    }

    public void ClickOnEditProject() throws Exception{
        Thread.sleep(2000);
        driver.findElement(EditProject).click();
    }

    public void ClickOnUpdateProject() {
        driver.findElement(UpdateProject).click();
    }

    public void ClickOnUpdateProjectOnRulePage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(UpdatePrjectOnRulePage).click();
    }

    // User Enable and disable
    public void ClickUserBtn() throws Exception{
        Thread.sleep(2000);
        driver.findElement(UserBtn).click();
    }

    public void SearchCreatedUser(String text) throws Exception{
        Thread.sleep(2000);
        driver.findElement(SearchBtn).sendKeys(text);
    }

    public void SelectSearchedUser() throws Exception{
        Thread.sleep(2000);
        driver.findElement(User).click();
    }

    public void ClickDisableUser() throws Exception{
        Thread.sleep(2000);
        driver.findElement(DisableUser).click();
    }

    public void ClickUpdateUser() throws Exception{
        Thread.sleep(2000);
        driver.findElement(UpdateUser).click();
    }

    public void ClickBackRulePage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(BackButtonRulePage).click();
    }

    public void CLickBackDataPage() throws Exception{
        Thread.sleep(2000);
        driver.findElement(BackButtonDataPage).click();
    }
    public void ClickOnSearchBox(String text)throws Exception{
        Thread.sleep(2000);
        driver.findElement(ClickSearchBox).sendKeys(text);
    }
    public void ClickEditProjectBtn()throws Exception{
        Thread.sleep(2000);
        driver.findElement(EditProjectBtn).click();
    }


    public void verifyProjectCreated(String TupeOfProject) throws IOException {
        switch (TupeOfProject) {
            case "MedicalChartProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("MedicalChartProjectName1"), ProjectCreated);
                break;
            }

            case "FreeFormProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("FreeFormProjectName1"), ProjectCreated);
                break;
            }

            case "StructuredProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("StructuredProjectName1"), ProjectCreated);
                break;
            }

            case "SemiStructuredProject": {
                AssertionsFunction.verifyElementText(ReadProps.readAttr("SemiStructuredProjectName1"), ProjectCreated);
                break;
            }

            default:
            {
                System.out.println("Wrong Project Type Is Entered");
            }

        }
    }
}
