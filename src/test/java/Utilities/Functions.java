package Utilities;

import Base.BasePage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Functions {
    public static void takescreenshot(String testname) throws IOException {
        File myfile = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(myfile, new File (System.getProperty("user.dir")+"\\HTMLReport\\"+testname+"_fail.png"));

    }
    public static boolean isElementPresent(By locator){
        try{
            BasePage.driver.findElement(locator).isDisplayed();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public static String getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = formatter.format(new Date());
        return date;
    }
////    public static boolean isSelectedOption(By locator){
//        try {
//            BasePage.driver.findElement(locator).isSelected();
//            return true;
//        }
//        catch (Exception e) {
//            return false;
//        }
//    }

    public static void custom_wait(By element)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    @Attachment
    public static byte[] saveFailureScreenShot()
    {
        return ((TakesScreenshot)BasePage.driver).getScreenshotAs(OutputType.BYTES);
    }
    @Step("{0}")
    public static void logStep(String message){
        // intentionally kept empty
    }


}
