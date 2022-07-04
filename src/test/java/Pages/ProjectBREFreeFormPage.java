package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import io.qameta.allure.Step;
public class ProjectBREFreeFormPage {
    WebDriver driver=null;
//locator
    By clickOnStructutrProject= By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By selectFreeFormProject=By.xpath("//span[contains(text(),'J1003')]//preceding::span[3]");
    By RejectedDocumnet=By.xpath("//span[contains(text(),'inputDocs/AE Free-Form/PDF 4.pdf')]");
    By chartData=By.xpath("//mat-label[contains(text(),'Data')]");
    By clickonAddAttribute=By.xpath("//span[contains(text(),'Attribute')]");
    By agetextbox=By.xpath("//input[@class='mat-tooltip-trigger mat-input-element mat-form-field-autofill-control tooltip-input ellipsis ng-tns-c97-31 ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored']");
    By cancel=By.xpath("//span[contains(text(),'Cancel')]");
    By Phone=By.xpath("(//span[contains(text(),'Phone')])");
    By RunRuleBtn=By.xpath("//span[contains(text(),'Run Rule')]");
    By CheckProcessedDocument=By.xpath("//span[contains(text(),' Processed ')]");
    By DOB=By.xpath("//div[@class='mat-form-field-infix ng-tns-c97-54']");

    By submitbtn=By.xpath("(//span[@class='mat-button-wrapper'])[11]");
    By submitbtn2=By.xpath("(//div[@class='modal-footer'])//button[1]");
    By Age=By.xpath("(//span[contains(text(),'Age')])");
    By Add=By.xpath("//span[contains( text(),' Add ')]");
    By clickOnStatusButton = By.xpath("//mat-icon[@class='mat-icon notranslate table-header-icon material-icons filter-icon mat-icon-no-color']");

    By clickOnProcessedPdf=By.xpath("(//span[contains(text(),' MD - MiscInformation - 2621820318 -  - LIBRE - - CA- NEW - 12-28-2020.tif ')])[1]");
    public  void clickOnProcessedPdf(){
        driver.findElement(clickOnProcessedPdf).click();
    }

    public ProjectBREFreeFormPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public  void clickOnRunRuleButton(){
        driver.findElement(RunRuleBtn).click();
    }

    @Step("click On StatusButton")
    public  void clickOnStatusButton(){driver.findElement(clickOnStatusButton).click();}
    @Step("click on RejectDocument")
    public  void clickonRejectDocument(){
        driver.findElement(RejectedDocumnet).click();
    }

    @Step("click_on_search_project")
    public void click_on_search_project() {
        driver.findElement(clickOnStructutrProject).click();
    }

    @Step("select_free_form_project")
    public void select_free_form_project() {
        driver.findElement(selectFreeFormProject).click();
    }

    @Step("clickonRejectedDocument")
    public void clickonRejectedDocument() {
        driver.findElement(RejectedDocumnet).click();
    }

    @Step("clickOnchartData")
    public  void clickOnchartData(){
        driver.findElement(chartData).click();
    }

    @Step("clickonAddAttribute")
    public  void  clickonAddAttribute(){
        driver.findElement(clickonAddAttribute).click();
    }

    @Step("selectAttribute")
    public  void  selectAttribute(){
        driver.findElement(Age).click();
    }

    @Step(" click on ProfileIcon")
    public  void  selectAttributeSecond(){
        driver.findElement(Phone).click();
    }

    @Step(" click on AddButton")
    public  void AddButton(){
        driver.findElement(Add).click();
    }
    @Step(" click on CheckProcessedDocument")
    public void CheckProcessedDocument(){
        driver.findElement(CheckProcessedDocument).click();
    }


    @Step("enterAge")
    public  void enterAge(){
        driver.findElement(agetextbox).sendKeys("24");
    }

    @Step("clickOnSubmit")
    public  void clickOnSubmit(){
        driver.findElement(submitbtn).click();
    }

    public  void clickOnSecondSubmitBtn(){
        driver.findElement(submitbtn2).click();
    }
}

