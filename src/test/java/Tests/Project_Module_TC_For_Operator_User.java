package Tests;

import Utilities.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Project_Module;

public class Project_Module_TC_For_Operator_User
{
	WebDriver driver;

			@Test
			public void verify_project_name_field() throws Exception {
				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.project_name_filed_validation("ProjectDemo");
				driver.quit();

			}


			@Test
			public void verify_Lead_Filed() throws Exception {
				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);

				project.clickOnCreateProjectButton();
				project.lead_filed_validation("qauser@gmail.com");
				driver.quit();

			}


			@Test
			public void verify_Start_Date_Filed() throws Exception {
				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.start_date_filed_validation("4/12/2022");
				driver.quit();
			}



			@Test
			public void verify_End_Date_Filed() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.end_date_filed_validation("4/10/2022", "4/13/2022");
				driver.quit();
			}



			@Test
			public void verify_document_structure_type_Filed() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.document_Structure_filed_validation();
				driver.quit();
			}



			@Test
			public void verify_processing_Engine_filed_for_Structured_Project() throws Exception
			{
				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.processing_Engine_filed_validation_for_Structured_Project("Structured");
				driver.quit();
			}


			@Test
			public void verify_processing_Engine_filed_for_Semi_Structured_Project() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.processing_Engine_filed_validation_for_Semi_Structured_Project("Semi_Structured");
				driver.quit();
			}


			@Test
			public void verify_processing_Engine_For_Medical_Project() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.processing_Engine_For_Medical_Project("Medical_Chart");
				driver.quit();
			}



			@Test
			public void verify_processing_Engine_For_Free_From_Project() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.processing_Engine_For_Medical_Project("Free_Form");

				driver.quit();
			}



			@Test
			public void verify_Status_Field() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.status_filed_validate();
				driver.quit();
			}



			@Test
			public void verify_document_Auto_Assignment_Field() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.document_auto_Assignment_filed_validate();
				driver.quit();
			}



			@Test
			public void verify_straight_through_process_and_document_scrore_filed() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);
				project.clickOnCreateProjectButton();
				project.straight_through_process_and_document_scrore_filed_validate();
				driver.quit();
			}


			@Test
			public void verify_template_filed() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);

				project.clickOnCreateProjectButton();
				driver.quit();
			}


			@Test
			public void verify_roles_filed() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.roles_fields_validation();
				driver.quit();
			}


			@Test
			public void verify_project_page_url() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				String exp_url = "https://alpha.neutrino-ai.com/#/home/project-management/create-project";
				String act_url = driver.getCurrentUrl();
				Verification_Functions.url_verification(act_url, exp_url);
				driver.quit();
			}

			@Test
			public void create_project_with_all_blank_details_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				Thread.sleep(10000);

				project.create_Button();


				driver.quit();

			}

			@Test
			public void create_project_with_blank_template_details_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.create_Button();

				driver.quit();
			}

			@Test
			public void create_project_with_blank_roles_details_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				project.create_Button();

				driver.quit();

			}

			@Test
			public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				project.enterRolesDetails("Analysis");
				project.create_Button();

				driver.quit();

			}

			@Test
			public void create_project_with_blank_processing_engine_details_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.create_Button();

				Scroll_Page.scroll_up_page(driver);
				driver.quit();
			}

			@Test
			public void create_project_with_disable_status_details_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.create_Button();

				driver.quit();
			}

			@Test
			public void create_project_with_existing_project_name_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterExistingProjectName("ProjectDemo");
				project.create_Button();

				driver.quit();
			}

			@Test
			public void verify_cancel_button_funationality_for_any_data() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterEmailID();
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				project.clickOnCancelButton();
				driver.quit();
			}

			@Test
			public void verify_error_Messages_for_empty_Project_Name_filed_and_lead_file_and_processing_engine() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine();
				driver.quit();
			}

			@Test
			public void create_project_with_all_blank_details_By_click_On_Next_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				Thread.sleep(10000);
				project.next_Button();

				driver.quit();

			}

			@Test
			public void create_project_with_blank_template_details_By_click_On_Next_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.next_Button();

				driver.quit();
			}

			@Test
			public void create_project_with_blank_roles_details_By_click_On_Next_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				Thread.sleep(5000);
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				project.next_Button();

				driver.quit();
			}

			@Test
			public void create_project_with_blank_user_details_inside_the_roles_section_By_click_On_Next_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				project.enterRolesDetails("Analysis");
				project.next_Button();

				driver.quit();
			}

			@Test
			public void create_project_with_blank_processing_engine_details_By_click_On_Next_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);

				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.next_Button();
				Scroll_Page.scroll_up_page(driver);
				driver.quit();
			}

			@Test
			public void select_dates_from_calendar_application_without_changing_year_and_month() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.select_start_date_and_end_date_from_calendar_application();
				driver.quit();
			}

			@Test
			public void select_dates_from_calendar_application_with_changing_year_and_month() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.change_year_and_month_from_calendar_application();
				driver.quit();
			}

			@Test
			public void verify_delete_functionality_for_user_on_Roles_Section() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);

				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				Scroll_Page.scroll_down_page(driver);
				project.enterRolesDetails("Analysis");
				project.enterUserDetailsInRoleSection();
				project.delete_user_from_role_section();
				project.create_Button();
				driver.quit();
			}

			@Test
			public void create_MedicalChart_Type_Project_having_amazon_s3_attachment_and_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);


				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectLead("qauser@gmail.com");
				project.enterStartAndEndDate();
				project.selectProjectType("Medical_Chart");
				project.selectStatus("Medical_Chart");
				project.addEntityDetailsForMedicalChartProject("HCC Conditions");
				project.clickOnDocumentInvestigationDropdown();
				project.enterDetailsForAmazonS3Type("Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7", "AKIAWKITVLWMKRADZH3O", "us-east-1");
				project.checkConnectionMessagesAndClickOnOkButton();
				project.enterAPIConfigurationDetails();
				driver.quit();
			}

			@Test
			public void create_Free_Form_Type_Project_having_google_drive_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);

				project.clickOnCreateProjectButton();
				project.enterNewProjectName();
				project.selectProjectType("Free-Form");
				project.selectStatus("Free-Form");
				project.enterAttributeDetailsForFreeFormProjectType("PatientName");
				project.clickOnDocumentInvestigationDropdown();
				project.enterDetailsForGoogleDriveType("suwarnajungari@gmail.com");
				project.checkConnectionMessagesAndClickOnOkButton();
				project.enterAPIConfigurationDetails();
				driver.quit();
			}

			@Test
			public void create_Structure_Type_Project_having_amazon_s3_attachment_and_having_existing_projectName_and_By_click_On_Create_Button() throws Exception {

				driver = Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/home");
				LoginUser.login_users(driver, "Operator@Test.com", "Operator@111");
				Project_Module project = new Project_Module(driver);

				project.clickOnCreateProjectButton();
				project.enterExistingProjectName("DempProj");
				project.selectProjectType("Structure");
				project.selectProcessingEngine();
				project.selectStatus("Structure");
				project.enterTemplateDetails();
				project.enterRolesDetails("Analysis");
				project.enterUserDetailsInRoleSection();
				project.clickOnDocumentInvestigationDropdown();
				project.enterDetailsForAmazonS3Type("Wmsp+0/+stE6dvgk3pAnObP38THQESOylCASX0V7", "AKIAWKITVLWMKRADZH3O", "us-east-1");
				project.checkConnectionMessagesAndClickOnOkButton();
				project.enterAPIConfigurationDetails();

				driver.quit();
			}
		}
