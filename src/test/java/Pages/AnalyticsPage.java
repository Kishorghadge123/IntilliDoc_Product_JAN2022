package Pages;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
///pages classs
public class
AnalyticsPage {

    WebDriver driver = null;

    //xpath change by suwarna
    public static String AnalyticsPageURL ="https://alpha.neutrino-ai.com/#/home/analytics";
    public static By AnalyticsBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[8]");
    By OrganizationStatistics =By.xpath("//span[text()='Project Statistics']");
    public static By StatisticsHidden = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By StatisticsVisible = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By TotalUser = By.xpath("//div[text()=' Users ']");
    public  static By Document = By.xpath("//div[text()=' Users ']//following::div[5]");
   public static By Processed = By.xpath("//div[text()=' Users ']//following::div[22]");

    public  static  By ReadyToProcess = By.xpath("//div[text()=' Users ']//following::div[32]");
  public  static   By Rejected = By.xpath("//div[text()=' Users ']//following::div[40]");
    public  static  By ValidationTime = By.xpath("//div[text()=' Validation Time ']");
    public  static By SProcessedBar = By.xpath("//div[text()=' Structured ']//following::div[2]");
    By SReadyBar = By.xpath("//div[text()=' Structured ']//following::div[3]");
    By SRejectedBar = By.xpath("//div[text()=' Structured ']//following::div[4]");
   public static By SSProcessedBar = By.xpath("//div[text()=' Semi-Structured ']//following::div[1]");
    By SSReadyBar = By.xpath("//div[text()=' Semi-Structured ']//following::div[3]");
    By SSRejectedBar = By.xpath("//div[text()=' Semi-Structured ']//following::div[4]");
    public  static By FFProcessedBar = By.xpath("//div[text()=' Free-Form ']//following::div[2]");
    By FFReadyBar = By.xpath("//div[text()=' Free-Form ']//following::div[3]");
    By FFRejectedBar = By.xpath("//div[text()=' Free-Form ']//following::div[4]");
    By MCProcessedBar = By.xpath("//div[text()=' Medical Chart ']//following::div[2]");
    By MCReadyBar = By.xpath("//div[text()=' Medical Chart ']//following::div[3]");
    By MCRejectedBar = By.xpath("//div[text()=' Medical Chart ']//following::div[4]");
    public  static By ProjectDownArrow=By.xpath("//mat-icon[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']//following::i");
    public static By ProjectSelected = By.xpath("//span[@class='mat-tooltip-trigger projectname']");
    By SearchProject=By.xpath("//input[@placeholder='Search']");
    public static By SelectProject=By.xpath("//input[@placeholder='Search']//following::span[1]");
public By SelectNewProject=By.xpath("//span[contains(text(),'gd test 3 ')]");
    public  static  By SelectDropDown= By.xpath("//mat-icon[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']//following::div[7]");
public String loginurl="https://alpha.neutrino-ai.com/#/login";
public  String analyticurl="https://alpha.neutrino-ai.com/#/home/analytics";
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
   public By SelectOverall = By.xpath("//mat-option[@id='mat-option-3']");
    By SortByDocuments = By.xpath("//div[text()=' Received ']//preceding::div[1]");
    By SortByReceived = By.xpath("//div[contains(text(),'Received')]");
    By OperatorPerformanceSection = By.xpath("//div[text()=' Operator Performance']");
    public static By AnalyticsPageDisplay= By.xpath("//div[@class='row ng-star-inserted']");
    public static By ProjectStatistics = By.xpath("//span[text()='Project Statistics']");

    //Constructor for Analytics Page.
    public AnalyticsPage(WebDriver driver)   {
        this.driver = driver;
    }

    @Step("Click Analytics Button")
    public void ClickAnalyticsBtn() throws Exception {
        Custome_Wait.wait(driver,AnalyticsBtn);
        driver.findElement(AnalyticsBtn).click();
    }
    @Step("Click OnSort By Received")
    public void ClickOnSortByReceived() throws Exception
    {
        Custome_Wait.wait(driver,SortByReceived);
        driver.findElement(SortByReceived).click();
    }
    @Step("Click OnSort By Documents")
    public void ClickOnSortByDocuments() throws Exception {
        By documentArrow = By.xpath("//span[@class='rejected']//following::div[8]");
        Custome_Wait.wait(driver,documentArrow);
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[@class='rejected']//following::div[8]"))).build().perform();
        act.click(driver.findElement(By.xpath("//span[@class='rejected']//following::div[9]")));
    }
    @Step("Click Organization Arrow")
    public  void ClickOrganizationArrow() throws Exception{
        Custome_Wait.wait(driver,OrganizationStatistics);
        Thread.sleep(2000);
        driver.findElement(OrganizationStatistics).click();
    }
    @Step("clickProject Statistic sarrow")
    public  void clickProjectStatisticsarrow() throws Exception{
        Custome_Wait.wait(driver,ProjectStatistics);
        driver.findElement(ProjectStatistics).click();
    }
    @Step("Hover Total User")
    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }
    @Step("Hover Documents")
    public void HoverDocuments()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Document);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }
    @Step("Hover Processed")
    public void HoverProcessed()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Processed);
        action.moveToElement(element).build().perform();

    }
    @Step("Hover Ready To Process")
    public void HoverReadyToProcess()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(ReadyToProcess);
        action.moveToElement(element).build().perform();
    }
    @Step("Hover Rejected")
    public void HoverRejected()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Rejected);
        action.moveToElement(element).build().perform();
    }
    @Step("Hover Validation Time")
    public void HoverValidationTime()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(ValidationTime);
        action.moveToElement(element).build().perform();
    }

    @Step("Hover Structured Bar")
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
    @Step("Hover Semi Structured")
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

    @Step("Hover Free Form")
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
    @Step("Hover Medical Chart")
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
    @Step("ClickProject DownArrow")
    public  void ClickProjectDownArrow(){
        driver.findElement(ProjectDownArrow).click();
    }
    @Step("Click Search Project")
    public void ClickSearchProject(){driver.findElement(SearchProject).click();}
    @Step("Click Select Project")
    public void ClickSelectProject()
    {
        Custome_Wait.wait(driver,SelectProject);
        driver.findElement(SelectProject).click();
    }
    @Step("Click Select DropDown")
    public void ClickSelectDropDown()  throws Exception
    {
        Thread.sleep(3000);
        driver.findElement(SelectDropDown).click();
    }
    @Step("Click Select Monthly")
    public void ClickSelectMonthly()
    {driver.findElement(SelectMonthly).click();}
    @Step("Click Select Weekly")
    public void ClickSelectWeekly(){driver.findElement(SelectWeekly).click();}
    @Step("Click Select Daily")
    public void ClickSelectDaily(){driver.findElement(SelectDaily).click();}
    @Step("Click Select overall")
    public void ClickSelectOverall()
    {
        driver.findElement(SelectOverall).click();
    }
    @Step("Verify Operator Performance")
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