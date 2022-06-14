package Pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FunctionalTabPage {

        WebDriver driver = null;

        By NIcon = By.xpath("//*[@id='sidenav']/div/ul/li/img");
        By HorizontalUsers = By.xpath("//span[contains(text(),'Users')]");
        By HorizontalRoles = By.xpath("//span[contains(text(),'Roles')]");
        By HorizontalTemplates = By.xpath("//span[contains(text(),'Templates')]");
        By HorizontalDataset = By.xpath("//span[contains(text(),'Data Sets')]");
        By HorizontalProjects = By.xpath("//span[contains(text(),'Projects')]");
        By HorizontalDocuments = By.xpath("//span[contains(text(),'Documents')]");
        By HorizontalAnalytics = By.xpath("//span[contains(text(),'Analytics')]");
        By VerticalUsers = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[1]/div/i");
        By VerticalRoles = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[2]/div/i");
        By VerticalTemplates = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[3]/div/i");
        By VerticalDataset = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[4]/div/i");
        By VerticalProjects = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[5]/div/i");
        By VerticalDocuments = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[6]/div/i");
        By VerticalAnalytics = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[7]/div/i");

        public FunctionalTabPage(WebDriver driver) { this.driver = driver;}

         // SoftAssert s= new SoftAssert();

    @Step("ClickN Icon")
        public void ClickNIcon(){ driver.findElement(NIcon).click();}
    @Step("Click Horizontal User")
        public void ClickHorizontalUser(){ driver.findElement(HorizontalUsers).click();}
    @Step("Click Horizontal Roles")
        public void ClickHorizontalRoles(){ driver.findElement(HorizontalRoles).click();}
    @Step("Click Horizontal Templates")
        public void ClickHorizontalTemplates(){ driver.findElement(HorizontalTemplates).click();}
    @Step("Click Horizontal Dataset")
        public void ClickHorizontalDataset(){ driver.findElement(HorizontalDataset).click();}
    @Step("Click Horizontal Projects")
        public void ClickHorizontalProjects(){ driver.findElement(HorizontalProjects).click();}
    @Step("Click Horizontal Documents")
        public void ClickHorizontalDocuments(){ driver.findElement(HorizontalDocuments).click();}
    @Step("Click Horizontal Analytics")
        public void ClickHorizontalAnalytics(){ driver.findElement(HorizontalAnalytics).click();}
    @Step("Click Vertical User")
        public void ClickVerticalUser(){ driver.findElement(VerticalUsers).click();}
    @Step("Click Vertical Roles")
        public void ClickVerticalRoles(){ driver.findElement(VerticalRoles).click();}
    @Step("Click Vertical Templates")
        public void ClickVerticalTemplates(){ driver.findElement(VerticalTemplates).click();}
    @Step("Click Vertical Dataset")
        public void ClickVerticalDataset(){ driver.findElement(VerticalDataset).click();}
    @Step("Click Vertical Projects")
        public void ClickVerticalProjects(){ driver.findElement(VerticalProjects).click();}
    @Step("Click Vertical Documents")
        public void ClickVerticalDocuments(){ driver.findElement(VerticalDocuments).click();}
    @Step("Click Vertical Analytics")
        public void ClickVerticalAnalytics(){ driver.findElement(VerticalAnalytics).click();}



      public void verifyNtab()
      {
              String actual_page = driver.getCurrentUrl();
              String expected_page="https://alpha.neutrino-ai.com/#/home";
              Assert.assertEquals(actual_page, expected_page);
      }
      public void verify_horizontal_users_tab()
      {
                String actual_page = driver.getCurrentUrl();
                String expected_page= "https://alpha.neutrino-ai.com/#/home/user-management";
                Assert.assertEquals(actual_page, expected_page);
      }
      public void verify_horizontal_roles_tab()
      {
              String actual_page = driver.getCurrentUrl();
              String expected_page="https://alpha.neutrino-ai.com/#/home/role-management";
              Assert.assertEquals(actual_page, expected_page);
      }
      public void verify_horizontal_templates_tab()
      {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/n-training";
                Assert.assertEquals(actual_page, expected_page);
      }
        public void verify_horizontal_datasets_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/datasets";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_horizontal_projects_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/project-management";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_horizontal_documents_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/documents";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_horizontal_analytics_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/analytics";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_vertical_users_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/user-management";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_vertical_roles_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/role-management";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_vertical_templates_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/n-training";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_vertical_datasets_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/datasets";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void verify_vertical_projects_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/project-management";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void  verify_vertical_Documents_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/documents";
                Assert.assertEquals(actual_page, expected_page);
        }
        public void vertical_analytics_tab()
        {
                String actual_page = driver.getCurrentUrl();
                String expected_page="https://alpha.neutrino-ai.com/#/home/analytics";
                Assert.assertEquals(actual_page, expected_page);
        }









}