package Pages;

import Utilities.Custome_Wait;
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
By cancel=By.xpath("//span[contains(text(),'Cancel')]");
    By Phone=By.xpath("(//span[contains(text(),'Phone')])");
    By RunRuleBtn=By.xpath("//span[contains(text(),'Run Rule')]");
    By CheckProcessedDocument=By.xpath("//div[@role='listbox']/mat-option[3]");
    By DOB=By.xpath("//div[@class='mat-form-field-infix ng-tns-c97-54']");

    By submitbtn=By.xpath("//span[contains(text(),'Submit')]");
    By submitbtn2=By.xpath("(//div[@class='modal-footer'])//button[1]");
    By Age=By.xpath("(//span[contains(text(),'Age')])");
    By Add=By.xpath("//span[contains( text(),' Add ')]");
    By clickOnProcessedPdf=By.xpath("(//span[contains(text(),' MD - MiscInformation - 2621820318 -  - LIBRE - - CA- NEW - 12-28-2020.tif ')])[1]");
    public  void clickOnProcessedPdf(){
        driver.findElement(clickOnProcessedPdf).click();
        Custome_Wait.wait(driver,chartData);
    }
    By clickOnStatusButton = By.xpath("//thead[@role='rowgroup']//preceding::tr[1]/th[3]/div[1]/div[1]/button");

    public ProjectBREFreeFormPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public  void clickOnRunRuleButton(){
        driver.findElement(RunRuleBtn).click();
    }
    public  void clickOnStatusButton(){driver.findElement(clickOnStatusButton).click();}
    public  void clickonRejectDocument(){
        driver.findElement(RejectedDocumnet).click();
    }

    public void click_on_search_project() {
        driver.findElement(clickOnStructutrProject).click();
        Custome_Wait.wait(driver,clickOnStructutrProject);
    }
    public void select_free_form_project() {
        driver.findElement(selectFreeFormProject).click();
        Custome_Wait.wait(driver,RejectedDocumnet);
    }
    public void clickonRejectedDocument() {
        driver.findElement(RejectedDocumnet).click();
    }

    public  void clickOnchartData(){
        driver.findElement(chartData).click();
        Custome_Wait.wait(driver,clickonAddAttribute);
    }
    public  void clickOnchartData1(){
        driver.findElement(chartData).click();
        Custome_Wait.wait(driver,DOB);
    }
    public  void  clickonAddAttribute(){
        driver.findElement(clickonAddAttribute).click();
    }
    public  void  selectAttribute(){
        driver.findElement(Age).click();
    }
    public  void  selectAttributeSecond(){
        driver.findElement(Phone).click();
    }
    public  void AddButton(){
        driver.findElement(Add).click();
    }
    public void CheckProcessedDocument(){
        driver.findElement(CheckProcessedDocument).click();
    }



    public  void enterAge(){
        driver.findElement(agetextbox).sendKeys("24");
    }
    public  void clickOnSubmit(){
        driver.findElement(submitbtn).click();
        Custome_Wait.wait(driver,cancel);
    }


}

