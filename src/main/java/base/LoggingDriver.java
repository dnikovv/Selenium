package base;

import base.Driver;
import base.DriverDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class LoggingDriver extends DriverDecorator implements JavascriptExecutor {
    public LoggingDriver(Driver driver) {
        super(driver);
    }

    @Override
    public void start(Browser browser) {
        System.out.print(String.format("start browser = %s", browser.name()));
        driver.start(browser);
    }

    @Override
    public void quit() {
        System.out.print(String.format(" close browser"));
        driver.quit();
    }

    @Override
    public void goToUrl(String url) {
        System.out.print(String.format("go to url = %s ", url));
        driver.goToUrl(url);
    }

    @Override
    public Element findElement(By locator) {
        System.out.print(String.format("find element"));
        return driver.findElement(locator);
    }

    @Override
    public List<Element> findElements(By locator) {
        System.out.print(String.format("find elements"));
        return driver.findElements(locator);
    }

    @Override
    public Object executeScript(String script, Object... args) {
        return ((JavascriptExecutor) driver).executeScript(script, args);
    }

    @Override
    public Object executeAsyncScript(String script, Object... args) {
        return ((JavascriptExecutor) driver).executeAsyncScript(script, args);
    }
}
