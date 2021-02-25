package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.TopMenu;
import utilities.Driver;
import utilities.ReadFromConfigFile;

public class LoginSteps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    TopMenu topMenu = new TopMenu();

    @Given("Open Campus {string}")
    public void openCampusHomepage(String homepage) {
        driver.get(ReadFromConfigFile.getValueFor(homepage));
        driver.manage().window().maximize();
    }

    @And("Enter username {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }


    @When("Click on login button")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }


    @Then("Verify login passes")
    public void verifyLoginPasses() {
        Assert.assertTrue(topMenu.getTextOfTopMenuProfileMenu().contains("Saurbekov"));
    }

    @Then("Verify login fails")
    public void verifyLoginFails() {
        String actual = loginPage.getTextOfAlertDialogBox();
        String expected = "Invalid username or password";
        Assert.assertEquals(actual,expected);
    }


}
