package Tests;
import Base.BasePage;
import Pages.ProjectBREDataSetPage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;

import java.awt.event.KeyEvent;
@Feature("Project BREDataSet Test")
@Listeners(Utilities.TestListeners.class)
public class ProjectBREDataSetTest extends BasePage {

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
    @Story("story_id: 001  - bre_applied_to_name_using_dataset_fail")
    @Description("verification_bre_applied_to_name_using_dataset_fail")
    @Test (priority=1,groups="smoke", description = "verification_bre_applied_to_name_using_dataset_fail")

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
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        //Starting Date should be updated in Xpath to Current Date before executing the Script.
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnAddTemplateBtn();
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(4000);
        ProjectPageObj.ClickNextPage();
        Thread.sleep(2000);
        //Navigate to Data Page.
        ProjectBREDataSetPageObj.ClickOnDataSets();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREDataSetPageObj.AddDataSet);
        Thread.sleep(1000);
        ProjectBREDataSetPageObj.ClickOnAddDataSets();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREDataSetPageObj.DatasetNameList);
        Thread.sleep(1000);
        ProjectBREDataSetPageObj.ClickOnChooseDataSet();
        ProjectBREDataSetPageObj.SelectDataSet();
        Thread.sleep(2000);
        ProjectBREDataSetPageObj.SelectData();
        Thread.sleep(2000);
        ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnThreeDotsButton();
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ExpandPanelOnRulePage);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnProjectData();
        ProjectBREPageObj.ClickOnProjectData();
        ProjectBREPageObj.ClickOnDataSets();
        ProjectBREPageObj.ClickOnVariables();
        ProjectBREPageObj.ClickOnThreeDotsButton();
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ScaleDownPanelOnRulePage);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddRulesButton();

        //   ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnDeleteRulesButton();
        //ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
        ProjectBREPageObj.ClickOnAddRulesButton();
        ProjectBREPageObj.ClickOnExpandFirstRule();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionBoxDisplay);
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionPanelDisplay);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnContractRuleButton();
        ProjectBREPageObj.ClickOnVisibility();
        ProjectBREPageObj.DoubleClickOnRule1();
        ProjectBREPageObj.ClickOnRule();
        ProjectBREPageObj.ClickOnClearRule();
        ProjectBREPageObj.DoubleClickOnRule1Second();
        ProjectBREPageObj.ClickOnRule();
        ProjectBREPageObj.EnterRuleName("Sample Rule");

        //Add Condition.
        ProjectBREPageObj.EnterAddNameOfCondition("Name");
        ProjectBREPageObj.ClickOnAddCondition();
        ProjectBREPageObj.ClickOnAttributeValue();
        ProjectBREPageObj.SelectNameAttribute();
        ProjectBREPageObj.ClickOnOperator();
        ProjectBREDataSetPageObj.SelectOperatorValueExistsIn();
        ProjectBREDataSetPageObj.ClickOnPredefinedDataSet();
        ProjectBREDataSetPageObj.SelectPredefinedDataSet();
        ProjectBREDataSetPageObj.ClickOnDataSetHeader();
        Thread.sleep(1000);
        ProjectBREDataSetPageObj.SelectDataSetHeader();
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
        Thread.sleep(1000);
        ProjectBREDataSetPageObj.ClickOnFirstDataSetBox();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(ProjectBREDataSetPageObj.FirstDecisionBox);
        Thread.sleep(1000);
        AssertionsFunction.verifyTargetPageURL(ProjectBREDataSetPageObj.breurl);


        //Document should be uploaded from backend to check the output.

    }
}