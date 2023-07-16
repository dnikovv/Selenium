package pages;

import base.BaseClass;
import base.Driver;
import base.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BaseClass {
    public PracticeFormPage(Driver driver){
        this.driver = driver;
    }

    public Element firstName(){
        return driver.findElement(By.id("firstName"));
    }

    public Element lastName(){
        return driver.findElement(By.id("lastName"));
    }

    public Element emailAddress(){
        return driver.findElement(By.id("userEmail"));
    }

    public Element genderRadioBtn(){
        return driver.findElement(By.cssSelector("label[for='gender-radio-1'].custom-control-label"));
    }

    public Element subjectField(){
        return driver.findElement(By.className("subjects-auto-complete__value-container"));
    }
    public Element userPhone(){
        return driver.findElement(By.id("userNumber"));
    }

    public Element sportCheckBox(){
        return driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1'].custom-control-label"));
    }

    public Element currentAddress(){
        return driver.findElement(By.id("currentAddress"));
    }

    public Element stateDropDown(){
        return driver.findElement(By.id("state"));
    }

    public void setFirstName(String fName){
        firstName().typeText(fName);
    }

    public void setLastName(String lName){
        lastName().typeText(lName);
    }
    public void setMailAddress(String mail){
        emailAddress().typeText(mail);
    }

    public void clickGenderBtn(){
        genderRadioBtn().click();
    }
    public void enterUserPhone(String phone){
        userPhone().typeText(phone);
    }

    public void enterSubject(String subject){
        subjectField().click();
        subjectField().typeText(subject);
    }

    public void clickSportCheckBox(){
        sportCheckBox().click();
    }

    public void setCurrentAddress(String cAddress){
        currentAddress().typeText(cAddress);
    }
}
