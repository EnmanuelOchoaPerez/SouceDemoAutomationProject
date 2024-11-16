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
    public static final String user = "standard_user";
    public static final String pass = "secret_sauce";

    @FindBy(className = "login_logo")
    public static WebElement loginLogo;

    @FindBy(id = "login-button")
    public static WebElement loginButton;

    @FindBy(id = "user-name")
    public static WebElement loginUser;

    @FindBy(id = "password")
    public static WebElement loginPass;

    public Home(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(d, this);
    }
    public void logging(){
        loginUser.sendKeys(user);
        loginPass.sendKeys(pass);
        loginButton.click();

        //return this.getDriver();
    }
}