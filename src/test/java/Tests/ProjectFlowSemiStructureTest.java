package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import io.qameta.allure.*;
import Pages.ProjectPage;
import Pages.TemplatePage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        //IN 808 For the semi structure documents, need to change how we are handling the rejected document,earlier we were showing only the list of the attributes, now we have select the model, on basis of that list of attributes will be displayedF
        ProjectPageObj.ClickOnProjectBtn();
    Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("SemiStructuredProjectName1"));
        ProjectPageObj.ClickOnLeadBtn();
      Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnStartDateBtn();
        ProjectPageObj.SelectStartDateBtn();
        ProjectPageObj.ClickOnEndDate();
        ProjectPageObj.SelectEndDate();
        ProjectPageObj.ClickOnDocumentStructureBtn();
        Custome_Wait.wait(driver,driver.findElement(ProjectPageObj.SelectSemiStructure));
        ProjectPageObj.SelectOnSemiStructure();
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        AssertionsFunction.isPresent(ProjectPageObj.DocumentScore);


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  - check_delete_attribute")
    @Description("verify user able to check_delete_attribute")
    @Test (priority=2,groups="smoke", description = "verify check_delete_attribute")

    public void check_delete_attribute() throws Exception {
        //TC 17.2 Checking Delete Attribute.
        ProjectPageObj.ClickOnDeleteAttributeFieldName();
        Thread.sleep(1000);
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
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,90000)", "");
        Thread.sleep(4000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
        ProjectPageObj.VerifyAssertForRole();
        Thread.sleep(3000);
        ProjectPageObj.ClickOnRolesBtn();
      Custome_Wait.wait(driver,ProjectPageObj.AddRoleAdmin);
        ProjectPageObj.ClickOnAddRoleBtn();
       Custome_Wait.wait(driver,ProjectPageObj.SelectRoleAdmin);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCreate();
        Thread.sleep(2000);
        ProjectPageObj.VerifyAssertForUser();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddUserBtn();
      Custome_Wait.wait(driver,ProjectPageObj.SelectUserAdmin);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - navigate_to_data_page_and_Rules_page")
    @Description("verify user able to navigate_to_data_page_and_Rules_page")
    @Test (priority=4,groups="smoke", description = "verify navigate_to_data_page_and_Rules_page")

    public void navigate_to_data_page_and_Rules_page() throws Exception {
        //17.4 Navigate Next to Data Page and Rules Page and Back also.
        ProjectPageObj.ClickNextPage();
        Thread.sleep(1000);
        ProjectPageObj.ClickRulesPage();
        Thread.sleep(1000);
        ProjectPageObj.ClickBackRulePage();
        Thread.sleep(1000);
        ProjectPageObj.CLickBackDataPage();
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - verify_create_project")
    @Description("verify user able to create_project")
    @Test (priority=5,groups="smoke", description = "verify_create_project")

    public void verify_create_project() throws Exception {
        //TC 17.5 Verify Create Project.
        ProjectPageObj.ClickOnCreate();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-9000)", "");
        ProjectPageObj.TableStructure();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.verifyProjectCreated("SemiStructuredProject");
        Thread.sleep(2000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - check_data_extracted_from_Pharmalink_Inmar_document")
    @Description("verify user able to check_data_extracted_from_Pharmalink_Inmar_document")
    @Test (priority=5,groups="smoke", description = "check_data_extracted_from_Pharmalink_Inmar_document")

    public  void check_data_extracted_from_Pharmalink_Inmar_document() throws Exception {
        //IN807 Pharmalink Inmar document processing

        DocumentPage DocPageObj=new DocumentPage(driver);
        TemplatePage TemplatePageObj=new TemplatePage(driver);

        Thread.sleep(2000);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(1000);
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(1000);
//Search Medical Chart Project.
        DocPageObj.ClickSearchProject(ReadProps.readAttr("semistructprojectname"));
        Thread.sleep(1000);
        DocPageObj.selectsemiproject();
        Thread.sleep(1000);
        DocPageObj.clickonReadyDocument();
        Thread.sleep(1000);
        DocPageObj.clickonchartdata();
        Thread.sleep(1000);
DocPageObj.clickSaveDraft();
Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        DocPageObj.clickonrejectdoc();
        Thread.sleep(1000);
        DocPageObj.clickonchartdata();
        Thread.sleep(1000);
        DocPageObj.clickonattributedropdown();
        Thread.sleep(1000);
        DocPageObj.addfirstattribute();
        Thread.sleep(1000);
        DocPageObj.addsecondattribute();
        Thread.sleep(1000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(4000);
        DocPageObj.clickSubmit();
        AssertionsFunction.isPresent(DocPageObj.Submit);

    }

}