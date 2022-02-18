package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProjectFlowStructuredPage1 {

    WebDriver driver = null;
    //Web Elements Declaration.
    By ClickSearchBox = By.xpath("//input[@placeholder='Search']");
    By EditProjectBtn = By.xpath("//mat-icon[contains(text(),'create')]");
    By EnableDisableProjectBtn = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[2]/div[1]/form[1]/mat-card[1]/div[1]/div[6]/div[1]/div[1]/div[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]");
    By ClickUpdateBtn = By.xpath("//span[contains(text(),'Update' )]");
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");

    //Constructor.
    public ProjectFlowStructuredPage1(WebDriver driver) {
        this.driver = driver;
    }

    //Methods Declaration.
    public void ClickOnSearchBox(String text) {driver.findElement(ClickSearchBox).sendKeys(text);}
    public void ClickEditProjectBtn(){ driver.findElement(EditProjectBtn).click();}
    public void ClickDisableProjectBtn(){ driver.findElement(EnableDisableProjectBtn).click();}
    public void ClickEnableProjectBtn(){ driver.findElement(EnableDisableProjectBtn).click();}
    public void ClickUpdateBtn() {driver.findElement(ClickUpdateBtn).click();}
    public void TableStructure() {driver.findElement(TableStructure).click();}
    public void ClearSearch() {driver.findElement(ClickSearchBox).clear();}








}
