package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// In page classes we define the elements of the page and their actions
public class LeftMenu extends Base {

    // Constructor
    public LeftMenu() {
        PageFactory.initElements(driver, this);
    }

    // Elements of the page
    @FindBy(css = ".group-items > :nth-child(4)")
    private WebElement studentMenu;

    @FindBy(css = ".group-items > :nth-child(4)>div>:nth-child(1) >a>span")
    private WebElement studentsSubmenu;

    @FindBy(xpath = "//span[contains(text(),'Human Resources')]")
    private WebElement humanResourcesMenu;

    @FindBy(xpath = "//span[contains(text(),'Employees')]")
    private WebElement employeesSubmenu;

    // Actions of the elements of the page
    public void clickOnStudentMenu() {
        clickOnElement(studentMenu);
    }

    public void clickOnStudentsSubmenu() {
        clickOnElement(studentsSubmenu);
    }

    public void clickOnHumanResourcesMenu() {
        clickOnElement(humanResourcesMenu);
    }

    public void clickOnEmployeesSubmenu() {
        clickOnElement(employeesSubmenu);
    }

}

