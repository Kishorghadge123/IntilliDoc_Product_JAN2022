
package Tests;

import Utilities.*;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Pages.Project_Module;
@Feature("Project_Module_TC_For_Admin_User")
public class Project_Module_TC_For_Admin_User
{
    WebDriver driver;




    @Step("Closed the Browser")
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001  -verify_project_name_field")
    @Description("verify_project_name_field")
    @Test (priority=1,groups="smoke", description = "verify_project_name_field")

    public void verify_project_name_field() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.project_name_filed_validation(ReadProps.readAttr("Projectdemo"));


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002  -verify_Lead_Filed")
    @Description("verify_Lead_Filed")
    @Test (priority=2,groups="smoke", description = "verify_Lead_Filed")

    public void verify_Lead_Filed() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);

        project.lead_filed_validation(ReadProps.readAttr("ValidEmail"));


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003  -verify_Start_Date_Filed")
    @Description("verify_Start_Date_Filed")
    @Test (priority=3,groups="smoke", description = "verify_Start_Date_Filed")

    public void verify_Start_Date_Filed() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.start_date_filed_validation(ReadProps.readAttr("ValidDate"));

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004  - verify_End_Date_Filed")
    @Description("verify_End_Date_Filed")
    @Test (priority=4,groups="smoke", description = "verify_End_Date_Filed")

    public void verify_End_Date_Filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Thread.sleep(2000);
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.end_date_filed_validation(ReadProps.readAttr("ValidStartDate"),(ReadProps.readAttr("ValidStartDate")));

    }




    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005  - verify_document_structure_type_Filed")
    @Description("verify_document_structure_type_Filed")
    @Test (priority=5,groups="smoke", description = "verify_document_structure_type_Filed")

    public void verify_document_structure_type_Filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.document_Structure_filed_validation();

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006  - verify_processing_Engine_filed_for_Structured_Project")
    @Description("verify_processing_Engine_filed_for_Structured_Project")
    @Test (priority=6,groups="smoke", description = "verify_processing_Engine_filed_for_Structured_Project")

    public void verify_processing_Engine_filed_for_Structured_Project() throws Exception
    {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.processing_Engine_filed_validation_for_Structured_Project((ReadProps.readAttr("StrucutreProject")));


    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007  - verify_processing_Engine_filed_for_Semi_Structured_Project")
    @Description("verify_processing_Engine_filed_for_Semi_Structured_Project")
    @Test (priority=7,groups="smoke", description = "verify_processing_Engine_filed_for_Semi_Structured_Project")

    public void verify_processing_Engine_filed_for_Semi_Structured_Project() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(3000);
        project.processing_Engine_filed_validation_for_Semi_Structured_Project("SemistructureName");

    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008  - verify_processing_Engine_For_Medical_Project")
    @Description("verify_processing_Engine_For_Medical_Project")
    @Test (priority=8,groups="smoke", description = "verify_processing_Engine_For_Medical_Project")

    public void verify_processing_Engine_For_Medical_Project() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        Thread.sleep(10000);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.processing_Engine_For_Medical_Project("MedicalProjectName");

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009  - verify_processing_Engine_For_Free_From_Project")
    @Description("verify_processing_Engine_For_Free_From_Project")
    @Test (priority=9,groups="smoke", description = "verify_processing_Engine_For_Free_From_Project")

    public void verify_processing_Engine_For_Free_From_Project() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.processing_Engine_For_Medical_Project("FreeformName");
    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 010  - verify_Status_Field")
    @Description("verify_Status_Field")
    @Test (priority=10,groups="smoke", description = "verify_Status_Field")

    public void verify_Status_Field() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.status_filed_validate();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 011  - verify_document_Auto_Assignment_Field")
    @Description("verify_document_Auto_Assignment_Field")
    @Test (priority=11,groups="smoke", description = "verify_document_Auto_Assignment_Field")

    public void verify_document_Auto_Assignment_Field() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        Thread.sleep(2000);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.document_auto_Assignment_filed_validate();

    }



    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 012  - verify_straight_through_process_and_document_scrore_filed")
    @Description("verify_straight_through_process_and_document_scrore_filed")
    @Test (priority=12,groups="smoke", description = "verify_straight_through_process_and_document_scrore_filed")

    public void verify_straight_through_process_and_document_scrore_filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.straight_through_process_and_document_scrore_filed_validate();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 013  - verify_template_filed")
    @Description("verify_template_filed")
    @Test (priority=13,groups="smoke", description = "verify_template_filed")

    public void verify_template_filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 014  - verify_roles_filed")
    @Description("verify_roles_filed")
    @Test (priority=14,groups="smoke", description = "verify_roles_filed")

    public void verify_roles_filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.roles_fields_validation();

    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 015  - verify_project_page_url")
    @Description("verify_project_page_url")
    @Test (priority=15,groups="smoke", description = "verify_project_page_url")

    public void verify_project_page_url() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        String exp_url = "https://alpha.neutrino-ai.com/#/home/project-management/create-project";
        //String exp_url="https://neo.neutrino-ai.com/#/home/project-management/create-project";
        String act_url = driver.getCurrentUrl();
        Verification_Functions.url_verification(act_url, exp_url);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 016  - create_project_with_all_blank_details_By_click_On_Create_Button")
    @Description("create_project_with_all_blank_details_By_click_On_Create_Button")
    @Test (priority=16,groups="smoke", description = "create_project_with_all_blank_details_By_click_On_Create_Button")

    public void create_project_with_all_blank_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);

        project.create_Button();




    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 017  - create_project_with_blank_template_details_By_click_On_Create_Button")
    @Description("create_project_with_blank_template_details_By_click_On_Create_Button")
    @Test (priority=17,groups="smoke", description = "create_project_with_blank_template_details_By_click_On_Create_Button")

    public void create_project_with_blank_template_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        project.selectProjectType((ReadProps.readAttr("Stuctproject")));
        Thread.sleep(2000);
        project.create_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 018  - create_project_with_blank_roles_details_By_click_On_Create_Button")
    @Description("create_project_with_blank_roles_details_By_click_On_Create_Button")
    @Test (priority=18,groups="smoke", description = "create_project_with_blank_roles_details_By_click_On_Create_Button")

    public void create_project_with_blank_roles_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);
        project.selectProcessingEngine();
        project.selectStatus((ReadProps.readAttr("Stuctproject")));
        project.enterTemplateDetails();
        project.create_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 019  - create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button")
    @Description("create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button")
    @Test (priority=19,groups="smoke", description = "create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button")

    public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);
        project.selectProcessingEngine();
        project.selectStatus(ReadProps.readAttr("Stuctproject"));
        project.enterTemplateDetails();
        project.enterRolesDetails((ReadProps.readAttr("AnalysisProject")));
        project.create_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 020  - create_project_with_blank_processing_engine_details_By_click_On_Create_Button")
    @Description("create_project_with_blank_processing_engine_details_By_click_On_Create_Button")
    @Test (priority=20,groups="smoke", description = "create_project_with_blank_processing_engine_details_By_click_On_Create_Button")

    public void create_project_with_blank_processing_engine_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);
        project.create_Button();
        Thread.sleep(3000);

        Scroll_Page.scroll_up_page(driver);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 021  - create_project_with_disable_status_details_By_click_On_Create_Button")
    @Description("create_project_with_disable_status_details_By_click_On_Create_Button")
    @Test (priority=21,groups="smoke", description = "create_project_with_disable_status_details_By_click_On_Create_Button")

    public void create_project_with_disable_status_details_By_click_On_Create_Button() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead(ReadProps.readAttr("ValidEmail"));
        project.enterStartAndEndDate();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);

        project.selectProcessingEngine();
        Thread.sleep(1000);
        project.create_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 022  - create_project_with_existing_project_name_By_click_On_Create_Button")
    @Description("create_project_with_existing_project_name_By_click_On_Create_Button")
    @Test (priority=22,groups="smoke", description = "create_project_with_existing_project_name_By_click_On_Create_Button")

    public void create_project_with_existing_project_name_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterExistingProjectName((ReadProps.readAttr("Projectdemo")));
        project.create_Button();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 023  - verify_cancel_button_funationality_for_any_data")
    @Description("verify_cancel_button_funationality_for_any_data")
    @Test (priority=23,groups="smoke", description = "verify_cancel_button_funationality_for_any_data")

    public void verify_cancel_button_funationality_for_any_data() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterEmailID();
        project.enterStartAndEndDate();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);

        project.selectStatus((ReadProps.readAttr("Stuctproject")));
        Thread.sleep(1000);
        project.enterTemplateDetails();
        Thread.sleep(1000);
        project.clickOnCancelButton();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 024  - verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine")
    @Description("verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine")
    @Test (priority=24,groups="smoke", description = "verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine")

    public void verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 025  - create_project_with_all_blank_details_By_click_On_Next_Button")
    @Description("create_project_with_all_blank_details_By_click_On_Next_Button")
    @Test (priority=25,groups="smoke", description = "create_project_with_all_blank_details_By_click_On_Next_Button")

    public void create_project_with_all_blank_details_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        Thread.sleep(2000);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.next_Button();



    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 026  - create_project_with_blank_template_details_By_click_On_Next_Button")
    @Description("create_project_with_blank_template_details_By_click_On_Next_Button")
    @Test (priority=26,groups="smoke", description = "create_project_with_blank_template_details_By_click_On_Next_Button")

    public void create_project_with_blank_template_details_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);


        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);

        project.next_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 027  - create_project_with_blank_roles_details_By_click_On_Next_Button")
    @Description("create_project_with_blank_roles_details_By_click_On_Next_Button")
    @Test (priority=27,groups="smoke", description = "create_project_with_blank_roles_details_By_click_On_Next_Button")

    public void create_project_with_blank_roles_details_By_click_On_Next_Button() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);

        project.selectProcessingEngine();
        Thread.sleep(1000);
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        Thread.sleep(1000);
        project.enterTemplateDetails();
        Thread.sleep(1000);
        project.next_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 028  - create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button")
    @Description("create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button")
    @Test (priority=28,groups="smoke", description = "create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button")

    public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);

        project.selectProcessingEngine();
        Thread.sleep(1000);
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        Thread.sleep(1000);
        project.enterTemplateDetails();
        project.enterRolesDetails((ReadProps.readAttr("AnalysisProject")));
        project.next_Button();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 029  - create_project_with_blank_processing_engine_details_By_click_On_Next_Button")
    @Description("create_project_with_blank_processing_engine_details_By_click_On_Next_Button")
    @Test (priority=29,groups="smoke", description = "create_project_with_blank_processing_engine_details_By_click_On_Next_Button")

    public void create_project_with_blank_processing_engine_details_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);

        project.next_Button();
        Thread.sleep(2000);
        Scroll_Page.scroll_up_page(driver);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 030  - select_dates_from_calendar_application_without_changing_year_and_month")
    @Description("select_dates_from_calendar_application_without_changing_year_and_month")
    @Test (priority=30,groups="smoke", description = "select_dates_from_calendar_application_without_changing_year_and_month")

    public void select_dates_from_calendar_application_without_changing_year_and_month() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.select_start_date_and_end_date_from_calendar_application();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 031  - select_dates_from_calendar_application_with_changing_year_and_month")
    @Description("select_dates_from_calendar_application_with_changing_year_and_month")
    @Test (priority=31,groups="smoke", description = "select_dates_from_calendar_application_with_changing_year_and_month")

    public void select_dates_from_calendar_application_with_changing_year_and_month() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.change_year_and_month_from_calendar_application();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 032  - verify_delete_functionality_for_user_on_Roles_Section")
    @Description("verify_delete_functionality_for_user_on_Roles_Section")
    @Test (priority=32,groups="smoke", description = "verify_delete_functionality_for_user_on_Roles_Section")

    public void verify_delete_functionality_for_user_on_Roles_Section() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));

        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(1000);
        project.selectProcessingEngine();
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        project.enterTemplateDetails();
        Scroll_Page.scroll_down_page(driver);
        project.enterRolesDetails((ReadProps.readAttr("AnalysisProject")));
        project.enterUserDetailsInRoleSection();
        project.delete_user_from_role_section();
        project.create_Button();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 033  - create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button")
    @Description("create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button")
    @Test (priority=33,groups="smoke", description = "create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button")

    public void create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(1000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentMedicalBtn();
        Thread.sleep(1000);
        project.selectStatus(ReadProps.readAttr("MedicalProjectName"));
        Thread.sleep(1000);
        project.addEntityDetailsForMedicalChartProject(ReadProps.readAttr("HCCcondition"));
        project.clickOnDocumentInvestigationDropdown();
        Thread.sleep(1000);
        project.enterDetailsForAmazonS3Type("Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7", "AKIAWKITVLWMKRADZH3O", "us-east-1");
        project.checkConnectionMessagesAndClickOnOkButton();
        project.enterAPIConfigurationDetails();

    }







    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 034  - create_Free_Form_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button")
    @Description("create_Free_Form_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button")
    @Test (priority=34,groups="smoke", description = "create_Free_Form_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button")

    public void create_Free_Form_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterNewProjectName();
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(1000);
        project.SelectDocumentfreeBtn();
        Thread.sleep(1000);
        project.selectStatus(ReadProps.readAttr("FreeformName"));
        Thread.sleep(1000);
        project.enterAttributeDetailsForFreeFormProjectType(ReadProps.readAttr("Patientname"));
        Thread.sleep(1000);
        project.clickOnDocumentInvestigationDropdown();
        Thread.sleep(2000);
        project.enterDetailsForGoogleDriveType(ReadProps.readAttr("usermail"));
        Thread.sleep(2000);
        project.clickonconnectionbtn();
        Thread.sleep(2000);
        project.checkConnectionMessagesAndClickOnOkButton();
        Thread.sleep(2000);
        project.enterAPIConfigurationDetails();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 035  - create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button")
    @Description("create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button")
    @Test (priority=35,groups="smoke", description = "create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button")

    public void create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(2000);
        project.enterExistingProjectName(ReadProps.readAttr("Demoproject"));
        Thread.sleep(1000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        Thread.sleep(2000);
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        project.enterTemplateDetails();
        project.enterRolesDetails(ReadProps.readAttr("AnalysisProject"));
        project.enterUserDetailsInRoleSection();


    }
}