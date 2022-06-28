package Pages;

import java.util.List;
import java.util.Random;

import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Project_Module_Locators;
import Utilities.Scroll_Page;
import Utilities.Verification_Functions;

public class Project_Module
{

    WebDriver driver;

    //locators
    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
    public static By SelectStructure = By.xpath("//span[contains(text(),'Structured')]");
    By clickfreeform=By.xpath("//span[contains(text(),' Free-Form ')]");
    By clickmedical=By.xpath("//span[contains(text(),' Medical Chart ')]");

    @FindBy (xpath="//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']")
    public WebElement projectMenu;

    @FindBy(xpath="//input[@placeholder='Search']")
    public WebElement searchProject;

    @FindBy(xpath="//span[text()=' Create Project ']//following::mat-icon[2]")
    public WebElement editIconForProject;

    @FindBy(xpath="//span[text()=' Create Project ']")
    public WebElement create_Project_button;

    @FindBy (xpath="//mat-label[text()='Project Name']//following::input[1]")
    public WebElement project_Name_Filed;
    By medical=By.xpath("//span[contains(text(),' Medical Chart ')]");
    By freefrom=By.xpath("//span[contains(text(),' Free-Form ')]");
    @FindBy (xpath="//mat-label[text()='Lead']//following::div[2]")
    public WebElement click_on_Lead_filed;

    @FindBy (xpath="//input[@placeholder='Search']")
    public WebElement search_Lead;

    @FindBy (xpath="//mat-label[text()='Lead']//following::mat-option[1]")
    public WebElement select_Lead;

    @FindBy (xpath="//mat-label[text()='Start Date']//following::input[1]")
    public WebElement start_Date;

    @FindBy (xpath="//mat-label[text()='End Date']//following::input[1]")
    public WebElement end_Date;

    @FindBy (xpath="//mat-label[text()=' Document Structure ']//following::div[12]")
    public WebElement document_Structure_dropdown;

    @FindBy (xpath="//mat-label[text()=' Document Structure ']//following::mat-option[1]")
    public WebElement select_Structured_Project_Type;

    @FindBy (xpath="//mat-label[text()=' Document Structure ']//following::mat-option[2]")
    public WebElement select_Semi_Structured_Project_Type;

    @FindBy (xpath="//mat-label[text()=' Document Structure ']//following::mat-option[3]")
    public WebElement select_Free_Form_Project_Type;

    @FindBy (xpath="//span[contains(text(),' Medical Chart ')]")
    public WebElement select_Medical_Chart_Project_Type;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::div[12]")
    public WebElement processing_Engine_Dropdown;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::mat-option[1]")
    public WebElement nh_High_ProcessingEngine_For_Structure_project;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::mat-option[2]")
    public WebElement nh_Low_ProcessingEngine_For_Structure_project;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::mat-option[3]")
    public WebElement brute_Force_ProcessingEngine_For_Structure_project;


    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::mat-option[1]")
    public WebElement trade_ProcessingEngine_For_SemiStructure_project;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::mat-option[2]")
    public WebElement returns_ProcessingEngine_For_SemiStructure_project;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::label[1]")
    public WebElement status_select;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::label[2]")
    public WebElement document_auto_assignment_select;

    @FindBy (xpath="//mat-label[text()=' Processing Engine ']//following::label[3]")
    public WebElement straight_Through_Process_select;

    @FindBy (xpath="//mat-label[text()='Document Score (0-100)']//following::input[1]")
    public WebElement document_Score;

    @FindBy (xpath="//span[text()=' Add Template ']")
    public WebElement add_Template_button;

    @FindBy (xpath="//span[text()=' Add Template ']//following::input[3]")
    public WebElement search_Template;

    @FindBy (xpath="//input[@placeholder='Search']//following::button[1]")
    public WebElement select_Template;

    @FindBy (xpath="//span[text()='Roles']/descendant-or-self::span")
    public WebElement expand_Role_Details;

    @FindBy (xpath="//span[text()=' Add Role ']")
    public WebElement add_Role_Button;

    @FindBy (xpath="//div[@id='mat-menu-panel-1']/div/div[1]/input")
    public WebElement search_Role;

