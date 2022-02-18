package Utilities;

import Base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Functions {
    public static void takescreenshot(String testname) throws IOException {
        File myfile = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(myfile, new File (System.getProperty("user.dir")+"\\target\\HTMLReport\\"+testname+"_fail.png"));

    }
}
