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
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkTheImpressiveRadioBtn() throws InterruptedException {
        RadioButton radioButton = new RadioButton(driver);
        driver.goToUrl(radioBtnUrl);
        radioButton.impressiveRadioBtn().click();
        String actualResult = radioButton.outputSpan().getText();
        String expectedResult = "Impressive";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
