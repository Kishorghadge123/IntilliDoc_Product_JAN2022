package Tests;

import Utilities.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Pages.Project_Module;

public class Project_Module_TC_For_Operator_User
{
    WebDriver driver;
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }


    @Test
    public void verify_project_name_field() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.project_name_filed_validation("ProjectDemo");


    }


    @Test
    public void verify_Lead_Filed() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.lead_filed_validation((ReadProps.readAttr("ValidEmail")));;

    }


    @Test
    public void verify_Start_Date_Filed() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.start_date_filed_validation(ReadProps.readAttr("ValidDate"));

    }



    @Test
    public void verify_End_Date_Filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.end_date_filed_validation(ReadProps.readAttr("ValidStartDate"),(ReadProps.readAttr("ValidStartDate")));

    }



    @Test
    public void verify_document_structure_type_Filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.document_Structure_filed_validation();

    }



    @Test
    public void verify_processing_Engine_filed_for_Structured_Project() throws Exception
    {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.processing_Engine_filed_validation_for_Structured_Project(ReadProps.readAttr("StrucutreProject"));

    }


    @Test
    public void verify_processing_Engine_filed_for_Semi_Structured_Project() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.processing_Engine_filed_validation_for_Semi_Structured_Project(ReadProps.readAttr("SemistructureName"));

    }


    @Test
    public void verify_processing_Engine_For_Medical_Project() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.processing_Engine_For_Medical_Project(ReadProps.readAttr("MedicalProjectName"));

    }



    @Test
    public void verify_processing_Engine_For_Free_From_Project() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.processing_Engine_For_Medical_Project(ReadProps.readAttr("FreeformName"));

    }



    @Test
    public void verify_Status_Field() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.status_filed_validate();

    }



    @Test
    public void verify_document_Auto_Assignment_Field() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);

        project.document_auto_Assignment_filed_validate();

    }


    @Test
    public void verify_straight_through_process_and_document_scrore_filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.straight_through_process_and_document_scrore_filed_validate();

    }


    @Test
    public void verify_template_filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);

    }


    @Test
    public void verify_roles_filed() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.roles_fields_validation();

    }


    @Test
    public void verify_project_page_url() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        String exp_url = "https://alpha.neutrino-ai.com/#/home/project-management/create-project";

        //String exp_url = "https://neo.neutrino-ai.com/#/home/project-management/create-project";


        String act_url = driver.getCurrentUrl();
        Verification_Functions.url_verification(act_url, exp_url);

    }

    @Test
    public void create_project_with_all_blank_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);

        project.create_Button();


    }

    @Test
    public void create_project_with_blank_template_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.create_Button();


    }

    @Test
    public void create_project_with_blank_roles_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        project.selectStatus((ReadProps.readAttr("Stuctproject")));
        project.enterTemplateDetails();
        project.create_Button();



    }

    @Test
    public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        project.selectStatus((ReadProps.readAttr("Stuctproject")));
        project.enterTemplateDetails();
        project.enterRolesDetails((ReadProps.readAttr("Stuctproject1")));
        project.create_Button();



    }




    @Test
    public void create_project_with_blank_processing_engine_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.create_Button();

        Scroll_Page.scroll_up_page(driver);

    }

    @Test
    public void create_project_with_disable_status_details_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        Thread.sleep(2000);
        project.create_Button();

    }

    @Test
    public void create_project_with_existing_project_name_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterExistingProjectName("ProjectDemo");
        project.create_Button();

    }

    @Test
    public void verify_cancel_button_funationality_for_any_data() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterEmailID();
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        project.enterTemplateDetails();
        project.clickOnCancelButton();
    }

    @Test
    public void verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);


        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine();
        driver.quit();
    }

    @Test
    public void create_project_with_all_blank_details_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);


        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.next_Button();


    }

    @Test
    public void create_project_with_blank_template_details_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.next_Button();

    }

    @Test
    public void create_project_with_blank_roles_details_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        Thread.sleep(5000);

        project.clickOnCreateProjectButton();
        Thread.sleep(10000);
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        project.enterTemplateDetails();
        project.next_Button();

    }


    @Test
    public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        project.enterTemplateDetails();
        Thread.sleep(2000);
        project.enterRolesDetails(((ReadProps.readAttr("Stuctproject1"))));
        Thread.sleep(2000);
        project.next_Button();

    }

    @Test
    public void create_project_with_blank_processing_engine_details_By_click_On_Next_Button() throws Exception {
        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);

        project.next_Button();
        Scroll_Page.scroll_up_page(driver);
        driver.quit();
    }

    @Test
    public void select_dates_from_calendar_application_without_changing_year_and_month() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.select_start_date_and_end_date_from_calendar_application();
    }

    @Test
    public void select_dates_from_calendar_application_with_changing_year_and_month() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.change_year_and_month_from_calendar_application();
    }



    @Test
    public void verify_delete_functionality_for_user_on_Roles_Section() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
        Thread.sleep(2000);
        project.enterStartAndEndDate();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentStructureBtn();
        Thread.sleep(2000);
        project.selectProcessingEngine();
        Thread.sleep(3000);
        project.selectStatus(((ReadProps.readAttr("Stuctproject"))));
        project.enterTemplateDetails();
        Scroll_Page.scroll_down_page(driver);
        project.enterRolesDetails(ReadProps.readAttr("AnalysisProject"));
        project.enterUserDetailsInRoleSection();
        project.delete_user_from_role_section();
        project.create_Button();

    }

