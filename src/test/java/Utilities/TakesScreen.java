package Utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakesScreen {

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception
        {
            File screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

            //Copy the file to a location and use try catch block to handle exception
            try {
               // FileUtils.copyFile(screenshot, new File(fileWithPath));
                String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
                FileUtils.copyFile(screenshot, new File(fileWithPath +" "+timestamp+".jpg"));

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }




