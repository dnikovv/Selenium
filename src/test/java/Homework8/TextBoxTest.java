package Homework8;

import base.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pages.TextBox;

public class TextBoxTest extends BaseClass {
    String baseUrl = "https://demoqa.com/text-box";
    @Test
    public void fillForm(){
        TextBox textBox = new TextBox(driver);
        driver.goToUrl(baseUrl);
        textBox.typeUsername("BlaBla");
        textBox.typeUserEmail("test12@test.com");
        textBox.typeCurrentAddress("This is a simple Selenium test");
        textBox.typePermanentAddress("Learning Selenium");
        driver.slowdownBetweenSteps(1);
        textBox.clickSubmitBtn();
        Assert.assertTrue("The output window is not displayed", textBox.output().isDisplayed());
    }
}
