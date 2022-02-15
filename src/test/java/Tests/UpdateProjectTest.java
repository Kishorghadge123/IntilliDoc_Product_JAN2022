package Tests;
import Base.BasePage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
@Listeners(Utilities.TestListeners.class)

public class UpdateProjectTest extends BasePage{
        ProjectPage ProjectPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void updating_project_with_valid_data() throws Exception {
            Robot r = new Robot();
            ProjectPageObj = new ProjectPage(driver);
            //TC 21.1 Verify the working of Platform Admin for  Updating Project by entering Valid Data.
            ProjectPageObj.SearchProject();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadSampleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineLowBtn();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);
    }
        @Test(priority = 2)
        public void to_maintain_script() throws Exception {
                //To maintain script
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(5000);
                ProjectPageObj.SearchProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickSearchLead("admin@test.com");
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnProcessingEngineBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 3)
        public void update_project_when_role_status_disabled() throws Exception {
                //TC 21.2 Verify the working of Platform Admin for Update Project button when Role and User Status is Disabled.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
                //User Disable.
                ProjectPageObj.ClickUserBtn();
                Thread.sleep(3000);
                ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
                Thread.sleep(2000);
                ProjectPageObj.SelectSearchedUser();
                Thread.sleep(1000);
                ProjectPageObj.ClickDisableUser();
                Thread.sleep(2000);
                ProjectPageObj.ClickUpdateUser();
                Thread.sleep(2000);
        }
        @Test(priority = 4)
        public void disabled_roles_are_not_displayed_in_add_role_list() throws Exception {
                //TC 21.3 Verify that all Disabled roles are not displayed in add role list while updating a project by Platform Admin.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(5000);
                ProjectPageObj.SearchProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickSearchLead("admin@test.com");
                Thread.sleep(2000);
                ProjectPageObj.ClearSearchLead();
                Thread.sleep(2000);
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
                //User status is enabled.
                ProjectPageObj.ClickUserBtn();
                Thread.sleep(3000);
                ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
                Thread.sleep(2000);
                ProjectPageObj.SelectSearchedUser();
                Thread.sleep(1000);
                ProjectPageObj.ClickDisableUser();
                Thread.sleep(2000);
                ProjectPageObj.ClickUpdateUser();
                Thread.sleep(3000);
        }
        @Test(priority = 5)
        public void update_project_button_when_role_and_user_status_enabled() throws Exception {
                //TC 21.4 Verify the working of Platform Admin for Update Project button  when role and user status is enabled.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 6)
        public void enabled_roles_() throws Exception {
                //TC 21.5 Verify that all enabled roles are displayed in add role list while updating a project by Platform Admin.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 7)
        public void user_should_not_add_user_when_role_disabled() throws Exception {
                //TC 21.6 Verify that while updating project user should not able to add user when role is disabled for project.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnSupervisorRoleDisable();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnAddUser();
                ProjectPageObj.VerifyAssertForRoleDisable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnCancelProject();
                Thread.sleep(4000);
        }
        @Test(priority = 8)
        public void update_project_role_should_not_have_empty_user() throws Exception {
                //TC 21.7 Verify that while updating project Role should not have an empty user.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnCancelProject();
                Thread.sleep(4000);
                ProjectPageObj.ClickLogout();
                Thread.sleep(3000);
                //Creation of Project By admin.
                ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
                Thread.sleep(2000);
                ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
                Thread.sleep(2000);
                ProjectPageObj.ClickLoginButton();
                Thread.sleep(6000);
        }
        @Test(priority = 9)
        public void update_project_by_entering_valid_data() throws Exception {
                //TC 21.8 Verify the working of  Admin for Updating project by entering valid data.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(5000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadSampleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnProcessingEngineLowBtn();
                Thread.sleep(2000);
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 10)
        public void to_maintain_script_two() throws Exception {
                //To maintain script.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickSearchLead("admin@test.com");
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnProcessingEngineBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnProcessingEngineBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 11)
        public void update_project_when_role_and_status_disable() throws Exception {
                //TC 21.9 Verify the working of Admin for Update Project button  when role and user status is Disabled.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
                //User Disable.
                ProjectPageObj.ClickUserBtn();
                Thread.sleep(3000);
                ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
                Thread.sleep(2000);
                ProjectPageObj.SelectSearchedUser();
                Thread.sleep(1000);
                ProjectPageObj.ClickDisableUser();
                Thread.sleep(2000);
                ProjectPageObj.ClickUpdateUser();
                Thread.sleep(2000);
        }
        @Test(priority = 12)
        public void disabled_roles_are_not_displayed_in_role_list_for_admin() throws Exception {
                //TC 21.10 Verify that all Disabled roles are not displayed in add role list while updating a project by Admin.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickSearchLead("admin@test.com");
                Thread.sleep(2000);
                ProjectPageObj.ClearSearchLead();
                Thread.sleep(2000);
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
                //User status is enabled
                ProjectPageObj.ClickUserBtn();
                Thread.sleep(3000);
                ProjectPageObj.SearchCreatedUser(ReadProps.readAttr("AdminRole"));
                Thread.sleep(2000);
                ProjectPageObj.SelectSearchedUser();
                Thread.sleep(1000);
                ProjectPageObj.ClickDisableUser();
                Thread.sleep(2000);
                ProjectPageObj.ClickUpdateUser();
                Thread.sleep(2000);
        }
        @Test(priority = 13)
        public void when_role_status_is_enabled_for_admin() throws Exception {
                //TC 21.11 Verify the working of Admin for Update Project button  when role and user status is enabled.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnRoleUserDisableEnable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 14)
        public void all_roles_are_displayed_in_add_list() throws Exception {
                //TC 21.12 Verify that all enabled roles are displayed in add role list while updating a project by Platform Admin.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnLeadBtn();
                Thread.sleep(2000);
                ProjectPageObj.SelectOnLeadAdminBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 15)
        public void user_should_not_able_to_add_user_when_role_is_disabled_SP() throws Exception {
                //TC 21.13 Verify that while updating project user should not able to add user when role is disabled for project for Supervisor.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSupervisorRoleDisable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddUser();
                ProjectPageObj.VerifyAssertForRoleDisable();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnCancelProject();
                Thread.sleep(4000);
        }
        @Test(priority = 16)
        public void role_should_not_have_empty_user_for_supervisor() throws Exception {
                //TC 21.14 Verify that while updating project role should not have an empty user for Supervisor.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnRolesBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnAddRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnSelectSupervisorRoleBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                ProjectPageObj.VerifyAssertForUser();
                Thread.sleep(4000);
                ProjectPageObj.ClickOnCancelProject();
                Thread.sleep(5000);
        }
        @Test(priority = 17)
        public void status_is_disabled_for_admin_when_action_is_false() throws Exception {
                //TC 21.15 Verify that project status is disabled for admin when the action checkbox  of the status is false.
                ProjectPageObj.ClickOnProjectBtn();
                Thread.sleep(4000);
                ProjectPageObj.SearchProjectAdmin();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnEditProject();
                Thread.sleep(3000);
                ProjectPageObj.ClickOnStatusBtn();
                Thread.sleep(2000);
                ProjectPageObj.ClickOnUpdateProject();
                Thread.sleep(4000);
        }
        @Test(priority = 18)
        public void status_is_disabled_for_admin_when_action_is_true() throws Exception {
            //TC 21.16 Verify that project status is enabled for admin when the action checkbox  of the status is True.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.TableStructure();
            Thread.sleep(4000);
            ProjectPageObj.SearchProjectAdmin();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEditProject();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnUpdateProject();
            Thread.sleep(4000);
            ProjectPageObj.ClickLogout();
            Thread.sleep(4000);

    }
}


