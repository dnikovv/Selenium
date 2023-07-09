package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class WebCoreDriver extends Driver implements JavascriptExecutor {
    private org.openqa.selenium.WebDriver webDriver;
    private WebDriverWait webDriverWait;

    @Override
    public void start(Browser browser) {
        switch (browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException(browser.name());
        }
        webDriverWait = new WebDriverWait(webDriver,30);
    }

    @Override
    public void quit() {
        webDriver.quit();
    }

    @Override
    public void goToUrl(String url) {
    webDriver.navigate().to(url);
    webDriver.manage().window().maximize();
    }

    @Override
    public Element findElement(By locator) {
        WebElement nativeWebElement = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Element element = new WebCoreElement(webDriver, nativeWebElement, locator);
        Element logElememnt = new LogElement(element);
        return logElememnt;
    }

    @Override
    public List<Element> findElements(By locator) {
        List<WebElement> nativeWebelements = webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        List<Element> elements = new ArrayList<Element>();
        for(WebElement nativeWebElement: nativeWebelements){
            Element element = new WebCoreElement(webDriver,nativeWebElement,locator);
            Element logElement = new LogElement(element);
            elements.add(logElement);
        }
        return elements;
    }

    public void slowdownBetweenSteps(int delayInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, delayInSeconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//dummyElement")));
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    @Override
    public Object executeScript(String script, Object... args) {
        return ((JavascriptExecutor) webDriver).executeScript(script, args);
    }

    @Override
    public Object executeAsyncScript(String script, Object... args) {
        return ((JavascriptExecutor) webDriver).executeAsyncScript(script, args);
    }
}
