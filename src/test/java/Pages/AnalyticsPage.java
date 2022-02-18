package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AnalyticsPage {

    WebDriver driver = null;

    By AnalyticsBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-cubes m-0 side-icon ng-star-inserted']");
    By OrganizationStatistics =By.xpath("//span[contains(text(),'Organization Statistics')]");
    By TotalUser = By.xpath("//div[contains(text(),' Users ')]");
    By Document = By.xpath("//*[@id='cdk-accordion-child-0']/div/div/div[1]/div/div[2]/div/div");
    By Processed = By.xpath("//*[@id='cdk-accordion-child-0']/div/div/div[1]/div/div[3]/div/div/div[1]/div");

    By ReadyToProcess = By.xpath("//*[@id='cdk-accordion-child-0']/div/div/div[1]/div/div[4]/div/div/div[1]/div");
    By Rejected = By.xpath("//*[@id='cdk-accordion-child-0']/div/div/div[1]/div/div[5]/div/div/div[1]/div");
    By ValidationTime = By.xpath("//div[contains(text(),' Validation Time ')]");
    By SProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[1]");
    By SReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[2]");
    By SRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[3]");
    By SSProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[1]");
    By SSReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[2]");
    By SSRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[3]");
    By FFProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[1]");
    By FFReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[2]");
    By FFRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[3]");
    By MCProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[1]");
    By MCReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[2]");
    By MCRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[3]");
    By ProjectDownArrow=By.xpath("//i[@class='fa fa-chevron-circle-down ml-2']");
    By SearchProject=By.xpath("//input[@placeholder='Search']");
    By SelectProject=By.xpath("//span[contains(text(),'QA-AutoProject-Structured')]");
    By SelectDropDown= By.xpath("//*[@id='mat-select-0']/div/div[2]");
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    By SelectOverall = By.xpath("//*[@id='mat-option-3']/span");
    By SortByDocuments = By.xpath("//*[@id='mat-tab-content-0-0']/div/div/div/table/thead/tr/th[1]/div/div[2]");
    By SortByReceived = By.xpath("//div[contains(text(),'Received')]");
    By OperatorPerformanceSection = By.xpath("//div[text()=' Operator Performance']");


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

    public void VerifyOperatorPerformance ()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Operator Performance']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Operator ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation count ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation time ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation time avg ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//canvas[@id='bar-chart-horizontal']")).isDisplayed());
    }
}