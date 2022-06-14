package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class Custome_Wait
{
	public static void wait(WebDriver driver,By locator)
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.DAYS.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public static void waitElement(WebDriver driver,WebElement locator)
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.DAYS.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,0);
		wait.until(ExpectedConditions.visibilityOf(locator));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

}
