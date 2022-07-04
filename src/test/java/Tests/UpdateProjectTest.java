package Tests;
import Pages.Project_Module;
import Utilities.AssertionsFunction;
import  Utilities.Custome_Wait;
import io.qameta.allure.*;
import Base.BasePage;
import Pages.CreateUserPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
@Feature("Update Project Test")
@Listeners(Utilities.TestListeners.class)

public class UpdateProjectTest extends BasePage {
    ProjectPage ProjectPageObj;
    CreateUserPage userPage;
    @Step("Login Test started")
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @Step("Closed the Browser")
    @AfterClass
    public void cleanUp() throws Exception
    {

        driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 - updating_project_with_valid_data")
    @Description("verify user able to updating_project_with_valid_data")
    @Test (priority=1,groups="smoke", description = " verify updating_project_with_valid_data")

    public void updating_project_with_valid_data() throws Exception {
        Robot r = new Robot();
        ProjectPageObj = new ProjectPage(driver);
        userPage=new CreateUserPage(driver);
        //TC 21.1 Verify the working of Platform Admin for  Updating Project by entering Valid Data.
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("new@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadSampleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 - to_maintain_script")
    @Description("verify user able to to_maintain_script")
    @Test (priority=2,groups="smoke", description = " verify to_maintain_script")


    public void to_maintain_script() throws Exception {
        //To maintain script
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("qaadmin@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadAdminBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - update_project_when_role_status_disabled")
    @Description("verify user able to update_project_when_role_status_disabled")
    @Test (priority=3,groups="smoke", description = " verify update_project_when_role_status_disabled")

    public void update_project_when_role_status_disabled() throws Exception {
        //TC 21.2 Verify the working of Platform Admin for Update Project button when Role and User Status is Disabled.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(1000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRoleUserDisableEnable();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        //User Disable.
        userPage.clickOnUserMenu();
        Thread.sleep(3000);
        userPage.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
        Thread.sleep(1000);
        userPage.selectSearchedUser();
        Thread.sleep(1000);
        userPage.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(1000);
        userPage.clickOnUpdateUserButton();
        AssertionsFunction.isPresent(userPage.UpdateUser);
Thread.sleep(2000);
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004 - disabled_roles_are_not_displayed_in_add_role_list")
    @Description("verify user able to disabled_roles_are_not_displayed_in_add_role_list")
    @Test (priority=4,groups="smoke", description = " verify disabled_roles_are_not_displayed_in_add_role_list")

    public void disabled_roles_are_not_displayed_in_add_role_list() throws Exception {
        //TC 21.3 Verify that all Disabled roles are not displayed in add role list while updating a project by Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("qaadmin@gmail.com");
        Thread.sleep(1000);

        ProjectPageObj.ClearSearchLead();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.ClickOnUpdateProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        //User status is enabled.
        userPage.clickOnUserMenu();
        Thread.sleep(3000);
        userPage.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
        Thread.sleep(1000);
        userPage.selectSearchedUser();
        Thread.sleep(1000);
        userPage.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(1000);
        userPage.clickOnUpdateUserButton();
        AssertionsFunction.isPresent(userPage.UpdateUser);
        Thread.sleep(1000);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005 - update_project_button_when_role_and_user_status_enabled")
    @Description("verify user able to update_project_button_when_role_and_user_status_enabled")
    @Test (priority=5,groups="smoke", description = " verify update_project_button_when_role_and_user_status_enabled")

    public void update_project_button_when_role_and_user_status_enabled() throws Exception {
        //TC 21.4 Verify the working of Platform Admin for Update Project button  when role and user status is enabled.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();

        Thread.sleep(1000);
        ProjectPageObj.ClickOnRoleUserDisableEnable();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));


    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - enabled_roles_")
    @Description("verify user able to enabled_roles_")
    @Test (priority=6,groups="smoke", description = " verify enabled_roles_")

    public void enabled_roles_() throws Exception {
        //TC 21.5 Verify that all enabled roles are displayed in add role list while updating a project by Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);

        ProjectPageObj.ClickSearchLead("qaadmin@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadAdminBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 - user_should_not_add_user_when_role_disabled")
    @Description("verify user able to user_should_not_add_user_when_role_disabled")
    @Test (priority=7,groups="smoke", description = " verify user_should_not_add_user_when_role_disabled")

    public void user_should_not_add_user_when_role_disabled() throws Exception {
        //TC 21.6 Verify that while updating project user should not able to add user when role is disabled for project.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(1000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSupervisorRoleDisable();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddUser();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCancelProject();
        AssertionsFunction.isPresent(ProjectPageObj.CancelOnProject);
        Thread.sleep(2000);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008 - update_project_role_should_not_have_empty_user")
    @Description("verify user able to update_project_role_should_not_have_empty_user")
    @Test (priority=8,groups="smoke", description = " verify update_project_role_should_not_have_empty_user")

    public void update_project_role_should_not_have_empty_user() throws Exception {
        //TC 21.7 Verify that while updating project Role should not have an empty user.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCancelProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        ProjectPageObj.ClickLogout();
        Thread.sleep(3000);
        //Creation of Project By admin.
        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
        Thread.sleep(1000);
        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
        Thread.sleep(1000);
        ProjectPageObj.ClickLoginButton();
        Thread.sleep(3000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009 - update_project_by_entering_valid_data")
    @Description("verify user able to update_project_by_entering_valid_data")
    @Test (priority=9,groups="smoke", description = " verify update_project_by_entering_valid_data")

    public void update_project_by_entering_valid_data() throws Exception {
        //TC 21.8 Verify the working of  Admin for Updating project by entering valid data.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("new@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadSampleBtn();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010 - to_maintain_script_two")
    @Description("verify user able to to_maintain_script_two")
    @Test (priority=10,groups="smoke", description = " verify to_maintain_script_two")

    public void to_maintain_script_two() throws Exception {
        //TC 21.19To maintain script.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("qaadmin@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadAdminBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 011 - update_project_when_role_and_status_disable")
    @Description("verify user able to update_project_when_role_and_status_disable")
    @Test (priority=11,groups="smoke", description = " verify update_project_when_role_and_status_disable")

    public void update_project_when_role_and_status_disable() throws Exception {
        //TC 21.9 Verify the working of Admin for Update Project button  when role and user status is Disabled.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRoleUserDisableEnable();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        //User Disable.
        userPage.clickOnUserMenu();
        Thread.sleep(3000);
        userPage.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
        Thread.sleep(1000);
        userPage.selectSearchedUser();
        Thread.sleep(1000);
        userPage.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(1000);
        userPage.clickOnUpdateUserButton();
        AssertionsFunction.isPresent(userPage.UpdateUser);
        Thread.sleep(1000);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012 - disabled_roles_are_not_displayed_in_role_list_for_admin")
    @Description("verify user able to disabled_roles_are_not_displayed_in_role_list_for_admin")
    @Test (priority=12,groups="smoke", description = " verify disabled_roles_are_not_displayed_in_role_list_for_admin")

    public void disabled_roles_are_not_displayed_in_role_list_for_admin() throws Exception {
        //TC 21.10 Verify that all Disabled roles are not displayed in add role list while updating a project by Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("qaadmin@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.ClearSearchLead();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        ProjectPageObj.ClickOnUpdateProject();
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
        //User status is enabled
        userPage.clickOnUserMenu();
        Thread.sleep(3000);
        userPage.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
        Thread.sleep(1000);
        userPage.selectSearchedUser();
        Thread.sleep(1000);
        userPage.ClickOnEnableOrDisableUserSelectionToggle();
        Thread.sleep(1000);
        userPage.clickOnUpdateUserButton();
        AssertionsFunction.isPresent(userPage.UpdateUser);
        Thread.sleep(1000);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013 - when_role_status_is_enabled_for_admin")
    @Description("verify user able to when_role_status_is_enabled_for_admin")
    @Test (priority=13,groups="smoke", description = " verify when_role_status_is_enabled_for_admin")

    public void when_role_status_is_enabled_for_admin() throws Exception {
        //TC 21.11 Verify the working of Admin for Update Project button  when role and user status is enabled.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRoleUserDisableEnable();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 014 - all_roles_are_displayed_in_add_list")
    @Description("verify user able to all_roles_are_displayed_in_add_list")
    @Test (priority=14,groups="smoke", description = " verify all_roles_are_displayed_in_add_list")

    public void all_roles_are_displayed_in_add_list() throws Exception {
        //TC 21.12 Verify that all enabled roles are displayed in add role list while updating a project by Platform Admin.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickSearchLead("new@gmail.com");
        Thread.sleep(1000);
        ProjectPageObj.SelectOnLeadSampleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 015 - user_should_not_able_to_add_user_when_role_is_disabled_SP")
    @Description("verify user able to user_should_not_able_to_add_user_when_role_is_disabled_SP")
    @Test (priority=15,groups="smoke", description = " verify user_should_not_able_to_add_user_when_role_is_disabled_SP")


    public void user_should_not_able_to_add_user_when_role_is_disabled_SP() throws Exception {
        //TC 21.13 Verify that while updating project user should not able to add user when role is disabled for project for Supervisor.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSupervisorRoleDisable();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddUser();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnCancelProject();
        AssertionsFunction.isPresent(ProjectPageObj.CancelOnProject);
        Thread.sleep(1000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 016 - role_should_not_have_empty_user_for_supervisor")
    @Description("verify user able to role_should_not_have_empty_user_for_supervisor")
    @Test (priority=16,groups="smoke", description = " verify role_should_not_have_empty_user_for_supervisor")

    public void role_should_not_have_empty_user_for_supervisor() throws Exception {
        //TC 21.14 Verify that while updating project role should not have an empty user for Supervisor.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        ProjectPageObj.ClickOnCancelProject();
        AssertionsFunction.isPresent(ProjectPageObj.CancelOnProject);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 017 - status_is_disabled_for_admin_when_action_is_false")
    @Description("verify user able to status_is_disabled_for_admin_when_action_is_false")
    @Test (priority=17,groups="smoke", description = " verifystatus_is_disabled_for_admin_when_action_is_false")

    public void status_is_disabled_for_admin_when_action_is_false() throws Exception {
        //TC 21.15 Verify that project status is disabled for admin when the action checkbox  of the status is false.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 016 - status_is_disabled_for_admin_when_action_is_true")
    @Description("verify user able to status_is_disabled_for_admin_when_action_is_true")
    @Test (priority=16,groups="smoke", description = " verify status_is_disabled_for_admin_when_action_is_true")

    public void status_is_disabled_for_admin_when_action_is_true() throws Exception {
        //TC 21.16 Verify that project status is enabled for admin when the action checkbox  of the status is True.
        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-50000)", "");
        ProjectPageObj.TableStructure();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnEditProject();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(1000);
        ProjectPageObj.ClickOnUpdateProject();
        AssertionsFunction.isPresent(ProjectPageObj.UpdateProject);
        Thread.sleep(1000);
        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));


    }

    @Test(priority = 19)
    public void  admin_should_display_available_project_list() throws Exception {
        //TC 21.11 Verify the working of Admin for Update Project button  when role and user status is enabled.

        ProjectPageObj.ClickOnProjectBtn();
        Thread.sleep(2000);
        ProjectPageObj.SearchProjectAdmin();
        AssertionsFunction.isPresent(ProjectPageObj.SearchProject);
        Thread.sleep(1000);

    }
    @Test(priority = 20)
    public void  create_project_with_blank_data() throws Exception {
        //TC 21.18 create_project_with_blank_data .
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(4000);
        project.create_Button();


    }

}