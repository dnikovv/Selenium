package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class Driver {
    public abstract void start(Browser browser);
    public abstract void quit();
    public abstract void goToUrl(String url);
    public abstract Element findElement(By locator);
    public abstract List<Element> findElements(By locator);
    public abstract String getCurrentUrl();
    public abstract void slowdownBetweenSteps(int delayInSeconds);
    public enum Browser {
        CHROME,
        FIREFOX,
        EDGE,
    }
}
