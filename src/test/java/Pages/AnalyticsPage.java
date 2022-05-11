package Pages;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class
AnalyticsPage {

    WebDriver driver = null;

    //xpath change by suwarna
    public static String AnalyticsPageURL = "https://alpha.neutrino-ai.com/#/home/analytics";
    public  static By Readylabel=By.xpath("//span[@class='mr-2 d-flex align-items-center'][1]");
    public static By AnalyticsBtn = By.xpath("(//*[@class='mat-nav-list mat-list-base side-bar-menue ng-star-inserted'])//following::i[8]");
    public  static By OrganizationStatistics =By.xpath("//span[text()='Project Statistics']");
    public static By StatisticsHidden = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By StatisticsVisible = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By TotalUser = By.xpath("//div[text()=' Users ']");
    By Document = By.xpath("//*[text()=' Users ']//following::div[5]");
    By Processed = By.xpath("//*[text()=' Users ']//following::div[22]");
    By ReadyToProcess = By.xpath("//div[text()=' Users ']//following::div[32]");
    By Rejected = By.xpath("//*[text()=' Users ']//following::div[40]");
    By ValidationTime = By.xpath("//*[text()=' Validation Time ']");
    By SProcessedBar = By.xpath("//*[text()=' Structured ']//following::div[2]");
    By SReadyBar = By.xpath("//*[text()=' Structured ']//following::div[3]");
    By SRejectedBar = By.xpath("//*[text()=' Structured ']//following::div[4]");
    By SSProcessedBar = By.xpath("//*[text()=' Semi-Structured ']//following::div[1]");
    By SSReadyBar = By.xpath("//*[text()=' Semi-Structured ']//following::div[3]");
    By SSRejectedBar = By.xpath("//*[text()=' Semi-Structured ']//following::div[4]");
    By FFProcessedBar = By.xpath("//*[text()=' Free-Form ']//following::div[2]");
    By FFReadyBar = By.xpath("//*[text()=' Free-Form ']//following::div[3]");
    By FFRejectedBar = By.xpath("//*[text()=' Free-Form ']//following::div[4]");
    By MCProcessedBar = By.xpath("//*[text()=' Medical Chart ']//following::div[2]");
    By MCReadyBar = By.xpath("//*[text()=' Medical Chart ']//following::div[3]");
    By MCRejectedBar = By.xpath("//*[text()=' Medical Chart ']//following::div[4]");
    By ProjectDownArrow=By.xpath("//*[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']//following::i");
    public static By ProjectSelected = By.xpath("//span[@class='mat-tooltip-trigger projectname']");
    By SearchProject=By.xpath("//input[@placeholder='Search']");
    public static By SelectProject=By.xpath("//input[@placeholder='Search']//following::span[1]");
  public static   By SelectDropDown= By.xpath("//div[@id='mat-select-value-1']");
    public  static By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    By SelectOverall = By.xpath("//*[@id='mat-option-3']/span");
    By SortByDocuments = By.xpath("//*[text()=' Received ']//preceding::div[3]");
    public  static By doc=By.xpath("//*[text()=' Received ']");
    By SortByReceived = By.xpath("//div[contains(text(),'Received')]");
   public static By OperatorPerformanceSection = By.xpath("//div[text()=' Operator Performance']");
    public static By AnalyticsPageDisplay= By.xpath("//div[@class='row ng-star-inserted']");
    public static By ProjectStatistics = By.xpath("//span[text()='Project Statistics']");
public  static  By DailyLabel=By.xpath("//span[contains(text(),' Daily trends ')]");
public  static  By MonthlyLable=By.xpath("//span[contains(text(),'Monthly trends')]");
public  static By OverallLabel=By.xpath("//span[contains(text(),' Overall trends')]");
    public  static By weeklylabel=By.xpath("///span[contains(text(),'Weekly trends')]");




    //Constructor for Analytics Page.
    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAnalyticsBtn() throws Exception {

        driver.findElement(AnalyticsBtn).click();
        Custome_Wait.wait(driver,OrganizationStatistics);
    }

    public void ClickOnSortByReceived() throws Exception {

        driver.findElement(SortByReceived).click();
        Custome_Wait.wait(driver,SortByReceived);
    }

    public void ClickOnSortByDocuments() throws Exception {

        driver.findElement(SortByDocuments).click();
        Custome_Wait.wait(driver,SortByDocuments);
    }

    public  void ClickOrganizationArrow() throws Exception{
        Custome_Wait.wait(driver,OrganizationStatistics);
        driver.findElement(OrganizationStatistics).click();
    }

    public  void clickProjectStatisticsarrow() throws Exception{
        Custome_Wait.wait(driver,OrganizationStatistics);
        driver.findElement(ProjectStatistics).click();
    }


    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverDocuments()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Document);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverProcessed()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Processed);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element).build().perform();

    }

    public void HoverReadyToProcess()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(ReadyToProcess);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element).build().perform();
    }

    public void HoverRejected()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Rejected);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element).build().perform();
    }

    public void HoverValidationTime()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(ValidationTime);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element).build().perform();
    }

    public void HoverStructuredBar()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SProcessedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SReadyBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SRejectedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element3).build().perform();
    }

    public void HoverSemiStructured()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SSProcessedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SSReadyBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SSRejectedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element3).build().perform();
    }

    public void HoverFreeForm()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(FFProcessedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(FFReadyBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(FFRejectedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element3).build().perform();
    }

    public void HoverMedicalChart()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(MCProcessedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element1).build().perform();
        WebElement element2= driver.findElement(MCReadyBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element2).build().perform();
        WebElement element3= driver.findElement(MCRejectedBar);
        Custome_Wait.wait(driver,OrganizationStatistics);
        action.moveToElement(element3).build().perform();
    }

    public  void ClickProjectDownArrow(){
        driver.findElement(ProjectDownArrow).click();
        Custome_Wait.wait(driver,OrganizationStatistics);
    }
    public void ClickSearchProject(){
        driver.findElement(SearchProject).click();
        Custome_Wait.wait(driver,OrganizationStatistics);
    }
    public void ClickSelectProject(){
        driver.findElement(SelectProject).click();
        Custome_Wait.wait(driver,OrganizationStatistics);
    }
    public void ClickSelectDropDown(){
        driver.findElement(SelectDropDown).click();
        Custome_Wait.wait(driver,ProjectStatistics);
    }
    public void ClickSelectMonthly(){
        driver.findElement(SelectMonthly).click();
        Custome_Wait.wait(driver,MonthlyLable);
    }
    public void ClickSelectWeekly(){
        driver.findElement(SelectWeekly).click();
        Custome_Wait.wait(driver,weeklylabel);
    }
    public void ClickSelectDaily(){
        driver.findElement(SelectDaily).click();
        Custome_Wait.wait(driver,DailyLabel);
    }
    public void ClickSelectOverall(){
        driver.findElement(SelectOverall).click();
        Custome_Wait.wait(driver,OverallLabel);
    }

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




