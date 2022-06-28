package Tests;
import Base.BasePage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import  Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
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
    public void cleanUp() throws Exception
    {
        driver.quit();
    }
    @Test(priority = 1)
    public void create_project_with_blank_data() throws Exception {
        Robot r = new Robot();
        ProjectPageObj = new ProjectPage(driver);
        //TC 18.1 Create new project with Blank information and also Verify 'Create' button for Platform Admin.
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(1000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
        ProjectPageObj.clickoncancel();
        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void next_button_with_blank_info_for_platform_admin() throws Exception {
        //TC 18.2 Verify Next button with Blank information for Platform Admin.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        ProjectPageObj.ClickNextPage();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);
        ProjectPageObj.clickoncancel();
        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void cancel_with_blank_info() throws Exception {
        //TC 18.3 Verify Cancel button with Blank information for Platform Admin.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
        ProjectPageObj.clickoncancel();
        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
        Thread.sleep(1000);

    }
    @Test(priority = 4)
    public void create_project_with_invalid_name() throws Exception {
        //TC 18.4 Create project with Invalid Project Name for Platform Admin , And Verify Disable Role should not be displayed in the Role List when adding Role.
      //TC
        ProjectPageObj.ClickRoleManagementBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
        Thread.sleep(3000);
        ProjectPageObj.ClickEditRole();
        Thread.sleep(2000);
        ProjectPageObj.ClickActiveRole();
        ProjectPageObj.ClickUpdateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        ProjectPageObj.ClickOnAddTemplateBtn();
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(1000);
        ProjectPageObj.VerifyAssertForData();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        ProjectPageObj.ClickRoleManagementBtn();
        Thread.sleep(4000);
        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
        Thread.sleep(4000);
        ProjectPageObj.ClickEditRole();
        Thread.sleep(3000);
        ProjectPageObj.ClickActiveRole();
        ProjectPageObj.ClickUpdateBtn();
        Thread.sleep(2000);
        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
      //  AssertionsFunction.verifyTargetPageURL(ProjectPageObj.roleurl);
        Thread.sleep(2000);

    }

    @Test(priority = 5)
    public void create_project_without_template() throws Exception {
        //TC 18.5  Create project with Project information without Template for Platform Admin.

        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName1"));//Change this
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        js.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(3000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(ProjectPageObj.create);


    }
    @Test(priority = 6)
    public void create_project_without_role() throws Exception {
        //TC 18.6 Create project without Role for Platform Admin.And not selecting the Process Engine
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(ProjectPageObj.create);

    }
    @Test(priority = 7)
    public void create_project_without_user_and_with_valid_data() throws Exception {
        //TC 18.7 Create Project without User for Platform Admin and
        //TC 18.8 Create Project with Valid Data.
        ProjectPageObj.ClickOnRolesBtn();
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);



    }
    @Test(priority = 8)
    public void create_project_with_disable_status() throws Exception {
        //TC 18.9 Create Project with Disable Status for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameFA"));//change this name in Obj file.
        Thread.sleep(2000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
        js.executeScript("window.scrollBy(0,10000)", "");
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(3000);

    }
    @Test(priority = 9)
    public void create_project_only_with_role_info() throws Exception {
        //TC 18.10  Create Project only with Role information for Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnRolesBtn();
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
        ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);
        ProjectPageObj.ClickLogout();
        Thread.sleep(3000);
        //AssertionsFunction.verifyTargetPageURL(ProjectPageObj.loginurl);
        Thread.sleep(1000);
    }
    @Test(priority = 10)
    public void create_project_with_blank_info() throws Exception {
        //TC 18.11 Create New Project with Blank information and also verify Create button for Admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        ProjectPageObj.ClickLoginButton();
 Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
 ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
        /*ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);*/
    }
    @Test(priority = 11)
    public void verify_next_button_with_blank_info() throws Exception {
        //TC 18.12 Verify Next button with Blank information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickNextPage();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void verify_cancel_with_blank_info() throws Exception {
        //TC 18.13 Verify Cancel button with Blank Information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.clickoncancel();
        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
        Thread.sleep(1000);
    }
    @Test(priority = 13)
    public void create_project_with_invalid_project_name() throws Exception {
        //TC 18.14 Create Project with Invalid Project Name for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddUserBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
    }
    @Test(priority = 14)
    public void create_project_without_template_for_admin() throws Exception {
        //TC 18.15 Create project with Project information without Template for Admin.

        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName"));
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnStatusBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        js.executeScript("window.scrollBy(0,10000)", "");
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);

    }
    @Test(priority = 15)
    public void create_project_without_role_for_admin() throws Exception {
        //TC 18.16 Create project without Role for Admin.
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,10000)", "");
        ProjectPageObj.clickoncreatebtn();

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(5000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);


    }
    @Test(priority = 17)
    public void create_project_with_disable_status_for_admin() throws Exception {
        //TC 18.18 Create Project with Disable Status for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
        Thread.sleep(2000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(6000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
        Thread.sleep(1000);

    }
    @Test(priority = 18)
    public void create_project_only_with_role_info_for_admin() throws Exception {
        //TC 18.19  Create Project only with Role information for Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnRolesBtn();
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
       /* ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickLogout();
        Thread.sleep(4000);
       // AssertionsFunction.verifyTargetPageURL(ProjectPageObj.loginurl);

    }

    @Test(priority = 19)
    public void create_project_with_valid_data() throws Exception {
        //TC 18.20 Create Project with Disable Status for Admin.//1covered
   //TC18.25     To verfiy create project using select option Straight through Process = TRUE
        //TC 18.28 To verfiy create project using select option Straight through Process = True and Document Score = 0-100
       // TC 18.27To verfiy create project using select option Document Strucuture = Structured
        Robot r = new Robot();
    ProjectPageObj = new ProjectPage(driver);
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        ProjectPageObj.ClickLoginButton();
        Custome_Wait.wait(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
        Thread.sleep(2000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(6000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);

        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)", "");
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnRolesBtn();
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);

        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(2000);
       /* ProjectPageObj.VerifyAssertForBlank();
        Thread.sleep(2000);*/
        ProjectPageObj.ClickLogout();
        Thread.sleep(4000);
    }
//
//
    @Test(priority = 20)
    public void create_project_with_disable_straigth_through_process() throws Exception {
        //TC 18.18 Create Project with Disable Status for Admin.//1covered
        //TC18.26 To verfiy create project using select option Straight through Process = False




Robot r=new Robot();


        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        ProjectPageObj.ClickLoginButton();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        Thread.sleep(3000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
        Thread.sleep(2000);
        ProjectPageObj.ClickOnLeadBtn();
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        ProjectPageObj.SelectDocumentStructureBtn();
        ProjectPageObj.ClickOnProcessingEngineBtn();
        ProjectPageObj.SelectOnProcessingEngineBtn();
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnTemplateBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddRoleBtn();
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        ProjectPageObj.clickoncreatebtn();
        Thread.sleep(6000);
AssertionsFunction.isPresent(ProjectPageObj.createbtutton);

    }

}