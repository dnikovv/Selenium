package Homework8;
import base.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;

public class MainPageTest extends BaseClass {

    @Test
    public void openElementsInDemoQASite() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        driver.goToUrl("https://demoqa.com/");
        mainPage.elementsSection().click();
        driver.slowdownBetweenSteps(2);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("The URL does not contain the expected value", currentUrl.contains("elements"));
    }
}
