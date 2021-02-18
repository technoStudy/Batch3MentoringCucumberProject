package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[data-placeholder=\"Username\"]")
    private WebElement usernameElement;

    @FindBy(css = "input[data-placeholder=\"Password\"]")
    private WebElement passwordElement;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement alertDialogBox;


    public void enterUsername(String username) {
        sendKeysToElement(usernameElement, username);
    }

    public void enterPassword(String password){
        sendKeysToElement(passwordElement, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getTextOfAlertDialogBox(){
        return getTextOfElement(alertDialogBox);
    }

}
