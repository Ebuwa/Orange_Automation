package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetupTests {
    //Create a WebDriver Object
    private WebDriver driver;
    //Create pageObjects.LoginPage object
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //instantiate WebDriver object
        driver = new ChromeDriver();
        //Maximize window size
        driver.manage().window().maximize();
        //Launch application
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Instantiate login page after browser launch
        loginPage = new LoginPage(driver);
    }


    @AfterTest
    public void closeBrowser(){
        //close window
        driver.quit();
    }
}
