package pages;

import base.Driver;
import base.Element;
import org.openqa.selenium.By;

public class MainPage {
    public final Driver driver;

    public MainPage(Driver driver) {
        this.driver = driver;
    }
    public Element elementsSection(){
    return driver.findElement(By.xpath("//div[@class = 'card mt-4 top-card']"));
}

}