    @FindBy (xpath="//div[@class='cdk-overlay-pane']//following::button[1]")
    public WebElement select_Role;

    @FindBy (xpath="//span[text()=' Document Ingestion Channels ']")
    public WebElement expand_Document_Investigation_Channels;

    @FindBy (xpath="//mat-label[text()='Channel Type']//following::span[1]")
    public WebElement channel_Type;

    By testbtn=By.xpath("//span[contains(text(), 'Test Connection')]");

    @FindBy (xpath="//mat-label[text()='Channel Type']//following::img[4]")
    public WebElement gcp_Bucket_select;

    @FindBy (xpath="//mat-label[text()='Channel Type']//following::img[3]")
    public WebElement amazon_s3_select;

    @FindBy (xpath="//mat-label[text()='Channel Type']//following::img[2]")
    public WebElement google_Drive_Select;

    @FindBy (xpath="//span[text()='API Configuration']")
    public WebElement expand_API_configuration_details;

    @FindBy (xpath="//*[text()=' You do not have permissions to add an API.']")
    public WebElement api_Access_related_message;

    @FindBy (xpath="//span[text()=' Create API ']")
    public WebElement create_API_Button;


    @FindBy (xpath="//mat-label[text()='API Name']//following::input[1]")
    public WebElement api_Name;

    @FindBy (xpath="//mat-label[text()='Method Type']//following::div[1]")
    public WebElement method_Type_Dropdown;


    @FindBy (xpath="//span[text()='GET']")
    public WebElement select_get_method;

    @FindBy (xpath="//span[text()='POST']")
    public WebElement select_post_method;

    @FindBy (xpath="//span[text()='PUT']")
    public WebElement select_put_method;

    @FindBy (xpath="//span[text()='DELETE']")
    public WebElement select_delete_method;

    @FindBy (xpath="//mat-label[text()='End Point']//following::input")
    public WebElement end_Point;

    @FindBy (xpath="//span[text()=' Add Field ']")
    public WebElement add_filed_button_for_api;

    @FindBy (xpath="//span[text()=' Add Field ']//following::input[1]")
    public WebElement api_key;

    @FindBy (xpath="//span[text()=' Add Field ']//following::input[2]")
    public WebElement api_value;

    @FindBy (xpath="//span[text()=' Test Connection ']")
    public WebElement test_Connection_button;

    @FindBy (xpath="//span[text()='Add ']")
    public WebElement add_Button_for_API;

    @FindBy (xpath="//span[text()='Add ']//following::button[1]")
    public WebElement cancel_Button_For_API;

    @FindBy (xpath="//span[text()=' Next']//preceding::button[1]")
    public WebElement cancel_Button_On_Project_Details;

    @FindBy (xpath="//span[text()=' Next']")
    public WebElement next_Button_On_Project_Details;

    @FindBy (xpath="//span[text()=' Add Fields ']")
    public WebElement add_Field_For_Attribute;

    @FindBy (xpath="//span[text()=' Add Fields ']//following::input[3]")
    public WebElement search_Attribute_On_Web;

     @FindBy (xpath="//button[contains(text(),'PatientName')]")
    public WebElement select_Attribute;

    @FindBy (xpath="//span[contains(text(),' Add Entity ')]")
    public WebElement add_Entity_Button;

    @FindBy (xpath="//input[@placeholder='Search']")
    public WebElement search_Entity_On_Web;

    @FindBy (xpath="(//button[@class='mat-focus-indicator mat-menu-item'])[2]")
    public WebElement select_HCC_Condition_Entity;

    @FindBy (xpath="//span[text()=' Create']")
    public WebElement create_button;

    @FindBy (xpath="//span[text()=' Create']//following::button[1]")
    public WebElement cancel_Button;

    @FindBy (xpath="//span[text()=' Next']")
    public WebElement next_Button;

    //google drive locators and Amazon s3

    @FindBy (xpath="//mat-label[text()='Channel Name']//following::input[1]")
    public WebElement channel_Name;

    @FindBy (xpath="//mat-label[text()='User Email']//following::input[1]")
    public WebElement user_Email_for_google_drive;

    @FindBy (xpath="//mat-label[text()='Service Account File']//following::input[1]")
    public WebElement upload_Service_Account_File;

