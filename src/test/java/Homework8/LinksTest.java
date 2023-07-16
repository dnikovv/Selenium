package Homework8;
import base.BaseClass;
import base.HttpUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.LinksPage;
import java.io.IOException;

public class LinksTest extends BaseClass {
    String linksUrl = "https://demoqa.com/broken/";
    @Test
    public void verityValidLink() {
        LinksPage linksPage = new LinksPage(driver);
        driver.goToUrl(linksUrl);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        driver.slowdownBetweenSteps(2);
        linksPage.clickOnValidLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://demoqa.com/"));
    }

    @Test
    public void checkBrokenLink() throws IOException {
        LinksPage linksPage = new LinksPage(driver);
        driver.goToUrl(linksUrl);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        driver.slowdownBetweenSteps(2);
        String brokenLinkUrl = linksPage.brokenLink().getAttribute("href");
        linksPage.clickOnBrokenLink();
        int statusCode = HttpUtils.getStatusCode(brokenLinkUrl);
        Assert.assertEquals("The status code is not 500.", 500, statusCode);
    }
}
