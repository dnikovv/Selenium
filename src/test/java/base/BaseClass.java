package base;

import base.Driver;
import base.LoggingDriver;
import base.WebCoreDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public Driver driver;

    @Before
    public void testInit(){
        driver = new LoggingDriver(new WebCoreDriver());
        driver.start(Driver.Browser.CHROME);
    }
    @After
    public void testCleanup(){
        driver.quit();
    }
}
