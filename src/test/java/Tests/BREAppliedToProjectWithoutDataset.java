package Tests;
import Base.BasePage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import io.qameta.allure.*;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
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
        static ProjectPage ProjectPageObj;
        static ProjectBREPage ProjectBREPageObj;

        @Step("Login Test started")
        @BeforeClass
        public void login() throws Exception {
                BasePage.driverInit();
                BasePage.LoginTest();
        }

        @Step("Closed the Browser")
        @AfterClass
        public void cleanUp() throws Exception {
                driver.quit();
        }

        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 001 - enter Projec Paget Data")
        @Description("verify user able to enter Projec Paget Data")
        @Test(priority = 1 ,groups="smoke", description = "verify enter Projec Paget Data")

        public void enterProjecPagetData() throws Exception {
                Robot r = new Robot();
                ProjectPageObj = new ProjectPage(driver);
                ProjectBREPageObj=new ProjectBREPage(driver);
                //Object Creation.
                Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
                ProjectPageObj.ClickOnCreateProjectBtn();
                //Navigate to Project Page.
                ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
                Thread.sleep(6000);
                ProjectPageObj.ClickOnLeadBtn();
                ProjectPageObj.SelectOnLeadBtn();
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
                ProjectPageObj.ClickOnRolesBtn();
                Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Roles ')]")));
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnSelectRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddUserBtn();
                Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[1]")));
                ProjectPageObj.ClickOnSelectUserBtn();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,-1000)", "");
                Thread.sleep(2000);
                //Navigate to Data Page. Adding Variables for Name, Address, State.
                ProjectPageObj.ClickNextPage();
                AssertionsFunction.isPresent(ProjectPageObj.NextPage);



        }



        @Severity(SeverityLevel.NORMAL)
        @Story("story_id: 002 - enter Variable")
        @Description("verify user able to enter Variable")
        @Test (priority=2,groups="smoke", description = "verify enter Variable")
        public void enterVariable  ()  throws Exception
        {
                ProjectBREPageObj=new ProjectBREPage(driver);
                ProjectBREPageObj.ClickOnExpandVariables();
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.AddVariablesButton);
                ProjectBREPageObj.ClickOnAddVariables();
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.VariableAddWindow);
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName1"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnName();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue1"));
                ProjectBREPageObj.ClickOnAddButton();
                //Adding Second Variable for Name.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName2"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnName();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Third Variable for Address.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName3"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnAddress();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue2"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Fourth Variable for Address.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName4"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnAddress();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Fifth Variable for State.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName5"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnState();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue3"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Sixth Variable for State.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName6"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnState();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Seventh Variable for City.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName7"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnCity();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue4"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Eight Variable for City.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName8"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnCity();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Ninth Variable for ZIP.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName9"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnZIP();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue5"));
                ProjectBREPageObj.ClickOnAddButton();


                //Adding Tenth Variable for ZIP.
                ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName10"));
                ProjectBREPageObj.ClickOnValidationType();
                ProjectBREPageObj.ClickOnZIP();
                ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnAddButton();
                ProjectBREPageObj.ClickOnCancelButton();

                AssertionsFunction.verifyTargetPageURL(ProjectBREPageObj.ProjectPageURL);
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.VariableAddedTable);

        }


        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 003 - add And Delete Rules Button")
        @Description("verify user able to add And Delete Rules Button")
        @Test (priority = 3,groups="smoke", description = "verify add And Delete Rules Button")

        public void addAndDeleteRulesButton() throws Exception
        {
                ProjectBREPageObj=new ProjectBREPage(driver);

                ProjectPageObj = new ProjectPage(driver);
                //Navigate to Rules Page.
                ProjectBREPageObj.ClickOnNextPageButton();
                ProjectBREPageObj.ClickOnThreeDotsButton();
                ProjectBREPageObj.ClickOnProjectData();
                ProjectBREPageObj.ClickOnProjectData();
                ProjectBREPageObj.ClickOnDataSets();
                ProjectBREPageObj.ClickOnVariables();
                ProjectBREPageObj.ClickOnThreeDotsButton();
                ProjectBREPageObj.ClickOnAddRulesButton();
                ProjectBREPageObj.ClickOnDeleteRulesButton();


                //Adding First Rule for Name.
                //TC-1 BRE Applied to NAME-Pass.
                ProjectBREPageObj.ClickOnAddRulesButton();
                ProjectBREPageObj.ClickOnExpandFirstRule();
                ProjectBREPageObj.ClickOnContractRuleButton();
                ProjectBREPageObj.ClickOnVisibility();
                ProjectBREPageObj.DoubleClickOnRule1();
                ProjectBREPageObj.ClickOnRule();
                ProjectBREPageObj.ClickOnClearRule();
                ProjectBREPageObj.DoubleClickOnRule1Second();
                ProjectBREPageObj.ClickOnRule();
                ProjectBREPageObj.EnterRuleName("SampleRule1");


                //Add Condition.
                ProjectBREPageObj.EnterAddNameOfCondition("Name");
                ProjectBREPageObj.ClickOnAddCondition();
                ProjectBREPageObj.ClickOnAttributeValue();
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.AttributeList);
                ProjectBREPageObj.SelectNameAttribute();
                ProjectBREPageObj.ClickOnOperator();
                ProjectBREPageObj.SelectOperatorValueEqualTo();
                ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnSave();
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
                ProjectBREPageObj.ClickOnFirstDecisionBox();


                //Add Action.
                ProjectBREPageObj.DoubleClickOnTrue1();
                ProjectBREPageObj.ClickOnFirstTrueBoxButton();
                ProjectBREPageObj.EnterActionValue("Name Exists");
                ProjectBREPageObj.ClickOnAddAction();
                ProjectBREPageObj.ClickOnVariableDropdown();//unable to write dynamic xpath
                ProjectBREPageObj.SelectVariable1();
                ProjectBREPageObj.ClickOnSave();
                AssertionsFunction.isPresent(ProjectBREPageObj.Save);
                Thread.sleep(2000);

        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 004 - bre applied to name fail")
        @Description("verify user able to bre applied to name fail")
        @Test(priority =4,groups="smoke", description = "verify bre applied to name fail")

        public void bre_applied_to_name_fail() throws Exception {
                //TC-2 BRE Applied to NAME-Fail.
                ProjectBREPageObj=new ProjectBREPage(driver);
                ProjectBREPageObj.DoubleClickOnFalse();
                ProjectBREPageObj.ClickOnFalseBoxButton1();
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.FalseConditionBox);
                ProjectBREPageObj.EnterActionValue("Name Doesn't Exists");
                ProjectBREPageObj.ClickOnAddAction();
                ProjectBREPageObj.ClickOnVariableDropdown();
                ProjectBREPageObj.SelectVariable2();
                ProjectBREPageObj.ClickOnSave();
                AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
                ProjectBREPageObj.ClickOnFalseBoxButton1();
                AssertionsFunction.isPresent(ProjectBREPageObj.FalseBox);


        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 005 - brev applied to address pass")
        @Description("verify user able to brev applied to address pass")
        @Test(priority =5,groups="smoke", description = "verify brev applied to address pass")
        public void bre_applied_to_address_pass() throws Exception {
                //Adding Second Rule for Address.
                //TC-3 BRE Applied to Address = Pass.
                ProjectBREPageObj=new ProjectBREPage(driver);
                ProjectBREPageObj.ClickOnAddRulesButton();
                ProjectBREPageObj.ClickOnExpandSecondRule();

                //Add Condition.
                ProjectBREPageObj.EnterAddNameOfCondition("Address");
                ProjectBREPageObj.ClickOnAddCondition();
                ProjectBREPageObj.ClickOnAttributeValue();
                ProjectBREPageObj.SelectAddressAttribute();
                ProjectBREPageObj.ClickOnOperator();
                ProjectBREPageObj.SelectOperatorValueEqualTo();
                ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnFirstDecisionBox();
                //Add Action.
                ProjectBREPageObj.DoubleClickOnTrue2();

                ProjectBREPageObj.clicksecondbox();
                ProjectBREPageObj.EnterActionValue("Address Exists");
                ProjectBREPageObj.ClickOnAddAction();
                ProjectBREPageObj.ClickOnVariableDropdown();
                ProjectBREPageObj.SelectVariable3();
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnSecondTrueBoxButton();
                AssertionsFunction.isPresent(ProjectBREPageObj.TrueBox2);
                Thread.sleep(2000);

        }
        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 006 - bre applied to address fail")
        @Description("verify user able to bre applied to address fail")
        @Test(priority =6,groups="smoke", description = "verify bre applied to address fail")
        public void bre_applied_to_address_fail() throws Exception {
                //TC-4 BRE Applied to Address-Fail.
                ProjectBREPageObj.DoubleClickOnFalse2();
                ProjectBREPageObj.ClickOnFalseBoxButton2();
                ProjectBREPageObj.EnterActionValue("Address Doesn't Exists");
                ProjectBREPageObj.ClickOnAddAction();
                ProjectBREPageObj.ClickOnVariableDropdown();
                ProjectBREPageObj.SelectVariable4();
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnFalseBoxButton2();
AssertionsFunction.isPresent(ProjectBREPageObj.FalseBox2);
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
                ProjectBREPageObj.ClickOnExpandThirdRule();

                //Add Condition.
                ProjectBREPageObj.EnterAddNameOfCondition("State");

                ProjectBREPageObj.ClickOnAddCondition();

                ProjectBREPageObj.ClickOnAttributeValue();
                ProjectBREPageObj.SelectStateAttribute();

                ProjectBREPageObj.ClickOnOperator();

                ProjectBREPageObj.SelectOperatorValueEqualTo();
                ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnFirstDecisionBox();
                //Add Action.
                ProjectBREPageObj.DoubleClickOnTrue3();
                ProjectBREPageObj.ClickOnThirdTrueBoxButton();
                ProjectBREPageObj.EnterActionValue("State Exists");
                ProjectBREPageObj.ClickOnAddAction();
                ProjectBREPageObj.ClickOnVariableDropdown();
                ProjectBREPageObj.SelectVariable5();
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnThirdTrueBoxButton();
                AssertionsFunction.isPresent(ProjectBREPageObj.TrueBox3);
                Thread.sleep(2000);

        }

        @Severity(SeverityLevel.CRITICAL)
        @Story("story_id: 008 - bre applied to state fail")
        @Description("verify user able to bre applied to state fail")
        @Test(priority =8,groups="smoke", description = "verify bre applied to state fail")
        public void bre_applied_to_state_fail() throws Exception {
                //TC-6 BRE Applied to State-Fail.
                ProjectBREPageObj.DoubleClickOnFalse3();
                ProjectBREPageObj.ClickOnFalseBoxButton3();
                ProjectBREPageObj.EnterActionValue("State Doesn't Exists");
                ProjectBREPageObj.ClickOnAddAction();
                ProjectBREPageObj.ClickOnVariableDropdown();
                ProjectBREPageObj.SelectVariable6();
                ProjectBREPageObj.ClickOnSave();
                ProjectBREPageObj.ClickOnFalseBoxButton3();
                AssertionsFunction.isPresent(ProjectBREPageObj.FalseBox3);
                Thread.sleep(2000);

        }
}