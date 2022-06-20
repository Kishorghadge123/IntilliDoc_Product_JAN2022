package Pages;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EditProfilePage
{
    WebDriver driver = null;

    // Locators
    public static By Profile = By.xpath("//div[@class='profileImageIcon ng-star-inserted']");
    By NightMode = By.xpath("//mat-label[contains(text(),'Night Mode')]");
    public  static By project=By.xpath("//span[contains(text(),' Create Project ')]");
    By DayMode = By.xpath("//mat-label[contains(text(),'Day Mode')]");
    public  static By EditProfile = By.xpath("//button[@id='profile-modal-button']");
    public By settingbtn=By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[9]");
    By Cancel = By.xpath("//mat-icon[contains(text(),'close')]");
    public  static By Visible = By.xpath("//mat-icon[contains(text(),'visibility')]");
   public By Save=By.xpath(" //span[contains(text(),' Save')]");
   public By applybtn=By.xpath("//span[contains(text(),' Apply ')]");
   public By theme=By.xpath("(//img[@class='img-responsive'])[1]");
    public String loginTabUrl="https://alpha.neutrino-ai.com/#/home/project-management";
    public EditProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickVisible(){driver.findElement(Visible).click();
    }
    public void ProfileButton() {
        driver.findElement(Profile).click();


    }
    public void NightModeButton() {
        driver.findElement(NightMode).click();
    }
    public void DayModeButton() {
        driver.findElement(DayMode).click();
    }

    public void EditProfileButton() {
        driver.findElement(EditProfile).click();
        Custome_Wait.wait(driver,Save);
    }
    public  void clickonsettingbtn(){
        driver.findElement(settingbtn).click();
    }
    public void CancelButton() {
        driver.findElement(Cancel).click();
        Custome_Wait.wait(driver,project);
    }
    public void clickontheme(){
        driver.findElement(theme).click();
    }
    public void SaveButton(){driver.findElement(Save).click();
        Custome_Wait.wait(driver,project);
    }
    public void clickonapplybtn(){
        driver.findElement(applybtn).click();
    }


    public void verify_profile_icon()
    {
        String acutal_value="NTS Platform Admin";
        String exp_value=driver.findElement(By.xpath("//span[contains(text(),'NTS Platform Admin')]")).getText();
        Assert.assertEquals(acutal_value,exp_value);
    }
    public  void verify_edit_profile()
    {
        String acutal_value="Edit Profile";
        String exp_value=driver.findElement(By.xpath("//span[text()='Edit Profile']")).getText();
        Assert.assertEquals(acutal_value,exp_value);
    }
    public void verify_Day_Mode()
    {
        String acutal_value="Day Mode";
        String exp_value=driver.findElement(By.xpath("//mat-label[text()='Day Mode']")).getText();
        Assert.assertEquals(acutal_value,exp_value);

    }
    public void verify_night_mode()
    {
        String actual_value="Night Mode";
        String exp_value=driver.findElement(By.xpath("//mat-label[text()='Night Mode']")).getText();
        Assert.assertEquals(actual_value,exp_value);
    }

    public void verify_edit_profile_cancel()
    {
        String acutal_value="N";
        String exp_value=driver.findElement(By.xpath("//div[@class='profileImageIcon ng-star-inserted']")).getText();
        Assert.assertEquals(acutal_value,exp_value);

    }
}