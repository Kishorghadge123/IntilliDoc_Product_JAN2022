package Tests;

import Base.BasePage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Project Flow Medical Chart")
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowMedicalChart extends BasePage {
    static ProjectPage ProjectPageObj;
    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @Step("Closed the Browser")
   @AfterClass
    public void cleanUp() throws Exception
    {
    driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  - check_all_functionalities_on_project_page")
    @Description("verify user able to check_all_functionalities_on_project_page")
    @Test (priority=1,groups="smoke", description = "verify check_all_functionalities_on_project_page")
    public void check_all_functionalities_on_project_page() throws Exception {
        Robot r = new Robot();
        ProjectPageObj = new ProjectPage(driver);
        //TC 16.1 Checking all the functionalities on the Project Page Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("MedicalChartProjectName1"));//change this name in Obj file.
        Thread.sleep(2000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.GetselectLead());
        Thread.sleep(1000);
        ProjectPageObj.ClickOnStartDateBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectStartDateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnEndDate();
        Thread.sleep(2000);
        ProjectPageObj.SelectEndDate();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectDocumentStructureMedicalBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectMedical);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.Status);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.DocumentAutoAssign);
        Thread.sleep(1000);


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - create_project_without_entities_and_role")
    @Description("verify user able to create_project_without_entities_and_role")
    @Test (priority=2,groups="smoke", description = "verify create_project_without_entities_and_role")
    public void create_project_without_entities_and_role() throws Exception {
        //TC 16.2 Verify Create Project without Entities and Role.
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForEntities();
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  - create_project_with_entities_without_role")
    @Description("verify user able to create_project_with_entities_without_role")
    @Test (priority=3,groups="smoke", description = "verify create_project_with_entities_without_role")
    public void create_project_with_entities_without_role() throws Exception {
        //TC 16.3 Verify Create Project with Entities and without Role
        ProjectPageObj.ClickOnAddEntity();
        Thread.sleep(3000);
        ProjectPageObj.SelectPatientGraphics();
        Thread.sleep(4000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.PatientDemoGraphicsSelected);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddEntity();
        Thread.sleep(3000);
        ProjectPageObj.SelectHCCConditions();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.HCCCConditionsSelected);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForRole();
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - create_project_without_user")
    @Description("verify user able to create_project_without_user")
    @Test (priority=4,groups="smoke", description = "verify create_project_without_user")
    public void create_project_without_user() throws Exception {
        //TC 16.4 Verify Create Project without User.
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(5000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectedRoleAdmin);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForUser();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - verify_add_user")
    @Description("verify user able to add_user")
    @Test (priority=5,groups="smoke", description = "verify verify_add_user")
    public void verify_add_user() throws Exception {
        //TC 16.5 Verify Add User.
        ProjectPageObj.ClickOnAddUserBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectUserAdmin);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006  - navigate_next_to_datapage_back_page")
    @Description("verify user able to navigate_next_to_datapage_back_page")
    @Test (priority=6,groups="smoke", description = "verify navigate_next_to_datapage_back_page")
    public void navigate_next_to_datapage_back_page() throws Exception {
        //16.6 Navigate Next to Data Page and Rules Page and Back also.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(4000);
        ProjectPageObj.ClickRulesPage();
        Thread.sleep(4000);
        ProjectPageObj.ClickBackRulePage();
        Thread.sleep(5000);
        ProjectPageObj.CLickBackDataPage();
        Thread.sleep(6000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007  - create_project_with_valid_details")
    @Description("verify user able to create_project_with_valid_details")
    @Test (priority=7,groups="smoke", description = "verify create_project_with_valid_details")
    public void create_project_with_valid_details() throws Exception {
        //TC 16.7 Verify Create Project with Valid Details.
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(15000);
        ProjectPageObj.TableStructure();
        Thread.sleep(15000);
        ProjectPageObj.verifyProjectCreated("MedicalChartProject");
        Thread.sleep(2000);
    }
}