package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.time.Duration;
import java.time.Instant;

import static com.globant.Home.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Unit test for simple Home.
 */
public class HomeTest {

    public static final Logger log = Logger.getLogger(HomeTest.class);
    private WebDriver driver = new ChromeDriver();


    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        Home hm = new Home(driver);
    }

    @Test
    public void openGoogle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginLogo));
        String actualTitle = driver.getTitle();
        log.info(actualTitle);
    }

    //@AfterClass
    //public void tearDown() {
    // Cerrar el navegador
    //    if (driver != null) {
    //        driver.quit();
    //    }
    //}

    //@Test
    //public void shouldAnswerWithTrue() {
    //    assertTrue(true);
    //}
}
