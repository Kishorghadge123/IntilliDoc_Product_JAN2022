

package Pages;
import Utilities.Custome_Wait;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.qameta.allure.Step;
public class RoleAccessPage {
    WebDriver driver = null;
    //locator
    public  String rolepageurl="https://alpha.neutrino-ai.com/#/home/project-management";
    public  String crateroleurl="https://alpha.neutrino-ai.com/#/home/role-management";
    public By help=By.xpath("//button[contains(text(),'Help')]");
    By username = By.xpath("//input[@formcontrolname='userName']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By loginBtn = By.xpath("//button[@type='submit']");
    public By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By Document=(By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[6]"));
    By Project = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[5]");
    By ProjectForSupervisor = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By ProjectForOperator = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By Role =By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]");
    By createrole=By.xpath("//span[contains(text(),' Create Role ')]");
    By Template = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[3]");
    By Analytics = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]");
    By superdocumnet=By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[3]");
    By profileIconAdmin=By.xpath("(//div[text()='A'])[1]");
    public  static By forgotpassword= By.xpath("//a[contains(text(),'Forgot Password?')]");
    By ProfileIcon_SupervisorUser= By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-menu-trigger mat-icon-button mat-button-base mat-accent']");
    By profileIcon_Operator=By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-menu-trigger mat-icon-button mat-button-base mat-accent']");
    By Name=By.xpath("//div[contains(text(),'Name')])");
    public static By CreateRoleBtn = By.xpath("//span[text()=' Create Role ']");
    public RoleAccessPage(WebDriver driver) { this.driver = driver;}

    @Step("setUsername")
    public void setUsername(String text) {
        Custome_Wait.wait(driver,password);
        driver.findElement(username).sendKeys(text);
    }

    @Step("setPassword")
    public void setPassword(String text) {
        Custome_Wait.wait(driver,loginBtn);
        driver.findElement(password).sendKeys(text);
    }


    @Step("clickOperatorDocument")
    public  void clickOperatorDocument(){
        Actions act = new Actions(driver);
        WebElement ele2= driver.findElement(By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]"));
        act.doubleClick(ele2).perform();
    }


    public  void clickOperatorAnalytics(){driver.findElement(Analytics).click();}


    public  void clickOperatorProject(){driver.findElement(ProjectForOperator).click();}

    @Step("clickLoginButton")
    public void clickLoginButton() {

        driver.findElement(loginBtn).click();
    }

    public void clickprofileIconAdmin() {
        driver.findElement(profileIconAdmin).click();
    }

    @Step("click on superdocumnet")
    public void  superdocumnet(){
        driver.findElement(superdocumnet).click();
    }

    public void clickProfileIcon_SupervisorUser() {
        driver.findElement(ProfileIcon_SupervisorUser).click();
    }


    @Step("clickProfileIcon_operator_role")
    public  void clickProfileIcon_operator_role(){
        driver.findElement(profileIcon_Operator).click();
    }

    @Step("Double_clickAdminUser")
    public void Double_clickAdminUser(){
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("(//div[@class='mat-list-item-content'])[1]"));
        act.doubleClick(ele).perform();

    }

    @Step("clickAdminRole")
    public  void clickAdminRole(){

        driver.findElement(Role).click();


    }

    @Step("clickAdminTemplate")
    public void clickAdminTemplate(){driver.findElement(Template).click();}

    @Step("ClickLogout")
    public void ClickLogout(){driver.findElement(Logout).click();}

    @Step("clickAdminProject")
    public void clickAdminProject(){driver.findElement(Project).click();}

    public void clickAdminDocument(){driver.findElement(Document).click();}


    @Step("clickAdminAnalytic")public  void clickAdminAnalytic(){driver.findElement(Analytics).click();}


   @Step("Double_clickSupervisorTemplate")
   public void Double_clickSupervisorTemplate() {
        Actions act = new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]"));
        act.doubleClick(ele2).perform();
    }
    public void clickSupervisorProject(){driver.findElement(ProjectForSupervisor).click();}

    public void clickSupervisorDocument(){driver.findElement(Document).click();}


    @Step("clickSupervisorAnalytics")
    public void clickSupervisorAnalytics(){driver.findElement(Analytics).click();}
    public void ClearUserID(){driver.findElement(username).clear();}
    public void ClearPWD(){driver.findElement(password).clear();}


    public void verify_login_with_valid_username_password()
    {
        String actual_value="AE Admin";
        String exp_value=driver.findElement(By.xpath("//span[text()=' AE Admin ']")).getText();
        Assert.assertEquals(actual_value,exp_value);
    }

    public void verify_admin_role_access_users_tab()
    {
        String actual_url=driver.getCurrentUrl();

        String exp_url="https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_url,exp_url);
    }


    public void verify_admin_role_access_roles_tab()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_url,exp_url);
    }
    public void verify_admin_role_access_templates_tab()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_url,exp_url);
    }

    @Step("verify_admin_role_access_project_tab")
    public void verify_admin_role_access_project_tab()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_url,exp_url);
    }
    public void verify_admin_role_access_analytics_tab()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/analytics";
        Assert.assertEquals(actual_url,exp_url);
    }

    @Step("verify_admin_role_access_logout")
    public void verify_admin_role_access_logout()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/login";
        Assert.assertEquals(actual_url,exp_url);
    }
    // super
    public void verify_supervisor_role_valid_login()
    {
        String actual_value="AE Supervisor";
        String exp_value=driver.findElement(By.xpath("//span[text()=' AE Supervisor ']")).getText();
        Assert.assertEquals(actual_value,exp_value);
    }

    @Step(" click on verify_supervisor_role_access_template")
    public void verify_supervisor_role_access_template()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/n-training";
        Assert.assertEquals(actual_url,exp_url);
    }
    public void verify_supervisor_role_access_document()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/documents";
        Assert.assertEquals(actual_url,exp_url);
    }


    @Step(" click on verify_supervisor_role_access_analytics")
    public void verify_supervisor_role_access_analytics()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/login";
        Assert.assertEquals(actual_url,exp_url);
    }
    public void verify_operator_role_with_valid_login()
    {
        String actual_value="AE Operator";
        String exp_value=driver.findElement(By.xpath("//span[text()=' AE Operator ']")).getText();
        Assert.assertEquals(actual_value,exp_value);
    }
    public void verify_operator_role_access_document()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_url,exp_url);
    }
    public void verify_operator_role_access_analytics()
    {
        String actual_url=driver.getCurrentUrl();
        String exp_url="https://alpha.neutrino-ai.com/#/login";
        Assert.assertEquals(actual_url,exp_url);
    }
}