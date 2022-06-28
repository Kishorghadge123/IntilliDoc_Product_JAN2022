package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.AssertionsFunction;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

@Listeners(Utilities.TestListeners.class)

public class ProjectBREMedicalChartDocumentTest extends BasePage {
    public static ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;
    public DocumentPage DocPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();

    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void verify_edit_address_save_draft_Patient_Demographics() throws Exception {

        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");

        DocPageObj = new DocumentPage(driver);
        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
        DocPageObj.ClickDocumentBtn();
        Thread.sleep(4000);
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);

        // TC 1 Verifying the Save Draft option for Patient Demographics.
        DocPageObj.ClickDropDownBtn();
        Thread.sleep(2000);
        //Search Medical Chart Project.

        DocPageObj.ClickSelectMedicalChartProject();
        Thread.sleep(2000);

        //Open Ready Document.
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        //AssertionsFunction.verifyTargetPageURL(DocPageObj.ClickOnReadyDocumentUrl);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent(DocPageObj.getpatientDemographics()));

        //Clear the Address.

        ProjectBREMedicalChartDocumentPageObj.ClickOnClearAddress();
        //Enter New Address.
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterAddress(ReadProps.readAttr("BREAddress"));
        //Click on Save Draft.
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.SaveDraft);
        Thread.sleep(2000);

    }



    @Test(priority = 2)
    public void verify_add_encounter_click_on_cancel() throws InterruptedException, IOException {
        // 2 Verify the Saved Data.
        //Open the Same Ready document.

        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(4000);
//        AssertionsFunction.verifyTargetPageURL(DocPageObj.ClickOnReadyDocumentUrl);

        // 2.1 verify add encounter click on cancel
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelAddEncounter();
        Thread.sleep(2000);
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.CancelEncounterDetails);
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void verify_without_entring_encounter_details_click_on_save() throws InterruptedException, IOException {
        //2.2 verify without entring encounter details click on  save
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getnpnNum()));
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelAddEncounter();
        Thread.sleep(3000);
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.CancelEncounterDetails);
    }

    @Test(priority = 4)
    public void verify_add_encounter_details_with_data_n_click_on_save() throws InterruptedException, IOException {
        // 2.3 verify add encounter details with data n click on save
        //IN 800 For the medical chart structure, when I proceed to modify any diagnosis, the 'Type' should be visible corresponding to the HCC
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.LatestEncounter);
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void verify_Without_entering_details_of_HCC_click_on_save() throws InterruptedException, IOException {
        //2.4 verify  Without entering details of HCC click on save (-ve)
        //IN 802 Blank row for ICD should not be accepted
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnsaveBtnHCC();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnCancelHCC();
        Thread.sleep(3000);


        //2.5 verify   entering details of HCC click on save (+ve)
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterPageNum(ReadProps.readAttr("PageNum"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.selectCommentDropdown();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddICD();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnCancel();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(4000);




    }

    @Test(priority = 6)
    public void verifyeditEncounterDetails() throws InterruptedException, IOException {
        //* TC 3 verify edit encounter Details n save draft
//IN800 For the medical chart structure, when I proceed to modify any diagnosis, the 'Type' should be visible corresponding to the HCC
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(8000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEditEncounterDetails();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clearNPINUM();
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("EditNPINumber"));

        ProjectBREMedicalChartDocumentPageObj.clearPhysicianName();

        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("EditPhysicianName"));
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.SaveDraft);
        Thread.sleep(3000);

    }

    @Test(priority = 7)
    public void verifyDeletandsaveEncounterDetails() throws InterruptedException, IOException {
        // TC 4 verify Delete existing Details and save draft
        // (verify again)

        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEditEncounterDetails();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clearNPINUM();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clearPhysicianName();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDraft();
        Thread.sleep(2000);
        AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);
    }

