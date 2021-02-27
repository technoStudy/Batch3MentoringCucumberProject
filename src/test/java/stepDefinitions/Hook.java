package stepDefinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReadFromConfigFile;

public class Hook {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Before
    public void settingup() {
        driver.get(ReadFromConfigFile.getValueFor("homepage"));
        driver.manage().window().maximize();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }


}
