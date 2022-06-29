package Tests;
import Base.BasePage;
import Pages.*;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.print.Doc;
import java.awt.*;
@Listeners(Utilities.TestListeners.class)
public class BREForReplaceWithStringRule extends BasePage {
    static ProjectPage ProjectPageObj;
    static ProjectBREPage ProjectBREPageObj;
    static DocumentPage DocPageObj;
    static AnalyticsPage AnalyticsPageObj;
    static ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;

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
    public void bre_applied_to_patient_name() throws Exception {
// In 667Implementation of Document display page after the rules have been run
        Robot r = new Robot();
        //Object Creation.
        ProjectPageObj = new ProjectPage(driver);
        ProjectBREPageObj = new ProjectBREPage(driver);
        AnalyticsPageObj = new AnalyticsPage(driver);
        DocPageObj = new DocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
        Thread.sleep(4000);
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(8000);
        //Navigate to Data Page.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(5000);
        AssertionsFunction.verifyElementPresent(ProjectPage.DataPageDispaly);
        Thread.sleep(1000);

        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnAddRulesButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.RuleBoxDisplay);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnExpandFirstRule();
        AssertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBoxDisplay);
        Thread.sleep(1000);


        //Add Condition.
        ProjectBREPageObj.EnterAddNameOfCondition("Patient Name");
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.AddNameOfCondition);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddCondition();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBox);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddBREEntity();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.SelectPatientDemographics);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddBREEntityPD();
        AssertionsFunction.verifyElementText("PatientDemographics", ProjectBREPage.PDEntitySelected);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAttributeValue();
        ProjectBREPageObj.SelectPatientNameAttribute();
        AssertionsFunction.verifyElementText("Patient Name", ProjectBREPage.AttributeValue);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnOperator();
        ProjectBREPageObj.SelectOperatorValueEqualTo();
        AssertionsFunction.verifyElementText("==", ProjectBREPage.OperatorValueEqualTo);
        ProjectBREPageObj.EnterValue(ReadProps.readAttr("OperatorValue"));
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.ConditionSaved);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnFirstDecisionBox();

        //Add Action.
        ProjectBREPageObj.DoubleClickOnTrue1();
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        ProjectBREPageObj.EnterActionValue("Replace Name");
        ProjectBREPageObj.ClickOnAddAction();
        ProjectBREPageObj.ClickOnVariableDropdown();
        ProjectBREPageObj.ClickOnActionType();
        ProjectBREPageObj.SelectReplaceStringBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectEntityBtn();
        Thread.sleep(3000);
        ProjectBREPageObj.SelectPatientGraphicsBtn();
        Thread.sleep(3000);
        ProjectBREPageObj.DoubleClickOnTrue2();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSecondTrueBoxButton();
        ProjectBREPageObj.EnterActionValue("Replace name1");
        //  AssertionsFunction.verifyElementText("Replace Name",ProjectBREPage.ActionValue);
        ProjectBREPageObj.ClickOnAddAction();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnVariableDropdown();
        ProjectBREPageObj.ClickOnActionType();
        Thread.sleep(3000);
        ProjectBREPageObj.SelectReplaceStringBtn();
        AssertionsFunction.verifyElementText("Replace String", ProjectBREPage.ReplaceString);
        Thread.sleep(2000);
        ProjectBREPageObj.SelectEntityBtn();
        ProjectBREPageObj.SelectPatientGraphicsBtn();
        AssertionsFunction.isPresent(ProjectBREPageObj.PatientDemoGraphics);
        Thread.sleep(1000);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(20000);
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
//Search Medical Chart Project.
        DocPageObj.ClickSearchProject(ReadProps.readAttr("ruleproject"));
        Thread.sleep(2000);
DocPageObj.selectproject();
Thread.sleep(20000);
DocPageObj.clickonreadyDocument();
Thread.sleep(10000);
DocPageObj.clickonchartdata();
        AssertionsFunction.isPresent(DocPageObj.chartdata);
        Thread.sleep(7000);
        AnalyticsPageObj.ClickAnalyticsBtn();
       AssertionsFunction.isPresent(AnalyticsPageObj.AnalyticsBtn);
       Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void verify_replace_first() throws Exception {
        ///IN752 Ability to set document attributes from actions
        ProjectPageObj = new ProjectPage(driver);
        ProjectBREPageObj = new ProjectBREPage(driver);
        DocPageObj = new DocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(10000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
        Thread.sleep(4000);
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(8000);
        //Navigate to Data Page.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(5000);
        AssertionsFunction.verifyElementPresent(ProjectPage.DataPageDispaly);
        Thread.sleep(1000);

        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnAddRulesButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.RuleBoxDisplay);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnExpandFirstRule();
        AssertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBoxDisplay);
        Thread.sleep(1000);


        //Add Condition.
        ProjectBREPageObj.EnterAddNameOfCondition("Patient Name");
        Thread.sleep(1000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.AddNameOfCondition);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddCondition();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBox);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddBREEntity();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.SelectPatientDemographics);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAddBREEntityPD();
        AssertionsFunction.verifyElementText("PatientDemographics", ProjectBREPage.PDEntitySelected);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnAttributeValue();
        ProjectBREPageObj.SelectPatientNameAttribute();
        AssertionsFunction.verifyElementText("Patient Name", ProjectBREPage.AttributeValue);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnOperator();
        ProjectBREPageObj.SelectOperatorValueEqualTo();
        AssertionsFunction.verifyElementText("==", ProjectBREPage.OperatorValueEqualTo);
        ProjectBREPageObj.EnterValue(ReadProps.readAttr("OperatorValue"));
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.ConditionSaved);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnFirstDecisionBox();

        //Add Action.
        ProjectBREPageObj.DoubleClickOnTrue1();
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        ProjectBREPageObj.EnterActionValue("Replace Name");
        ProjectBREPageObj.ClickOnAddAction();
        ProjectBREPageObj.ClickOnVariableDropdown();
        ProjectBREPageObj.ClickOnActionType();
        ProjectBREPageObj.SelectReplaceStringBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectEntityBtn();
        Thread.sleep(3000);
        ProjectBREPageObj.SelectPatientGraphicsBtn();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(ProjectBREPageObj.PatientDemoGraphics);
        Thread.sleep(1000);


    }

    @Test(priority = 3)
    public void verify_replace_all() throws Exception {
        ///IN752 Ability to set document attributes from actions
        //
        ProjectPageObj = new ProjectPage(driver);
        ProjectBREPageObj = new ProjectBREPage(driver);
        DocPageObj = new DocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(8000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(10000);
        ProjectPageObj.ClickOnSearchBox("medical 524");
        Thread.sleep(2000);
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(5000);
        //Navigate to Data Page.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(5000);
        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(6000);
        AssertionsFunction.isPresent(ProjectBREPageObj.NextPageOnRulesPage);
Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void delete_created_rule() throws Exception {
        ProjectBREPageObj.ClickOnAddRulesButton();
        Thread.sleep(2000);
        AssertionsFunction.verifyElementPresent(ProjectBREPage.RuleBoxDisplay);
        Thread.sleep(1000);
        DocPageObj.ClickOnDeleteRule1Condition1();
        Thread.sleep(2000);
AssertionsFunction.isPresent(DocPageObj.DeleteRule1Condition1);
Thread.sleep(2000);
    }

}