//    // cardwise Document

    @Test(priority = 8)
    public void verify_System_should_be_able_to_retrieve_the_ICD_codes_for_the_captured_diseases() throws InterruptedException, IOException {
        //IN-156 System should be able to retrieve the ICD codes for the captured diseases.
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getcreatedICD()));
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        driver.navigate().back();

    }


    @Test(priority = 9)
    public void Click_On_ItemPer_Page() throws Exception {
        ////IN-413 Document Navigation Page- Server side pagination and Analytics Change- UI side change
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnItemPerPage();
        driver.navigate().refresh();
        Thread.sleep(3000);


    }

    @Test(priority = 10)
    public void Check_Email_Field() throws Exception {

        //IN-406 Post-processing requirements for the validation type "E-Mail"-JAVA side changes
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnPatientDemography();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.getcreatedEmail();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREMedicalChartDocumentPageObj.getcreatedEmail())));
        driver.navigate().back();
        Thread.sleep(3000);
    }


    @Test(priority = 11)
    public void check_cancel_button() throws Exception {
        //IN 501 ?While opening the document of the type 'Medical Charts', which is in the processed state, which is in read only mode right now, only 'Cancel' button should be made available
        //Search Medical Chart Project.

        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.getCancelButton();
        Thread.sleep(2000);
        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREMedicalChartDocumentPageObj.getCancelButton())));
        driver.navigate().back();
        Thread.sleep(3000);


    }

    @Test(priority = 12)
    public void without_adding_comment() throws Exception {
        //IN 626 Comments are mandatory at the diagnosis level, if the comments have not been provided for the valid(enabled) disease, under that circumstances, the medical charts should not be allowed to get submitted
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnMedicalProjectChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnTopEncounterDetail();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnAddEncounterButton();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSave();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.SaveBtn);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(4000);

    }

    @Test(priority = 13)
    public void System_should_open_rejected_document() throws Exception {
        //IN-492 Rejected medical charts not loading
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnrejectedDocument();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnImagename();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);

    }

    @Test(priority =14)
    public void Verify_provider_details() throws  Exception {
//  IN720 ??The system should be capable of verifying the medical charts based on the valid provider's signature (as in their qualifications) which will be available in the enterprise datasets.
        ///IN 180??The system should be capable of verifying the medical charts based on the valid provider's signature (as in their qualifications) which will be available in the enterprise datasets.
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.LatestEncounter);
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(3000);
    }



    @Test(priority = 15)
    public  void Check_the_comment() throws  Exception{
        //IN 646 Refinement of the comments at the run time
        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnMedicalProjectChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnTopEncounterDetail();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEditEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnSave();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.SaveBtn);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);

    }

    @Test(priority =16 )
    public void check_chart_flag_options() throws  Exception {
        //IN 620There should be facility to add the comments at the medical chart level
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyDocument();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickOnChartFlags();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.clickOnChartFlags);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);


    }
    @Test(priority = 17)
    public  void ICD_code_should_highlighted() throws  Exception{
        //IN 624 If the Operator is entering an invalid ICD codes, then the system should highlight the entered ICD code is wrong
        ProjectBREMedicalChartDocumentPageObj.clickonDropDown();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickonProjectName();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyDocument();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterDiagnosisForHCC();
        Thread.sleep(1000);

        ProjectBREMedicalChartDocumentPageObj.selectCommentDropdown1();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddICD();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.enterICDCode(ReadProps.readAttr("icd"));
        driver.navigate().back();
        Thread.sleep(3000);
    }
    @Test(priority = 18)
    public  void Add_third_character_ICD_codes () throws  Exception {
//IN 769 Refactoring HCC and ICD codes
        //IN 757  Validation of medical charts with non-HCC conditions
        //IN 624 If the Operator is entering an invalid ICD codes, then the system should highlight the entered ICD code is wrong
        //IN 713 only 1 page number per DOS will be displayed, remaining page numbers should be hidden for that particular diagnosis in that encounter
        //IN 821  The diagnosis should be auto populated when the operator is trying to enter a new entry.The diagnosis should be same as the description of the ICD code
        //IN 799 Once the provider details have been added, the sub table header details should not be auto populated, we should give the operator the freedom to select whether the entry he is going to enter is non-HCC or HCC
//IN 836 Removal of API call for retrieval of the ICD codes and description
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyDocument();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddEncounter();
        ProjectBREMedicalChartDocumentPageObj.clickOnEnterNPI(ReadProps.readAttr("NPINumber"));
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("PhysicianName"));
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterStarDate(ReadProps.readAttr("StartDate"));//Change this Date
        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterEndDate(ReadProps.readAttr("EndDate"));//Change this Date
        ProjectBREMedicalChartDocumentPageObj.clickOnSaveDiagonis();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter1();
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        ProjectBREMedicalChartDocumentPageObj.enterDiagnosisForHCC();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.selectCommentDropdown1();
        Thread.sleep(2000);

        ProjectBREMedicalChartDocumentPageObj.clickOnAddICD();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterICDCode(ReadProps.readAttr("ICD"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.Clickonoption();
        //build()- used to compile all the actions into a single step
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.enterHCC(ReadProps.readAttr("HCC"));
        ProjectBREMedicalChartDocumentPageObj.clickOnsaveBtnHCC();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(3000);    }





    @Test(priority = 19)
    public void  Verify_family_disease_and_diagnosis () throws  Exception{
        //IN557 only 1 page number per DOS will be displayed, remaining page numbers should be hidden for that particular diagnosis in that encounter
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyNewDocument();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getDiagnosisName()));
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(3000);    }


    @Test(priority = 20)
    public void  Verify_HCC_Code() throws  Exception{
//IN 182 Based on the ICD codes fetched by the system, the system should be able to capture the HCC codes.
        //IN812  Update the HCC list as per the latest 2021 dataset
        //IN782 Update chronic condition model as per 2022 dataset
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyNewDocument();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getNewCreatedICD()));
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getHcccode()));
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(3000);    }


    @Test(priority = 21)
    public void verify_filed_of_patient_Demographics_for_medical_project() throws IOException, InterruptedException {
        ///IN 616 For the document of the type 'Medical Charts', the user should have the ability to add the patient demographics manually, if some of the demographics has not been fetched by the system
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyNewDocument();
        Thread.sleep(4000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnPatientDemography();
        Thread.sleep(1000);
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getAgeAttribute()));
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getBirthDate()));
        Assert.assertTrue(AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.getEmail_address()));
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Test(priority = 22)
    public void  Enter_ICD_codes_for_empty_Diagnosis() throws  Exception{
//IN591 Training of ICD codes model using datasets
        ProjectBREMedicalChartDocumentPageObj.clickOnReadyNewDocument();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
        Thread.sleep(2000);
        ProjectBREMedicalChartDocumentPageObj.clickOnDiagnosis();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickLatestEncounter();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddHCCorNonHCCplusBtn();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnAddICD();
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.enterICDCode(ReadProps.readAttr("ICD"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement subMenu = driver.findElement(By.xpath("//*[text()=' Description ']//following::span[3]"));//To mouseover on sub menu
        actions.moveToElement(subMenu);//build()- used to compile all the actions into a single step
        actions.click().build().perform();
        Thread.sleep(3000);
        ProjectBREMedicalChartDocumentPageObj.enterHCC(ReadProps.readAttr("HCC"));
        Thread.sleep(1000);
        ProjectBREMedicalChartDocumentPageObj.clickOnsaveBtnHCC();
        AssertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.SaveHCC);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);    }


}


