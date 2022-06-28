package Base;

import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
//import org.apache.commons.io.FileUtils;
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
import java.util.concurrent.TimeUnit;




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
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(10000);
    }

    public static void AdminLoginTest() throws Exception {

        loginPageObjects =  new LoginPage(driver);
        ProjectPageObj = new ProjectPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(10000);
    }

    public static void OperatorLoginTest() throws Exception {

        loginPageObjects = new LoginPage(driver);
        ProjectPageObj = new ProjectPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("OperatorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(10000);
    }

    public static void supervisiorLoginTest() throws Exception {

        loginPageObjects = new LoginPage(driver);
        ProjectPageObj = new ProjectPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        ProjectPageObj.EnterUsername(ReadProps.readAttr("SupervisorUser"));
        loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
        loginPageObjects.clickLoginButtonForValidInput();
        Thread.sleep(10000);
    }

    public static void driverInit() throws Exception {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }


    @BeforeSuite
    public static void updateObjectRepo() throws IOException, ConfigurationException {
        int exec_id = Integer.valueOf(ReadProps.readAttr("exec_id"));
        exec_id++;
        PropertiesConfiguration config = new PropertiesConfiguration("Object_Repository.properties");
        config.setProperty("exec_id", String.valueOf(exec_id));
        // config.setProperty("AdminUserName", "AutoAdminUser"+ exec_id);
        config.setProperty("AdminID", config.getProperty("AdminUserName")+"@test.com");
        config.setProperty("RoleName", "AutoAdmin"+ exec_id);
        config.setProperty("RoleNamePA", "AutoAdminPA"+ exec_id);
        config.setProperty("DName", "QAAutoDataset"+ exec_id);
        config.setProperty("StructuredProjectName1", "QA-AutoProject-Structured" + exec_id);
        config.setProperty("ProjectDisabledNameFA","QA-AutoDisable"+ exec_id);
        config.setProperty("ProjectDisabledNameA","QA-AutoDisable"+ (exec_id + 1));
        config.setProperty("SemiStructuredProjectName1","QA-AutoProject-SemiStructured"+ exec_id);
        config.setProperty("FreeFormProjectName1","QA-AutoProject-FreeForm"+ exec_id);
        config.setProperty("MedicalChartProjectName1","QA-AutoProject-MedicalChart"+ exec_id);
        config.setProperty("StartDate", new SimpleDateFormat("M/d/yyyy").format(new Date()));
        config.setProperty("EndDate", config.getProperty("StartDate"));
        config.save();}



}