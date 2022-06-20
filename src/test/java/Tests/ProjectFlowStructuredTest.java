package Tests;
import Base.BasePage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Project Flow Structured Test")
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowStructuredTest extends BasePage {
    static ProjectPage ProjectPageObj;
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
    @Story("story_id: 001  - create_project_with_blank_data")
    @Description("verify user able to create_project_with_blank_data")
    @Test (priority=1,groups="smoke", description = "verify create_project_with_blank_data")
    public void create_project_with_blank_data() throws Exception {
        Robot r = new Robot();
        ProjectPageObj = new ProjectPage(driver);
        //TC 18.1 Create new project with Blank information and also Verify 'Create' button for Platform Admin.
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(500);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - next_button_with_blank_info_for_platform_admin")
    @Description("verify user able to click next_button_with_blank_info_for_platform_admin")
    @Test (priority=2,groups="smoke", description = "verify next_button_with_blank_info_for_platform_admin")
    public void next_button_with_blank_info_for_platform_admin() throws Exception {
        //TC 18.2 Verify Next button with Blank information for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(9000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        ProjectPageObj.ClickNextPage();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  - cancel_with_blank_info")
    @Description("verify user able to cancel_with_blank_info")
    @Test (priority=3,groups="smoke", description = "verify cancel_with_blank_info")
    public void cancel_with_blank_info() throws Exception {
        //TC 18.3 Verify Cancel button with Blank information for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCancelProject();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL (ProjectPageObj.ProjectPageURl);
        Thread.sleep(2000);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - create_project_with_invalid_name")
    @Description("verify user able to create_project_with_invalid_name")
    @Test (priority=4,groups="smoke", description = "verify create_project_with_invalid_name")
    public void create_project_with_invalid_name() throws Exception {
        //TC 18.4 Create project with Invalid Project Name for Platform Admin , And Verify Disable Role should not be displayed in the Role List when adding Role.
        ProjectPageObj.ClickRoleManagementBtn();
        Thread.sleep(6000);
        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
        Thread.sleep(6000);
        ProjectPageObj.ClickEditRole();
        Thread.sleep(4000);
        ProjectPageObj.ClickActiveRole();
        Thread.sleep(4000);
        ProjectPageObj.ClickUpdateBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectStartDateBtn();
        Thread.sleep(4000);
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
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForData();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(7000);
        ProjectPageObj.ClickRoleManagementBtn();
        Thread.sleep(4000);
        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
        Thread.sleep(4000);
        ProjectPageObj.ClickEditRole();
        Thread.sleep(4000);
        ProjectPageObj.ClickActiveRole();
        Thread.sleep(4000);
        ProjectPageObj.ClickUpdateBtn();
        Thread.sleep(4000);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005 - create_project_without_template")
    @Description("verify user able to create_project_without_template")
    @Test (priority=5,groups="smoke", description = "verify create_project_without_template")
    public void create_project_without_template() throws Exception {
        //TC 18.5  Create project with Project information without Template for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName1"));//Change this
        Thread.sleep(1000);
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
        ProjectPageObj.SelectDocumentStructureBtn();
        Thread.sleep(2000);
       AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectStructure);
       Thread.sleep(1000);
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForNoTemplate();
        Thread.sleep(4000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - create_project_without_role")
    @Description("verify user able to create_project_without_role")
    @Test (priority=6,groups="smoke", description = "verify create_project_without_role")
    public void create_project_without_role() throws Exception {
        //TC 18.6 Create project without Role for Platform Admin.And not selecting the Process Engine
         ProjectPageObj.ClickOnAddTemplateBtn();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnTemplateBtn();
         Thread.sleep(2000);
         AssertionsFunction.verifyElementText("PE_TEMPLATE",ProjectPage.TemplateSelected);
         Thread.sleep(1000);
         ProjectPageObj.ClickOnCreate();
         Thread.sleep(2000);

         /*ProjectPageObj.ClickOnProcessingEngineBtn();
         Thread.sleep(2000);
         ProjectPageObj.SelectOnProcessingEngineBtn();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnStraightThroughProcessBtn();
         Thread.sleep(2000);
         AssertionsFunction.verifyElementSelected(ProjectPage.StraightThroughProcess);
         Thread.sleep(1000);*/
         ProjectPageObj.ClickOnCreate();
         Thread.sleep(1000);
         //ProjectPageObj.VerifyAssertForRole();
         Thread.sleep(2000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 - create_project_without_user_and_with_valid_data")
    @Description("verify user able to create_project_without_user_and_with_valid_data")
    @Test (priority=7,groups="smoke", description = "verify create_project_without_user_and_with_valid_data")
    public void create_project_without_user_and_with_valid_data() throws Exception {
        //TC 18.7 Create Project without User for Platform Admin and
        //TC 18.8 Create Project with Valid Data.
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
      // AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectedRoleAdmin);
       Thread.sleep(1000);
       ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
       /* ProjectPageObj.VerifyAssertForUser();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickOnAddUserBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
       //AssertionsFunction.verifyElementSelected(ProjectPageObj.SelectUserAdmin);
       Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(10000);
       /* ProjectPageObj.TableStructure();
       Thread.sleep(10000);
       ProjectPageObj.verifyProjectCreated("StructuredProject");
       Thread.sleep(1000);*/

   }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008 - create_project_with_disable_status")
    @Description("verify user able to create_project_with_disable_status")
    @Test (priority=8,groups="smoke", description = "verify create_project_with_disable_status")
    public void create_project_with_disable_status() throws Exception {
        //TC 18.9 Create Project with Disable Status for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameFA"));//change this name in Obj file.
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
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(9000);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009 - create_project_only_with_role_info")
    @Description("verify user able to create_project_only_with_role_info")
    @Test (priority=9,groups="smoke", description = "verify create_project_only_with_role_info")
    public void create_project_only_with_role_info() throws Exception {
        //TC 18.10  Create Project only with Role information for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
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
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
        ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);
        ProjectPageObj.ClickLogout();
        Thread.sleep(10000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010 - create_project_with_blank_info")
    @Description("verify user able to create_project_with_blank_info")
    @Test (priority=10,groups="smoke", description = "verify create_project_with_blank_info")
    public void create_project_with_blank_info() throws Exception {
        //TC 18.11 Create New Project with Blank information and also verify Create button for Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        Thread.sleep(2000);
        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        Thread.sleep(2000);
        ProjectPageObj.ClickLoginButton();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
        /*ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);*/
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 011 - verify_next_button_with_blank_info")
    @Description("verify user able to verify_next_button_with_blank_info")
    @Test (priority=11,groups="smoke", description = "verify next_button_with_blank_info")
    public void verify_next_button_with_blank_info() throws Exception {
        //TC 18.12 Verify Next button with Blank information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickNextPage();
        Thread.sleep(2000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012 - verify_cancel_with_blank_info")
    @Description("verify user able to verify_cancel_with_blank_info")
    @Test (priority=12,groups="smoke", description = "verify _cancel_with_blank_info")
    public void verify_cancel_with_blank_info() throws Exception {
        //TC 18.13 Verify Cancel button with Blank Information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCancelProject();
        Thread.sleep(5000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013 - create_project_with_invalid_project_name")
    @Description("verify user able to create_project_with_invalid_project_name")
    @Test (priority=13,groups="smoke", description = "verify create_project_with_invalid_project_name")
    public void create_project_with_invalid_project_name() throws Exception {
        //TC 18.14 Create Project with Invalid Project Name for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
        Thread.sleep(1000);
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
       /* ProjectPageObj.ClickOnProcessingEngineBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnProcessingEngineBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
       /* ProjectPageObj.VerifyAssertForData();*/
        Thread.sleep(6000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 014 - create_project_without_template_for_admin")
    @Description("verify user able to create_project_without_template_for_admin")
    @Test (priority=14,groups="smoke", description = "verify create_project_without_template_for_admin")
    public void create_project_without_template_for_admin() throws Exception {
        //TC 18.15 Create project with Project information without Template for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName"));
        Thread.sleep(1000);
        /*ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);*/
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
       /* ProjectPageObj.ClickOnProcessingEngineBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnProcessingEngineBtn();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(200);
        /*ProjectPageObj.VerifyAssertForNoTemplate();
        Thread.sleep(4000);*/
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 015 - create_project_without_role_for_admin")
    @Description("verify user able to create_project_without_role_for_admin")
    @Test (priority=15,groups="smoke", description = "verify create_project_without_role_for_admin")
    public void create_project_without_role_for_admin() throws Exception {
        //TC 18.16 Create project without Role for Admin.
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        /*ProjectPageObj.VerifyAssertForRole();
        Thread.sleep(2000);*/
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 016 - create_project_without_user_for_admin")
    @Description("verify user able to create_project_without_user_for_admin")
    @Test (priority=16,groups="smoke", description = "verify create_project_without_user_for_admin")
    public void create_project_without_user_for_admin() throws Exception {
        //TC 18.17 Create project without User for Admin.
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(5000);


    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 017 - create_project_with_disable_status_for_admin")
    @Description("verify user able to create_project_with_disable_status_for_admin")
    @Test (priority=17,groups="smoke", description = "verify create_project_with_disable_status_for_admin")
    public void create_project_with_disable_status_for_admin() throws Exception {
        //TC 18.18 Create Project with Disable Status for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
        Thread.sleep(2000);
      /*  ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);*/
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
        /*ProjectPageObj.ClickOnProcessingEngineBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectOnProcessingEngineBtn();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(6000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 018 - create_project_only_with_role_info_for_admin")
    @Description("verify user able to create_project_only_with_role_info_for_admin")
    @Test (priority=18,groups="smoke", description = "verify create_project_only_with_role_info_for_admin")
    public void create_project_only_with_role_info_for_admin() throws Exception {
        //TC 18.19  Create Project only with Role information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
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
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
       /* ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickLogout();
        Thread.sleep(2000);
    }

}