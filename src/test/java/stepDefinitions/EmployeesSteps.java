package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.EmployeesPage;
import pages.LeftMenu;

import java.util.List;

public class EmployeesSteps {
    LeftMenu leftMenu = new LeftMenu();
    EmployeesPage employeesPage = new EmployeesPage();

    @Given("Click on Human Resources Menu")
    public void clickOnHumanResourcesMenu() {
        leftMenu.clickOnHumanResourcesMenu();
    }

    @And("Click on Employees submenu")
    public void clickOnEmployeesSubmenu() {
        leftMenu.clickOnEmployeesSubmenu();
    }

    @Then("Validate full names")
    public void validateFullNames(DataTable table) {
        List<String> nameList = table.asList();
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < 10; i++) {
            String actual = employeesPage.getTextOfTableItem(i + 1, 3);
            String expected = nameList.get(i);
            softAssert.assertEquals(actual, expected);
        }
        softAssert.assertAll();
    }
}
