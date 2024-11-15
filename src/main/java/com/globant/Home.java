package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

/**
 * Hello world!
 */
public class Home {
    private WebDriver driver;
    public static final String[] users = new String[]{"standard_user", "locked_out_user","problem_user","performance_glitch_user","error_user","visual_user"};
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
        Random random = new Random();
        loginUser.sendKeys(users[random.nextInt(users.length)]);
        loginPass.sendKeys(pass);
        loginButton.click();

        //return this.getDriver();
    }
}