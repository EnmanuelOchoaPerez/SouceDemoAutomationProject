package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.time.Duration;
import java.util.Random;

import static com.globant.Home.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Unit test for simple Home.
 */
public class ShopTest {

    public static final Logger log = Logger.getLogger(ShopTest.class);
    private WebDriver driver = new ChromeDriver();
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public Random random = new Random();


    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void Shop() {
        Home hm = new Home(driver);
        hm.logging();
        Store st = new Store(driver);
        //t.getRandomLink().click();
    }


    //@AfterClass
    //public void tearDown() {
    //    if (driver != null) {
    //        driver.quit();
    //    }
    //}

    //@Test
    //public void shouldAnswerWithTrue() {
    //    assertTrue(true);
    //}
}
