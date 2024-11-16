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
import static com.globant.ShoppEnd.ty;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Unit test for simple Home.
 */
public class ShopTest {

    public static final Logger log = Logger.getLogger(ShopTest.class);
    private WebDriver driver = new ChromeDriver();
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Store st = new Store(driver);
    Home hm = new Home(driver);
    ShopCar sc = new ShopCar(driver);
    CheckOut1 co1 = new CheckOut1(driver);
    CheckOut2 co2 = new CheckOut2(driver);
    ShoppEnd se = new ShoppEnd(driver);


    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        hm.logging();
    }

    @Test
    public void Shop() {
        st.getRandomLink().click();
        if (st.itemCount() == 1){
            st.goToCar();
            sc.checkOut();
            co1.fillInfo();
            co2.finishing();
            wait.until(ExpectedConditions.visibilityOf(ty));
        }
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
