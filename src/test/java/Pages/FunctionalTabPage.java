package Pages;
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
        By VerticalUsers = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[1]");
        By VerticalRoles = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]");
        By VerticalTemplates = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[3]");
        By VerticalDataset = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[4]");
        By VerticalProjects = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[5]");
        By VerticalDocuments = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[6]");
        By VerticalAnalytics = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[8]");

        public FunctionalTabPage(WebDriver driver) { this.driver = driver;}

         // SoftAssert s= new SoftAssert();
    public void ClickNIcon(){ driver.findElement(NIcon).click();}
        public void ClickHorizontalUser(){ driver.findElement(HorizontalUsers).click();}
        public void ClickHorizontalRoles(){ driver.findElement(HorizontalRoles).click();}
        public void ClickHorizontalTemplates(){ driver.findElement(HorizontalTemplates).click();}
        public void ClickHorizontalDataset(){ driver.findElement(HorizontalDataset).click();}
        public void ClickHorizontalProjects(){ driver.findElement(HorizontalProjects).click();}
        public void ClickHorizontalDocuments(){ driver.findElement(HorizontalDocuments).click();}
        public void ClickHorizontalAnalytics(){ driver.findElement(HorizontalAnalytics).click();}
        public void ClickVerticalUser(){ driver.findElement(VerticalUsers).click();}
        public void ClickVerticalRoles(){ driver.findElement(VerticalRoles).click();}
        public void ClickVerticalTemplates(){ driver.findElement(VerticalTemplates).click();}
        public void ClickVerticalDataset(){ driver.findElement(VerticalDataset).click();}
        public void ClickVerticalProjects(){ driver.findElement(VerticalProjects).click();}
        public void ClickVerticalDocuments(){ driver.findElement(VerticalDocuments).click();}
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