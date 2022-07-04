package Utilities;

import Base.BasePage;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;






public class AssertionsFunction extends BasePage{
///assertions
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
        System.out.println(actualValue);
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

    public  static boolean verifyColor(By element_Locator, String exc) {

        //WebElement color =driver.findElement(By.xpath("//div[text()=' Structured ']//following::div[2]"));
       WebElement color=driver.findElement(element_Locator);
        String backgroundcolor=color.getCssValue("background-color");
        String hexcolor= Color.fromString(backgroundcolor).asHex();
        String actual=hexcolor;
        Assert.assertEquals(actual,exc);
        return false;
    }


}

