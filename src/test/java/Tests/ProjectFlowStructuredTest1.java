package Tests;
import Base.BasePage;
import Pages.ProjectFlowStructuredPage1;
import Utilities.ReadProps;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)
public class ProjectFlowStructuredTest1 extends BasePage {
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
    public void disable_active_project_on_Project_page() throws Exception {

            ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
            //TC 1.1 Disable Project.
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
    @Test(priority = 2)
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