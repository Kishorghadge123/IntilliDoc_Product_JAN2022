package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import io.qameta.allure.Step;
public class ProjectPage   {
    String currentDate = new SimpleDateFormat("dd").format(new Date());
    WebDriver driver = null;
    //locators
    public static String ProjectPageURl = "https://alpha.neutrino-ai.com/#/home/project-management";
    public  String  EditProjectURL = "https://alpha.neutrino-ai.com/#/home/project-management/edit-project/6221eeaa994e456345dd1030";
    public String EditProjectAdmin = "https://alpha.neutrino-ai.com/#/home/project-management/edit-project/6200fd11cc453f40a6baf157";
    public  static By createrolebtn=By.xpath("//span[contains(text(),' Create User ')]");
    public static By ProjectBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[5]");
    public static By CreateProject = By.xpath("//span[contains(text(),' Create Project ')]");
    By ProjectName = By.xpath("//input[@formcontrolname='project']");
    By Lead = By.xpath("//*[@formcontrolname='lead']");
    By SearchLead = By.xpath("//input[@placeholder='Search']");
    By SelectLeadSample = By.xpath("//mat-label[text()='Lead']//following::mat-option[1]");
    By SelectLeadAdmin = By.xpath("//mat-label[text()='Lead']//following::mat-option[1]");
    By SelectLead = By.xpath("//mat-label[text()='Lead']//following::mat-option[1]");
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


    By PatientDemoGraphics = By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[1]");
    By HCCConditions = By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[2]");
    By PatientDemoGraphics1 = By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[1]");
    public static By PatientDemoGraphicsSelected = By.xpath("//*[text()=' Patient Demographics ']");
    public static By HCCCConditionsSelected = By.xpath("//*[text()=' HCC Conditions ']");


    By ClickProcessingEngine = By.xpath("//mat-select[@formcontrolname='processingEngine']");
    By SelectProcessingEngine = By.xpath("//span[contains(text(),' NN High ')]");
    public static By SelectProcessingEngineNNLow = By.xpath("//span[contains(text(),' NN Low')]");
    public static By StraightThroughProcess = By.xpath("//*[@formcontrolname='staightThroughProcessing']/label/div");
    public By DocumentScore = By.xpath("//input[@formcontrolname='score']");
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
    public static By SelectRoleAdmin = By.xpath("//div[@class='cdk-overlay-pane']//following::button[1]");
    public static By SelectedRoleAdmin = By.xpath("//*[text()=' AE Admin ']");


