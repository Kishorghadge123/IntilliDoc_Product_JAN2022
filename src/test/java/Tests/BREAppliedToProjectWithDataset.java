package Tests;
import Base.BasePage;
import Pages.ProjectBREDataSetPage;
import Pages.ProjectBREPage;
import io.qameta.allure.*;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import java.awt.event.KeyEvent;

@Feature("BREApplied To Project With Dataset")
@Listeners(Utilities.TestListeners.class)
public class BREAppliedToProjectWithDataset extends BasePage {

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
    @Story("story_id: 001 - bre applied to name using dataset fail")
    @Description("verify user able to bre applied to name using dataset fail")
    @Test(priority = 1,groups="smoke", description = "verify test bre applied to name using dataset fail")

    public void bre_applied_to_name_using_dataset_fail() throws Exception {
        ProjectPage ProjectPageObj = new ProjectPage(driver);
        //Object creation
        ProjectBREDataSetPage ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

        Robot r = new Robot();
        //TC-1.1 BRE Applied to NAME RULE Using DataSet = Fail.
        ProjectPageObj.ClickOnCreateProjectBtn();
        //Navigate to Project Page.
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
        Thread.sleep(4000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
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
        ProjectPageObj.ClickOnRolesBtn();
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnAddUserBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[1]")));
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(9000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1000)", "");
        ProjectPageObj.ClickNextPage();
        Thread.sleep(4000);
        //Navigate to Data Page.
        ProjectBREDataSetPageObj.ClickOnDataSets();
        AssertionsFunction.verifyElementPresent(ProjectBREDataSetPageObj.AddDataSet);
        ProjectBREDataSetPageObj.ClickOnAddDataSets();
        AssertionsFunction.verifyElementPresent(ProjectBREDataSetPageObj.DatasetNameList);
        ProjectBREDataSetPageObj.ClickOnChooseDataSet();
        Thread.sleep(2000);
        ProjectBREDataSetPageObj.SelectDataSet();
        Thread.sleep(2000);
        ProjectBREDataSetPageObj.SelectData();
        Thread.sleep(2000);
        ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
        //Navigate to Rules Page.
        ProjectBREPageObj.ClickOnNextPageButton();
        Thread.sleep(3000);
        ProjectBREPageObj.ClickOnThreeDotsButton();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Project DATA')]")));
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ExpandPanelOnRulePage);
        Thread.sleep(1000);
        ProjectBREPageObj.ClickOnProjectData();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//div[@class='py-1 pl-2'])[1]")));
        ProjectBREPageObj.ClickOnProjectData();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//div[@class='py-1 pl-2'])[1]")));

        // AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ScaleDownPanelOnRulePage);
        ProjectBREPageObj.ClickOnAddRulesButton();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'Rule-1')]")));
        //   ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
        ProjectBREPageObj.ClickOnDeleteRulesButton();
        //ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
        ProjectBREPageObj.ClickOnAddRulesButton();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'Rule-1')]")));
        ProjectBREPageObj.ClickOnExpandFirstRule();

        Custome_Wait.wait(driver,ProjectBREPage.ContractFirstRule);
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionBoxDisplay);
        AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionPanelDisplay);
        ProjectBREPageObj.ClickOnContractRuleButton();
        Custome_Wait.wait(driver,ProjectBREPage.Visibility);
        ProjectBREPageObj.ClickOnVisibility();
        Thread.sleep(2000);
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
        ProjectBREDataSetPageObj.SelectDataSetHeader();
        ProjectBREPageObj.ClickOnSave();
        // AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
        ProjectBREDataSetPageObj.ClickOnFirstDataSetBox();
        ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.FirstDecisionBox);
        //Document should be uploaded from backend to check the output.

    }
}
