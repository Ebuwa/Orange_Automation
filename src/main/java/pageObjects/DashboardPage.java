package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //create webdriver object
    private WebDriver driver;
    //create a constructor
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    //locate elements
    private By welcomeAdmin = By.id("welcome");
    private By logOut = By.linkText("Logout");

    //functions to interact with elements
    public void clickWelcomeAdmin() throws InterruptedException {
        //wait
        Thread.sleep(10000);
        driver.findElement(welcomeAdmin).click();
    }

    public LoginPage clickLogout() throws InterruptedException {
        //wait
        Thread.sleep(3000);
        driver.findElement(logOut).click();
        return new LoginPage(driver);
    }
}