    By SelectRoleSuperVisor = By.xpath("//button[contains(text(),'AE Supervisor')]");
    By AddUser = By.xpath("(//span[@class='mat-option-text'])[1]");
    By AddUserAdmin = By.xpath("//div[text()=' Users ']//following::mat-icon[1]");       //esc method
    public static By SelectUserAdmin = By.xpath("//*[@class='cdk-overlay-connected-position-bounding-box']//following::mat-option[1]/span[1]");
    public By UpdateProject = By.xpath("//project-info-section/following-sibling::div/button/span[text()=' Update']/parent::button");
    By UpdatePrjectOnRulePage = By.xpath("//project-rule-section/following-sibling::div/button/span[text()=' Update ']/parent::button");
    By RoleUserDisableEnable = By.xpath("//div[@class='row']/div[3]/mat-slide-toggle");
    By SupervisorRoleDisable = By.xpath("//project-roles/mat-expansion-panel/div/div/div[1]/div[3]/div/div[3]/mat-slide-toggle/label[@class='mat-slide-toggle-label']");
    By RulesPage = By.xpath("//span[text()='Next']");
    By CreateButtonOnProjectPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/div[1]/button[1]/span[1]");
    By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");
    By SelectItems = By.xpath("//span[contains(text(),'50')]");
    public By NextPage = By.xpath("//span[contains(text(),' Next')]");
    public By create=By.xpath("//span[text()='Create']");
    public By field=By.xpath("//span[contains(text(),' Add Fields ')]");
    public By pname=By.xpath("//button[contains(text(),'PatientName')]");
    public By checkbox=By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]");
    public  By createbtutton=By.xpath("(//button[contains(@class,'mat-focus-indicator ml-2 ng-tns')])[1]");
    public By creatbtnforstruct=By.xpath("(//span[contains(text(),' Create')])[2]");
    public   By CancelOnProject = By.xpath("(//button[contains(@class,'mat-focus-indicator ml-2')])[3]");
    By cancel=By.xpath("(//span[contains(text(),'Cancel')])[2]");
    By ErrorMsgBlank = By.xpath("//span[contains(text(),'Please add the attributes before creating the project.')]");
    By ErrorMsgRoleUser = By.xpath("//span[contains(text(),'Role cannot have empty users')]");
    By ErrorMsgTemplate = By.xpath("//span[contains(text(),'Please add the template before creating the project.')]");
    By ErrorMsgData = By.xpath("//span[contains(text(),'Please check form data')]");
    By ErrorMsgRole = By.xpath("//span[contains(text(),'Role(s) cannot be empty')]");
    By ErrorMsgDisableRole = By.xpath("//span[contains(text(),'AE Supervisor role is Disabled')]");
    By ErrorMsgDataRole = By.xpath("//span[contains(text(),'Please check form data and role(s) cannot be empty')]");
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");
    public By SearchProject = By.xpath("//input[@data-placeholder='Search']");


    By RoleManagementBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]");
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
    By EditProject = By.xpath("//span[text()=' Create Project ']//following::mat-icon[2]");
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

    @Step(" click on ClickOnDeleteAttributeFieldName")
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

    @Step(" click on ClickOnProjectBtn")
    public void ClickOnProjectBtn() throws  Exception{
        driver.findElement(ProjectBtn).click();
        Thread.sleep(8000);


    }
    public void createrolebutton(){
        driver.findElement(createrolebtn).click();
    }
    @Step(" click on ClickOnCreateProjectBtn")
    public void ClickOnCreateProjectBtn() throws Exception {
        driver.findElement(CreateProject).click();
        // AssertionsFunction.verifyTargetPageURL ("https://alpha.neutrino-ai.com/#/home/project-management/create-project");
    }
    @Step(" click on clickoncreatebtn")
    public void clickoncreatebtn(){
        driver.findElement(createbtutton).click();
    }
    public void addfields(){
        driver.findElement(field).click();
    }
    public  void selectpatientname(){
        driver.findElement(pname).click();
    }
    @Step(" click on selectdropdown")
    public void selectdropdown(){
        driver.findElement(checkbox).click();
    }

    public void clickoncreatebtnstruct(){
        driver.findElement(creatbtnforstruct).click();
    }


    @Step("ClickOnProjectNameBtn")
    public void ClickOnProjectNameBtn(String text) throws Exception{


        driver.findElement(ProjectName).sendKeys(text);
    }


    @Step("ClickOnLeadBtn")
    public void ClickOnLeadBtn() throws Exception
    {
        Thread.sleep(2000);
        driver.findElement(Lead).click();
    }


    @Step("SelectPatientGraphics")
    public void SelectPatientGraphics() throws Exception{
        Thread.sleep(2000);
        driver.findElement(PatientDemoGraphics).click();
    }

    @Step("SelectPatientGraphics1")
    public void SelectPatientGraphics1() throws Exception{
        Thread.sleep(2000);
        driver.findElement(PatientDemoGraphics1).click();
}
        public void SelectHCCConditions() throws Exception{
        Thread.sleep(2000);
        driver.findElement(HCCConditions).click();
    }

    @Step("ClickOnAddEntity")
    public void ClickOnAddEntity() throws Exception{
        Thread.sleep(2000);
        driver.findElement(AddEntity).click();
    }
    @Step("ClickSearchLead")
    public void ClickSearchLead(String text) throws Exception{

        driver.findElement(SearchLead).sendKeys(text);
    }
    @Step(" click on ClearSearchLead")
    public void ClearSearchLead() throws Exception{

        driver.findElement(SearchLead).clear();
    }
    @Step("SelectOnLeadBtn")
    public void SelectOnLeadBtn() throws Exception{

        driver.findElement(SelectLead).click();
    }
    @Step("SelectOnLeadSampleBtn")
    public void SelectOnLeadSampleBtn() throws Exception{

        Thread.sleep(2000);
        driver.findElement(SelectLeadSample).click();
    }
    @Step(" click on SelectOnLeadAdminBtn")
    public void SelectOnLeadAdminBtn()throws Exception{

        driver.findElement(SelectLeadAdmin).click();
    }

    @Step("ClickOnStartDateBtn")
    public void ClickOnStartDateBtn() throws Exception{

        driver.findElement(ClickStartDate).click();
    }
    @Step(" SelectStartDateBtn")
    public void SelectStartDateBtn()throws Exception{

        driver.findElement(SelectStartDate).click();
    }
    @Step("ClickOnDocumentStructureBtn")
    public void ClickOnDocumentStructureBtn() throws Exception{

        driver.findElement(ClickDocumentStructure).click();
    }
    @Step("SelectDocumentStructureBtn")
    public void SelectDocumentStructureBtn() throws Exception{

        driver.findElement(SelectStructure).click();
    }

    @Step("SelectDocumentStructureMedicalBtn")
    public void SelectDocumentStructureMedicalBtn() throws Exception{

        driver.findElement(SelectMedical).click();
    }

    @Step("SelectOnSemiStructure")
    public void SelectOnSemiStructure() throws Exception{

        driver.findElement(SelectSemiStructure).click();
    }
    @Step("SelectOnFreeFormStructure")
    public void SelectOnFreeFormStructure() throws Exception{

        driver.findElement(SelectFreeForm).click();
    }
    @Step("ClickOnProcessingEngineBtn")
    public void ClickOnProcessingEngineBtn() throws Exception{

        driver.findElement(ClickProcessingEngine).click();
    }
    @Step("SelectOnProcessingEngineBtn")
    public void SelectOnProcessingEngineBtn() throws Exception{

        driver.findElement(SelectProcessingEngine).click();
    }

    public void SelectOnProcessingEngineLowBtn() throws Exception{

        driver.findElement(SelectProcessingEngineNNLow).click();
    }
    @Step("ClickOnStraightThroughProcessBtn")
    public void ClickOnStraightThroughProcessBtn() throws Exception{

        driver.findElement(StraightThroughProcess).click();
    }
    @Step(" ClickOnDocumentScoreBtn")
    public void ClickOnDocumentScoreBtn(String text)throws Exception{

        driver.findElement(DocumentScore).sendKeys(text);
    }
    @Step(" ClickOnStatusBtn")
    public void ClickOnStatusBtn() throws Exception
    {
        Thread.sleep(2000);
        Custome_Wait.wait(driver,Status);
        driver.findElement(Status).click();
    }
    @Step(" ClickOnDocumentAutoAssignBtn")
    public void ClickOnDocumentAutoAssignBtn() throws Exception{

        driver.findElement(DocumentAutoAssign).click();
    }
    @Step("ClickOnAddTemplateBtn")
    public void ClickOnAddTemplateBtn() throws Exception{

        driver.findElement(ClickAddTemplate).click();
    }
    @Step(" ClickOnAddFieldBtn")
    public void ClickOnAddFieldBtn() throws Exception{

        driver.findElement(AddFields).click();
    }
    @Step(" click on SelectFieldValue")
    public void SelectFieldValue() throws Exception{

        driver.findElement(SelectField).click();
    }

    @Step("ClickOnRoleUserDisableEnable")
    public void ClickOnRoleUserDisableEnable() throws Exception{

        driver.findElement(RoleUserDisableEnable).click();
    }
    @Step("ClickOnSupervisorRoleDisable")
    public void ClickOnSupervisorRoleDisable() throws Exception{

        driver.findElement(SupervisorRoleDisable).click();
    }
    @Step("ClickOnTemplateBtn")
    public void ClickOnTemplateBtn() throws Exception{

        driver.findElement(SelectTemplate).click();
    }
    @Step("ClickOnRolesBtn")
    public void ClickOnRolesBtn() throws Exception{

        driver.findElement(ClickRoles).click();
    }
    @Step(" ClickOnAddRoleBtn")
    public void ClickOnAddRoleBtn() throws Exception{

        driver.findElement(AddRoleAdmin).click();
    }
    @Step("ClickOnSelectRoleBtn")
    public void ClickOnSelectRoleBtn() throws Exception{

        driver.findElement(SelectRoleAdmin).click();
    }
    @Step("ClickOnSelectSupervisorRoleBtn")
    public void ClickOnSelectSupervisorRoleBtn() throws Exception{

        driver.findElement(SelectRoleSuperVisor).click();
    }
    @Step("ClickUpdateBtn")
    public void ClickUpdateBtn() throws Exception{

        driver.findElement(ClickUpdateBtn).click();
    }

    @Step(" ClickOnAddUserBtn")
    public void ClickOnAddUserBtn() throws Exception{

        driver.findElement(AddUserAdmin).click();
    }


    @Step("ClickOnAddUser")
    public void ClickOnAddUser() throws Exception{

        driver.findElement(AddUser).click();
    }

    @Step("ClickOnSelectUserBtn")
    public void ClickOnSelectUserBtn() throws Exception{

        driver.findElement(SelectUserAdmin).click();
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[text()=' Users ']//following::mat-chip")));
        act.click().build().perform();
    }


    public void ClickItemsPerPage() throws Exception{

        driver.findElement(ItemsPerPage).click();
    }

    public void SelectItemsPerPage() throws Exception{

        driver.findElement(SelectItems).click();
    }

    @Step("ClickNextPage")
    public void ClickNextPage() throws Exception{

        Thread.sleep(5000);
        Custome_Wait.wait(driver,NextPage);
        driver.findElement(NextPage).click();
    }
    public void createbtn(){
        driver.findElement(create).click();
    }

    @Step("ClickRulesPage")
    public void ClickRulesPage() throws Exception{

        driver.findElement(RulesPage).click();
    }
    @Step(" ClickOnCreate")
    public void ClickOnCreate()  throws Exception{

        driver.findElement(CreateButtonOnProjectPage).click();
    }


    @Step("ClickOnCancelProject")
    public void ClickOnCancelProject() throws  InterruptedException
    {
        driver.findElement(CancelOnProject).click();
    }

    @Step(" clickoncancel")
    public void clickoncancel(){
        driver.findElement(cancel).click();
    }


    @Step("VerifyAssertForBlank")
    public void VerifyAssertForBlank()
    {
        AssertionsFunction.verifyElementText("Please add the attributes before creating the project.",ErrorMsgBlank);
    }


    @Step("VerifyAssertForUser")
    public void VerifyAssertForUser()
    {
        AssertionsFunction.verifyElementText("Role cannot have empty users",ErrorMsgRoleUser);
    }

    public void VerifyAssertForNoTemplate()
    {

        Custome_Wait.wait(driver,ErrorMsgTemplate);
        AssertionsFunction.verifyElementText("Please add the template before creating the project.",ErrorMsgTemplate);

    }
    @Step("VerifyAssertForData")
    public void VerifyAssertForData()
    {

        AssertionsFunction.verifyElementText("Please check form data",ErrorMsgData);

    }

    public void VerifyAssertForDataAndRole()
    {
        AssertionsFunction.verifyElementText("Please check form data and role(s) cannot be empty",ErrorMsgDataRole);

    }
    @Step("VerifyAssertForRole")
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


    @Step("ClickOnEndDate")
    public void ClickOnEndDate() throws Exception{

        driver.findElement(ClickEndDate).click();
    }
    @Step("SelectEndDate")
    public void SelectEndDate() throws Exception{

        driver.findElement(SelectEndDate).click();
    }
    @Step(" click on TableStructure")
    public void TableStructure() throws Exception{


        driver.findElement(TableStructure).click();
    }
    @Step(" click on SearchProject")
    public void SearchProject() throws Exception{

        driver.findElement(SearchProject).sendKeys("QA-AutoProject");
    }


    @Step(" click on SearchProjectAdmin")
    public void SearchProjectAdmin() throws Exception{

        driver.findElement(SearchProject).sendKeys("QA-AutoAdmin");
    }

    @Step(" click on SearchProjectForStatus")
    public void SearchProjectForStatus(String projectName) throws Exception{
        Custome_Wait.wait(driver,SearchProject);
        driver.findElement(SearchProject).sendKeys(projectName);
        Custome_Wait.wait(driver,EditProject);
    }



    @Step(" click on ClickRoleManagementBtn")
    public void ClickRoleManagementBtn() throws Exception{

        driver.findElement(RoleManagementBtn).click();
    }


    @Step(" click on SearchCreatedRole")
    public void SearchCreatedRole(String text)throws Exception{

        driver.findElement(SearchRole).sendKeys(text);
    }


    @Step("ClickEditRole")
    public void ClickEditRole() throws Exception{

        driver.findElement(EditRole).click();
    }

    @Step(" ClickActiveRole")
    public void ClickActiveRole() throws Exception{

        driver.findElement(ActiveRole).click();
    }

    @Step(" ClickLogout")
    public void ClickLogout() throws Exception{

        driver.findElement(Logout).click();
    }

    //Admin Login

    @Step(" EnterUsername")
    public void EnterUsername(String text) throws Exception{

        driver.findElement(Username).sendKeys(text);
    }
    @Step("EnterPassword")
    public void EnterPassword(String text) throws Exception{

        driver.findElement(Password).sendKeys(text);
    }
    @Step("ClickLoginButton")
    public void ClickLoginButton() throws Exception{

        driver.findElement(LoginBtn).click();
        Thread.sleep(8000);
    }
    @Step("ClickOnEditProject")
    public void ClickOnEditProject() throws Exception{

        driver.findElement(EditProject).click();
        Thread.sleep(3000);
    }
    @Step(" ClickOnUpdateProject")
    public void ClickOnUpdateProject() throws Exception
    {
        Custome_Wait.wait(driver,UpdateProject);
        driver.findElement(UpdateProject).click();
        Thread.sleep(5000);

        // Custome_Wait.waitElement(driver,driver.findElement(By.xpath("//*[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']")));

    }

    public void ClickOnUpdateProjectOnRulePage() throws Exception{

        driver.findElement(UpdatePrjectOnRulePage).click();
    }

    // User Enable and disable
    public void ClickUserBtn() throws Exception{

        driver.findElement(UserBtn).click();
    }

    public void SearchCreatedUser(String text) throws Exception{

        driver.findElement(SearchBtn).sendKeys(text);
    }

    public void SelectSearchedUser() throws Exception{

        driver.findElement(User).click();
    }

    public void ClickDisableUser() throws Exception{

        driver.findElement(DisableUser).click();
    }

    public void ClickUpdateUser() throws Exception{

        driver.findElement(UpdateUser).click();
    }
    @Step(" ClickBackRulePage")
    public void ClickBackRulePage() throws Exception{

        driver.findElement(BackButtonRulePage).click();
    }
    @Step(" CLickBackDataPage")
    public void CLickBackDataPage() throws Exception{

        driver.findElement(BackButtonDataPage).click();
    }

    @Step(" ClickOnSearchBox")
    public void ClickOnSearchBox(String text)throws Exception
    {
        Custome_Wait.wait(driver,ClickSearchBox);
        driver.findElement(ClickSearchBox).sendKeys(text);
    }

    @Step("ClickEditProjectBtn")
    public void ClickEditProjectBtn()throws Exception{
        Custome_Wait.wait(driver,EditProjectBtn);
        driver.findElement(EditProjectBtn).click();
    }

    @Step("verifyProjectCreated ")
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