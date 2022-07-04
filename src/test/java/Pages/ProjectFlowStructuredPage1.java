package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
public class ProjectFlowStructuredPage1 {



    WebDriver driver = null;
//locators
    public  String projecturl="https://alpha.neutrino-ai.com/#/home/project-management";
    By ClickSearchBox = By.xpath("//input[@placeholder='Search']");
    By EditProjectBtn = By.xpath("//mat-icon[contains(text(),'create')]");
    By EnableDisableProjectBtn = By.xpath("(//label[@class='mat-slide-toggle-label'])[1]");
    By ClickUpdateBtn = By.xpath("//span[contains(text(),'Update' )]");
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");

    //Constructor.
    public ProjectFlowStructuredPage1(WebDriver driver) {
        this.driver = driver;
    }

    //Methods Declaration.

    @Step("Click OnSearchBox")
    public void ClickOnSearchBox(String text) {driver.findElement(ClickSearchBox).sendKeys(text);}

    @Step("Click EditProjectBtn")
    public void ClickEditProjectBtn(){ driver.findElement(EditProjectBtn).click();}

    @Step("Click DisableProjectBtn")
    public void ClickDisableProjectBtn(){ driver.findElement(EnableDisableProjectBtn).click();}

    @Step("Click EnableProjectBtn")
    public void ClickEnableProjectBtn(){ driver.findElement(EnableDisableProjectBtn).click();}

    @Step("Click UpdateBtn")
    public void ClickUpdateBtn() {driver.findElement(ClickUpdateBtn).click();}

    @Step("Click TableStructure")
    public void TableStructure() {driver.findElement(TableStructure).click();}

    @Step("Clear Search")
    public void ClearSearch() {driver.findElement(ClickSearchBox).clear();}








}
