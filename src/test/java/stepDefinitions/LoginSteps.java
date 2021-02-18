package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("Open Campus homepage")
    public void openCampusHomepage() {
        driver.get("https://test.campus.techno.study/");
        driver.manage().window().maximize();
    }

    @And("Enter username")
    public void enterUsername() {
        loginPage.enterUsername("daulet2030@gmail.com");
    }

    @And("Enter password")
    public void enterPassword() {
        loginPage.enterPassword("TechnoStudy123@");
    }


    @When("Click on login button")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }


}
