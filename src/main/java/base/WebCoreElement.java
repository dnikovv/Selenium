package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebCoreElement extends Element{

    private final WebDriver webDriver;
    private final WebElement webElement;
    private final By by;

    public WebCoreElement(WebDriver webDriver, WebElement webElement, By by){
        this.webDriver = webDriver;
        this.webElement = webElement;
        this.by = by;
    }

    @Override
    public By getBy() {
        return by;
    }

    @Override
    public String getText() {
        return webElement.getText();
    }

    @Override
    public Boolean isEnabled() {
        return webElement.isEnabled();
    }

    @Override
    public Boolean isDisplayed() {
        return webElement.isDisplayed();
    }

    @Override
    public void typeText(String text) {
        try {
            if (webElement != null) {
                webElement.clear();
                webElement.sendKeys(text);
            } else {
                System.out.println("Error: WebElement is null.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred while typing text: " + e.getMessage());
        }
    }

    @Override
    public void click() {
        waiToBeClickable(by);
        webElement.click();
    }

    private boolean waiToBeClickable(By by) {
        try {
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
            webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        } catch (TimeoutException e) {
            System.out.println("Timeout occurred while waiting for element to be clickable: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error occurred while waiting for element to be clickable: " + e.getMessage());
            return false;
        }
    }

//    private boolean isVisible(By by) {
//        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
//        return true;
//    }

    @Override
    public String getAttribute(String attributeName) {
        return webElement.getAttribute(attributeName);
    }

    @Override
    public void clickEnter() {
        webElement.sendKeys(Keys.ENTER);
    }

    @Override
    public void submit() {
        webElement.submit();
    }
}
