package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage extends Base {

    public EmployeesPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTextOfTableItem(int row, int column) {
        WebElement tableCell = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + column + "]"));
        return getTextOfElement(tableCell);
    }
}
