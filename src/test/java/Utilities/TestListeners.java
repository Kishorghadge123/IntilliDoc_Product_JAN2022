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
public class TestListeners implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
            Functions.saveFailureScreenShot();
    }
}
