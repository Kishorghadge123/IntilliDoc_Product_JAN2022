package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AnalyticsPage {

    WebDriver driver = null;

    By AnalyticsBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-cubes m-0 side-icon ng-star-inserted']");
    By OrganizationStatistics =By.xpath("//span[contains(text(),'Organization Statistics')]");
    By TotalUser = By.xpath("//div[contains(text(),' Users ')]");
    By Document = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By Processed = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By ReadyToProcess = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By Rejected = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By ValidationTime = By.xpath("//div[contains(text(),' Validation Time ')]");
    By SProcessedBar = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]");
    By SReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[2]");
    By SRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[3]");
    By SSProcessedBar = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]");
    By SSReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[2]");
    By SSRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[3]");
    By FFProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[1]");
    By FFReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[2]");
    By FFRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[3]");
    By MCProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[1]");
    By MCReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[2]");
    By MCRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[3]");
    By ProjectDownArrow=By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/i[1]");
    By SearchProject=By.xpath("//input[@placeholder='Search']");
    By SelectProject=By.xpath("//span[contains(text(),'QA-AutoProject-Structured')]");
    By SelectDropDown= By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]");
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    By SelectOverall = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[4]/span[1]");
    By SortByDocuments = By.xpath("//thead/tr[1]/th[1]/div[1]/div[1]");
    By SortByReceived = By.xpath("//div[contains(text(),'Received')]");

    //Constructor for Analytics Page.
    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAnalyticsBtn() {
        driver.findElement(AnalyticsBtn).click();
    }

    public void ClickOnSortByReceived() {
        driver.findElement(SortByReceived).click();
    }

    public void ClickOnSortByDocuments() {
        driver.findElement(SortByDocuments).click();
    }

    public  void ClickOrganizationArrow(){
        driver.findElement(OrganizationStatistics).click();
    }

    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverDocuments()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Document);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

public void HoverProcessed()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(Processed);
    action.moveToElement(element).build().perform();

}

public void HoverReadyToProcess()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(ReadyToProcess);
    action.moveToElement(element).build().perform();
}

public void HoverRejected()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(Rejected);
    action.moveToElement(element).build().perform();
}

public void HoverValidationTime()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(ValidationTime);
    action.moveToElement(element).build().perform();
}

    public void HoverStructuredBar()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverSemiStructured()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SSProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SSReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SSRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverFreeForm()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(FFProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(FFReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(FFRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverMedicalChart()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(MCProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(MCReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(MCRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public  void ClickProjectDownArrow(){
        driver.findElement(ProjectDownArrow).click();
    }
    public void ClickSearchProject(){driver.findElement(SearchProject).click();}
    public void ClickSelectProject(){driver.findElement(SelectProject).click();}
    public void ClickSelectDropDown(){driver.findElement(SelectDropDown).click();}
    public void ClickSelectMonthly(){driver.findElement(SelectMonthly).click();}
    public void ClickSelectWeekly(){driver.findElement(SelectWeekly).click();}
    public void ClickSelectDaily(){driver.findElement(SelectDaily).click();}
    public void ClickSelectOverall(){driver.findElement(SelectOverall).click();}
}