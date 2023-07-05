package Homework8;
import base.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pages.RadioButton;

public class RadioButtonTests extends BaseClass {
    String radioBtnUrl = "https://demoqa.com/radio-button";

    @Test
    public void checkTheYesRadioBtn() throws InterruptedException {
        RadioButton radioButton = new RadioButton(driver);
        driver.goToUrl(radioBtnUrl);
        radioButton.yesRadioBtn().click();
        String actualResult = radioButton.outputSpan().getText();
        String expectedResult = "Yes";
        driver.slowdownBetweenSteps(2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkTheImpressiveRadioBtn() throws InterruptedException {
        RadioButton radioButton = new RadioButton(driver);
        driver.goToUrl(radioBtnUrl);
        radioButton.impressiveRadioBtn().click();
        String actualResult = radioButton.outputSpan().getText();
        String expectedResult = "Impressive";
        driver.slowdownBetweenSteps(2);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
