package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Project Flow Semi Structure Test")
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowSemiStructureTest extends BasePage {
    static ProjectPage ProjectPageObj;
    static DocumentPage DocPageObj;
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
    @Story("story_id: 001  - check_all_the_functions_on_project_page")
    @Description("verify user able to check_all_the_functions_on_project_page")
    @Test (priority=1,groups="smoke", description = "verify check_all_the_functions_on_project_page")
    public void check_all_the_functions_on_project_page() throws Exception {
        Robot r = new Robot();
        ProjectPageObj = new ProjectPage(driver);
        DocPageObj = new DocumentPage(driver);
        //TC 17.1 Checking all the functionalities on the Project Page.
        Thread.sleep(2000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("SemiStructuredProjectName1"));
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
        ProjectPageObj.SelectOnSemiStructure();
        Thread.sleep(3000);
        AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectSemiStructure);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - check_delete_attribute")
    @Description("verify user able to check_delete_attribute")
    @Test (priority=2,groups="smoke", description = "verify check_delete_attribute")
    public void check_delete_attribute() throws Exception {
        //TC 17.2 Checking Delete Attribute.
        ProjectPageObj.ClickOnDeleteAttributeFieldName();
        Thread.sleep(3000);
        AssertionsFunction.verifyDeletedElementText("Invoice No",ProjectPageObj.DeletedInvoiceAttribute);
        Thread.sleep(1000);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  - create_project_without_role")
    @Description("verify user able to create_project_without_role")
    @Test (priority=3,groups="smoke", description = "verify create_project_without_role")
    public void create_project_without_role() throws Exception {
        //TC 17.3 Verify Create Project without Role.
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForRole();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
        ProjectPageObj.VerifyAssertForUser();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - navigate_to_data_page_and_Rules_page")
    @Description("verify user able to navigate_to_data_page_and_Rules_page")
    @Test (priority=4,groups="smoke", description = "verify navigate_to_data_page_and_Rules_page")
    public void navigate_to_data_page_and_Rules_page() throws Exception {
        //17.4 Navigate Next to Data Page and Rules Page and Back also.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(2000);
        ProjectPageObj.ClickRulesPage();
        Thread.sleep(2000);
        ProjectPageObj.ClickBackRulePage();
        Thread.sleep(2000);
        ProjectPageObj.CLickBackDataPage();
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - verify_create_project")
    @Description("verify user able to create_project")
    @Test (priority=5,groups="smoke", description = "verify_create_project")
    public void verify_create_project() throws Exception {
        //TC 17.5 Verify Create Project.
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(15000);
        ProjectPageObj.TableStructure();
        Thread.sleep(12000);
        ProjectPageObj.verifyProjectCreated("SemiStructuredProject");
        Thread.sleep(2000);
    }
}