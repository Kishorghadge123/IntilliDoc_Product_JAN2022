package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Random;

public class CreateRolePage {

    WebDriver driver = null;
    //TC 6.1 element locators

    public static By RoleManagementBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-id-card m-0 side-icon ng-star-inserted']");
    public static By CreateRoleBtn = By.xpath("//span[contains(text(),'Create Role')]");

    By ClickCreate = By.xpath("//*[text()= ' Create ']");
    public By RoleName = By.xpath("//input[@formcontrolname='role']");
    By ActiveRole = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By AddPermission = By.xpath(" //button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By ViewDocumentPermission = By.xpath("//span[contains(text(),'View Document' )]");
    By validationMsg=By.xpath("//*[text()='Only alphabets,digits,parenthesis and hyphens are allowed while giving a role name.']");
    By ClickCancel = By.xpath("//span[contains(text(),'Cancel')]");
    By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    By EditRole = By.xpath("//*[text()=' Action ']//following::tr[1]/td[1]"); //edit by suwarna  and work for all role selection
    By ProcessDocumentPermission = By.xpath("//span[contains(text(),' Process Document ')]");
    By ViewApiConfig=By.xpath("//span[text()=' View API Config ']");
    By CreateUserPermission = By.xpath("//span[contains(text(),'Create User')]");
    By CreateProject = By.xpath("//span[contains(text(),'Create Project')]");
    By ViewUser = By.xpath("//span[contains(text(),'View User')]");
    By ViewRole = By.xpath("//span[contains(text(),'View Role')]");
    By UpdateProject = By.xpath("//span[contains(text(),'Update Project')]");
    By UpdateUser = By.xpath("//span[contains(text(),'Update User')]");
    By CreateTemplate = By.xpath("//span[contains(text(),'Create Template')]");
    By CreateRole = By.xpath("//span[contains(text(),'Create Role')]");
    By ViewAnalytics    = By.xpath("//span[contains(text(),'View Analytics')]");
    By RemoveProcessDocPermission = By.xpath("//mat-icon[contains(text(),'cancel')]");
    By UpdateRole = By.xpath("//span[contains(text(),'Update Role')]");
    public static By ClickUpdateBtn = By.xpath("//span[contains(text(),'Update' )]");
    By RemovePermission = By.xpath("//mat-icon[contains(text(),'cancel')]");
    By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By LoginBtn = By.xpath("//button[@type='submit']");
    By Username = By.xpath("//input[@formcontrolname='userName']");
    By Password = By.xpath("//input[@formcontrolname='password']");
    By search_created_role_element=By.xpath("//*[@mattooltipposition='below']");

    public static By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    public static By CreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");
    //
    public static By RoleCreatedTime=By.xpath("//input[@formcontrolname='created']");
    public static By RoleUpdatedTime=By.xpath("//input[@formcontrolname='updated']");
    By sortRole= By.xpath("//div[text()='Roles ']");

    public static By errormsgBlankDataCreateRoleClick=By.xpath("//span[contains(text(),'Please enter all the details before submitting.')]");
    public static String loginPage_url="https://alpha.neutrino-ai.com/#/login";
    public static String homepage_url="https://alpha.neutrino-ai.com/#/home/project-management";
    public static String role_tab_url="https://alpha.neutrino-ai.com/#/home/role-management";
    public static String create_role_url="https://alpha.neutrino-ai.com/#/home/role-management/create-role";
    public static String edit_role_url="https://alpha.neutrino-ai.com/#/home/role-management/edit-role/61b8747950fd017465189427";
    public static String errormsg="Please enter all the details before submitting.";
    public static String role_exist_error_msg="Role exist with name AutoAdminPA41";
    public By errormsg_roleExist_CreateRoleClick=By.xpath("//*[@class='mat-simple-snackbar ng-star-inserted']");

    public By getCreateUserPermission(){return this.CreateUserPermission;}
    public By getvalidationMsg(){return  this.validationMsg;}
    public By getroleExist_errormsg(){
        return this.errormsg_roleExist_CreateRoleClick;
    }
    public By getProcessDocumentPermission(){return  this.ProcessDocumentPermission;}
    public By getViewApiConfig(){return this.ViewApiConfig;}
    public By getViewDocumentPermission(){return this.ViewDocumentPermission;}
    public By getSearch_created_role_element(){return this.search_created_role_element;}

    public CreateRolePage(WebDriver driver) throws IOException {this.driver = driver;}

    public void ClickSortRoleBtn(){driver.findElement(sortRole).click();}
    public void ClickRoleManagementBtn() {
        driver.findElement(RoleManagementBtn).click();
    }
    public void ClickCreateRoleBtn() {
        driver.findElement(CreateRoleBtn).click();
    }

    public void EnterNewRoleName(String roleName)
    {
        Random r = new Random();
        char first_c = (char)(r.nextInt(26) + 'a');
        char second_c = (char)(r.nextInt(26) + 'a');
        driver.findElement(RoleName).sendKeys(roleName+first_c+second_c);
    }

    public void enterExistingRoleName_OrInvalidRoleName(String roleName)
    {
        driver.findElement(RoleName).click();
    }
    public void AddPermissionPlusBtn() {driver.findElement(AddPermission).click();}

    public void SelectViewDocumentPermission() {
        driver.findElement(ViewDocumentPermission).click();
    }
    public void SelectCreateUserPermission(){
        driver.findElement(CreateUserPermission).click();
    }
    public  void SelectCreateProject(){driver.findElement(CreateProject).click();}
    public void SelectViewUser(){driver.findElement(ViewUser).click();}
    public void SelectUpdateRole(){driver.findElement(UpdateRole).click();}
    public  void SelectViewRole(){driver.findElement(ViewRole).click();}
    public void SelectUpdateProject(){driver.findElement(UpdateProject).click();}
    public void SelectUpdateUser(){driver.findElement(UpdateUser).click();}
    public void SelectCreateTemplate(){driver.findElement(CreateTemplate).click();}
    public  void SelectCreateRole(){driver.findElement(CreateRole).click();}
    public  void SelectViewAnalytics(){driver.findElement(ViewAnalytics).click();}

    public void ClickActiveRole() {
        driver.findElement(ActiveRole).click();
    }

    public void ClickCancelButton() {
        driver.findElement((ClickCancel)).click();
    }

    public void ClickCreateButton() throws Exception{
        driver.findElement(ClickCreate).click();
    }

    public void SearchCreatedRole(String text) {
        driver.findElement(SearchRole).sendKeys(text);
    }

    public void ClickEditRole()
    {
        driver.findElement(EditRole).click();
    }
    public void ClickProcessDocPermission() {
        driver.findElement(ProcessDocumentPermission).click();
    }
    public void ClickViewApiConfig(){driver.findElement(ViewApiConfig).click();}

    public void RemoveProcessPermission() {
        driver.findElement(RemoveProcessDocPermission).click();
    }

    public void ClickUpdateBtn() {
        driver.findElement(ClickUpdateBtn).click();
    }

    public void ClickRemovePermission() {
        driver.findElement(RemovePermission).click();
    }

    public void ClickLogout() {
        driver.findElement(Logout).click();
    }

    public void EnterUsername(String text) {driver.findElement(Username).sendKeys(text);}

    public void EnterPassword(String text) {driver.findElement(Password).sendKeys(text);}

    public void ClickLoginButton() {
        driver.findElement(LoginBtn).click();
    }



}