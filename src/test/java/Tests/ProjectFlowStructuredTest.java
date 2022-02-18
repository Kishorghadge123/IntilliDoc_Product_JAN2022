package Tests;
import Base.BasePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowStructuredTest extends BasePage {
    static ProjectPage ProjectPageObj;
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
        ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
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
        Thread.sleep(2000);
    }
    @Test(priority = 3)
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
    }
    @Test(priority = 4)
    public void create_project_with_invalid_name() throws Exception {
        //TC 18.4 Create project with Invalid Project Name for Platform Admin , And Verify Disable Role should not be displayed in the Role List when adding Role.
        ProjectPageObj.ClickRoleManagementBtn();
        Thread.sleep(6000);
        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
        Thread.sleep(4000);
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
        ProjectPageObj.VerifyAssertForData();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(4000);
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

   @Test(priority = 5)
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
     @Test(priority = 6)
    public void create_project_without_role() throws Exception {
        //TC 18.6 Create project without Role for Platform Admin.And not selecting the Process Engine
         ProjectPageObj.ClickOnAddTemplateBtn();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnTemplateBtn();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnCreate();
         ProjectPageObj.VerifyAssertForData();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnProcessingEngineBtn();
         Thread.sleep(2000);
         ProjectPageObj.SelectOnProcessingEngineBtn();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnStraightThroughProcessBtn();
         Thread.sleep(2000);
         ProjectPageObj.ClickOnCreate();
         ProjectPageObj.VerifyAssertForRole();
         Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void create_project_without_user_and_with_valid_data() throws Exception {
        //TC 18.7 Create Project without User for Platform Admin and
        //TC 18.8 Create Project with Valid Data.
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForUser();
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
    @Test(priority = 8)
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
    @Test(priority = 9)
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
        ProjectPageObj.ClickLogout();
        Thread.sleep(10000);
    }
    @Test(priority = 10)
    public void create_project_with_blank_info() throws Exception {
        //TC 18.11 Create New Project with Blank information and also verify Create button for Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        Thread.sleep(2000);
        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        Thread.sleep(2000);
        ProjectPageObj.ClickLoginButton();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);
    }
    @Test(priority = 11)
    public void verify_next_button_with_blank_info() throws Exception {
        //TC 18.12 Verify Next button with Blank information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickNextPage();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void verify_cancel_with_blank_info() throws Exception {
        //TC 18.13 Verify Cancel button with Blank Information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCancelProject();
        Thread.sleep(5000);
    }
    @Test(priority = 13)
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
        Thread.sleep(3000);
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForData();
        Thread.sleep(2000);
    }
    @Test(priority = 14)
    public void create_project_without_template_for_admin() throws Exception {
        //TC 18.15 Create project with Project information without Template for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName"));
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
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(200);
        ProjectPageObj.VerifyAssertForNoTemplate();
        Thread.sleep(4000);
    }
    @Test(priority = 15)
    public void create_project_without_role_for_admin() throws Exception {
        //TC 18.16 Create project without Role for Admin.
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        ProjectPageObj.VerifyAssertForRole();
        Thread.sleep(2000);
    }
    @Test(priority = 16)
    public void create_project_without_user_for_admin() throws Exception {
        //TC 18.17 Create project without User for Admin.
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForUser();
        Thread.sleep(2000);
    }
    @Test(priority = 17)
    public void create_project_with_disable_status_for_admin() throws Exception {
        //TC 18.18 Create Project with Disable Status for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(6000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
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
        Thread.sleep(6000);
    }
    @Test(priority = 18)
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
        ProjectPageObj.ClickLogout();
        Thread.sleep(8000);
    }
    @Test(priority = 19)
    public void table_structure() throws Exception {
        //TC 18.20 Table Structure.
        LoginPage loginPageObjects = new LoginPage(driver);
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        Thread.sleep(1000);
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        Thread.sleep(1000);
        loginPageObjects.clickLoginButton();
        Thread.sleep(8000);
        ProjectPageObj.TableStructure();
        Thread.sleep(6000);
    }
    @Test(priority = 20)
    public void items_per_page() throws Exception {
        //TC 18.21 Verify Items per Page.
        ProjectPageObj.ClickItemsPerPage();
        Thread.sleep(2000);
        ProjectPageObj.SelectItemsPerPage();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
    }
}