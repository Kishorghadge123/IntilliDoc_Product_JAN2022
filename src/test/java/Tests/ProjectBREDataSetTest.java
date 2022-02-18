package Tests;
import Base.BasePage;
import Pages.ProjectBREDataSetPage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)
public class ProjectBREDataSetTest extends BasePage {
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void bre_applied_to_name_using_dataset_fail() throws Exception {
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            //Object creation
            ProjectBREDataSetPage ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
            Robot r = new Robot();
            //TC-1.1 BRE Applied to NAME RULE Using DataSet = Fail.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(3000);
            //Navigate to Project Page.
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            //Starting Date should be updated in Xpath to Current Date before executing the Script.
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-1000)", "");
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,1000)", "");
            Thread.sleep(1000);
            ProjectPageObj.ClickNextPage();
            Thread.sleep(2000);
            //Navigate to Data Page.
            ProjectBREDataSetPageObj.ClickOnDataSets();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnAddDataSets();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnChooseDataSet();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectDataSet();
            Thread.sleep(1000);
            ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
            //Navigate to Rules Page.
            ProjectBREPageObj.ClickOnNextPageButton();
            Thread.sleep(3000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnProjectData();
            Thread.sleep(4000);
            ProjectBREPageObj.ClickOnProjectData();
            Thread.sleep(3000);
            ProjectBREPageObj.ClickOnDataSets();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariables();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnDeleteRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandFirstRule();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnContractRuleButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVisibility();
            Thread.sleep(2000);
            ProjectBREPageObj.DoubleClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnClearRule();
            Thread.sleep(1000);
            ProjectBREPageObj.DoubleClickOnRule1Second();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterRuleName("Sample Rule");
            Thread.sleep(1000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("Name");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectNameAttribute();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectOperatorValueExistsIn();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnPredefinedDataSet();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectPredefinedDataSet();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnDataSetHeader();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.SelectDataSetHeader();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(1000);
            ProjectBREDataSetPageObj.ClickOnFirstDataSetBox();
            Thread.sleep(4000);
    //Document should be uploaded from backend to check the output.

        }
        }