    @FindBy (xpath="//span[text()='ok']//preceding::div[1]")
    public WebElement test_conn_success_or_error_msg;

    @FindBy (xpath="//span[text()='ok']")
    public WebElement ok_button;

    @FindBy (xpath="//mat-label[text()='Secret Key ID']//following::input[1]")
    public WebElement secret_Key_ID;

    @FindBy (xpath="//mat-label[text()='Access Key ID']//following::input[1]")
    public WebElement access_Key_ID;

    @FindBy (xpath="//mat-label[text()='Bucket Region']//following::input[1]")
    public WebElement bucket_Region;

    @FindBy (xpath="//span[text()=' Test Connection ']")
    public WebElement test_Connection_button_for_google_drive_and_Amazon_s3;



    //verify template details

    @FindBy (xpath="//mat-header-cell[text()=' Action ']//following::mat-row[1]/mat-cell[1]/span[1]")
    public WebElement name_of_template;


    //verify roles details
    @FindBy (xpath="//div[text()=' Users ']//following::div[3]")
    public WebElement role_Name;

    @FindBy (xpath="//div[text()=' Users ']//following::mat-icon[1]")
    public WebElement addButton_User_In_Roles_Details;

    @FindBy (xpath="//*[@class='cdk-overlay-connected-position-bounding-box']//following::mat-option[1]/span[1]")
    public WebElement select_userName_For_Roles_Details;

    @FindBy (xpath="//div[@class='mat-chip-ripple']//following::mat-icon[1]")
    public WebElement delete_userName_From_Roles_Details;

    @FindBy (xpath="//div[text()=' Users ']//following::mat-chip")
    public WebElement user_Name_On_Roles_Section;

    @FindBy (xpath="//div[text()=' Users ']//following::mat-icon[1]")
    public WebElement remove_user_from_Roles_section;


    //Error messages

    @FindBy (xpath="//*[@class='mat-simple-snackbar ng-star-inserted']")   //works for missing roles, template, roles and existing project
    public WebElement error_msg_for_mandatory_attributes;

    @FindBy (xpath="//*[text()='Lead']//following::mat-error[1]")
    public WebElement error_msg_for_Empty_lead_dropdown;

    @FindBy (xpath="//*[text()='Project Name']//following::mat-error[1]")
    public WebElement error_msg_for_Empty_Project_Name_Filed;

    @FindBy (xpath="//*[text()=' Processing Engine ']//following::mat-error[1]")
    public WebElement error_msg_for_Empty_processing_engine_for_structured_type_project;

    //label locators

    @FindBy (xpath="//mat-label[text()='Start Date']")
    public WebElement start_date_label;


    //locators for calendar application

    @FindBy (xpath="//mat-label[text()='Start Date']//following::span[2]")
    public WebElement calendar_app_for_start_date;

    @FindBy (xpath="//mat-label[text()='End Date']//following::span[2]")
    public WebElement calendar_app_for_end_date;

    @FindBy (xpath="//div[text()=' 10 ']")
    public WebElement select_start_date;

    @FindBy (xpath="//div[text()=' 17 ']")
    public WebElement select_end_date;

    @FindBy (xpath="//button[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']")
    public WebElement month_year_filed_for_start_date_or_end_date;

    @FindBy (xpath="//button[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[2]")
    public WebElement select_year_or_month_for_start_date;

    @FindBy (xpath="//button[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[48]")
    public WebElement select_year_for_end_date;

    @FindBy (xpath="//button[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[24]")
    public WebElement select_month_for_end_date;

    @FindBy (xpath="//span[text()=' Update']")
    public WebElement updateButton;

    @FindBy (xpath="//*[contains(text(),' list ')]")
    public WebElement TableStructure;

    @FindBy (xpath="//mat-slide-toggle[@class='mat-slide-toggle mat-primary ng-valid ng-dirty ng-touched']")
    public WebElement enabaleOrDisableUserToggleOnProjectPage;

