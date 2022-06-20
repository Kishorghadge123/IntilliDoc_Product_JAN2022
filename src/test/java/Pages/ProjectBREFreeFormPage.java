package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ProjectBREFreeFormPage {


    WebDriver driver=null;

    By clickOnStructutrProject= By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By selectFreeFormProject=By.xpath("//span[contains(text(),'J1003')]//preceding::span[3]");
    By RejectedDocumnet=By.xpath("//span[contains(text(),'inputDocs/AE Free-Form/PDF 4.pdf')]");
    By chartData=By.xpath("//mat-label[contains(text(),'Data')]");
    By clickonAddAttribute=By.xpath("//span[contains(text(),'Attribute')]");
    By agetextbox=By.xpath("//input[@class='mat-tooltip-trigger mat-input-element mat-form-field-autofill-control tooltip-input ellipsis ng-tns-c97-31 ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored']");

    By Phone=By.xpath("(//span[contains(text(),'Phone')])");
    By RunRuleBtn=By.xpath("//span[contains(text(),'Run Rule')]");
    By CheckProcessedDocument=By.xpath("//div[@role='listbox']/mat-option[3]");

    By submitbtn=By.xpath("//span[contains(text(),'Submit')]");
    By submitbtn2=By.xpath("(//div[@class='modal-footer'])//button[1]");
    By Age=By.xpath("(//span[contains(text(),'Age')])");
    By Add=By.xpath("//*[text()=' Add ']");
    By clickOnProcessedPdf=By.xpath("//*[text()=' Type ']//following::tr[1]/td[4]");
    public  void clickOnProcessedPdf(){
        driver.findElement(clickOnProcessedPdf).click();
    }
    By clickOnStatusButton = By.xpath("//*[text()=' Status ']//following::span[1]/mat-icon");

    public ProjectBREFreeFormPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }
    @Step("click On RunRule Button")
    public  void clickOnRunRuleButton(){
        driver.findElement(RunRuleBtn).click();
    }
    @Step("click On Status Buttonr")
    public  void clickOnStatusButton(){driver.findElement(clickOnStatusButton).click();}
    @Step("click on Reject Document")
    public  void clickonRejectDocument(){
        driver.findElement(RejectedDocumnet).click();
    }
    @Step("click on search project")
    public void click_on_search_project() {
        driver.findElement(clickOnStructutrProject).click();
    }
    @Step("select free form project")
    public void select_free_form_project() {
        driver.findElement(selectFreeFormProject).click();
    }
    @Step("click onRejected Document")
    public void clickonRejectedDocument() {
        driver.findElement(RejectedDocumnet).click();
    }
    @Step("click On chart Data")
    public  void clickOnchartData(){
        driver.findElement(chartData).click();
    }
    @Step("click on Add Attribute")
    public  void  clickonAddAttribute(){
        driver.findElement(clickonAddAttribute).click();
    }
    @Step("select Attribute")
    public  void  selectAttribute(){
        driver.findElement(Age).click();
    }
    @Step("select Attribute Second")
    public  void  selectAttributeSecond(){
        driver.findElement(Phone).click();
    }
    @Step("Add Button")
    public  void AddButton(){
        driver.findElement(Add).click();
    }
    @Step("Check Processed Document")
    public void CheckProcessedDocument(){
        driver.findElement(CheckProcessedDocument).click();
    }
    @Step("enter Age")
    public  void enterAge(){
        driver.findElement(agetextbox).sendKeys("24");
    }
    @Step("click On Submit")
    public  void clickOnSubmit(){
        driver.findElement(submitbtn).click();
    }
    @Step("click OnSecond Submit Btn")
    public  void clickOnSecondSubmitBtn(){
        driver.findElement(submitbtn2).click();
    }
}

