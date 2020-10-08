package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetupTests;

public class LoginTests extends SetupTests {

    //TestNG annotation
    @Test
    //this class extends to the SetupTests
    public void testLogin() throws InterruptedException {
        loginPage.enterUsername("Admin");
        loginPage.enterUserPassword("admin123");

        //Handler for the dashboard page
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }
}
