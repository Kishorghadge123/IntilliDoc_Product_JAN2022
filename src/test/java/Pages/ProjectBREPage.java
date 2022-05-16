package Pages;
import Utilities.AssertionsFunction;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProjectBREPage extends AssertionsFunction {

    WebDriver driver = null;

    public String ProjectPageURL ="https://alpha.neutrino-ai.com/#/home/project-management/create-project";

    By NextPageOnRulesPage = By.xpath("(//span[contains(text(),'Next')])[2]");
    By ThreeDots = By.xpath("//mat-icon[contains(text(),'menu')]");
    public static By ExpandPanelOnRulePage = By.xpath("//*[@style='width: 20vw; height: 78vh; transform: none; visibility: visible;']");
    public static By ScaleDownPanelOnRulePage = By.xpath("//*[@style='width: 20vw; height: 78vh; box-shadow: none; visibility: hidden;']");

    By ProjectData = By.xpath("//mat-panel-title[contains(text(),'Project DATA')]");
    By DataSets = By.xpath("//mat-panel-title[contains(text(),'Datasets')]");
    By Variables = By.xpath("//mat-panel-title[contains(text(),'Variables')]");
    By AddRules = By.xpath("//span[contains(text(),'Rules')]");
    public static By RuleBox = By.xpath("//div[@class='d-flex ml-3 mt-4 pt-3']");
    public static By RuleBoxDisplay = By.xpath("//span[@class='py-2 rulesetName']");
    By DeleteRules = By.xpath("//span[@class='rulesetVisibilityIcon px-3 bgcolor2']");
    By ExpandRule = By.xpath("//mat-icon[@class='mat-icon notranslate addRuleRoundedIcon mt-2 ml-2 material-icons mat-icon-no-color ng-star-inserted']");
    public static By ConditionBoxDisplay = By.xpath("//mat-card[@data-target='#RuleModal']");
    public static By ConditionPanelDisplay = By.xpath("//div[@class='row m-1 ng-star-inserted']");


    //div[@class='row m-1 ng-star-inserted']
    //BREMedicalChart.
    By PNameCheck= By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/span[1]");
    By SetDocumentStatus = By.xpath("//span[contains(text(),'Set Document Status')]");
    By DocumentValue = By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c164-132']");
    By Rejected = By.xpath("//span[contains(text(),'Rejected')]");
    By ActionType = By.xpath("//span[contains(text(),'Set Variable')]");
    By ContractFirstRule = By.xpath("//mat-icon[contains(text(),'visibility_off')]");
    public static By AddNameOfCondition = By.xpath("//input[@data-placeholder='Enter name of Condition / Action']");

    By RuleName = By.xpath("//input[@data-placeholder='Rule Name']");
    By FirstDecisionBox =  By.xpath("//span[@class='mat-tooltip-trigger conditionCardHeadingspan']");
    By AddCondition = By.xpath("//span[contains(text(),'Add Condition')]");
    public static By ConditionBox = By.xpath("//div[@class='p-2 conditionBox']");
    By FirstCondition = By.xpath("//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading']");
    By AndCondition = By.xpath("//span[contains(text(),'AND')]");

    public static By SelectPatientDemographics = By.xpath("//div[@role='listbox']/mat-option[1]");
    By AddBREEntity = By.xpath("(//span[contains(text(),'Entity')])[3]");
    public static By PDEntitySelected = By.xpath("//*[@placeholder='Entity']");
    By AddBREEntity1 = By.xpath("(//span[contains(text(),'Entity')])[4]");
    public static By AttributeValue = By.xpath("//*[@placeholder='Attribute / Variable']");

    By NameAttribute = By.xpath("//span[contains(text(),'NAME')]");
    By PatientName = By.xpath("//div[@role='listbox']/mat-option[7]");
    By BRENameAttributePN = By.xpath("//span[contains(text(),'Patient Name')]");
    By BRENameAttributeDOB = By.xpath("//span[contains(text(),'Birthdate')]");
    By AddressAttribute = By.xpath("//span[contains(text(),'ADDRESS')]");
    By StateAttribute = By.xpath("//span[contains(text(),'STATE')]");

    By Visibility = By.xpath("//mat-icon[contains(text(),'visibility')]");
    By Operator = By.xpath("//span[contains(text(),'Operator')]");
    public static By OperatorValueEqualTo = By.xpath("//span[contains(text(),'==')]");
    By OperatorValueExistsIN = By.xpath("//span[contains(text(),'Exists In')]");
    By Save = By.xpath("//span[contains(text(),'Save ')]");
    public static By ConditionSaved = By.xpath("//*[@style='height: 78vh;']");
    public static By RightConditionPanelDisplay = By.xpath("//*[@style='height: 78vh;']");
    public static By AttributeList= By.xpath("//div[@role='listbox']");


    By AddAction = By.xpath("//span[contains(text(),'Add Action')]");
    By ClickOnBREDataSet = By.xpath("//span[contains(text(),'dataset')]");
    By ClickOnAddBREDataSet = By.xpath("//span[contains(text(),'Auto-DataSet - Auto-SampleDataSet')]");
    By ClickOnAddBREDataSet1 = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By ClickOnBREDataHeader = By.xpath("//span[contains(text(),'Dataset Header')]");
    By SelectBREDatasetHeaderDXCode = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By SelectBREDatasetHeaderDOB = By.xpath("//span[contains(text(),'DOB')]");
    By ExpandVariables = By.xpath("//span[contains(text(),'Variables')]");
    public static By AddVariablesButton = By.xpath("//span[contains(text(),' Add Variable ')]");
    By VariableName = By.xpath("//input[@id='variableName']");
    By ValidationType = By.xpath("//*[@id='validationType']");
    By Name = By.xpath("//span[contains(text(),'Name')]");
    By Address = By.xpath("//span[contains(text(),'Address')]");
    By City = By.xpath("//span[contains(text(),'City')]");
    By State = By.xpath("//span[contains(text(),'State')]");
    By ZIP = By.xpath("//span[contains(text(),'Zip')]");

    By DefaultValue = By.xpath("//input[@id='VariableValue']");
    By AddButton = By.xpath("(//button[@class='mat-focus-indicator ml-2 mat-raised-button mat-button-base mat-primary'])[2]");
    By CancelButton = By.xpath("//button[@class='mat-focus-indicator ml-2 mat-stroked-button mat-button-base mat-accent']");

    By Value = By.xpath("//input[@placeholder='value']");
    public static By ActionValue = By.xpath("//input[@data-placeholder='Enter name of Condition / Action']");
    By FalseBox = By.xpath("(//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading'])[2]");
    By FalseBox2 = By.xpath("(//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading'])[4]");
    By FalseBox3 = By.xpath("(//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading'])[6]");

    By TrueBox1 = By.xpath("(//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading'])[1]");
    By TrueBox2 = By.xpath("(//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading'])[3]");
    By TrueBox3 = By.xpath("(//div[@class='opacity7 font-12 pt-3 text-center actionCardHeading'])[5]");
    //Replace String
    public static By ReplaceString = By.xpath("//span[contains(text(),'Replace String')]");
    By Entity = By.xpath("//span[contains(text(),'Entity')]//parent::div");

    By PatientDemoGraphics = By.xpath("//span[contains(text(),'PatientDemographics')]/parent::mat-option");
    public static By AttributeDropDown = By.xpath("//*[starts-with(@class,'mat-select-placeholder mat-select-min-line ng-tns')]/following::span[132]");

    By PatientNameAttributes = By.xpath("(//span[contains(text(),'Patient Name')])[2]");
    By OperatorDropDown = By.xpath("//*[starts-with(@class,'mat-select-placeholder mat-select-min-line ng-tns')]/following::span[135]");

    By ReplaceAll = By.xpath("//span[contains(text(),'replaceAll')]");
    public static By ReplaceFirst = By.xpath("//span[contains(text(),'replaceFirst')]");

    By Replace = By.xpath("(//input[@type='text'])[5]");
    By With = By.xpath("(//input[@type='text'])[4]");
    public static By CaseSensitiveCheckBox = By.xpath("//span[contains(text(),'Case Sensitive')]");


    By SelectVariable1 = By.xpath("//span[contains(text(),'Variable1')]");
    By SelectVariable2 = By.xpath("//span[contains(text(),'Variable2')]");
    By SelectVariable3 = By.xpath("//span[contains(text(),'Variable3')]");
    By SelectVariable4 = By.xpath("//span[contains(text(),'Variable4')]");
    By SelectVariable5 = By.xpath("//span[contains(text(),'Variable5')]");
    By SelectVariable6 = By.xpath("//span[contains(text(),'Variable6')]");
    By SelectVariable7 = By.xpath("//span[contains(text(),'Variable7')]");
    By SelectVariable8 = By.xpath("//span[contains(text(),'Variable8')]");
    By SelectVariable9 = By.xpath("//span[contains(text(),'Variable9')]");
    By SelectVariable10 = By.xpath("//span[contains(text(),'Variable10')]");

    By VariableDropdown = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[2]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By Project = By.xpath("//span[contains(text(),'AutoSample3')]");

    public static By VariableAddWindow = By.xpath("//div[@class='modal-body']");
    public static By VariableAddedTable = By.xpath("//div[@role='region']/div/div/div/mat-table");
    public static By FalseConditionBox = By.xpath("//div[@class='d-flex mt-1 pt-1 border-l falseConditionPath']");


    //Constructor
    public ProjectBREPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickOnFirstTrueBoxButton(){driver.findElement(TrueBox1).click();}
    public void ClickOnSecondTrueBoxButton(){driver.findElement(TrueBox2).click();}
    public void ClickOnThirdTrueBoxButton(){driver.findElement(TrueBox3).click();}

    //BRE Medical Chart
    public void ClickOnPNameCheck(){driver.findElement(PNameCheck).click();}
    public void ClickOnActionType(){driver.findElement(ActionType).click();}
    public void ClickOnDocumentValue(){driver.findElement(DocumentValue).click();}
    public void ClickOnSetDocumentStatus(){driver.findElement(SetDocumentStatus).click();}
    public void SelectDocumentStatusR(){driver.findElement(Rejected).click();}
    public void ClickOnNextPageButton(){driver.findElement(NextPageOnRulesPage).click();}
    public void ClickOnThreeDotsButton(){driver.findElement(ThreeDots).click();}
    public void ClickOnProjectData(){driver.findElement(ProjectData).click();}
    public void ClickOnDataSets(){driver.findElement(DataSets).click();}
    public void ClickOnVariables(){driver.findElement(Variables).click();}
    public void ClickOnAddRulesButton(){driver.findElement(AddRules).click();}
    public void ClickOnDeleteRulesButton(){driver.findElement(DeleteRules).click();}
    public void ClickOnFirstDecisionBox(){driver.findElement(FirstDecisionBox).click();}
    public void SearchCreatedProject(){driver.findElement(Project).click();}

    //Replace String methods
    public void SelectReplaceStringBtn(){driver.findElement(ReplaceString).click();}
    public void SelectEntityBtn(){driver.findElement(Entity).click();}
    public void SelectPatientGraphicsBtn(){driver.findElement(PatientDemoGraphics).click();}
    public void ClickOnAttributeBtn(){driver.findElement(AttributeDropDown).click();}
    public void SelectPatientNameAttributesBtn(){driver.findElement(PatientNameAttributes).click();}
    public void ClickOnOperatorDropdownBtn(){driver.findElement(OperatorDropDown).click();}
    public void SelectReplaceAllBtn(){driver.findElement(ReplaceAll).click();}
    public void SelectReplaceFirstBtn(){driver.findElement(ReplaceFirst).click();}
    public void ClickOnReplaceValue(){ driver.findElement(Replace).click();}
    public void ClickOnWithValue(){ driver.findElement(With).click();}
    public void ClearWithValue(){ driver.findElement(With).clear();}

    public void EnterReplaceValue(String text){ driver.findElement(Replace).sendKeys(text);}
    public void EnterWithValue(String text){ driver.findElement(With).sendKeys(text);}
    public void ClickOnCaseSensitivityBtn(){driver.findElement(CaseSensitiveCheckBox).click();}




    public void ClickOnExpandFirstRule(){driver.findElement(ExpandRule).click();}
    public void ClickOnExpandSecondRule(){driver.findElement(ExpandRule).click();}
    public void ClickOnExpandThirdRule(){driver.findElement(ExpandRule).click();}

    public void EnterAddNameOfCondition(String text){ driver.findElement(AddNameOfCondition).sendKeys(text);}

    public  void ClickOnRule(){driver.findElement(RuleName).click();}
    public  void ClickOnClearRule(){driver.findElement(RuleName).clear();}
    public  void EnterValue(String text){ driver.findElement(Value).sendKeys(text);}

    public  void ClickOnAddCondition(){driver.findElement(AddCondition).click();}
    public  void ClickOnFirstCondition(){driver.findElement(FirstCondition).click();}

    public  void ClickOnANDCondition(){driver.findElement(AndCondition).click();}

    public  void ClickOnAddBREEntity(){driver.findElement(AddBREEntity).click();}
    public  void ClickOnAddBREEntity1(){driver.findElement(AddBREEntity1).click();}
    public  void ClickOnAddBREEntityPD1(){driver.findElement(SelectPatientDemographics).click();}
    public  void ClickOnAddBREEntityPD(){driver.findElement(SelectPatientDemographics).click();}

    public  void ClickOnAttributeValue(){driver.findElement(AttributeValue).click();}
    public  void SelectNameAttribute(){driver.findElement(NameAttribute).click();}
    public  void SelectPatientNameAttribute(){driver.findElement(PatientName).click();}
    public  void SelectBRENameAttribute(){driver.findElement(BRENameAttributePN).click();}
    public  void SelectBREDOBAttribute(){driver.findElement(BRENameAttributeDOB).click();}
    public  void SelectAddressAttribute(){driver.findElement(AddressAttribute).click();}
    public  void SelectStateAttribute(){driver.findElement(StateAttribute).click();}

    public  void ClickOnSelectBREDataSet(){driver.findElement(ClickOnBREDataSet).click();}

    public  void ClickOnChooseBREDataSet(){driver.findElement(ClickOnAddBREDataSet).click();}
    public  void ClickOnChooseBREDataSet1(){driver.findElement(ClickOnAddBREDataSet1).click();}

    public  void ClickOnBREDataHeader(){driver.findElement(ClickOnBREDataHeader).click();}
    public  void SelectBREDataHeaderDXCode(){driver.findElement(SelectBREDatasetHeaderDXCode).click();}
    public  void SelectBREDataHeaderDOB(){driver.findElement(SelectBREDatasetHeaderDOB).click();}


    public  void ClickOnOperator(){driver.findElement(Operator).click();}
    public  void ClickOnVisibility(){driver.findElement(Visibility).click();}
    public  void SelectOperatorValueEqualTo(){driver.findElement(OperatorValueEqualTo).click();}
    public  void SelectOperatorValueExistsIn(){driver.findElement(OperatorValueExistsIN).click();}


    public  void ClickOnAddAction(){driver.findElement(AddAction).click();}
    public  void ClickOnSave(){driver.findElement(Save).click();}
    public  void ClickOnExpandVariables(){driver.findElement(ExpandVariables).click();}
    public  void ClickOnAddVariables(){driver.findElement(AddVariablesButton).click();}
    public  void EnterVariableName(String text){ driver.findElement(VariableName).sendKeys(text);}
    public  void ClickOnValidationType(){driver.findElement(ValidationType).click();}
    public  void ClickOnName(){driver.findElement(Name).click();}
    public  void ClickOnState(){driver.findElement(State).click();}
    public  void ClickOnAddress(){driver.findElement(Address).click();}
    public  void ClickOnZIP(){driver.findElement(ZIP).click();}
    public  void ClickOnCity(){driver.findElement(City).click();}
    public  void EnterDefaultValue(String text){ driver.findElement(DefaultValue).sendKeys(text);}

    public  void ClickOnAddButton(){driver.findElement(AddButton).click();}
    public  void ClickOnCancelButton(){driver.findElement(CancelButton).click();}
    public  void ClickOnContractRuleButton(){driver.findElement(ContractFirstRule).click();}

    public  void ClickOnFalseBoxButton1(){driver.findElement(FalseBox).click();}
    public  void ClickOnFalseBoxButton2(){driver.findElement(FalseBox2).click();}
    public  void ClickOnFalseBoxButton3(){driver.findElement(FalseBox3).click();}
    public  void EnterActionValue(String text){ driver.findElement(ActionValue).sendKeys(text);}
    public  void ClickOnVariableDropdown(){driver.findElement(VariableDropdown).click();}
    public  void SelectVariable1(){driver.findElement(SelectVariable1).click();}
    public  void SelectVariable2(){driver.findElement(SelectVariable2).click();}
    public  void SelectVariable3(){driver.findElement(SelectVariable3).click();}
    public  void SelectVariable4(){driver.findElement(SelectVariable4).click();}
    public  void SelectVariable5(){driver.findElement(SelectVariable5).click();}
    public  void SelectVariable6(){driver.findElement(SelectVariable6).click();}
    public  void SelectVariable7(){driver.findElement(SelectVariable7).click();}
    public  void SelectVariable8(){driver.findElement(SelectVariable8).click();}
    public  void SelectVariable9(){driver.findElement(SelectVariable9).click();}
    public  void SelectVariable10(){driver.findElement(SelectVariable10).click();}



    public  void EnterRuleName(String text){ driver.findElement(RuleName).sendKeys(text);}

    public void DoubleClickOnRule1(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Rule-1')]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnRule1Second(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[@ class='py-2 rulesetName']"));
        act.doubleClick(ele).perform();
    }
    public void DoubleClickOnTrue1(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//button[@class='float-left conditinBlockTrueButton ng-star-inserted']"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnTrue2(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[2]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[1]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnTrue3(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[1]"));
        act.doubleClick(ele).perform();
    }


    public void DoubleClickOnTrue4(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[1]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnTrue5(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[1]"));
        act.doubleClick(ele).perform();
    }


    public void DoubleClickOnFalse(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//button[@class='float-right conditionBlockFalseButton ng-star-inserted']"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnFalse1(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[2]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[2]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnFalse2(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[2]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[2]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnFalse3(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[2]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnFalse4(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[4]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[2]"));
        act.doubleClick(ele).perform();
    }

    public void DoubleClickOnFalse5(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[5]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/button[2]"));
        act.doubleClick(ele).perform();
    }




}
