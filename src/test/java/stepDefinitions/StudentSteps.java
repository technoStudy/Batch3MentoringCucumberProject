package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.LeftMenu;
import pages.StudentPage;

public class StudentSteps {

    StudentPage studentPage = new StudentPage();
    LeftMenu leftMenu = new LeftMenu();

    @Given("Click on Student Menu")
    public void clickOnStudentMenu() {
        leftMenu.clickOnStudentMenu();
    }

    @And("Click on Students submenu")
    public void clickOnStudentsSubmenu() {
        leftMenu.clickOnStudentsSubmenu();
    }

    @And("Click on Add Student Button")
    public void clickOnAddStudentButton() {
        studentPage.clickOnAddStudentIcon();
    }
}
