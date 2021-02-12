package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentPage extends Base{

    public StudentPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ms-table-toolbar ms-add-button")
    private WebElement addStudentIcon;


    public void clickOnAddStudentIcon(){
        clickOnElement(addStudentIcon);
    }
}
