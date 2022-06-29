package Tests;
import Base.BasePage;
import Pages.ProjectBREDataSetPage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class ProjectBREMedicalChartTest extends BasePage
{ static
ProjectBREPage ProjectBREPageObj;
    static ProjectPage ProjectPageObj;
    static  ProjectBREDataSetPage ProjectBREDataSetPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @AfterClass
    public void cleanUp() throws Exception
    {

        driver.quit();
    }
    @Test(priority = 1)
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
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureMedicalBtn();
        ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        //Adding Entities.
        ProjectPageObj.ClickOnAddEntity();
        Thread.sleep(2000);
        ProjectPageObj.SelectPatientGraphics();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddEntity();
        Thread.sleep(2000);
        ProjectPageObj.SelectPatientGraphics1();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
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
        AssertionsFunction.isPresent(ProjectBREDataSetPageObj.DataSets);
    }
    @Test(priority = 2)
    public void add_dataset() throws Exception {
        //TC 2 Adding DataSet.
        ProjectBREDataSetPageObj.ClickOnAddDataSets();
        Thread.sleep(2000);
        ProjectBREDataSetPageObj.ClickOnBREChooseDataSet();
        Thread.sleep(2000);
        ProjectBREDataSetPageObj.SelectBREDataSet();
        //  Assert.assertTrue(Functions.isElementPresent(ProjectBREDataSetPageObj.getBRESelectDataSet()));
        // Navigate to Rules Page.
        ProjectBREPageObj = new ProjectBREPage(driver);
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnThreeDotsButton();
        ProjectBREPageObj.ClickOnDataSets();
        ProjectBREPageObj.ClickOnThreeDotsButton();
        ProjectBREPageObj.ClickOnAddRulesButton();
        ProjectBREPageObj.ClickOnExpandFirstRule();
        ProjectBREPageObj.DoubleClickOnRule1();
        ProjectBREPageObj.ClickOnRule();
        ProjectBREPageObj.ClickOnClearRule();
        ProjectBREPageObj.DoubleClickOnRule1Second();
        ProjectBREPageObj.ClickOnRule();
        ProjectBREPageObj.EnterRuleName("SampleRule1");
        Thread.sleep(1000);
     //   AssertionsFunction.isPresent(ProjectBREPageObj.RuleName);
        Thread.sleep(1000);

    }
    @Test(priority = 3)
    public void add_condition() throws Exception {
        //TC 3 Add Condition.
        ProjectBREPageObj.EnterAddNameOfCondition("PName and DOB Check");
        ProjectBREPageObj.ClickOnAddCondition();
        ProjectBREPageObj.ClickOnAddBREEntity();
        ProjectBREPageObj.ClickOnAddBREEntityPD();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAttributeValue();
        Thread.sleep(4000);
        ProjectBREPageObj.SelectBRENameAttribute();
        ProjectBREPageObj.ClickOnOperator();
        Thread.sleep(3000);
        ProjectBREPageObj.SelectOperatorValueExistsIn();
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnSelectBREDataSet();
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnChooseBREDataSet();
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnBREDataHeader();
        Thread.sleep(1000);
        ProjectBREPageObj.SelectBREDataHeaderDXCode();
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnPNameCheck();
        Thread.sleep(2000);
       /// AssertionsFunction.isPresent(ProjectBREPageObj.PNameCheck);
    }
    @Test(priority = 4)
    public void add_action() throws Exception {
        //TC 4 Add Action.
        ProjectBREPageObj.DoubleClickOnTrue1();
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();

        ProjectBREPageObj.EnterActionValue("Document Pass");
Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddAction();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnActionType();
        Thread.sleep(2000);
       // AssertionsFunction.isPresent(ProjectBREPageObj.ActionType);
        Thread.sleep(1000);


    }
    @Test(priority = 5)
    public void set_document_status_ready() throws Exception {
        //TC 5 Set Document Status = Ready.
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnSetDocumentStatus();
Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        Thread.sleep(2000);
        ProjectBREPageObj.DoubleClickOnFalse();
        ProjectBREPageObj.ClickOnFalseBoxButton1();
        ProjectBREPageObj.EnterActionValue("Document Fail");
        ProjectBREPageObj.ClickOnAddAction();
        ProjectBREPageObj.ClickOnActionType();
        ProjectBREPageObj.ClickOnSetDocumentStatus();
 //  AssertionsFunction.isPresent(ProjectBREPageObj.SetDocumentStatus);
    }
    @Test(priority = 6)
    public void set_document_status_rejected() throws Exception {
        //TC 6 Document Status = Rejected.
//            ProjectBREPageObj.SelectDocumentStatusR();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(5000);
        ProjectBREPageObj.ClickOnFalseBoxButton1();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFirstCondition();
        Thread.sleep(2000);
       // AssertionsFunction.isPresent(ProjectBREPageObj.FirstCondition);

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