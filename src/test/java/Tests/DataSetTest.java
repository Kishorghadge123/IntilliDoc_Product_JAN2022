package Tests;
import Base.BasePage;
import Pages.DatasetPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(Utilities.TestListeners.class)
public class DataSetTest extends BasePage {
    static DatasetPage DatasetPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void create_category_with_blank_name() throws Exception {
        DatasetPageObj = new DatasetPage(driver);
        DatasetPageObj.ClickDatasetBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
        Thread.sleep(2000);
        //TC 6.1 - Create category with blank name.
        DatasetPageObj.ClickAddCategoryBtn();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getCreateNewDatasetCategory()));

    }

    @Test(priority = 2)
    public void create_category_with_invalid_name() throws Exception {
        //TC 6.2 - Create Category with Invalid Name.
        DatasetPageObj.ClickCategoryName(ReadProps.readAttr("Invalid_Name"));
        Thread.sleep(2000);
        DatasetPageObj.ClickCategoryCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);

    }

    @Test(priority = 3)
    public void create_category_with_valid_name() throws Exception {
        //TC 6.3 - Create category with Valid name.
        DatasetPageObj.ClickAddCategoryBtn();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getCreateNewDatasetCategory()));
        Thread.sleep(2000);
        DatasetPageObj.ClickCategoryName(ReadProps.readAttr("DName"));//Change Dataset Name before executing
        Thread.sleep(2000);
        DatasetPageObj.ClickCreateCategory();
        Thread.sleep(4000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getcreatedCategory()));

    }

    @Test(priority = 4)
    public void add_dataset_with_blank_and_no_chosen_file() throws Exception {
        //TC 6.4 - Perform action to add dataset with blank name and no chosen file.
        DatasetPageObj.ClickActionBtn();
        Thread.sleep(2000);
        Assert.assertTrue(Functions.isElementPresent(DatasetPageObj.getCreateNewDataset()));
        Thread.sleep(2000);
        DatasetPageObj.ClickAddDatasetCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
    }



    @Test(priority = 5)
    public void add_dataset_with_blank_and_name_chosen_file() throws Exception {
        //TC 6.5 - Perform action to add dataset with name and no chosen file.
        DatasetPageObj.ClickActionBtn();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getCreateNewDataset()));
        Thread.sleep(2000);
        DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName"));//Change before executing.
        Thread.sleep(2000);
        DatasetPageObj.ClickAddDatasetCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
    }

    @Test(priority = 6)
    public void add_dataset_with_csv_file_validation() throws Exception {
        //TC 6.6 - Perform action to add dataset with name, chosen file (.csv) but no validation type.
        DatasetPageObj.ClickActionBtn();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getCreateNewDataset()));
        Thread.sleep(2000);
        DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName"));//Change before executing.
        Thread.sleep(2000);
        WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
        upload_file.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\sampledata.csv");
        Thread.sleep(2000);
        DatasetPageObj.ClickAddDatasetCancelBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);

    }

    @Test(priority = 7)
    public void add_dataset_created_category_name_chosen_file_valid_type() throws Exception {
        //TC 6.7 - Perform action to add dataset file in the created category with name, chosen file and validation type.
        DatasetPageObj.ClickActionBtn();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getCreateNewDataset()));
        Thread.sleep(2000);
        DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName"));//Change before executing
        Thread.sleep(2000);
        WebElement upload_file1 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
        upload_file1.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\sampledata.csv");
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);

    }

    @Test(priority = 8)
    public void validation_type_as_name_to_create_new_dataset() throws Exception {
        //TC 6.8 - Validation type as "name" for dataset to create a new dataset.
        DatasetPageObj.ClickValidationDropDown();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationName();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void validation_type_as_phone_role_to_create_new_dataset() throws Exception {
        //TC 6.9 - Validation type as "phone" for roles to create a new dataset.
        DatasetPageObj.ClickValidationDropDown2();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationName();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationDropDown3();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationRoles();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,20000)", "");
        Thread.sleep(4000);
        DatasetPageObj.ClickValidationDropDown4();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationEmail();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationDropDown5();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationText();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationDropDown6();
        Thread.sleep(2000);
        DatasetPageObj.ClickValidationText();
        Thread.sleep(2000);
        DatasetPageObj.ClickCreateDataset();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);

    }

    @Test(priority = 10)
    public void search_created_document_and_expand() throws Exception {
        //TC 6.10 - Search created category and click to expand it.
        DatasetPageObj.ClickSearchBox(ReadProps.readAttr("DName"));//Change before executing
        Thread.sleep(4000);
        DatasetPageObj.ClickExpand1();
        AssertionsFunction.isPresent(DatasetPageObj.ExpandDataset1);
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void select_open_file_and_cancel() throws Exception {
        //TC 6.11 - Select file to open it and cancel.
        Thread.sleep(2000);
        DatasetPageObj.ClickDatasetFileName();
        AssertionsFunction.isPresent(DatasetPageObj.DatasetFile);
        Thread.sleep(2000);

    }
}
