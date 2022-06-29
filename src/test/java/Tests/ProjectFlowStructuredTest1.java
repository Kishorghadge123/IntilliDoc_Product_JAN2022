package Tests;
import Base.BasePage;
import Pages.ProjectFlowStructuredPage1;
import Utilities.ReadProps;
import Utilities.Custome_Wait;
import Utilities.AssertionsFunction;
import org.openqa.selenium.By;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)
public class ProjectFlowStructuredTest1 extends BasePage {
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
    public void disable_active_project_on_Project_page() throws Exception {

        ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
        //TC 1.1 Disable Project.
        ProjectPageObj.TableStructure();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
        Thread.sleep(2000);
        ProjectPageObj.ClickEditProjectBtn();
Thread.sleep(3000);
        ProjectPageObj.ClickDisableProjectBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickUpdateBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
        ProjectPageObj.ClearSearch();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projecturl);

    }
    @Test(priority = 2)
    public void verify_disabled_project_on_Project_page() throws Exception {
        //TC 1.2 Verify Disable Project in List View.
        //TC 18.20 Verify the Functionality of Table Structure.
        ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
        ProjectPageObj.TableStructure();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
        ProjectPageObj.ClickEditProjectBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickEnableProjectBtn();
        ProjectPageObj.ClickUpdateBtn();
        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        AssertionsFunction.verifyTargetPageURL(ProjectPageObj.projecturl);
    }  }