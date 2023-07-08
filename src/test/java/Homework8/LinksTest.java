package Homework8;

import base.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pages.LinksPage;
import pages.LinksPage.*;
import pages.MainPage;

public class LinksTest extends BaseClass {

    @Test
    public void verityValidLink() {
        LinksPage linksPage = new LinksPage(driver);
        driver.goToUrl("https://demoqa.com/broken");
        driver.slowdownBetweenSteps(2);
        Assert.assertTrue(linksPage.validLibnk().isDisplayed());
        linksPage.validLibnk().click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://demoqa.com/"));


    }

}
