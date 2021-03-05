package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    @After
    public void takeScreenShotIfFails(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

//    @After
//    public void closeUp(){
//        Driver.quitDriver();
//    }
}
