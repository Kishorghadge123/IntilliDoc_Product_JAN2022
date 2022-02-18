package Tests;

import Base.BasePage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowMedicalChart extends BasePage {
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
    public void check_all_functionalities_on_project_page() throws Exception {
            Robot r = new Robot();
           ProjectPageObj = new ProjectPage(driver);
            //TC 16.1 Checking all the functionalities on the Project Page Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("MedicalChartProjectName1"));//change this name in Obj file.
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
            ProjectPageObj.SelectDocumentStructureMedicalBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
    }

        @Test(priority = 2)
        public void create_project_without_entities_and_role() throws Exception {
                //TC 16.2 Verify Create Project without Entities and Role.
                ProjectPageObj.ClickOnCreate();
                ProjectPageObj.VerifyAssertForEntities();
            Thread.sleep(2000);
        }
        @Test(priority = 3)
        public void create_project_with_entities_without_role() throws Exception {
                //TC 16.3 Verify Create Project with Entities and without Role
                ProjectPageObj.ClickOnAddEntity();
                Thread.sleep(3000);
                ProjectPageObj.SelectPatientGraphics();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnAddEntity();
                Thread.sleep(3000);
                ProjectPageObj.SelectChronicConditions();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnCreate();
                ProjectPageObj.VerifyAssertForRole();
            Thread.sleep(2000);
        }
        @Test(priority = 4)
        public void create_project_without_user() throws Exception {
                //TC 16.4 Verify Create Project without User.
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnCreate();
                ProjectPageObj.VerifyAssertForUser();
        }
        @Test(priority = 5)
        public void verify_add_user() throws Exception {
                //TC 16.5 Verify Add User.
                ProjectPageObj.ClickOnAddUserBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectUserBtn();
                Thread.sleep(2000);
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
        }
        @Test(priority = 6)
        public void navigate_next_to_datapage_back_page() throws Exception {
                //16.6 Navigate Next to Data Page and Rules Page and Back also.
                ProjectPageObj.ClickNextPage();
                Thread.sleep(2000);
                ProjectPageObj.ClickRulesPage();
                Thread.sleep(2000);
                ProjectPageObj.ClickBackRulePage();
                Thread.sleep(2000);
                ProjectPageObj.CLickBackDataPage();
                Thread.sleep(2000);
        }
        @Test(priority = 7)
        public void create_project_with_valid_details() throws Exception {
            //TC 16.7 Verify Create Project with Valid Details.
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(9000);
    }
}