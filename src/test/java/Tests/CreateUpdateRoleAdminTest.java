package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.Functions;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static Pages.CreateRolePage.*;
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
    static CreateRolePage CreateRolePageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
//    @AfterClass
//    public void cleanUp() throws Exception {
//        driver.quit();
//    }
    @Test(priority = 1)
    public void login_with_valid_details() throws Exception {
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        CreateRolePageObj = new CreateRolePage(driver);
        //TC 2.1 Login with Valid Admin details.
        CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        CreateRolePageObj.ClickLoginButton();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        CreateRolePageObj.ClickRoleManagementBtn();
       Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);

     driver.navigate().back();
     Thread.sleep(9000);
        //Assert.assertEquals(errormsg,errormsgBlankDataCreateRoleClick);

    }
    @Test(priority = 2)
    public void blank_role_name_permission() throws Exception {
        //TC 2.2 Blank RoleName and Permission.
        Thread.sleep(9000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(role_tab_url);
Thread.sleep(3000);

    }
    @Test(priority = 3)
    public void valid_role_name_blank_permission() throws Exception {
        //TC 2.3 Valid RoleName and Blank Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Custome_Wait.wait(driver,CreateRolePage.ActiveRole);
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.ClickCreateButton();
        Custome_Wait.page_load_wait(driver);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        Thread.sleep(3000);


    }
    @Test(priority = 4)
    public void blank_role_name_valid_permission() throws Exception {
        //TC 2.4 Blank RoleName and Valid Permission.
      //TC2.8  Verify the working of admin for Create role button when user status is enabled
        CreateRolePageObj.ClickActiveRole();
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(3000);
        //Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' Create Template ' )]")));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(10000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(5000);


    }

    //need to change
    @Test(priority = 5)
    public void valid_role_and_permission() throws Exception {
        //TC 2.5 Valid Role and Valid Permission.
        CreateRolePageObj.ClickCreateRoleBtn();
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        Thread.sleep(9000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(3000);
        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u run
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(4000);
        String expectedDate = Functions.getCurrentDate();
        System.out.println("expectedDate="+expectedDate);
        //System.out.println("driver.findElement(CreatedTime).getText()="+driver.findElement(CreatedTime).getText());
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void create_role_with_existing_rolename() throws Exception {
        //TC 2.6 Create Role with Existing Role Name.

        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(3000);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(5000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);

    }
    @Test(priority = 7)
    public void search_created_role() throws Exception {
        //TC 2.7 Search the Created Role or not
        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getSearch_created_role_element()));

        Thread.sleep(3000);

    }

    @Test(priority = 8)
    public void update_role_with_valid_data() throws Exception {
        //TC 2.8 Update Role with Valid Data.
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(3000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(5000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        CreateRolePageObj.SelectViewDocumentPermission();
        Thread.sleep(5000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }

    @Test(priority = 9)
    public void remove_all_permissions() throws Exception {
        //TC 2.9 Remove All Permissions and Update.
        CreateRolePageObj.ClickEditRole();
        Thread.sleep(3000);
        CreateRolePageObj.ClickRemovePermission();
        Thread.sleep(2000);
        CreateRolePageObj.ClickUpdateBtn();
       Thread.sleep(2000);



    }
    @Test(priority = 10)
    public void disable_the_status_of_role_update() throws Exception {
        //TC 2.10 Disable the Status of Role and Update.
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
       AssertionsFunction.isPresent(CreateRolePageObj.ClickUpdateBtn);



    }
    @Test(priority = 11)
    public void enable_status_role_update() throws Exception {
        //TC 2.11 Enable the Status of Role and Update.
       Thread.sleep(2000);
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(3000);
        CreateRolePageObj.ClickUpdateBtn();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(CreateRolePageObj.ClickUpdateBtn);
        Thread.sleep(1000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);



    }
    @Test(priority = 12)
    public void Creating_role_invalid_data_in_RoleName_Permissions() throws Exception {
        //TC-3.2 Verify the working of admin for Creating role by putting invalid data in Role name, blank Permissions
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        CreateRolePageObj.ClickActiveRole();
        Thread.sleep(2000);
        CreateRolePageObj.ClickCreateButton();
               Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }
    @Test(priority = 13)
    public void Creating_role_invalid_data_with_disabled_status() throws Exception {
        //TC 3.5 Verify the working of admin for Create role button when user status is disabled
       Thread.sleep(5000);
        CreateRolePageObj.ClickCreateRoleBtn();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(create_role_url);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        Thread.sleep(1000);
        CreateRolePageObj.AddPermissionPlusBtn();
        Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
        CreateRolePageObj.ClickProcessDocPermission();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getProcessDocumentPermission()));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
        CreateRolePageObj.ClickCreateButton();
        Thread.sleep(3000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }
    @Test(priority = 14)
    public void Updating_role_invalid_data_RolenamePermissions() throws Exception {
        //TC 4.2  Verify the working of admin for Updating the role by putting invalid data in Role name,Permissions
        Thread.sleep(5000);
        CreateRolePageObj.ClickCreateRoleBtn();
       Thread.sleep(3000);
        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
        Assert.assertTrue(AssertionsFunction.is_Enabled(CreateRolePageObj.RoleName));
        Thread.sleep(2000);
        CreateRolePageObj.clickcancel();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);
    }
    @Test(priority = 15)
    public void Sorting_role() throws InterruptedException {
        //TC 6.1 Sorting by role, permission,updated,created
      Thread.sleep(3000);
        CreateRolePageObj.ClickSortRoleBtn();
        Thread.sleep(3000);
        CreateRolePageObj.ClickLogout();
        Thread.sleep(4000);
        AssertionsFunction.verifyTargetPageURL(loginPage_url);
Thread.sleep(3000);

    }




    @Test(priority = 16)
    public  void sorting_on_role_permission_updated_created() throws Exception{
        //IN2.16 Sorting by role, permission,updated,created
        CreateRolePageObj.rolesorting();
        CreateRolePageObj.permissionsorting();
        CreateRolePageObj.updatedsorting();
        CreateRolePageObj.createdsorting();
        AssertionsFunction.verifyTargetPageURL(rolepageurl);
        Thread.sleep(3000);


    }

}