    public void clickOnProjectMenu() throws  Exception
    {
        projectMenu.click();
        Thread.sleep(7000);
    }
    public Project_Module(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void searchProject(String projectName)
    {
        searchProject.sendKeys(projectName);
    }

    public void clickOnEditProjectIcon() throws Exception
    {
        editIconForProject.click();

    }
    public  void clickOnCreateProjectButton() throws Exception
    {

        create_Project_button.click();
    }
    public  void enterNewProjectName() throws Exception {
        Random randam_num = new Random();
        int int_num = randam_num.nextInt(2000);
        project_Name_Filed.sendKeys("PRONAME" + int_num);
    }
    public void enterExistingProjectName(String projectName)
    {
        project_Name_Filed.sendKeys("PRONAME");
    }
    public void selectLead(String emailID)  throws Exception
    {
        Thread.sleep(2000);
        click_on_Lead_filed.click();
        Thread.sleep(2000);
        search_Lead.sendKeys(emailID);
        Thread.sleep(2000);
        select_Lead.click();

    }
    public void enterEmailID()  throws Exception
    {
        search_Lead.sendKeys("qauser@gmail.com");

    }

    public void enterStartAndEndDate()  throws Exception
    {
        Custome_Wait.waitElement(driver,start_Date);
        start_Date.sendKeys("4/11/2022");
        Custome_Wait.waitElement(driver,end_Date);
        end_Date.sendKeys("4/13/2022");

    }

    public  void selectProjectType(String projectType) throws Exception
    {
        Thread.sleep(2000);
        document_Structure_dropdown.click();
        Thread.sleep(1000);


        if(projectType.equalsIgnoreCase("Structure"))
        {


            select_Structured_Project_Type.click();
        }
        else if(projectType.equalsIgnoreCase("Semi-Structure"))
        {
            select_Semi_Structured_Project_Type.click();
        }
        else if(projectType.equalsIgnoreCase("Free-Form"))
        {

            select_Free_Form_Project_Type.click();
        }
        else if(projectType.equalsIgnoreCase("Medical_Chart"))
        {
            select_Medical_Chart_Project_Type.click();
        }


    }

    public  void selectProcessingEngine() throws Exception
    {
        Thread.sleep(2000);
        processing_Engine_Dropdown.click();
        Thread.sleep(1000);
        nh_High_ProcessingEngine_For_Structure_project.click();
    }

    public  void selectStatus(String project_type) throws Exception
    {

        Thread.sleep(1000);
        if(project_type.equalsIgnoreCase("Medical_Chart"))
        {

            status_select.click();
            Thread.sleep(1000);
            document_auto_assignment_select.click();
        }
        else
        {
            status_select.click();
            Thread.sleep(1000);
            document_auto_assignment_select.click();
            Thread.sleep(1000);
            straight_Through_Process_select.click();
            Custome_Wait.waitElement(driver,document_Score);
            document_Score.sendKeys("90");
        }
    }

    public  void enterTemplateDetails() throws Exception
    {
        Thread.sleep(2000);
        add_Template_button.click();
        Thread.sleep(1000);
        search_Template.sendKeys("YOURK_TEMPLATE");
        Thread.sleep(1000);
        select_Template.click();
        Scroll_Page.scroll_down_page(driver);
    }

    public  void enterRolesDetails(String roleName) throws Exception
    {
        Scroll_Page.scroll_down_page(driver);
        expand_Role_Details.click();
        Thread.sleep(2000);
        add_Role_Button.click();
        Custome_Wait.waitElement(driver,search_Role);
        search_Role.sendKeys(roleName);
        Custome_Wait.waitElement(driver,select_Role);
        select_Role.click();
    }

    public  void enterUserDetailsInRoleSection() throws Exception
    {
        addButton_User_In_Roles_Details.click();
        Thread.sleep(2000);
        select_userName_For_Roles_Details.click();

        Actions act=new Actions(driver);
        act.moveToElement(user_Name_On_Roles_Section);
        act.click().build().perform();

    }

    public void enabaleOrDisableUserToggleOnProjectPage()
    {
        enabaleOrDisableUserToggleOnProjectPage.click();
    }

    public  void clickOnDocumentInvestigationDropdown() throws Exception
    {
        Thread.sleep(2000);
        expand_Document_Investigation_Channels.click();
        Custome_Wait.waitElement(driver,channel_Type);
        channel_Type.click();

    }

    public  void clickonconnectionbtn() throws Exception{
        driver.findElement(testbtn).click();
    }
    public  void selectGCPBucket() throws Exception
    {
        Thread.sleep(2000);
        gcp_Bucket_select.click();

    }
    public  void enterDetailsForGoogleDriveType(String user_Email) throws Exception
    {
        //Thread.sleep(3000);
        //Custome_Wait.waitElement(driver,google_Drive_Select);
        google_Drive_Select.click();
        //stome_Wait.waitElement(driver,channel_Name);
        channel_Name.sendKeys("TESTGOOGLEDRIVE");
        Custome_Wait.waitElement(driver,user_Email_for_google_drive);
        user_Email_for_google_drive.sendKeys(user_Email);
        //Custome_Wait.waitElement(driver,upload_Service_Account_File);
//		upload_Service_Account_File.sendKeys("C:\\Users\\NTS-suwarna\\eclipse-workspace\\ChatBot\\Inputs_Files\\intellidocs-304911-16f0f75b8ed4.json");
//		Custome_Wait.waitElement(driver,test_Connection_button);
//		test_Connection_button.click();

    }

    public  void checkConnectionMessagesAndClickOnOkButton() throws Exception
    {
        Thread.sleep(3000);
        if(driver.findElements(By.xpath("//span[text()='ok']//preceding::div[1]")).size()==1)
        {
            Custome_Wait.waitElement(driver,test_conn_success_or_error_msg);
            System.out.println(test_conn_success_or_error_msg.getText());
        }
        else
        {
            Custome_Wait.waitElement(driver,test_conn_success_or_error_msg);
            System.out.println(test_conn_success_or_error_msg.getText());
        }
        ok_button.click();


    }

    public  void enterDetailsForAmazonS3Type(String secret_key,String access_key,String bucket_region) throws Exception
    {
        Custome_Wait.waitElement(driver,amazon_s3_select);
        amazon_s3_select.click();
        Thread.sleep(2000);
        channel_Name.sendKeys("2299");

        secret_Key_ID.sendKeys(secret_key);

        access_Key_ID.sendKeys(access_key);

        bucket_Region.sendKeys(bucket_region);
        Thread.sleep(2000);
        test_Connection_button.click();


    }

    public  void enterAPIConfigurationDetails() throws Exception
    {

        expand_API_configuration_details.click();
        List<WebElement> able_to_access_api_or_not=driver.findElements(By.xpath("//*[text()=' You do not have permissions to add an API.']"));

        if(able_to_access_api_or_not.size()==1)
        {
            System.err.println("Able to Access");
        }
        else
        {
            System.err.println("Access denied....");
        }

    }

    public  void enterAttributeDetailsForFreeFormProjectType(String search_Attribute) throws Exception
    {
        Scroll_Page.scroll_down_page(driver);
        Thread.sleep(2000);
        add_Field_For_Attribute.click();

        search_Attribute_On_Web.sendKeys(search_Attribute);

        select_Attribute.click();

    }

    public  void addEntityDetailsForMedicalChartProject(String search_Entity) throws Exception
    {
        Scroll_Page.scroll_down_page(driver);
        Thread.sleep(2000);
        add_Entity_Button.click();
        Thread.sleep(2000);
//		search_Entity_On_Web.sendKeys(search_Entity);
//		Custome_Wait.waitElement(driver,select_HCC_Condition_Entity);
        select_HCC_Condition_Entity.click();
        Thread.sleep(2000);


    }

    public  void project_name_filed_validation(String projectName) throws Exception
    {
        String act_value=null;
        Thread.sleep(2000);
        project_Name_Filed.sendKeys(projectName);
        Custome_Wait.waitElement(driver,project_Name_Filed);
        act_value=project_Name_Filed.getText();
        Verification_Functions.actual_text_data_Campare(act_value);

    }

    public  void lead_filed_validation(String emailID) throws Exception
    {
        String act_value=null;
        Thread.sleep(2000);
        click_on_Lead_filed.click();
        Custome_Wait.waitElement(driver,search_Lead);
        search_Lead.sendKeys(emailID);
        Custome_Wait.waitElement(driver,search_Lead);
        act_value=search_Lead.getText();
        Verification_Functions.actual_text_data_Campare(act_value);
    }


    public  void start_date_filed_validation(String startDate) throws Exception
    {
        String act_value=null;
        Thread.sleep(2000);
        project_Name_Filed.sendKeys("TEST");
        Custome_Wait.waitElement(driver,start_Date);
        start_Date.sendKeys(startDate);
        Custome_Wait.waitElement(driver,start_Date);
        act_value=start_Date.getText();
        Verification_Functions.actual_text_data_Campare(startDate,act_value);

    }

    public  void end_date_filed_validation(String startDate,String endDate) throws Exception
    {
        String act_value=null;

        Thread.sleep(2000);
        start_Date.sendKeys(startDate);
        Custome_Wait.waitElement(driver,end_Date);
        end_Date.sendKeys(endDate);
        Custome_Wait.waitElement(driver,end_Date);
        act_value=end_Date.getText();
        Verification_Functions.actual_text_data_Campare(act_value);
    }


    public  void document_Structure_filed_validation() throws Exception
    {
        String act_value=null;

        Thread.sleep(2000);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Structured_Project_Type);
        select_Structured_Project_Type.click();
        Custome_Wait.waitElement(driver,project_Name_Filed);
        act_value=project_Name_Filed.getText();

        Verification_Functions.actual_text_data_Campare(act_value," Structured ");

        Custome_Wait.waitElement(driver,document_Structure_dropdown);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Semi_Structured_Project_Type);
        select_Semi_Structured_Project_Type.click();
        Custome_Wait.waitElement(driver,project_Name_Filed);
        act_value=project_Name_Filed.getText();
        Verification_Functions.actual_text_data_Campare(act_value," Semi-Structured ");

