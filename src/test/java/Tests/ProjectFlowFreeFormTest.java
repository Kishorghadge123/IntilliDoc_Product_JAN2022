package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
//    @AfterClass
//    public void cleanUp() throws Exception
//    {
//
//    driver.quit();
//    }
    @Test(priority = 1)
    public void create_project_without_adding_attributes_and_role() throws Exception {
            Robot r = new Robot();
            ProjectPageObj = new ProjectPage(driver);
            DocPageObj = new DocumentPage(driver);
            //TC 15.1 Verify Create Project without adding the Attributes and Role.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("FreeFormProjectName1"));
            ProjectPageObj.ClickOnLeadBtn();
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStartDateBtn();
            ProjectPageObj.SelectStartDateBtn();
            ProjectPageObj.ClickOnEndDate();
            ProjectPageObj.SelectEndDate();
            ProjectPageObj.ClickOnDocumentStructureBtn();
            ProjectPageObj.SelectOnFreeFormStructure();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            ProjectPageObj.clickoncreatebtn();
            ProjectPageObj.VerifyAssertForBlank();
            Thread.sleep(3000);
    }



        @Test(priority = 3)
        public void create_project_without_adding_role() throws Exception {
                //TC 15.2 Verify Create Project without adding the Role.
                ProjectPageObj.ClickOnAddFieldBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectFieldValue();
                Thread.sleep(2000);
            ProjectPageObj.selectdropdown();
    Thread.sleep(2000);
                ProjectPageObj.clickoncreatebtn();
                ProjectPageObj.VerifyAssertForRole();
                Thread.sleep(2000);
        }


        @Test(priority = 4)
        public void create_project_without_adding_user() throws Exception {
                //TC 15.3 Verify Create Project without adding the User.
                ProjectPageObj.ClickOnRolesBtn();
                ProjectPageObj.ClickOnAddRoleBtn();
                ProjectPageObj.ClickOnSelectRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.clickoncreatebtn();
            Thread.sleep(2000);
            ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(2000);
        }
        @Test(priority = 5)
        public void verify_add_user() throws Exception {
                //TC 15.4 Verify Add User.
                ProjectPageObj.ClickOnAddUserBtn();
                ProjectPageObj.ClickOnSelectUserBtn();
                Thread.sleep(2000);
            Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
        }
        @Test(priority = 6)
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
        @Test(priority = 7)
        public void create_project_with_valid_details() throws Exception {
            //TC 15.6 Verify Create Project with Valid Details.
            ProjectPageObj.clickoncreatebtn();
           Thread.sleep(2000);
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-2000)", "");
            Thread.sleep(3000);
            ProjectPageObj.TableStructure();
            Thread.sleep(2000);
            ProjectPageObj.verifyProjectCreated("FreeFormProject");
            Thread.sleep(2000);
        }

@Test(priority = 8)
    public void verify_free_form_project() throws Exception{
        //IN558 Introduction of mandatory fields for the attributes
    DocPageObj.ClickDocumentBtn();
    Thread.sleep(20000);
    DocPageObj.ClickDropDownBtn();
    Thread.sleep(2000);
//Search Medical Chart Project.
    DocPageObj.ClickSearchProject(ReadProps.readAttr("FREEFORMPROJ"));
    Thread.sleep(2000);
    DocPageObj.selectfreeformproject();
    Thread.sleep(2000);
    DocPageObj.clickonfreereadyDocument();
    Thread.sleep(2000);
    DocPageObj.clickonchartdata();
    AssertionsFunction.isPresent(DocPageObj.chartdata);
    Thread.sleep(100);
}


}