//    @Test
//    public void create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button() throws Exception {
//
//        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
//        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
//        Project_Module project = new Project_Module(driver);
//
//        project.clickOnCreateProjectButton();
//        Thread.sleep(5000);
//        project.enterNewProjectName();
//        Thread.sleep(2000);
//
//        project.selectLead(((ReadProps.readAttr("ValidEmail"))));
//        Thread.sleep(2000);
//        Thread.sleep(2000);
//        project.enterStartAndEndDate();
//        Thread.sleep(2000);
//        project.ClickOnDocumentStructureBtn();
//        Thread.sleep(2000);
//        project.setClickmedical();
//        Thread.sleep(2000);
//        project.selectStatus(ReadProps.readAttr("MedicalProjectName"));
//        Thread.sleep(3000);
//        project.addEntityDetailsForMedicalChartProject(ReadProps.readAttr("HCC Conditions"));
//        Thread.sleep(3000);
//        project.clickOnDocumentInvestigationDropdown();
//        project.enterDetailsForAmazonS3Type("Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7", "AKIAWKITVLWMKRADZH3O", "us-east-1");
//        project.checkConnectionMessagesAndClickOnOkButton();
//        project.enterAPIConfigurationDetails();
//    }
    @Test
    public void create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        project.selectLead((ReadProps.readAttr("ValidEmail")));
        project.enterStartAndEndDate();
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentMedicalBtn();
        Thread.sleep(2000);
        project.selectStatus(ReadProps.readAttr("MedicalProjectName"));
        Thread.sleep(2000);
        project.addEntityDetailsForMedicalChartProject(ReadProps.readAttr("HCCcondition"));
        project.clickOnDocumentInvestigationDropdown();
        Thread.sleep(3000);
        project.enterDetailsForAmazonS3Type("Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7", "AKIAWKITVLWMKRADZH3O", "us-east-1");
        project.checkConnectionMessagesAndClickOnOkButton();
        project.enterAPIConfigurationDetails();

    }







    @Test
    public void create_Free_Form_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver, (ReadProps.readAttr("OperatorUser")), ReadProps.readAttr("OperatorPwd"));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
        project.enterNewProjectName();
        Thread.sleep(2000);
        project.ClickOnDocumentStructureBtn();
        Thread.sleep(2000);
        project.SelectDocumentfreeBtn();
        Thread.sleep(2000);
        project.selectStatus(ReadProps.readAttr("FreeformName"));
        Thread.sleep(2000);
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

    @Test
    public void create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception {

        driver = Browser_Launch.browser_launch(ReadProps.readAttr("Url"));
        LoginUser.login_users(driver,(ReadProps.readAttr("AdminUser")),((ReadProps.readAttr("AdminPwd"))));
        Project_Module project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        Thread.sleep(5000);
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
