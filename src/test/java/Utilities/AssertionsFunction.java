package Utilities;

import Base.BasePage;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.xml.sax.Locator;
        import java.security.PublicKey;

public class AssertionsFunction extends BasePage{

    public static void verifyElementText(String expectedValue, By element_Locator)
    {
        String actualValue= driver.findElement(element_Locator).getText();
        System.out.println(actualValue);
        Assert.assertEquals(actualValue,expectedValue);
    }
    public static void verifyElementTextNotSame(By eleOne,By eleTwo)
    {
        String act=driver.findElement(eleOne).getText();
        String exp=driver.findElement(eleTwo).getText();
        Assert.assertNotEquals(act,exp);
    }
    public static void verifyElementTextSametype(By eleOne,By eleTwo)
    {
        String act=driver.findElement(eleOne).getText();
        String exp=driver.findElement(eleTwo).getText();
        Assert.assertEquals(act,exp);
    }
    public static void verifyElementTextWithTrim(String expectedValue, By element_Locator)
    {
        String[] Value = driver.findElement(element_Locator).getText().split(" ");
        String actualValue = Value[1].trim();
        System.out.println(actualValue);
        Assert.assertEquals(expectedValue,actualValue );
    }
    public static void verifyElementDeletedTextWithTrim(String expectedValue, By element_Locator)
    {
        String[] Value = driver.findElement(element_Locator).getText().split(" ");
        String actualValue = Value[1].trim();
        Assert.assertNotEquals(expectedValue,actualValue);
    }
    public static void verifyDeletedElementText(String expectedValue, By element_Locator)
    {
        String actualValue= driver.findElement(element_Locator).getText();
        System.out.println(actualValue);
        Assert.assertNotEquals(actualValue,expectedValue);
    }
    public static void  verify_ElementHover(String expectedValue, By element_Locator)
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(element_Locator);
        action.moveToElement(element).build().perform();
        String actualvalue = driver.findElement(element_Locator).getText();
        Assert.assertEquals(actualvalue, expectedValue);
    }
    public static void verifyElementPresent(By element_Locator)
    {
        Assert.assertTrue(isPresent(element_Locator),"element "+element_Locator+"not present");
    }
    public static boolean isPresent(By locator){
        try{
            driver.findElement(locator).isDisplayed();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public static boolean is_Enabled(By locator){
        try {
            driver.findElement(locator).isEnabled();
            return true;
        }
             catch(Exception e){
                return false;
            }
        }

    public static void verifyTargetPageURL (String expectedValue)
    {
        String actualValue = driver.getCurrentUrl();
        Assert.assertEquals(actualValue , expectedValue);
    }
    public static void verifyElementSelected(By element_Locator)
    {
        driver.findElement(element_Locator).isSelected();
    }

    public static void verifyElementAttribute(String expectedValue, By element_Locator)
    {
        String actualValue= driver.findElement(element_Locator).getAttribute("textContent");
        Assert.assertEquals(actualValue,expectedValue);
    }
    public static void verifyElementCreatedUpdatedTime(By element_Locator1, By element_Locator2)
    {
        String actualValue= driver.findElement(element_Locator1).getText();
        System.out.println(actualValue);
        String expectedValue= driver.findElement(element_Locator2).getText();
        Assert.assertEquals(actualValue,expectedValue);
    }

    public static void verifyElementCreatedUpdatedTimeUpdated(By element_Locator1, By element_Locator2)
    {
        String actualValue= driver.findElement(element_Locator1).getText();
        System.out.println(actualValue);
        String expectedValue= driver.findElement(element_Locator2).getText();
        Assert.assertNotEquals(actualValue,expectedValue);
    }

}

