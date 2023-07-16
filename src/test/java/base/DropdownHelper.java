package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {
    private Driver driver;

    public DropdownHelper(Driver driver) {
        this.driver = driver;
    }

    public void selectByVisibleText(WebElement dropdownElement, String visibleText) {
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public void selectByValue(WebElement dropdownElement, String value) {
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }
}
