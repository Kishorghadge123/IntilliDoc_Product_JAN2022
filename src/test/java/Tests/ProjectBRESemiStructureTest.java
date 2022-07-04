
package Tests;

import Pages.ProjectBRESemiStructurePage;
import Base.BasePage;
import io.qameta.allure.*;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Pages.ProjectBREStructureChartDocumentPage;
import Utilities.AssertionsFunction;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import Base.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Feature("Project BRESemiStructure Test")
@Listeners(Utilities.TestListeners.class)
public class ProjectBRESemiStructureTest  extends BasePage {

    public static ProjectBRESemiStructurePage ProjectBRESemiStructurePageObj;
    public DocumentPage DocPageObj;
    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        //BasePage.LoginTest();
    }
    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  - Add_Attribute_In_SemiStructureProject")
    @Description("verify user able to Add_Attribute_In_SemiStructureProject")
    @Test (priority=1,groups="smoke", description = "verify Add_Attribute_In_SemiStructureProject")


    public void Add_Attribute_In_SemiStructureProject() throws  Exception{
        //IN 481 Manual Intervention for rejected documents for semi structure kind of documents
        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
        DocPageObj = new DocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(3000);
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);
        ProjectBRESemiStructurePageObj.click_on_search_project();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.select_semi_structure_project();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.clickonRejectedDocument();
        Thread.sleep(2000);
       /* ProjectBRESemiStructurePageObj.clickOnchartData();
       Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.clickonAddAttribute();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.selectAttribute();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.selectAttributeSecond();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
        ProjectBRESemiStructurePageObj.AddButton();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.enterQuantity();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.enterNoofPackage();
        Thread.sleep(2000);
        ProjectBRESemiStructurePageObj.clickOnSubmit();
        Thread.sleep(5000);
        ProjectBRESemiStructurePageObj.clickOnSecondSubmitBtn();
*/

    }
}


