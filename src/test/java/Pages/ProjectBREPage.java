package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProjectBREPage {


    WebDriver driver = null;

    By NextPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/div[1]/button[4]/span[1]");
    By ThreeDots = By.xpath("//mat-icon[contains(text(),'menu')]");
    By ProjectData = By.xpath("//mat-panel-title[contains(text(),'Project DATA')]");
    By DataSets = By.xpath("//mat-panel-title[contains(text(),'Datasets')]");
    By Variables = By.xpath("//mat-panel-title[contains(text(),'Variables')]");
    By AddRules = By.xpath("//span[contains(text(),'Rules')]");
    By DeleteRules = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/span[3]/mat-icon[1]");
    By ExpandFirstRule = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-icon[1]");
    By ExpandSecondRule = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-icon[1]");
    By ExpandThirdRule = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-icon[1]");
    By ExpandFourthRule = By.xpath("");
    By ExpandFifthRule = By.xpath("");

    //BREMedicalChart.
    By PNameCheck= By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/span[1]");
    By SetDocumentStatus = By.xpath("//span[contains(text(),'Set Document Status')]");
    By DocumentValue = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]");
    By Rejected = By.xpath("//span[contains(text(),'Rejected')]");
    By ActionType = By.xpath("//span[contains(text(),'Set Variable')]");
    By ContractFirstRule = By.xpath("//mat-icon[contains(text(),'visibility_off')]");
    By AddNameOfCondition = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");

    By RuleName = By.xpath("//input[@data-placeholder='Rule Name']");
    By FirstDecisionBox =  By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/span[1]");
    By AddCondition = By.xpath("//span[contains(text(),'Add Condition')]");
    By FirstCondition = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/span[1]");
    By  AndCondition = By.xpath("//span[contains(text(),'AND')]");


    By SelectPatientDemographics = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By SelectPatientDemographics1 = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By AddBREEntity = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By AddBREEntity1 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By AttributeValue = By.xpath("//span[contains(text(),'Attribute / Variable')]");

    By NameAttribute = By.xpath("//span[contains(text(),'NAME')]");
    By BRENameAttributePN = By.xpath("//span[contains(text(),'Patient Name')]");
    By BRENameAttributeDOB = By.xpath("//span[contains(text(),'Birthdate')]");
    By AddressAttribute = By.xpath("//span[contains(text(),'ADDRESS')]");
    By StateAttribute = By.xpath("//span[contains(text(),'STATE')]");
    By CityAttribute = By.xpath("//span[contains(text(),'CITY')]");
    By ZipAttribute = By.xpath("//span[contains(text(),'ZIP')]");

    By Visibility = By.xpath("//mat-icon[contains(text(),'visibility')]");
    By Operator = By.xpath("//span[contains(text(),'Operator')]");
    By OperatorValueEqualTo = By.xpath("//span[contains(text(),'==')]");
    By OperatorValueExistsIN = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By Save = By.xpath("//span[contains(text(),'Save ')]");
    By AddAction = By.xpath("//span[contains(text(),'Add Action')]");
    By ClickOnBREDataSet = By.xpath("//span[contains(text(),'dataset')]");
    By ClickOnAddBREDataSet = By.xpath("//span[contains(text(),'Auto-DataSet - Auto-SampleDataSet')]");
    By ClickOnAddBREDataSet1 = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By ClickOnBREDataHeader = By.xpath("//span[contains(text(),'Dataset Header')]");
    By SelectBREDatasetHeaderDXCode = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By SelectBREDatasetHeaderDOB = By.xpath("//span[contains(text(),'DOB')]");
    By ExpandVariables = By.xpath("//span[contains(text(),'Variables')]");
    By AddVariablesButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
    By VariableName = By.xpath("//input[@id='variableName']");
    By ValidationType = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By Name = By.xpath("//span[contains(text(),'Name')]");
    By Address = By.xpath("//span[contains(text(),'Address')]");
    By City = By.xpath("//span[contains(text(),'City')]");
    By State = By.xpath("//span[contains(text(),'State')]");
    By ZIP = By.xpath("//span[contains(text(),'Zip')]");

    By DefaultValue = By.xpath("//input[@id='VariableValue']");
    By AddButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]/span[1]");
    By CancelButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]");

    By Value= By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By ActionValue = By.xpath("//input[@data-placeholder='Enter name of Condition / Action']");

    By FalseBox1 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]");
    By FalseBox2 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[2]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]");
    By FalseBox3 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]");
    By FalseBox4 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[4]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]");
    By FalseBox5 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[5]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[2]/div[1]/div[1]/div[2]/mat-card[1]");


    By CreateProject = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/div[1]/button[2]/span[1]");
    By TrueBox1 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[1]");
    By TrueBox2 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[2]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]/mat-card[1]");
    By TrueBox3 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-tree-node[1]/div[1]/div[1]/div[1]/app-tree-node[1]/div[1]/div[1]/div[1]/div[2]");
    By TrueBox4 = By.xpath("");
    By TrueBox5 = By.xpath("");

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


    //Constructor
    public ProjectBREPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnCreateProjectButton(){driver.findElement(CreateProject).click();}
    public void ClickOnFirstTrueBoxButton(){driver.findElement(TrueBox1).click();}
    public void ClickOnSecondTrueBoxButton(){driver.findElement(TrueBox2).click();}
    public void ClickOnThirdTrueBoxButton(){driver.findElement(TrueBox3).click();}
    public void ClickOnFourthTrueBoxButton(){driver.findElement(TrueBox4).click();}
    public void ClickOnFifthTrueBoxButton(){driver.findElement(TrueBox5).click();}

