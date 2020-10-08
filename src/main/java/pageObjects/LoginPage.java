package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.DashboardPage;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //using By as element locator
    private By username = By.id("username");

    public LoginPage() {
    }

    public void enterUsername(String uName){
        //find and enter username
        WebElement passwordField = driver.findElement(By.id("txtUsername"));
        passwordField.sendKeys(uName);
    }

    public void enterUserPassword(String pwd){
        //find and enter password
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(pwd);
    }

    public DashboardPage clickLoginBtn(){
        //locate LoginBtn
        driver.findElement(By.id("btnLogin")).click();
        return new DashboardPage(driver);
    }
}
