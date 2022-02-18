package Base;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BasePage {

    public static WebDriver driver;
    public static ExtentTest test;
    static ProjectPage ProjectPageObj;
    static LoginPage loginPageObjects;
    public static void LoginTest() throws Exception {

        loginPageObjects = new LoginPage(driver);
        ProjectPageObj = new ProjectPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButton();
        Thread.sleep(10000);
    }
    public static void driverInit() throws Exception {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

//    @BeforeSuite
//    public static void updateObjectRepo() throws IOException, ConfigurationException {
//    int id = Integer.valueOf(ReadProps.readAttr("exec_id"));
//    id++;
//        PropertiesConfiguration config = new PropertiesConfiguration("Object_Repository.properties");
//        config.setProperty("exec_id", String.valueOf(id));
//
//        config.setProperty("AdminUserName", "AutoAdminUser"+ id);
//        config.setProperty("AdminID", config.getProperty("AdminUserName")+"@test.com");
//        config.setProperty("RoleName", "AutoAdmin"+ id);
//        config.setProperty("RoleNamePA", "AutoAdminPA"+ id);
//        config.setProperty("DName", "QAAutoDataset"+ id);
//        config.setProperty("StructuredProjectName1", "QA-AutoProject-Structured" + id);
//        config.setProperty("ProjectDisabledNameFA","QA-AutoDisable"+ id);
//        config.setProperty("ProjectDisabledNameA","QA-AutoDisable"+ (id + 1));
//        config.setProperty("SemiStructuredProjectName1","QA-AutoProject-SemiStructured"+ id);
//        config.setProperty("FreeFormProjectName1","QA-AutoProject-FreeForm"+ id);
//        config.setProperty("MedicalChartProjectName1","QA-AutoProject-MedicalChart"+ id);
//        config.setProperty("StartDate", new SimpleDateFormat("M/d/yyyy").format(new Date()));
//        config.setProperty("EndDate", config.getProperty("StartDate"));
//        config.save();
//        File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Pfizer.jpg");
//        File uploadFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\file_upload\\Pfizer"+id+".jpg");
//        FileUtils.copyFile(file, uploadFile);
//    }
//
//    @AfterSuite
//    public void cleanDirectory() throws IOException {
//        FileUtils.cleanDirectory(System.getProperty("user.dir")+"\\src\\test\\resources\\file_upload");
//    }
}