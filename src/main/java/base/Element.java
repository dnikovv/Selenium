package base;

import org.openqa.selenium.By;

public abstract class Element {
    public abstract By getBy();
    public abstract String getText();
    public abstract Boolean isEnabled();
    public abstract Boolean isDisplayed();
    public abstract void typeText(String text);
    public abstract void click();
    public abstract String getAttribute(String attributeName);
    public abstract void clickEnter();
    public abstract void submit();
}
