package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Verification_Functions 
{
	public static void actual_text_data_Campare(String act)
	{
		if(act.isEmpty())
		{
			System.out.println("Given Field Not Working as Expected......");
		}
		else
		{
			System.err.println("Given Field Working as Expected......");
		}
	}
	public static void check_statuses_enable_or_disable(WebDriver driver,WebElement element)
	{
	      String color_name = element.getCssValue("color");
	      String color_code = Color.fromString(color_name).asHex();
	      System.out.println("Hex code for color:" + color_code);
	      if(color_code.equalsIgnoreCase("#e87033"))
	      {
	    	System.out.println("Given Field is Enable and working as expected");  
	      }
	      else
	      {
	    	  System.err.println("Not Working");
	      }
	}
	
	public static void actual_text_data_Campare(String act,String expected)
	{
		if(act.equalsIgnoreCase(expected))
		{
			System.out.println("Given Field is Enable and working as expected.....");
		}
		else
		{
			System.out.println("Given Field is Not  Enable and Not working as expected.....");
		}
	}

	public static void url_verification(String expected_Url,String actual_Url)
	{

		if(actual_Url.equalsIgnoreCase(expected_Url))
		{
			System.out.println("URL Matched");
			
		}
		else
		{
			System.out.println("URL mismatched");
		}
	}
}
