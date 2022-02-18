package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
@Listeners(Utilities.TestListeners.class)
public class ProjectBRETest1 extends BasePage {
    static  ProjectPage ProjectPageObj;
    static  ProjectBREPage ProjectBREPageObj;
    static  DocumentPage DocPageObj;
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
        Robot r = new Robot();
        //Object Creation.
        ProjectPageObj = new ProjectPage(driver);
        ProjectBREPageObj = new ProjectBREPage(driver);
        DocPageObj = new DocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
        Thread.sleep(2000);
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(5000);
        //Navigate to Data Page.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(5000);
        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnAddRulesButton();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnExpandFirstRule();
        Thread.sleep(2000);
        //Add Condition.
        ProjectBREPageObj.EnterAddNameOfCondition("Patient Name");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAddCondition();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAddBREEntity();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAddBREEntityPD();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAttributeValue();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectPatientNameAttribute();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnOperator();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectOperatorValueEqualTo();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterValue(ReadProps.readAttr("OperatorValue"));
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFirstDecisionBox();
        Thread.sleep(2000);
        //Add Action.
        ProjectBREPageObj.DoubleClickOnTrue1();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterActionValue("Replace Name");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAddAction();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnVariableDropdown();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnActionType();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectReplaceStringBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectEntityBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectPatientGraphicsBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnAttributeBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectPatientNameAttributesBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnOperatorDropdownBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectReplaceFirstBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnWithValue();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterWithValue("Smith");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnReplaceValue();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterReplaceValue("Taylor");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnCaseSensitivityBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnCaseSensitivityBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnUpdateProject();
        Thread.sleep(10000);
    }
    @Test(priority = 2)
    public void verify_replace_first() throws Exception {
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(7000);
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
        DocPageObj.ClickSearchProject(ReadProps.readAttr("ProjectBRE"));
        Thread.sleep(2000);
        DocPageObj.ClickSelectBREProject();
        Thread.sleep(3000);
        DocPageObj.ClickViewDocIcon6();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        DocPageObj.ClickOnPatientNameValueBtn();
        Thread.sleep(2000);
        DocPageObj.ClickOnClearPatientNameValueBtn();
        Thread.sleep(2000);
        DocPageObj.EnterNewPatientNameValueBtn("Smith Raymond");
        Thread.sleep(2000);
        DocPageObj.ClickOnClassificationNameBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnRunRuleBtn();
        Thread.sleep(8000);
        DocPageObj.ClickOnPatientNameBtn();
        Thread.sleep(2000);
        DocPageObj.ClickCancelDoc2();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(10000);
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
        Thread.sleep(2000);
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(5000);
        //Navigate to Data Page.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(5000);
        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectReplaceFirstBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.SelectReplaceAllBtn();
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnWithValue();
        Thread.sleep(2000);
        ProjectBREPageObj.ClearWithValue();
        Thread.sleep(2000);
        ProjectBREPageObj.EnterWithValue("Smith Raymond");
        Thread.sleep(2000);
        ProjectBREPageObj.ClickOnSave();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnUpdateProject();
        Thread.sleep(10000);
    }
    @Test(priority = 3)
    public void verify_replace_all() throws Exception {
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(8000);
        DocPageObj.ClickViewDocIcon6();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        DocPageObj.ClickOnPatientNameValueBtn();
        Thread.sleep(2000);
        DocPageObj.ClickOnClearPatientNameValueBtn();
        Thread.sleep(2000);
        DocPageObj.EnterNewPatientNameValueBtn("Smith Raymond");
        Thread.sleep(2000);
        DocPageObj.ClickOnClassificationNameBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnRunRuleBtn();
        Thread.sleep(6000);
        DocPageObj.ClickOnPatientNameBtn();
        Thread.sleep(2000);
        DocPageObj.ClickCancelDoc2();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(10000);
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
        Thread.sleep(2000);
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(5000);
        //Navigate to Data Page.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(5000);
        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
    }
        @Test(priority = 4)
        public void delete_created_rule() throws Exception {
        DocPageObj.ClickOnDeleteRule1Condition1();
        Thread.sleep(2000);
        DocPageObj.ClickOnCNFRule1Condition1();
        Thread.sleep(2000);
        DocPageObj.ClickOnDeleteFirstRuleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnUpdateProject();
        Thread.sleep(10000);
    }}