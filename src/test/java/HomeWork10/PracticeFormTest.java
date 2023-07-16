package HomeWork10;

import base.BaseClass;
import base.DropdownHelper;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.PracticeFormPage;

public class PracticeFormTest extends BaseClass {

    String url = "https://demoqa.com/automation-practice-form";

    @Test
    public void fillForm(){
        PracticeFormPage formPage = new PracticeFormPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        DropdownHelper dropdownHelper = new DropdownHelper(driver);
        driver.goToUrl(url);
        formPage.setFirstName("Drago");
        formPage.setLastName("Nikov");
        formPage.setMailAddress("test2@test.com");
        formPage.clickGenderBtn();
        formPage.enterUserPhone("012881291");
        js.executeScript("window.scrollBy(0, 500)");
        formPage.clickSportCheckBox();
        formPage.setCurrentAddress("blablablablabla");
        dropdownHelper.selectByValue((WebElement) formPage.stateDropDown(), "Haryana");
        driver.slowdownBetweenSteps(2);
    }

}
