
package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import  Pages.ProjectBREFreeFormPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.LoginUser;
import io.qameta.allure.*;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Project BREFree Form Test")
public class ProjectBREFreeFormTest  extends BasePage {
    public static ProjectBREFreeFormPage  ProjectBREFreeFormPageobj;
    public DocumentPage DocPageObj;
    @Step("Login Test started")
    @BeforeSuite
    public void login() throws Exception{
        BasePage.driverInit();
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();

    }

    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  - Add_Attribute_In_FreeForm")
    @Description("verification_Add_Attribute_In_FreeForm")
    @Test (priority=1,groups="smoke", description = "verification_Add_Attribute_In_FreeForm")


    public void Add_Attribute_In_FreeForm () throws  Exception{
        //IN482 Manual Intervention for Free form kind of documents
        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
        Robot r = new Robot();
        DocPageObj = new DocumentPage(driver);
        ProjectBREFreeFormPageobj = new ProjectBREFreeFormPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(3000);
        ProjectBREFreeFormPageobj.click_on_search_project();
        Thread.sleep(2000);
        ProjectBREFreeFormPageobj.select_free_form_project();
        Thread.sleep(2000);
        ProjectBREFreeFormPageobj.clickonRejectDocument();
        ProjectBREFreeFormPageobj.clickOnchartData();
        ProjectBREFreeFormPageobj.clickonAddAttribute();
        ProjectBREFreeFormPageobj.selectAttribute();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Actions act=new Actions(driver);
        act.click(driver.findElement(By.xpath("//*[text()='Rejected']"))).build().perform();
        Thread.sleep(4000);
        ProjectBREFreeFormPageobj.AddButton();
        ProjectBREFreeFormPageobj.enterAge();
        ProjectBREFreeFormPageobj.clickOnSubmit();
        Thread.sleep(2000);

        DocPageObj.ClickDocumentBtn();
        Thread.sleep(3000);
        ProjectBREFreeFormPageobj.click_on_search_project();
        Thread.sleep(3000);
        ProjectBREFreeFormPageobj.select_free_form_project();
        Thread.sleep(2000);

        ProjectBREFreeFormPageobj.clickOnStatusButton();
        ProjectBREFreeFormPageobj.CheckProcessedDocument();
        Thread.sleep(3000);
        /*ProjectBREFreeFormPageobj.clickOnProcessedPdf();
        Thread.sleep(2000);
        ProjectBREFreeFormPageobj.clickOnchartData();
        Thread.sleep(2000);
        ProjectBREFreeFormPageobj.clickonAddAttribute();*/


    }
}

