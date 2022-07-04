package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Step;
public class ProjectBRESemiStructurePage {

    WebDriver driver = null;
    //locators
    By selectFirst=By.xpath("//span[contains(text(),'Manifest Quantity')]");
    By submitbtn=By.xpath("//span[contains(text(),'Submit')]");
    By submitbtn2=By.xpath("(//div[@class='modal-footer'])//button[1]");
    By selectSecond=By.xpath("//span[contains(text(),' No of Packages ')]");
    By Add=By.xpath("//span[contains( text(),' Add ')]");

    By email=By.xpath("//input[@class='mat-tooltip-trigger mat-input-element mat-form-field-autofill-control mat-autocomplete-trigger ellipsis ng-tns-c97-30 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']");
    By  clickOnStatusButton=By.xpath("//thead[@role='rowgroup']//preceding::tr[1]/th[3]/div[1]/div[1]/button");
    By chartData=By.xpath("//mat-label[contains(text(),'Data')]");
    By clickonAddAttribute=By.xpath("//span[contains(text(),'Attribute')]");
    By packageno=By.xpath("//input[@id='mat-input-3']//following::input[2]");
    By quantity=By.xpath("//input[@id='mat-input-3']//following::input[1]");
    By clickOnStructutrProject= By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By selectSemiStructureProject=By.xpath("//span[contains(text(),'projectdemo')]//following::span[1]");
    By OpenSemiStructurePdf=By.xpath("//*[@class='mat-header-row cdk-header-row table-list-header secondary-background ng-star-inserted']//following::span[contains(text(), ' MD - ProgressNotes  -1137768581 -  - LIBRE -- IL - NEW - 12-2-2020.tif')]");
    By CheckProcessedDocument = By.xpath("//div[@role='listbox']/mat-option[3]");
    By processedStatus=By.xpath("//span[contains(text(),'Cancel')]//following::mat-label[2]");
    By RejectedDocument=By.xpath("//span[contains(text(),' MD - InboundRX -2746121966 -  - LIBRE -  -  NEW  - TN- 12-15-2020.tif ')]");

    public ProjectBRESemiStructurePage(WebDriver driver) {
        this.driver = driver;


    }


    public  By ProcessedStatus(){
        return  this.processedStatus;

    }
    public  void enterQuantity(){
        driver.findElement(quantity).sendKeys("20");
    }
    public  void enterNoofPackage(){
        driver.findElement(packageno).sendKeys("10");
    }
    public  void clickOnSubmit(){
        driver.findElement(submitbtn).click();
    }
    public  void clickOnSecondSubmitBtn(){
        driver.findElement(submitbtn2).click();
    }


    @Step("click_on_search_project")
    public void click_on_search_project() {
        driver.findElement(clickOnStructutrProject).click();
    }


    @Step("select_semi_structure_project")
    public void select_semi_structure_project() {
        driver.findElement(selectSemiStructureProject).click();
    }

    @Step("clickonRejectedDocument")
    public  void clickonRejectedDocument(){
        driver.findElement(RejectedDocument).click();
    }
    public void clickOnSemiStructurePdf() {
        driver.findElement(OpenSemiStructurePdf).click();

    }

    @Step("clickOnchartData")
    public  void clickOnchartData(){
        driver.findElement(chartData).click();
    }
    public  void  clickonAddAttribute(){
        driver.findElement(clickonAddAttribute).click();
    }
    public  void  selectAttribute(){
        driver.findElement(selectFirst).click();
    }
    public  void  selectAttributeSecond(){
        driver.findElement(selectSecond).click();
    }
    public  void AddButton(){
        driver.findElement(Add).click();
    }

    public void CheckProcessedDocument(){
        driver.findElement(CheckProcessedDocument).click();
    }
    public void clickOnStatusButton() {
        driver.findElement(clickOnStatusButton).click();
    }
}