package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.globant.ShoppEnd.ty;

public class LogOutTest {
    private WebDriver driver = new ChromeDriver();
    private Home hm = new Home(driver);
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgBtn;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutSideBar;


    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        hm.logging();
    }

    @Test
    public void LogOut() {
        burgBtn.click();
        logOutSideBar.click();
        wait.until(ExpectedConditions.visibilityOf(hm.loginLogo));

    }
}
