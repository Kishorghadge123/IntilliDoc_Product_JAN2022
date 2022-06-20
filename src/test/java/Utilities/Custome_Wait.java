package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static Utilities.Browser_Launch.driver;

public class Custome_Wait {


	public static void wait(WebDriver driver, WebElement element) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(element));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void waitElement (WebDriver driver, WebElement element) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(element));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}



	public static void wait(WebDriver driver, By locator) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.DAYS.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


	}

	public static void page_load_wait(WebDriver driver) {
		WebDriver.Timeouts time = driver.manage().timeouts();
		time.pageLoadTimeout(10, TimeUnit.SECONDS);

	}
	public static void wait1(WebDriver driver, By locator) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


//	public static void fluentwait(WebDriver driver) {
//		//Declare and initialise a fluent wait
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
//		WebElement element=wait.until(new Function<WebDriver, WebElement>() {
//		public WebElement apply(WebDriver driver){
//	}
}