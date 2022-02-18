package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestListeners implements ITestListener {
    public static ExtentTest test;
    static ExtentReports report;
    static WebDriver driver= BasePage.driver;
    @Override
    public void onFinish(ITestContext result) {
        report.endTest(test);
        report.flush();

    }

    @Override
    public void onStart(ITestContext result) {
        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        report = new ExtentReports(System.getProperty("user.dir")+"\\target\\HTMLReport\\"+result.getSuite().getName()+"_Report_"+timestamp+".html");
        report.loadConfig(new File (System.getProperty("user.dir")+"\\target\\HTMLReport\\config.xml"));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {

            Functions.takescreenshot(result.getName());
        } catch (IOException e) {

            e.printStackTrace();
        }
        test.log(LogStatus.FAIL,result.getInstanceName()+" : "+result.getName().replace("_"," ")+" -- FAILED due to below error: \n"+ result.getThrowable().toString(),test.addScreenCapture(result.getName()+"_fail.png"));


    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.log(LogStatus.SKIP,result.getInstanceName()+" : "+result.getName().replace("_"," ")+" -- SKIPPED");

    }

    @Override
    public void onTestStart(ITestResult result) {
        test = report.startTest(result.getName().replace("_"," "));

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(LogStatus.PASS,result.getInstanceName()+" : "+result.getName().replace("_"," ")+" -- PASSED");


    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {


    }

}
