package Homework8;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;

public class MainPageTest extends BaseClass {

    @Test
    public void openElementsInDemoQASite() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        driver.goToUrl("https://demoqa.com/");
        mainPage.elementsSection().click();
        Thread.sleep(3000);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("The URL does not contain the expected value", currentUrl.contains("elements"));
    }
}
