package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// This class is built as "singleton" pattern.
public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        if(driver != null){
            driver = null;
        }
    }

    private Driver(){}

}
