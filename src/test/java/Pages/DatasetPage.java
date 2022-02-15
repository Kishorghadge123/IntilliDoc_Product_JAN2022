package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatasetPage {

        WebDriver driver = null;
        By DatasetBtn = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/app-sidebar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-nav-list[1]/mat-list-item[4]/div[1]/i[1]");
        By AddCategoryBtn = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[1]/div[1]/div[3]/button[1]/span[1]");
        By CategoryName = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
        By CreateCategory = By.xpath("//span[contains(text(),'Create Category')]");
        By CategoryCancelBtn = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]");

        By ActionBtn = By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]/span[1]/mat-icon[1]");

        By SearchBox = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");        //driver.clear();
        By ExpandDataset1 = By.xpath("//tbody/tr[1]/td[1]");

        By DatasetFile = By.xpath("//td[contains(text(),'sampledata.csv')]");
        By CancelDatasetFile = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-datasetviewer[1]/div[1]/div[1]/h5[1]/button[1]/span[1]");
        By Action = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/button[1]/span[1]/mat-icon[1]");
        By DatasetName = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
        By ValidationDropDown1 = By.xpath("//tbody/tr[1]/td[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]");
        By ValidationName= By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
        By ValidationDropDown2 = By.xpath("//tbody/tr[2]/td[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]");
        By ValidationRoles = By.xpath("//span[contains(text(),'Phone')]");
        By DisableDataset = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]");

        By CreateDataset = By.xpath("//span[contains(text(),'Create Dataset')]");
        By NewDatasetCancelBtn = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]");

        public DatasetPage(WebDriver driver) { this.driver = driver;}

        public void ClickDatasetBtn(){ driver.findElement(DatasetBtn).click();}
        public void ClickAddCategoryBtn(){ driver.findElement(AddCategoryBtn).click();}
        public void ClickCategoryName(String text){ driver.findElement(CategoryName).sendKeys(text);}
        public void ClickCreateCategory(){driver.findElement(CreateCategory).click();}

        public void ClickActionBtn(){driver.findElement(ActionBtn).click();}
        public void ClickDatasetName(String text){ driver.findElement(DatasetName).sendKeys(text);}
        public void ClickValidationDropDown(){driver.findElement(ValidationDropDown1).click();}
        public void ClickValidationName(){driver.findElement(ValidationName).click();}
        public void ClickValidationDropDown2(){driver.findElement(ValidationDropDown2).click();}
        public void ClickValidationRoles(){driver.findElement(ValidationRoles).click();}
        public void ClickCreateDataset(){driver.findElement(CreateDataset).click();}
        public void ClickCategoryCancelBtn(){driver.findElement(CategoryCancelBtn).click();}

        public void ClickSearchBox(String text){ driver.findElement(SearchBox).sendKeys(text);}
        public void ClickExpand1(){driver.findElement(ExpandDataset1).click();}
        public void ClickDatasetFileName(){ driver.findElement(DatasetFile).click();}
        public void ClickCancelDatasetFileName(){ driver.findElement(CancelDatasetFile).click();}
        public void ClickDisableUser(){driver.findElement(DisableDataset).click();}
        public void ClickAddDatasetCancelBtn(){ driver.findElement(NewDatasetCancelBtn).click();}
}