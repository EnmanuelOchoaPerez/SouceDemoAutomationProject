package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 */
public class Home {
    private WebDriver driver;

    @FindBy(className = "login_logo")
    public static WebElement loginLogo;

    public Home(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }

}
