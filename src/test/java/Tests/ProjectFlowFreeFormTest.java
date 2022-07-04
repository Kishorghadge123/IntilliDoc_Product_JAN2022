package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Project Flow Free Form Test")
@Listeners(Utilities.TestListeners.class)

public class ProjectFlowFreeFormTest extends BasePage {
        static  DocumentPage DocPageObj;
        static  ProjectPage ProjectPageObj;

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
    @Story("story_id: 001  - create_project_without_adding_attributes_and_role")
    @Description("verify user able to create_project_without_adding_attributes_and_role")
    @Test (priority=1,groups="smoke", description = "verify create_project_without_adding_attributes_and_role")
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnStartDateBtn();
            ProjectPageObj.SelectStartDateBtn();
            ProjectPageObj.ClickOnEndDate();
            ProjectPageObj.SelectEndDate();
            ProjectPageObj.ClickOnDocumentStructureBtn();
            ProjectPageObj.SelectOnFreeFormStructure();
            Thread.sleep(1000);
            ProjectPageObj.ClickOnStatusBtn();
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            ProjectPageObj.clickoncreatebtn();
            ProjectPageObj.VerifyAssertForBlank();
            Thread.sleep(3000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - create_project_without_adding_user")
    @Description("verify user able to create_project_without_adding_user")
    @Test (priority=2,groups="smoke", description = "verify create_project_without_adding_user")

    public void create_project_without_adding_role() throws Exception {
                //TC 15.2 Verify Create Project without adding the Role.
                ProjectPageObj.ClickOnAddFieldBtn();
                Thread.sleep(1000);
                ProjectPageObj.SelectFieldValue();
                Thread.sleep(1000);
            ProjectPageObj.selectdropdown();
    Thread.sleep(2000);
                ProjectPageObj.clickoncreatebtn();
                ProjectPageObj.VerifyAssertForRole();
                Thread.sleep(2000);
        }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  - create_project_with_valid_details")
    @Description("verify user able to create_project_with_valid_details")
    @Test (priority=3,groups="smoke", description = "verify create_project_with_valid_details")

    public void create_project_without_adding_user() throws Exception {
                //TC 15.3 Verify Create Project without adding the User.
                ProjectPageObj.ClickOnRolesBtn();
                ProjectPageObj.ClickOnAddRoleBtn();
                ProjectPageObj.ClickOnSelectRoleBtn();
                Thread.sleep(1000);
                ProjectPageObj.clickoncreatebtn();
            Thread.sleep(2000);
            ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(2000);
        }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - verify_add_user")
    @Description("verify user able to verify_add_user")
    @Test (priority=4,groups="smoke", description = " verify_add_user")

    public void verify_add_user() throws Exception {
                //TC 15.4 Verify Add User.
                ProjectPageObj.ClickOnAddUserBtn();
                ProjectPageObj.ClickOnSelectUserBtn();
                Thread.sleep(1000);
            Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
        }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - next_to_data")
    @Description("verify user able to next_to_data")
    @Test (priority=5,groups="smoke", description = "verify next_to_data")


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


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006  - create_project_with_valid_details")
    @Description("verify user able to create_project_with_valid_details")
    @Test (priority=6,groups="smoke", description = "verify create_project_with_valid_details")


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

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 - verify_free_form_project")
    @Description("verify user able to verify_free_form_project")
    @Test (priority=7,groups="smoke", description = "verify_free_form_project")

    public void verify_free_form_project() throws Exception{
        //IN558 Introduction of mandatory fields for the attributes
    DocPageObj.ClickDocumentBtn();
    Thread.sleep(3000);
    DocPageObj.ClickDropDownBtn();
    Thread.sleep(1000);
//Search Medical Chart Project.
    DocPageObj.ClickSearchProject(ReadProps.readAttr("FREEFORMPROJ"));
    Thread.sleep(1000);
    DocPageObj.selectfreeformproject();
    Thread.sleep(1000);
    DocPageObj.clickonfreereadyDocument();
    Thread.sleep(2000);
    DocPageObj.clickonchartdata();
    AssertionsFunction.isPresent(DocPageObj.chartdata);
    Thread.sleep(100);
}


}