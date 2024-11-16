package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut1 {
    private WebDriver driver;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public CheckOut1(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }

    public void fillInfo(){
        firstName.sendKeys("Elias");
        lastName.sendKeys("Martinez");
        postalCode.sendKeys("123456");
        continueBtn.click();
    }
}
