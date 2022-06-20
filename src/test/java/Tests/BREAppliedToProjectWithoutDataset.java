package Tests;
import Base.BasePage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("BREApplied To Project Without Dataset")
@Listeners(Utilities.TestListeners.class)
public class BREAppliedToProjectWithoutDataset extends BasePage {
        static  ProjectPage ProjectPageObj;
        static  ProjectBREPage ProjectBREPageObj;
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
        @Story("story_id: 001 - enter Projec Paget Data")
        @Description("verify user able to enter Projec Paget Data")
        @Test(priority = 1 ,groups="smoke", description = "verify enter Projec Paget Data")
        public void enterProjecPagetData() throws Exception {
                Robot r = new Robot();
                ProjectPageObj = new ProjectPage(driver);
                //Object Creation.
                ProjectBREPageObj = new ProjectBREPage(driver);
                ProjectPageObj.ClickOnCreateProjectBtn();
                Thread.sleep(5000);
                //Navigate to Project Page.
                ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
                Thread.sleep(2000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadBtn();
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
                Thread.sleep(2000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,-1000)", "");
                Thread.sleep(2000);

                //Navigate to Data Page. Adding Variables for Name, Address, State.
                ProjectPageObj.ClickNextPage();
                Thread.sleep(2000);
        }
        @Severity(SeverityLevel.NORMAL)
        @Story("story_id: 002 - enter Variable")
        @Description("verify user able to enter Variable")
        @Test (priority=2,groups="smoke", description = "verify enter Variable")
                public void enterVariable  ()  throws Exception
        {
                ProjectBREPageObj.ClickOnExpandVariables();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.AddVariablesButton);
                Thread.sleep(1000);
                ProjectBREPageObj.ClickOnAddVariables();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.VariableAddWindow);
                Thread.sleep(1000);
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName1"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnName();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue1"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);
                //Adding Second Variable for Name.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName2"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnName();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);
                //Adding Third Variable for Address.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName3"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddress();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue2"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Fourth Variable for Address.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName4"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddress();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Fifth Variable for State.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName5"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnState();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue3"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Sixth Variable for State.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName6"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnState();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Seventh Variable for City.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName7"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnCity();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue4"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Eight Variable for City.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName8"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnCity();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Ninth Variable for ZIP.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName9"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnZIP();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue5"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);

                //Adding Tenth Variable for ZIP.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName10"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnValidationType();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnZIP();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnCancelButton();
                Thread.sleep(2000);
                AssertionsFunction.verifyTargetPageURL(ProjectBREPageObj.ProjectPageURL);
                Thread.sleep(1000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.VariableAddedTable);
                Thread.sleep(1000);
        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 003 - add And Delete Rules Button")
        @Description("verify user able to add And Delete Rules Button")
        @Test (priority = 3,groups="smoke", description = "verify add And Delete Rules Button")
        public void addAndDeleteRulesButton() throws Exception
        {
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
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnThreeDotsButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddRulesButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnDeleteRulesButton();
                Thread.sleep(2000);

                //Adding First Rule for Name.
                //TC-1 BRE Applied to NAME-Pass.
                ProjectBREPageObj.ClickOnAddRulesButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnExpandFirstRule();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnContractRuleButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVisibility();
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

                //Add Condition.
                ProjectBREPageObj.EnterAddNameOfCondition("Name");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddCondition();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAttributeValue();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.AttributeList);
                Thread.sleep(1000);
                ProjectBREPageObj.SelectNameAttribute();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnOperator();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectOperatorValueEqualTo();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
                Thread.sleep(1000);
                ProjectBREPageObj.ClickOnFirstDecisionBox();
                Thread.sleep(2000);

                //Add Action.
                ProjectBREPageObj.DoubleClickOnTrue1();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFirstTrueBoxButton();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterActionValue("Name Exists");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddAction();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVariableDropdown();//unable to write dynamic xpath
                Thread.sleep(2000);
                ProjectBREPageObj.SelectVariable1();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 004 - bre applied to name fail")
        @Description("verify user able to bre applied to name fail")
        @Test(priority =4,groups="smoke", description = "verify bre applied to name fail")
        public void bre_applied_to_name_fail() throws Exception {
                //TC-2 BRE Applied to NAME-Fail.
                ProjectBREPageObj.DoubleClickOnFalse();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFalseBoxButton1();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.FalseConditionBox);
                Thread.sleep(1000);
                ProjectBREPageObj.EnterActionValue("Name Doesn't Exists");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddAction();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVariableDropdown();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectVariable2();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
                ProjectBREPageObj.ClickOnFalseBoxButton1();
                Thread.sleep(2000);
        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 005 - brev applied to address pass")
        @Description("verify user able to brev applied to address pass")
        @Test(priority =5,groups="smoke", description = "verify brev applied to address pass")
        public void bre_applied_to_address_pass() throws Exception {
                //Adding Second Rule for Address.
                //TC-3 BRE Applied to Address = Pass.
                ProjectBREPageObj.ClickOnAddRulesButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnExpandSecondRule();
                Thread.sleep(2000);
                //Add Condition.
                ProjectBREPageObj.EnterAddNameOfCondition("Address");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddCondition();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAttributeValue();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectAddressAttribute();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnOperator();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectOperatorValueEqualTo();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFirstDecisionBox();
                Thread.sleep(2000);
                //Add Action.
                ProjectBREPageObj.DoubleClickOnTrue2();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSecondTrueBoxButton();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterActionValue("Address Exists");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddAction();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVariableDropdown();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectVariable3();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSecondTrueBoxButton();
                Thread.sleep(2000);
        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 006 - bre applied to address fail")
        @Description("verify user able to bre applied to address fail")
        @Test(priority =6,groups="smoke", description = "verify bre applied to address fail")
        public void bre_applied_to_address_fail() throws Exception {
                //TC-4 BRE Applied to Address-Fail.
                ProjectBREPageObj.DoubleClickOnFalse2();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFalseBoxButton2();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterActionValue("Address Doesn't Exists");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddAction();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVariableDropdown();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectVariable4();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFalseBoxButton2();
                Thread.sleep(2000);
        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 007 - bre applied to state pass")
        @Description("verify user able to bre applied to state pass")
        @Test(priority =7,groups="smoke", description = "verify bre applied to state pass")
        public void bre_applied_to_state_pass() throws Exception {
                //Adding Third Rule for State.
                //TC-5 BRE Applied to State = Pass.
                ProjectBREPageObj.ClickOnAddRulesButton();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnExpandThirdRule();
                Thread.sleep(2000);
                //Add Condition.
                ProjectBREPageObj.EnterAddNameOfCondition("State");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddCondition();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAttributeValue();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectStateAttribute();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnOperator();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectOperatorValueEqualTo();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnFirstDecisionBox();
                //Add Action.
                ProjectBREPageObj.DoubleClickOnTrue3();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnThirdTrueBoxButton();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterActionValue("State Exists");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddAction();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVariableDropdown();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectVariable5();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnThirdTrueBoxButton();
                Thread.sleep(2000);
        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 008 - bre applied to state fail")
        @Description("verify user able to bre applied to state fail")
        @Test(priority =8,groups="smoke", description = "verify bre applied to state fail")
        public void bre_applied_to_state_fail() throws Exception {
                //TC-6 BRE Applied to State-Fail.
                ProjectBREPageObj.DoubleClickOnFalse3();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFalseBoxButton3();
                Thread.sleep(2000);
                ProjectBREPageObj.EnterActionValue("State Doesn't Exists");
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnAddAction();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnVariableDropdown();
                Thread.sleep(2000);
                ProjectBREPageObj.SelectVariable6();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnSave();
                Thread.sleep(2000);
                ProjectBREPageObj.ClickOnFalseBoxButton3();
                Thread.sleep(2000);
                //Add Create Method here to complete the flow before executing in TestNG.
                //Upload the Document in this Project for the Results.

        }
}