package pages;

import base.Driver;
import base.Element;
import org.openqa.selenium.By;

public class RadioButton {
    public final Driver driver;

    public RadioButton(Driver driver) {
        this.driver = driver;
    }

    public Element yesRadioBtn(){
        return driver.findElement(By.xpath("//label[@for = 'yesRadio']"));
    }
    public Element impressiveRadioBtn(){
        return driver.findElement(By.xpath("//label[@for = 'impressiveRadio']"));
    }
    public Element outputSpan(){
        return driver.findElement(By.xpath("//span[@class = 'text-success']"));
    }
}
