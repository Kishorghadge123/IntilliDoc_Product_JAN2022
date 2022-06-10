package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginUser
{
	public static void login_users(WebDriver driver,String username, String password) throws Exception
	{
		Project_Module_Locators loc=PageFactory.initElements(driver, Project_Module_Locators.class);
		loc.userName.sendKeys(username);
		loc.password.sendKeys(password);
        loc.loginButton.click();
        Thread.sleep(10000);
	}

	public static void logoutUser(WebDriver driver) throws Exception
	{
		driver.findElement(By.xpath("//span[@mattooltip='Logout']")).click();
	}
}
