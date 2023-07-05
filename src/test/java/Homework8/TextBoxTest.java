package Homework8;

import base.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pages.TextBox;

public class TextBoxTest extends BaseClass {
    @Test
    public void fillForm(){
        TextBox textBox = new TextBox(driver);
        driver.goToUrl("https://demoqa.com/text-box");
        textBox.userNameField().typeText("BlaBla");
        textBox.userEmail().typeText("test12@test.com");
        textBox.currentAddress().typeText("This is a simple Selenium test");
        textBox.permanentAddress().typeText("Learning Selenium");
        driver.slowdownBetweenSteps(1);
        textBox.submitBtn().submit();
        Assert.assertTrue("The output window is not displayed", textBox.output().isDisplayed());
    }
}
