package pages;

import base.Driver;
import base.Element;
import org.openqa.selenium.By;

public class TextBox {
    public final Driver driver;

    public TextBox(Driver driver) {
        this.driver = driver;
    }

    public Element userNameField(){
        return driver.findElement(By.id("userName"));
    }

    public Element userEmail(){
        return driver.findElement(By.id("userEmail"));
    }
    public Element currentAddress(){
        return driver.findElement(By.id("currentAddress"));
    }
    public Element permanentAddress(){
        return driver.findElement(By.id("permanentAddress"));
    }
    public Element submitBtn(){
        return driver.findElement(By.id("submit"));
    }
    public Element output(){
        return driver.findElement(By.id("output"));
    }

    public void typeUsername(String text){
        userNameField().typeText(text);
    }
    public void typeUserEmail(String text){
        userEmail().typeText(text);
    }
    public void typeCurrentAddress(String text){
        currentAddress().typeText(text);
    }
    public void typePermanentAddress(String text){
        permanentAddress().typeText(text);
    }

    public void clickSubmitBtn(){
        submitBtn().submit();
    }


}
