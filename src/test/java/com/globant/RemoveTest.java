package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.time.Duration;

public class RemoveTest {

    public static final Logger log = Logger.getLogger(ShopTest.class);
    private WebDriver driver = new ChromeDriver();
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Store st = new Store(driver);
    Home hm = new Home(driver);
    ShopCar sc = new ShopCar(driver);


    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        hm.logging();
    }

    @Test
    public void Remove() {
        for(int i = 0; i<= 2; i++){p
            st.getRandomLink().click();
            log.info(st.itemCount());
        }
        if (st.itemCount() == 3){
            st.goToCar();
            sc.clearCart();
        }
    }
}