//BRE Medical Chart
    public void ClickOnPNameCheck(){driver.findElement(PNameCheck).click();}
    public void ClickOnActionType(){driver.findElement(ActionType).click();}
    public void ClickOnDocumentValue(){driver.findElement(DocumentValue).click();}
    public void ClickOnSetDocumentStatus(){driver.findElement(SetDocumentStatus).click();}
    public void SelectDocumentStatusR(){driver.findElement(Rejected).click();}
    public void ClickOnNextPageButton(){driver.findElement(NextPage).click();}
    public void ClickOnThreeDotsButton(){driver.findElement(ThreeDots).click();}
    public void ClickOnProjectData(){driver.findElement(ProjectData).click();}
    public void ClickOnDataSets(){driver.findElement(DataSets).click();}
    public void ClickOnVariables(){driver.findElement(Variables).click();}
    public void ClickOnAddRulesButton(){driver.findElement(AddRules).click();}
    public void ClickOnDeleteRulesButton(){driver.findElement(DeleteRules).click();}
    public void ClickOnFirstDecisionBox(){driver.findElement(FirstDecisionBox).click();}
    public void SearchCreatedProject(){driver.findElement(Project).click();}

    public void ClickOnExpandFirstRule(){driver.findElement(ExpandFirstRule).click();}
    public void ClickOnExpandSecondRule(){driver.findElement(ExpandSecondRule).click();}
    public void ClickOnExpandThirdRule(){driver.findElement(ExpandThirdRule).click();}
    public void ClickOnExpandFourthRule(){driver.findElement(ExpandFourthRule).click();}
    public void ClickOnExpandFifthRule(){driver.findElement(ExpandFifthRule).click();}

    public void EnterAddNameOfCondition(String text){ driver.findElement(AddNameOfCondition).sendKeys(text);}

    public  void ClickOnRule(){driver.findElement(RuleName).click();}
    public  void ClickOnClearRule(){driver.findElement(RuleName).clear();}
    public  void EnterValue(String text){ driver.findElement(Value).sendKeys(text);}

    public  void ClickOnAddCondition(){driver.findElement(AddCondition).click();}
    public  void ClickOnFirstCondition(){driver.findElement(FirstCondition).click();}

    public  void ClickOnANDCondition(){driver.findElement(AndCondition).click();}

    public  void ClickOnAddBREEntity(){driver.findElement(AddBREEntity).click();}
    public  void ClickOnAddBREEntity1(){driver.findElement(AddBREEntity1).click();}
    public  void ClickOnAddBREEntityPD1(){driver.findElement(SelectPatientDemographics1).click();}
    public  void ClickOnAddBREEntityPD(){driver.findElement(SelectPatientDemographics).click();}

    public  void ClickOnAttributeValue(){driver.findElement(AttributeValue).click();}
    public  void SelectNameAttribute(){driver.findElement(NameAttribute).click();}
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

    public  void ClickOnFalseBoxButton1(){driver.findElement(FalseBox1).click();}
    public  void ClickOnFalseBoxButton2(){driver.findElement(FalseBox2).click();}
    public  void ClickOnFalseBoxButton3(){driver.findElement(FalseBox3).click();}
    public  void ClickOnFalseBoxButton4(){driver.findElement(FalseBox4).click();}
    public  void ClickOnFalseBoxButton5(){driver.findElement(FalseBox5).click();}


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
