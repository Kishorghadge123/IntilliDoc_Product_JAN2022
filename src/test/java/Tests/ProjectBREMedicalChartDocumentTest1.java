package Tests;
import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectBREMedicalChartDocumentPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
@Listeners(Utilities.TestListeners.class)
public class ProjectBREMedicalChartDocumentTest1 extends BasePage {
    @BeforeTest
    public void login() throws Exception {
            BasePage.LoginTest();
    }

    @Test(priority = 1)
    public void verify_rejected_document_no_data_extracted_on_medical_chart() throws Exception {
            //Object Creation.
            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            //TC 1.1 Open Ready Document and verify the Patient Demographics and Chronic conditions.
            DocumentPage DocPageObj = new DocumentPage(driver);
            DocPageObj.ClickDocumentBtn();
            Thread.sleep(8000);
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(2000);
            //Search Medical Chart Project.
            DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectNameICD"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ProjectSearch.jpg");
            Thread.sleep(2000);
            DocPageObj.ClickSelectMedicalChartProjectICD();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ProjectSelected.jpg");
            Thread.sleep(2000);
            //Open Rejected document and verify the Chronic conditions and Patient Demographics.
            ProjectBREMedicalChartDocumentPageObj.ClickOnRejectedDocument();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//RejectedDocument.jpg");
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelButtonICD();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//CancelBtn.jpg");
            Thread.sleep(1000);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument1TC1");
            test.log(LogStatus.PASS, "TestPassed");
        }

    @Test(priority = 2)
    public void edit_encounter_detail_and_enter_invalid_npi_physician_on_medical_chart() throws Exception {
            //Object Creation.
            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            //TC 1.2 Edit Encounter Details and save with Invalid NPI number and Physicians name.
            //Open Ready Document.
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocumentICD();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ViewReadyDocument.jpg");
            Thread.sleep(1000);
            //open Chart Data.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ViewChartData.jpg");
            Thread.sleep(1000);
            //open Chronic Conditions.
            ProjectBREMedicalChartDocumentPageObj.ClickOnChronicConditions();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ChronicConditions.jpg");
            Thread.sleep(1000);
            //Click on edit encounter details.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEncounterDetails();
            Thread.sleep(1000);
            //Open edit encounter details.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditEncounterDetails();
            Thread.sleep(1000);
            //Clear Physicians Name.
            ProjectBREMedicalChartDocumentPageObj.ClearDoctorName();
            Thread.sleep(1000);
            //save chronic conditions.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveChronicCondition();
            Thread.sleep(2000);
            //Error message for NPI and Physician details.
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ErrorNPI&Physician.jpg");
            Thread.sleep(1000);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument1TC2");
            test.log(LogStatus.PASS, "TestPassed");
        }
    @Test(priority = 3)
    public void run_rule_for_invalid_physicians_sign_on_medical_chart() throws Exception {
            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            //TC 1.3 Perform Run rule.
            //Entering valid NPI number.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterNPI(ReadProps.readAttr("NPINumber"));
            Thread.sleep(2000);
            //Entering INVALID Doctor name.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("DoctorName"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//EnteredValidNPI&PhysicianName.jpg");
            Thread.sleep(2000);
            //Save chronic condition.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveChronicCondition();
            Thread.sleep(2000);
            //Click on RUN RULE button
            ProjectBREMedicalChartDocumentPageObj.ClickOnRunRuleBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//RunRuleDone.jpg");
            Thread.sleep(2000);
            //Click on cancel button.
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelButtonICD();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//Cancel.jpg");
            Thread.sleep(1000);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument1TC3");
            test.log(LogStatus.PASS, "TestPassed");
        }
    @Test(priority = 4)
    public void verify_icd_on_medical_chart() throws Exception {

            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            //TC 1.4 verify all conditions for ICD Code.
            //Open Ready document
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocumentICD1();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ViewReadyDocument1.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ViewChartData1.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnChronicConditions();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ChronicConditions1.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEncounterDetails();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//EncounterDetails1.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditICDCodeOnEditDiagnosisDetails();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//EditDiagnosisDetails.jpg");
            Thread.sleep(2000);
            //Cancel button.
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelEditDiagnosisDetails();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnEditICDCodeOnEditDiagnosisDetails();
            Thread.sleep(2000);
            //Clear ICD code.
            ProjectBREMedicalChartDocumentPageObj.ClickOnClearICDCode();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//ClearICDCodeDetails.jpg");
            Thread.sleep(2000);
            //Enter Invalid ICD Code.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterInvalidICDCode(ReadProps.readAttr("InvalidICDCode"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//EnteredInvalidICDCode.jpg");
            Thread.sleep(1000);
            //Clear Invalid ICD code.
            ProjectBREMedicalChartDocumentPageObj.ClickOnClearICDCode();
            Thread.sleep(1000);
            //Waiting for suggestions of ICD code.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterInvalidICDCode(ReadProps.readAttr("ValidICDCode"));
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//EnteredValidICDCode.jpg");
            Thread.sleep(1000);
            //Select the ICD code from Suggestions Dropdown.
            ProjectBREMedicalChartDocumentPageObj.ClickOnPickICDCode();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//SelectValidICDCode.jpg");
            Thread.sleep(1000);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument1TC4");
            test.log(LogStatus.PASS, "TestPassed");
        }
    @Test(priority = 5)
    public void save_without_hcc_comments_on_medical_chart() throws Exception {

            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            Thread.sleep(1000);
            //Save without HCC and Comments.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveEditDiagnosisDetails();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//HCC&CommentsError.jpg");
            Thread.sleep(1000);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument1TC5");
            test.log(LogStatus.PASS, "TestPassed");
        }
    @Test(priority = 6)
    public void save_with_hcc_comments_on_medical_chart() throws Exception {
            ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
            Thread.sleep(1000);
            //Enter valid HCC code.
            ProjectBREMedicalChartDocumentPageObj.ClickOnEnterHCCCodes(ReadProps.readAttr("HCCCodes"));
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//HCCCodeEntered.jpg");
            Thread.sleep(1000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnAddComment();
            Thread.sleep(1000);
            //Select comment 'ADD' from suggestions.
            ProjectBREMedicalChartDocumentPageObj.ClickOnSelectCommentAdd();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBREMedicalChartDocumentTest1//CommentAddSelected.jpg");
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnSaveEditDiagnosisDetails();
            Thread.sleep(2000);
            ProjectBREMedicalChartDocumentPageObj.ClickOnCancelButtonICD();
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "ProjectBREMedicalChartDocument1TC6");
            test.log(LogStatus.PASS, "TestPassed");
            driver.close();
        }
}
