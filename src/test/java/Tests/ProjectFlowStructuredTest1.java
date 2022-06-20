package Tests;
import Base.BasePage;
import Pages.ProjectFlowStructuredPage1;
import Utilities.ReadProps;
import io.qameta.allure.*;
import org.testng.annotations.*;
@Feature("Project Flow Structured Test1")
@Listeners(Utilities.TestListeners.class)
public class ProjectFlowStructuredTest1 extends BasePage {
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
    @Story("story_id: 001 - disable_active_project_on_Project_page")
    @Description("verify user able to disable_active_project_on_Project_page")
    @Test (priority=1,groups="smoke", description = "verify disable_active_project_on_Project_page")
    public void disable_active_project_on_Project_page() throws Exception {

            ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
            //TC 1.1 Disable Project.
            Thread.sleep(4000);
            ProjectPageObj.TableStructure();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
            Thread.sleep(1000);
            ProjectPageObj.ClickEditProjectBtn();
            Thread.sleep(5000);
            ProjectPageObj.ClickDisableProjectBtn();
            Thread.sleep(1000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
            Thread.sleep(1000);
            ProjectPageObj.ClearSearch();
            Thread.sleep(2000);
        }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 - verify_disabled_project_on_Project_page")
    @Description("verify user able to verify_disabled_project_on_Project_page")
    @Test (priority=2,groups="smoke", description = "verify_disabled_project_on_Project_page")
    public void verify_disabled_project_on_Project_page() throws Exception {
            //TC 1.2 Verify Disable Project in List View.
            ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
            ProjectPageObj.TableStructure();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
            Thread.sleep(1000);
            ProjectPageObj.ClickEditProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickEnableProjectBtn();
            Thread.sleep(1000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(5000);
        }  }