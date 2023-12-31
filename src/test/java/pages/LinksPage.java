package pages;

import base.Driver;
import base.Element;
import org.openqa.selenium.By;

public class LinksPage {
    public final Driver driver;

    public LinksPage(Driver driver) {
        this.driver = driver;
    }

    public Element validLink(){
        return driver.findElement(By.xpath("//a[@href='http://demoqa.com' and text()='Click Here for Valid Link']"));
    }


    public Element brokenLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Click Here for Broken Link')]"));
    }

    public void clickOnValidLink(){
        validLink().click();
    }

    public void clickOnBrokenLink(){
        brokenLink().click();
    }

}
