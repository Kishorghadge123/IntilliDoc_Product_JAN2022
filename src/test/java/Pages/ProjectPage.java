package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectPage {
    String currentDate = new SimpleDateFormat("dd").format(new Date());
    WebDriver driver = null;


    //Define Project
    By ProjectBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By CreateProject = By.xpath("//span[contains(text(),' Create Project ')]");
    By ProjectName = By.xpath("//input[@formcontrolname='project']");
    By Lead = By.xpath("//*[@formcontrolname='lead']");
    By SearchLead = By.xpath("//input[@placeholder='Search']");
    By SelectLeadSample = By.xpath("//span[contains(text(),'new@gmail.com')]");
    By SelectLeadAdmin = By.xpath("//span[contains(text(),' admin@test.com ')]");
    By SelectLead = By.xpath("//span[contains(text(),'qauser@gmail.com')]");
    By ClickStartDate = By.cssSelector("button[aria-label='Open calendar'][tabindex='0']");
    By SelectStartDate = By.xpath("//div[contains(text()," + currentDate + ")]");//Change this before running
    By ClickEndDate = By.xpath("/html/body/app-root/div/app-landing/div/div/main/div/app-create-project/div[2]/div/form/mat-card/div/div[4]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");
    By SelectEndDate = By.xpath("//div[contains(text()," + currentDate + ")]");
    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
    By SelectStructure = By.xpath("//span[contains(text(),'Structured ')]");
    By SelectMedical = By.xpath("//span[contains(text(),'Medical Chart')]");
    By SelectFreeForm = By.xpath("//span[contains(text(),'Free-Form ')]");
    By SelectSemiStructure = By.xpath("//span[contains(text(),'Semi-Structured ')]");
    By AddEntity = By.xpath("//span[contains(text(),' Add Entity ')]");

    By PatientDemoGraphics = By.xpath("//button[contains(text(),' Patient Demographics')]");
    By ChronicConditions = By.xpath("//button[contains(text(),' Chronic Conditions')]");

    By ClickProcessingEngine = By.xpath("//*[@formcontrolname='processingEngine']/div[1]/div[2]");
    By SelectProcessingEngine = By.xpath("//span[contains(text(),'NN High')]");
    By SelectProcessingEngineNNLow = By.xpath("//span[contains(text(),'NN Low')]");
    By StraightThroughProcess = By.xpath("//*[@formcontrolname='staightThroughProcessing']/label/div");
    By DocumentScore = By.xpath("//input[@formcontrolname='score']");
    By Status = By.xpath("//*[@formcontrolname='status']/label/div");
    By Attributes = By.xpath("//span[contains(text(),'Attributes')]");
    By DocumentAutoAssign = By.xpath("//*[@formcontrolname='autoAssignment']/label/div");
    By ClickAddTemplate = By.xpath("//span[contains(text(),'Add Template')]");
    By SelectTemplate = By.xpath("//button[contains(text(),'PE_TEMPLATE')]");
    By AddFields = By.xpath("//span[contains(text(),' Add Fields ')]");
    By SelectField = By.xpath("//button[contains(text(),'PatientName')]");
    By ClickRoles = By.xpath("//span[contains(text(),'Roles')]");
    By AddRoleAdmin = By.xpath("//span[contains(text(),'Add Role')]");
    By SelectRoleAdmin = By.xpath("//button[contains(text(),'AE Admin')]");
    By SelectRoleSuperVisor = By.xpath("//button[contains(text(),'AE Supervisor')]");
    By AddUser = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/project-info-section[1]/mat-accordion[1]/project-roles[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");
    By AddUserAdmin = By.xpath("//button[@class='mat-focus-indicator disabled-font-color mat-icon-button mat-button-base primary-font-color']");       //esc method
    By SelectUserAdmin = By.xpath("//span[contains(text(),'j1@gmail.com')]");
    By UpdateProject =  By.xpath("(//span[contains(text(),'Update')])[3]");
    By UpdateProjectOnProjectPage = By.xpath("(//span[contains(text(),'Update')])[1]");
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
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");
    By SearchProject = By.xpath("//input[@data-placeholder='Search']");


    By RoleManagementBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-id-card m-0 side-icon ng-star-inserted']");
    By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    By EditRole = By.xpath("//span[contains(text(),' AutoAdmin1 ')]");
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
    // User Update
    By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    By User = By.xpath("//td[contains(text(),' AE Admin ')]");
    By SearchBtn = By.xpath("//input[@data-placeholder='Search']");
    By DisableUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By UpdateUser = By.xpath("//span[text()='Update']");
    By BackButtonRulePage = By.xpath("//project-rule-section/following-sibling::div/button/span[text()='Back']/parent::button");
    By BackButtonDataPage = By.xpath("//project-data-section/following-sibling::div/button/span[text()='Back']/parent::button");
    By ErrorMsgEntities = By.xpath("//span[contains(text(),'Please add the entities before creating the project.')]");


    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    SoftAssert softAssert = new SoftAssert();

    public void ClickOnDeleteAttributeFieldName() {
        driver.findElement(DeleteAttributeFieldName).click();
    }

    public void ClickOnProjectBtn() {
        driver.findElement(ProjectBtn).click();
    }

    public void ClickOnCreateProjectBtn() {
        driver.findElement(CreateProject).click();
    }

    public void ClickOnProjectNameBtn(String text) {
        driver.findElement(ProjectName).sendKeys(text);
    }

    public void ClickOnLeadBtn() {
        driver.findElement(Lead).click();
    }

    public void SelectPatientGraphics() {
        driver.findElement(PatientDemoGraphics).click();
    }

    public void SelectChronicConditions() {
        driver.findElement(ChronicConditions).click();
    }


    public void ClickOnAddEntity() {
        driver.findElement(AddEntity).click();
    }

    public void ClickSearchLead(String text) {
        driver.findElement(SearchLead).sendKeys(text);
    }

    public void ClearSearchLead() {
        driver.findElement(SearchLead).clear();
    }

    public void SelectOnLeadBtn() {
        driver.findElement(SelectLead).click();
    }

    public void SelectOnLeadSampleBtn() {
        driver.findElement(SelectLeadSample).click();
    }

    public void SelectOnLeadAdminBtn() {
        driver.findElement(SelectLeadAdmin).click();
    }


    public void ClickOnStartDateBtn() {
        driver.findElement(ClickStartDate).click();
    }

    public void SelectStartDateBtn() {
        driver.findElement(SelectStartDate).click();
    }

    public void ClickOnDocumentStructureBtn() {
        driver.findElement(ClickDocumentStructure).click();
    }

    public void SelectDocumentStructureBtn() {
        driver.findElement(SelectStructure).click();
    }


    public void SelectDocumentStructureMedicalBtn() {
        driver.findElement(SelectMedical).click();
    }


    public void SelectOnSemiStructure() {
        driver.findElement(SelectSemiStructure).click();
    }

    public void SelectOnFreeFormStructure() {
        driver.findElement(SelectFreeForm).click();
    }

    public void ClickOnProcessingEngineBtn() {
        driver.findElement(ClickProcessingEngine).click();
    }

    public void SelectOnProcessingEngineBtn() {
        driver.findElement(SelectProcessingEngine).click();
    }

    public void SelectOnProcessingEngineLowBtn() {
        driver.findElement(SelectProcessingEngineNNLow).click();
    }

    public void ClickOnStraightThroughProcessBtn() {
        driver.findElement(StraightThroughProcess).click();
    }

    public void ClickOnDocumentScoreBtn(String text) {
        driver.findElement(DocumentScore).sendKeys(text);
    }

    public void ClickOnStatusBtn() {
        driver.findElement(Status).click();
    }

    public void ClickOnDocumentAutoAssignBtn() {
        driver.findElement(DocumentAutoAssign).click();
    }

    public void ClickOnAddTemplateBtn() {
        driver.findElement(ClickAddTemplate).click();
    }

    public void ClickOnAddFieldBtn() {
        driver.findElement(AddFields).click();
    }

    public void SelectFieldValue() {
        driver.findElement(SelectField).click();
    }

    public void ClickOnRoleUserDisableEnable() {
        driver.findElement(RoleUserDisableEnable).click();
    }

    public void ClickOnSupervisorRoleDisable() {
        driver.findElement(SupervisorRoleDisable).click();
    }

    public void ClickOnTemplateBtn() {
        driver.findElement(SelectTemplate).click();
    }

    public void ClickOnRolesBtn() {
        driver.findElement(ClickRoles).click();
    }

    public void ClickOnAddRoleBtn() {
        driver.findElement(AddRoleAdmin).click();
    }

    public void ClickOnSelectRoleBtn() {
        driver.findElement(SelectRoleAdmin).click();
    }

    public void ClickOnSelectSupervisorRoleBtn() {
        driver.findElement(SelectRoleSuperVisor).click();
    }

    public void ClickUpdateBtn() {
        driver.findElement(ClickUpdateBtn).click();
    }


    public void ClickOnAddUserBtn() {
        driver.findElement(AddUserAdmin).click();
    }

    public void ClickOnAddUser() {
        driver.findElement(AddUser).click();
    }

    public void ClickOnSelectUserBtn() {
        driver.findElement(SelectUserAdmin).click();
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


    public void ClickRulesPage() {
        driver.findElement(RulesPage).click();
    }

    public void ClickOnCreate() {
        driver.findElement(CreateButtonOnProjectPage).click();
    }

    public void ClickOnCancelProject() {
        driver.findElement(CancelOnProject).click();
    }

    public void VerifyAssertForBlank() {

        String actual_msg = driver.findElement(ErrorMsgBlank).getText();
        String expect = "Please add the attributes before creating the project.";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForUser() {
        String actual_msg = driver.findElement(ErrorMsgRoleUser).getText();
        String expect = "Role cannot have empty users.";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForNoTemplate() {
        String actual_msg = driver.findElement(ErrorMsgTemplate).getText();
        String expect = "Please add the template before creating the project.";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForData() {
        String actual_msg = driver.findElement(ErrorMsgData).getText();
        String expect = "Please check form data";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForRole() {
        String actual_msg = driver.findElement(ErrorMsgRole).getText();
        String expect = "Role(s) cannot be empty";
        softAssert.assertEquals(actual_msg, expect);
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
        String actual_msg = driver.findElement(ErrorMsgEntities).getText();
        String expect = "Please add the entities before creating the project.";
        softAssert.assertEquals(actual_msg, expect);
    }

    public void ClickOnEndDate() {
        driver.findElement(ClickEndDate).click();
    }

    public void SelectEndDate() {
        driver.findElement(SelectEndDate).click();
    }

    public void TableStructure() {
        driver.findElement(TableStructure).click();
    }

    public void SearchProject() {
        driver.findElement(SearchProject).sendKeys("QA-AutoProject-Structured1");
    }

    public void SearchProjectAdmin() {
        driver.findElement(SearchProject).sendKeys("QA-AutoAdmin1");
    }

    public void ClickRoleManagementBtn() {
        driver.findElement(RoleManagementBtn).click();
    }

    public void SearchCreatedRole(String text) {
        driver.findElement(SearchRole).sendKeys(text);
    }

    public void ClickEditRole() {
        driver.findElement(EditRole).click();
    }

    public void ClickActiveRole() {
        driver.findElement(ActiveRole).click();
    }

    public void ClickLogout() {
        driver.findElement(Logout).click();
    }

    //Admin Login
    public void EnterUsername(String text) {
        driver.findElement(Username).sendKeys(text);
    }

    public void EnterPassword(String text) {
        driver.findElement(Password).sendKeys(text);
    }

    public void ClickLoginButton() {
        driver.findElement(LoginBtn).click();
    }

    public void ClickOnEditProject() {
        driver.findElement(EditProject).click();
    }

    public void ClickOnUpdateProject() {
        driver.findElement(UpdateProject).click();
    }
    public void ClickOnUpdateProjectOnPP() {
        driver.findElement(UpdateProjectOnProjectPage).click();
    }
    // User Enable and disable
    public void ClickUserBtn() {
        driver.findElement(UserBtn).click();
    }

    public void SearchCreatedUser(String text) {
        driver.findElement(SearchBtn).sendKeys(text);
    }

    public void SelectSearchedUser() {
        driver.findElement(User).click();
    }

    public void ClickDisableUser() {
        driver.findElement(DisableUser).click();
    }

    public void ClickUpdateUser() {
        driver.findElement(UpdateUser).click();
    }

    public void ClickBackRulePage() {
        driver.findElement(BackButtonRulePage).click();
    }

    public void CLickBackDataPage() {
        driver.findElement(BackButtonDataPage).click();
    }
    public void ClickOnSearchBox(String text) {driver.findElement(ClickSearchBox).sendKeys(text);}
    public void ClickEditProjectBtn(){ driver.findElement(EditProjectBtn).click();}
}
