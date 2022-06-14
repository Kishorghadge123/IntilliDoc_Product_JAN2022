package Tests;
import Base.BasePage;
import Pages.ProjectBREDataSetPage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Project BREMedical Chart Test")
@Listeners(Utilities.TestListeners.class)

public class ProjectBREMedicalChartTest extends BasePage
{ static
        ProjectBREPage ProjectBREPageObj;
        static ProjectPage ProjectPageObj;
        static  ProjectBREDataSetPage ProjectBREDataSetPageObj;
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
    @Story("story_id: 001  - check_all_functions_on_project_page")
    @Description("verify user able to check_all_functions_on_project_page")
    @Test (priority=1,groups="smoke", description = "verify check_all_functions_on_project_page")
    public void check_all_functions_on_project_page() throws Exception {
            Robot r = new Robot();
            //Initializing Object for Project Page.
            ProjectPageObj = new ProjectPage(driver);
            //TC 1 Check all the Functionalities on the Project Page.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
             AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREMedicalChartProjectName"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Assert.assertTrue(AssertionsFunction.isPresent(ProjectPageObj.GetLead()));
            Thread.sleep(2000);
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
            Assert.assertTrue(AssertionsFunction.isPresent(ProjectPageObj.GetSelectMedical()));
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            //Adding Entities.
            ProjectPageObj.ClickOnAddEntity();
            Thread.sleep(2000);
            ProjectPageObj.SelectPatientGraphics();
            Thread.sleep(3000);

            ProjectPageObj.ClickOnAddEntity();
            Thread.sleep(2000);
            ProjectPageObj.SelectHCCConditions();
            Thread.sleep(2000);

            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);

            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(2000);

            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(8000);
            //Navigate to Data Page.
            ProjectPageObj.ClickNextPage();
            Thread.sleep(2000);
            ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
            ProjectBREDataSetPageObj.ClickOnDataSets();
            Thread.sleep(1000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - add_dataset")
    @Description("verify user able to add_dataset")
    @Test (priority=2,groups="smoke", description = "verify add_dataset")
        public void add_dataset() throws Exception {
                //TC 2 Adding DataSet.
                ProjectBREDataSetPageObj.ClickOnAddDataSets();
                Thread.sleep(1000);
                ProjectBREDataSetPageObj.ClickOnBREChooseDataSet();
                Thread.sleep(1000);
                ProjectBREDataSetPageObj.SelectBREDataSet();
                Thread.sleep(1000);
              //  Assert.assertTrue(Functions.isElementPresent(ProjectBREDataSetPageObj.getBRESelectDataSet()));
                // Navigate to Rules Page.
                ProjectBREPageObj = new ProjectBREPage(driver);
                ProjectBREPageObj.ClickOnNextPageButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnThreeDotsButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnDataSets();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnThreeDotsButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddRulesButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnExpandFirstRule();
                Thread.sleep(2000);
                ProjectBREPageObj.DoubleClickOnRule1();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnRule();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnClearRule();
                Thread.sleep(2000);
                ProjectBREPageObj.DoubleClickOnRule1Second();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnRule();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterRuleName("SampleRule1");
                Thread.sleep(2000);
        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  - add_condition")
    @Description("verify user able to add_condition")
    @Test (priority=3,groups="smoke", description = "verify add_condition")
        public void add_condition() throws Exception {
            //TC 3 Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("PName and DOB Check");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddBREEntity();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddBREEntityPD();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(2000);
            //ProjectBREPageObj.SelectBRENameAttribute();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectOperatorValueExistsIn();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSelectBREDataSet();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnChooseBREDataSet();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnBREDataHeader();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectBREDataHeaderDXCode();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnPNameCheck();
            Thread.sleep(2000);
        }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004  - add_action")
    @Description("verify user able to add_action")
    @Test (priority=4,groups="smoke", description = "verify add_action")
    public void add_action() throws Exception {
        //TC 4 Add Action.
        ProjectBREPageObj.DoubleClickOnTrue1();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterActionValue("Document Pass");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAddAction();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnActionType();
        Thread.sleep(2000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005  - set_document_status_ready")
    @Description("verify user able to set_document_status_ready")
    @Test (priority=5,groups="smoke", description = "verify set_document_status_ready")
    public void set_document_status_ready() throws Exception {
        //TC 5 Set Document Status = Ready.
        ProjectBREPageObj.ClickOnSetDocumentStatus();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        Thread.sleep(2000);
        ProjectBREPageObj.DoubleClickOnFalse();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFalseBoxButton1();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterActionValue("Document Fail");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAddAction();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnActionType();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSetDocumentStatus();
        Thread.sleep(2000);
        //ProjectBREPageObj.ClickOnDocumentValue();
        //Thread.sleep(2000);
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006  - set_document_status_rejected")
    @Description("verify user able to set_document_status_rejected")
    @Test (priority=6,groups="smoke", description = "verify set_document_status_rejected")
    public void set_document_status_rejected() throws Exception {
            //TC 6 Document Status = Rejected.
//            ProjectBREPageObj.SelectDocumentStatusR();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton1();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFirstCondition();
            Thread.sleep(2000);
           /* ProjectBREPageObj.ClickOnANDCondition();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddBREEntity1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddBREEntityPD1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectBREDOBAttribute();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectOperatorValueExistsIn();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSelectBREDataSet();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnChooseBREDataSet1();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnBREDataHeader();
            Thread.sleep(2000);
        ProjectBREPageObj.SelectBREDataHeaderDXCode();
        Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);*/
            //for the Result please upload the Document from Backend.
        }
    }


