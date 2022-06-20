package Pages;
import io.qameta.allure.Step;
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
        By VerticalUsers = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[1]/div/i");
        By VerticalRoles = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[2]/div/i");
        By VerticalTemplates = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[3]/div/i");
        By VerticalDataset = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[4]/div/i");
        By VerticalProjects = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[5]/div/i");
        By VerticalDocuments = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[6]/div/i");
        By VerticalAnalytics = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[7]/div/i");

        public FunctionalTab(WebDriver driver) { this.driver = driver;}
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

    }