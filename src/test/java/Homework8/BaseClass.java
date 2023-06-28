package Homework8;

import base.Driver;
import base.LoggingDriver;
import base.WebCoreDriver;
import org.junit.After;
import org.junit.Before;

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
