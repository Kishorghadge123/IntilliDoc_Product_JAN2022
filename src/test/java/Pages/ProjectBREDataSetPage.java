package Pages;

import Utilities.AssertionsFunction;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProjectBREDataSetPage   {


    WebDriver driver = null;

    public ProjectBREDataSetPage(WebDriver driver) {
        this.driver = driver;
    }

    By DataSets = By.xpath("//span[contains(text(),'Datasets')]");
    public static By AddDataSet = By.xpath("//span[contains(text(),' Add Dataset ')]");
    public static By DatasetNameList = By.xpath("//div[@role='menu']");
    By ChooseDataSet = By.xpath("//button[contains(text(),'Test')]");
    By BREChooseDataSet = By.xpath("//button[contains(text(),' Auto-DataSet ')]");
    By SelectDataSet = By.xpath("//button[contains(text(),' Patient Info ')]");
    public static By DataSetSelected = By.xpath("//span[text()=' Patient Info ']");
    By SelectDataSet1 = By.xpath("//button[contains(text(),' Providerdetails ')]");
    By BRESelectDataSet = By.xpath("//button[contains(text(),' Auto-SampleDataSet ')]");
    By OperatorValueExistsIn = By.xpath("//span[contains(text(),'Exists In')]");
    By PreDefinedDataSet = By.xpath("//span[contains(text(),'dataset')]");
    By SelectPreDefinedDataSet = By.xpath("//span[contains(text(),'Test - Patient Info')]");
    By DataSetHeader = By.xpath("//span[contains(text(),'Dataset Header')]");
    By SelectDataSetHeader = By.xpath("//span[contains(text(),'DxCode')]");
    By FirstDecisionBox = By.xpath("//div[contains(@class,'opacity7 font-12 conditionCardHeading')]");

    public By getBRESelectDataSet(){return this.BRESelectDataSet;}
    @Step("SelectDataSetHeader")
    public  void SelectDataSetHeader(){driver.findElement(SelectDataSetHeader).click();}
    @Step("Click OnData SetHeader")
    public  void ClickOnDataSetHeader(){driver.findElement(DataSetHeader).click();}
    @Step("Click OnData Sets")
    public  void ClickOnDataSets(){driver.findElement(DataSets).click();}
    @Step("Click On AddData Sets")
    public  void ClickOnAddDataSets(){driver.findElement(AddDataSet).click();}
    @Step("Click OnChoose DataSet")
    public  void ClickOnChooseDataSet(){driver.findElement(ChooseDataSet).click();}
    @Step("Click OnBREChoose DataSet")
    public  void ClickOnBREChooseDataSet(){driver.findElement(BREChooseDataSet).click();}
    @Step("Select DataSet")
    public  void SelectDataSet(){driver.findElement(SelectDataSet).click();}
    @Step("Select Data Set1")
    public  void SelectDataSet1(){driver.findElement(SelectDataSet1).click();}
    @Step("Select BREDataSet")
    public  void SelectBREDataSet(){driver.findElement(BRESelectDataSet).click();}
    @Step("Select Operator Value ExistsIn")
    public  void SelectOperatorValueExistsIn(){driver.findElement(OperatorValueExistsIn).click();}
    @Step("Click OnPredefined DataSet")
    public  void ClickOnPredefinedDataSet(){driver.findElement(PreDefinedDataSet).click();}
    @Step("Select Predefined DataSet")
    public  void SelectPredefinedDataSet(){driver.findElement(SelectPreDefinedDataSet).click();}
    @Step("Click On First Data SetBox")
    public  void ClickOnFirstDataSetBox(){driver.findElement(FirstDecisionBox).click();}

}

