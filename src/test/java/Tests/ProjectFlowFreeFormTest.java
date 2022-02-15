package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowFreeFormTest extends BasePage {
        static  DocumentPage DocPageObj;
        static  ProjectPage ProjectPageObj;
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
    public void create_project_without_adding_attributes_and_role() throws Exception {
            Robot r = new Robot();
            ProjectPageObj = new ProjectPage(driver);
            DocPageObj = new DocumentPage(driver);
            //TC 15.1 Verify Create Project without adding the Attributes and Role.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(5000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("FreeFormProjectName1"));
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
            ProjectPageObj.SelectOnFreeFormStructure();
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
            ProjectPageObj.VerifyAssertForBlank();
            Thread.sleep(3000);
    }
        @Test(priority = 2)
        public void create_project_without_adding_role() throws Exception {
                //TC 15.2 Verify Create Project without adding the Role.
                ProjectPageObj.ClickOnAddFieldBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectFieldValue();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnCreate();
                ProjectPageObj.VerifyAssertForRole();
                Thread.sleep(2000);
        }
        @Test(priority = 3)
        public void create_project_without_adding_user() throws Exception {
                //TC 15.3 Verify Create Project without adding the User.
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnCreate();
                ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(2000);
        }
        @Test(priority = 4)
        public void verify_add_user() throws Exception {
                //TC 15.4 Verify Add User.
                ProjectPageObj.ClickOnAddUserBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectUserBtn();
                Thread.sleep(2000);
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
        }
        @Test(priority = 5)
        public void next_to_data() throws Exception {
                //TC 15.5 Navigate Next to Data Page and Rules Page and Back to Project Page.
                ProjectPageObj.ClickNextPage();
                Thread.sleep(2000);
                ProjectPageObj.ClickRulesPage();
                Thread.sleep(2000);
                ProjectPageObj.ClickBackRulePage();
                Thread.sleep(2000);
                ProjectPageObj.CLickBackDataPage();
                Thread.sleep(2000);
        }
        @Test(priority = 6)
        public void create_project_with_valid_details() throws Exception {
            //TC 15.6 Verify Create Project with Valid Details.
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(9000);
        }
}