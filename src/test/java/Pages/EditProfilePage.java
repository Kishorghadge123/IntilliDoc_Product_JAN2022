package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EditProfilePage
{
    WebDriver driver = null;
    By Profile = By.xpath("//div[@class='profileImageIcon ng-star-inserted']");
    By NightMode = By.xpath("//*[contains(text(),'Night Mode')]");
    By DayMode = By.xpath("//*[contains(text(),'Day Mode')]");
    By EditProfile = By.xpath("//button[@id='profile-modal-button']");
    By Cancel = By.xpath("//mat-icon[contains(text(),'close')]");
    By Visible = By.xpath("//mat-icon[contains(text(),'visibility')]");
    By Save=By.xpath(" //span[contains(text(),' Save')]");

    public EditProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickVisible(){driver.findElement(Visible).click();}
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
    }
    public void CancelButton() {
        driver.findElement(Cancel).click();
    }
    public void SaveButton(){driver.findElement(Save).click();}

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