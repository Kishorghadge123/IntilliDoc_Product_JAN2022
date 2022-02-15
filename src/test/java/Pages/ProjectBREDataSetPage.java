package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProjectBREDataSetPage {


    WebDriver driver = null;

    public ProjectBREDataSetPage(WebDriver driver) {
        this.driver = driver;
    }

    By DataSets = By.xpath("//span[contains(text(),'Datasets')]");
    By AddDataSet = By.xpath("//span[contains(text(),' Add Dataset ')]");
    By ChooseDataSet = By.xpath("//button[contains(text(),' Test ')]");
    By BREChooseDataSet = By.xpath("//button[contains(text(),' Auto-DataSet ')]");
    By SelectDataSet = By.xpath("//button[contains(text(),' Patient Info ')]");
    By SelectDataSet1 = By.xpath("//button[contains(text(),' Providerdetails ')]");
    By BRESelectDataSet = By.xpath("//button[contains(text(),' Auto-SampleDataSet ')]");
    By OperatorValueExistsIn = By.xpath("//span[contains(text(),'Exists In')]");
    By PreDefinedDataSet = By.xpath("//span[contains(text(),'dataset')]");
    By SelectPreDefinedDataSet = By.xpath("//span[contains(text(),'Test - Patient Info')]");
    By DataSetHeader = By.xpath("//span[contains(text(),'Dataset Header')]");
    By SelectDataSetHeader = By.xpath("//span[contains(text(),'DxCode')]");
    By FirstDecisionBox = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]");

    public  void SelectDataSetHeader(){driver.findElement(SelectDataSetHeader).click();}
    public  void ClickOnDataSetHeader(){driver.findElement(DataSetHeader).click();}
    public  void ClickOnDataSets(){driver.findElement(DataSets).click();}
    public  void ClickOnAddDataSets(){driver.findElement(AddDataSet).click();}
    public  void ClickOnChooseDataSet(){driver.findElement(ChooseDataSet).click();}
    public  void ClickOnBREChooseDataSet(){driver.findElement(BREChooseDataSet).click();}
    public  void SelectDataSet(){driver.findElement(SelectDataSet).click();}
    public  void SelectDataSet1(){driver.findElement(SelectDataSet1).click();}
    public  void SelectBREDataSet(){driver.findElement(BRESelectDataSet).click();}
    public  void SelectOperatorValueExistsIn(){driver.findElement(OperatorValueExistsIn).click();}
    public  void ClickOnPredefinedDataSet(){driver.findElement(PreDefinedDataSet).click();}
    public  void SelectPredefinedDataSet(){driver.findElement(SelectPreDefinedDataSet).click();}
    public  void ClickOnFirstDataSetBox(){driver.findElement(FirstDecisionBox).click();}

}

