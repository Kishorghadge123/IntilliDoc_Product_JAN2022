package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowSemiStructureTest extends BasePage{
        static  ProjectPage ProjectPageObj;
        static  DocumentPage DocPageObj;
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
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
    }
        @Test(priority = 2)
        public void check_delete_attribute() throws Exception {
                //TC 17.2 Checking Delete Attribute.
                ProjectPageObj.ClickOnDeleteAttributeFieldName();
                Thread.sleep(2000);
        }
        @Test(priority = 3)
        public void create_project_without_role() throws Exception {
                //TC 17.3 Verify Create Project without Role.
                ProjectPageObj.ClickOnStatusBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnDocumentAutoAssignBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnCreate();
                ProjectPageObj.VerifyAssertForRole();
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
        }
        @Test(priority = 4)
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
        @Test(priority = 5)
        public void verify_create_project() throws Exception {
            //TC 17.5 Verify Create Project.
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(9000);
        }
        }