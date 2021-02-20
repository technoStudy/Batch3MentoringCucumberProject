package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends Base {

    public TopMenu() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span.username")
    private WebElement topMenuProfileMenu;


    public void clickOnTopMenuProfileMenu(){
        clickOnElement(topMenuProfileMenu);
    }

    public String getTextOfTopMenuProfileMenu(){
        return getTextOfElement(topMenuProfileMenu);
    }

}