        Custome_Wait.waitElement(driver,document_Structure_dropdown);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Free_Form_Project_Type);
        select_Free_Form_Project_Type.click();
        Custome_Wait.waitElement(driver,project_Name_Filed);
        act_value=project_Name_Filed.getText();

        Verification_Functions.actual_text_data_Campare(act_value," Free-Form ");

        Custome_Wait.waitElement(driver,document_Structure_dropdown);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Medical_Chart_Project_Type);
        select_Medical_Chart_Project_Type.click();

        act_value=project_Name_Filed.getText();

        Verification_Functions.actual_text_data_Campare(act_value," Medical Chart ");
    }


    public  void processing_Engine_filed_validation_for_Structured_Project(String projectName) throws Exception
    {
        String act_value=null;
        Thread.sleep(2000);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Structured_Project_Type);
        select_Structured_Project_Type.click();
        Custome_Wait.waitElement(driver,processing_Engine_Dropdown);

        processing_Engine_Dropdown.click();
        Custome_Wait.waitElement(driver,nh_High_ProcessingEngine_For_Structure_project);
        nh_High_ProcessingEngine_For_Structure_project.click();

        Custome_Wait.waitElement(driver,processing_Engine_Dropdown);
        processing_Engine_Dropdown.click();
        Custome_Wait.waitElement(driver,nh_Low_ProcessingEngine_For_Structure_project);
        nh_Low_ProcessingEngine_For_Structure_project.click();
        Custome_Wait.waitElement(driver,processing_Engine_Dropdown);

        processing_Engine_Dropdown.click();
        Custome_Wait.waitElement(driver,brute_Force_ProcessingEngine_For_Structure_project);
        brute_Force_ProcessingEngine_For_Structure_project.click();



    }

    public  void processing_Engine_filed_validation_for_Semi_Structured_Project(String projectName) throws Exception
    {
        String act_value=null;

        Thread.sleep(2000);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Semi_Structured_Project_Type);
        select_Semi_Structured_Project_Type.click();
        Custome_Wait.waitElement(driver,processing_Engine_Dropdown);

        processing_Engine_Dropdown.click();
        Custome_Wait.waitElement(driver,trade_ProcessingEngine_For_SemiStructure_project);
        trade_ProcessingEngine_For_SemiStructure_project.click();


        Custome_Wait.waitElement(driver,processing_Engine_Dropdown);
        processing_Engine_Dropdown.click();
        Custome_Wait.waitElement(driver,returns_ProcessingEngine_For_SemiStructure_project);
        returns_ProcessingEngine_For_SemiStructure_project.click();


    }


    public  void processing_Engine_For_Free_From_Project(String projectName) throws Exception
    {
        Thread.sleep(2000);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Free_Form_Project_Type);
        select_Free_Form_Project_Type.click();


        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(processing_Engine_Dropdown));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable......Which means given field working as expected");
        }
    }

    public  void processing_Engine_For_Medical_Project(String projectName) throws Exception
    {
        Thread.sleep(2000);

        document_Structure_dropdown.click();
        Thread.sleep(2000);

        select_Medical_Chart_Project_Type.click();


        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(processing_Engine_Dropdown));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable......Which means given field working as expected");
        }
    }


    public  void status_filed_validate() throws Exception
    {


        Thread.sleep(2000);
        status_select.click();
        Verification_Functions.check_statuses_enable_or_disable(driver, status_select);

    }

    public  void document_auto_Assignment_filed_validate() throws Exception
    {

        Custome_Wait.waitElement(driver,document_auto_assignment_select);
        Thread.sleep(1000);
        document_auto_assignment_select.click();
        Verification_Functions.check_statuses_enable_or_disable(driver, document_auto_assignment_select);

    }


    public  void straight_through_process_and_document_scrore_filed_validate() throws Exception
    {
        Thread.sleep(2000);
        straight_Through_Process_select.click();
        Verification_Functions.check_statuses_enable_or_disable(driver, straight_Through_Process_select);
        Custome_Wait.waitElement(driver,document_Score);
        document_Score.sendKeys("99");
        String act_value=document_Score.getText();
        Verification_Functions.actual_text_data_Campare(act_value);

    }

    public  void template_fields_validation() throws Exception
    {
        Thread.sleep(2000);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Structured_Project_Type);
        select_Structured_Project_Type.click();
        Scroll_Page.scroll_down_page(driver);
        Custome_Wait.waitElement(driver,add_Template_button);
        add_Template_button.click();
        Custome_Wait.waitElement(driver,search_Template);
        search_Template.sendKeys("YOURK_TEMPLATE");
        String expect=search_Template.getText();
        Custome_Wait.waitElement(driver,select_Template);
        select_Template.click();
        Scroll_Page.scroll_down_page(driver);
        Custome_Wait.waitElement(driver,name_of_template);
        String actual=name_of_template.getText();
        Verification_Functions.actual_text_data_Campare(actual, expect);

    }

    public  void roles_fields_validation() throws Exception
    {

        Scroll_Page.scroll_down_page(driver);

        Thread.sleep(2000);
        expand_Role_Details.click();
        Custome_Wait.waitElement(driver,add_Role_Button);
        add_Role_Button.click();
        Custome_Wait.waitElement(driver,search_Role);
        search_Role.sendKeys("BCAtesting");
        String expected="BCAtesting";
        select_Role.click();
        String actual=role_Name.getText();
        Verification_Functions.actual_text_data_Campare(actual, expected);
    }

    public  void create_Button() throws Exception
    {
        Thread.sleep(1000);
        create_button.click();

    }

    public  void next_Button() throws Exception
    {
        Thread.sleep(1000);
        next_Button.click();

    }

    public  void error_messages_validation() throws Exception
    {
        Scroll_Page.scroll_down_page_till_end(driver);

        if(error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please add the attributes before creating the project."))
        {
            System.out.println("Please add the attributes before creating the project.");
        }
        else if(error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please add the template before creating the project."))
        {
            System.out.println("Please add the template before creating the project.");
        }
        else if(error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please check form data and role(s) cannot be empty"))
        {
            System.out.println("Please check form data and role(s) cannot be empty");
        }
        else if(error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Please check form data and role(s) cannot be empty"))
        {
            System.out.println("Role cannot have empty users");
        }
        else if(error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("Role(s) cannot be empty"))
        {
            System.out.println("Role(s) cannot be empty");
        }

        else if(error_msg_for_mandatory_attributes.getText().equalsIgnoreCase("check form data"))
        {
            System.out.println("check form data");
        }
        else if(error_msg_for_mandatory_attributes.getText().contentEquals("role is Disabled"))
        {
            System.out.println(" role is Disabled");
        }

    }

    public  void clickOnCancelButton() throws Exception
    {

        Thread.sleep(1000);
        cancel_Button.click();

        Verification_Functions.url_verification("https://alpha.neutrino-ai.com/#/home/project-management", driver.getCurrentUrl());
    }
    public void ClickOnDocumentStructureBtn() throws Exception{

        driver.findElement(ClickDocumentStructure).click();
    }
    public void  SelectDocumentMedicalBtn() throws Exception{
        driver.findElement(medical).click();
    }
    public  void  SelectDocumentFreeFormBtn() throws Exception{
        driver.findElement(freefrom).click();
    }
    public void SelectDocumentfreeBtn() throws Exception{
        driver.findElement(clickfreeform).click();
    }
    public void SelectDocumentStructureBtn() throws Exception{

        driver.findElement(SelectStructure).click();
    }
    public void setClickmedical() throws Exception{
        driver.findElement(clickmedical).click();
    }



    public  void error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine() throws Exception
    {

        Thread.sleep(2000);
        project_Name_Filed.click();
        Custome_Wait.waitElement(driver,project_Name_Filed);
        project_Name_Filed.sendKeys(Keys.TAB);

        Verification_Functions.actual_text_data_Campare(error_msg_for_Empty_Project_Name_Filed.getText(), "Can not be blank");
        Custome_Wait.waitElement(driver,click_on_Lead_filed);
        click_on_Lead_filed.click();

        Actions act=new Actions(driver);
        act.moveToElement(start_date_label).click().build().perform();
        Verification_Functions.actual_text_data_Campare(error_msg_for_Empty_lead_dropdown.getText(), "Can not be blank");
        Custome_Wait.waitElement(driver,document_Structure_dropdown);
        document_Structure_dropdown.click();
        Custome_Wait.waitElement(driver,select_Structured_Project_Type);
        select_Structured_Project_Type.click();
        Custome_Wait.waitElement(driver,processing_Engine_Dropdown);
        processing_Engine_Dropdown.click();

        act.moveToElement(start_date_label).click().build().perform();

        Verification_Functions.actual_text_data_Campare(error_msg_for_Empty_lead_dropdown.getText(), "Can not be blank");



    }

    public  void select_start_date_and_end_date_from_calendar_application() throws Exception
    {
        Thread.sleep(1000);
        calendar_app_for_start_date.click();
        Custome_Wait.waitElement(driver,select_start_date);
        select_start_date.click();

        Custome_Wait.waitElement(driver,calendar_app_for_end_date);
        calendar_app_for_end_date.click();
        Custome_Wait.waitElement(driver,select_end_date);
        select_end_date.click();

    }

    public  void change_year_and_month_from_calendar_application() throws Exception
    {
        Thread.sleep(1000);
        calendar_app_for_start_date.click();
        Custome_Wait.waitElement(driver,month_year_filed_for_start_date_or_end_date);
        month_year_filed_for_start_date_or_end_date.click();
        Custome_Wait.waitElement(driver,select_year_or_month_for_start_date);
        select_year_or_month_for_start_date.click();  //select year
        Custome_Wait.waitElement(driver,select_year_or_month_for_start_date);
        select_year_or_month_for_start_date.click();        //select month
        Custome_Wait.waitElement(driver,select_start_date);
        select_start_date.click();
        Custome_Wait.waitElement(driver,calendar_app_for_end_date);
        calendar_app_for_end_date.click();
        Custome_Wait.waitElement(driver,month_year_filed_for_start_date_or_end_date);
        month_year_filed_for_start_date_or_end_date.click();
        Custome_Wait.waitElement(driver,select_year_for_end_date);
        select_year_for_end_date.click();
        Custome_Wait.waitElement(driver,select_month_for_end_date);
        select_month_for_end_date.click();
        Custome_Wait.waitElement(driver,select_end_date);
        select_end_date.click();
    }

    public  void delete_user_from_role_section() throws Exception
    {
        Thread.sleep(1000);
        remove_user_from_Roles_section.click();

    }

    public void clickOnUpdateButton() throws Exception
    {
        updateButton.click();
        Thread.sleep(7000);
    }
    public void TableStructure() throws Exception{

        TableStructure.click();
    }



}
