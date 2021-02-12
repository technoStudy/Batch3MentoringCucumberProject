package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utulities.Driver;

public class Base {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    protected void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
