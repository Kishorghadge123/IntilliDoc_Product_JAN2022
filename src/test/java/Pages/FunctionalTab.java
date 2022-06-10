package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FunctionalTab {

        WebDriver driver = null;

        By NIcon = By.xpath("//*[@id='sidenav']/div/ul/li/img");
        By HorizontalUsers = By.xpath("//span[contains(text(),'Users')]");
        By HorizontalRoles = By.xpath("//span[contains(text(),'Roles')]");
        By HorizontalTemplates = By.xpath("//span[contains(text(),'Templates')]");
        By HorizontalDataset = By.xpath("//span[contains(text(),'Data Sets')]");
        By HorizontalProjects = By.xpath("//span[contains(text(),'Projects')]");
        By HorizontalDocuments = By.xpath("//span[contains(text(),'Documents')]");
        By HorizontalAnalytics = By.xpath("//span[contains(text(),'Analytics')]");
        By VerticalUsers = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-users')]");
        By VerticalRoles = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-id-card ')]");
        By VerticalTemplates = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-newspaper-o')]");
        By VerticalDataset = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-database ')]");
        By VerticalProjects = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-briefcase')]");
        By VerticalDocuments = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-file-text ')]");
        By VerticalAnalytics = By.xpath("//i[contains(@class,'mat-tooltip-trigger fa fa-cubes')]");

        public FunctionalTab(WebDriver driver) { this.driver = driver;}

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
    }