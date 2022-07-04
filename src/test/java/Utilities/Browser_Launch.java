package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_Launch 
{
	///browser




	static WebDriver driver;
	
	  public Browser_Launch(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  
	  
	  public static WebDriver browser_launch(String url) throws Exception
	  {
		  String projectPath = System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver.exe");
		  
		  driver=new ChromeDriver();
		  
		  driver.get(url);
		  
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  return driver;
		  
	  }

}
