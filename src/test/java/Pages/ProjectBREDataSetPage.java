package Pages;

import Utilities.AssertionsFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class ProjectBREDataSetPage   {


 WebDriver driver = null;
    //locator
public  String breurl="https://alpha.neutrino-ai.com/#/home/project-management/create-project";
    public ProjectBREDataSetPage(WebDriver driver) {
        this.driver = driver;
    }
    public  static By selectdata=By.xpath("(//button[@class='mat-focus-indicator mat-menu-item ng-star-inserted'])[1]");
   public By DataSets = By.xpath("//span[contains(text(),'Datasets')]");
    public static By AddDataSet = By.xpath("//span[contains(text(),' Add Dataset ')]");
    public static By DatasetNameList = By.xpath("//div[@role='menu']");
    By ChooseDataSet = By.xpath("(//button[@role='menuitem'])[1]");
    By BREChooseDataSet = By.xpath("//button[contains(text(),' Auto-DataSet ')]");
    public static By SelectDataSet = By.xpath("//button[contains(text(),' Sample ')]");
    public static By SelectData=By.xpath("//button[contains(text(),'PAP Name')]");
    public static By DataSetSelected = By.xpath("//span[text()=' Patient Info ']");
    By SelectDataSet1 = By.xpath("//button[contains(text(),' Providerdetails ')]");
    By BRESelectDataSet = By.xpath("//button[contains(text(),' Auto-SampleDataSet ')]");
    By OperatorValueExistsIn = By.xpath("//span[contains(text(),'Exists In')]");
    By PreDefinedDataSet = By.xpath("//span[contains(text(),'dataset')]");
    By SelectPreDefinedDataSet = By.xpath("//span[contains(text(),' Sample Data Set - PAP Name ')]");
    By DataSetHeader = By.xpath("//span[contains(text(),'Dataset Header')]");
    By SelectDataSetHeader = By.xpath("//span[contains(text(),' PAPName ')]");
     public  static By FirstDecisionBox = By.xpath("//div[contains(@class,'opacity7 font-12 conditionCardHeading')]");

    public By getBRESelectDataSet(){return this.BRESelectDataSet;}

 @Step("SelectDataSetHeader")
 public  void SelectDataSetHeader(){driver.findElement(SelectDataSetHeader).click();}

 @Step("Click On DataSetHeader")
    public  void ClickOnDataSetHeader(){driver.findElement(DataSetHeader).click();}

 @Step("Click On DataSets")
 public  void ClickOnDataSets(){driver.findElement(DataSets).click();}

 @Step("Click OnAddDataSets")
    public  void ClickOnAddDataSets(){driver.findElement(AddDataSet).click();}

 @Step("Click OnChooseDataSet")
    public  void ClickOnChooseDataSet(){driver.findElement(ChooseDataSet).click();}

 @Step("Click On BREChooseDataSet")
    public  void ClickOnBREChooseDataSet(){driver.findElement(BREChooseDataSet).click();}

 @Step(" click on SelectDataSet")
    public  void SelectDataSet(){driver.findElement(SelectDataSet).click();}

 @Step(" click on SelectData")
    public  void SelectData(){driver.findElement(SelectData).click();}

 @Step(" click on ProfileIcon")
 public  void SelectDataSet1(){driver.findElement(SelectDataSet1).click();}

 @Step("SelectBREDataSet")
 public  void SelectBREDataSet(){driver.findElement(BRESelectDataSet).click();}

 @Step("SelectOperatorValueExistsIn")
 public  void SelectOperatorValueExistsIn(){driver.findElement(OperatorValueExistsIn).click();}

 @Step("ClickOnPredefinedDataSet")
    public  void ClickOnPredefinedDataSet(){driver.findElement(PreDefinedDataSet).click();}

 @Step("SelectPredefinedDataSet")
 public  void SelectPredefinedDataSet(){driver.findElement(SelectPreDefinedDataSet).click();}

 @Step("ClickOnFirstDataSetBox")
 public  void ClickOnFirstDataSetBox(){driver.findElement(FirstDecisionBox).click();}

}

