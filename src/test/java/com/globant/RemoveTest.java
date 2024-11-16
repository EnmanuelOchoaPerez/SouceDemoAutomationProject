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
    private Store st = new Store(driver);
    private Home hm = new Home(driver);
    private ShopCar sc = new ShopCar(driver);


    @BeforeClass
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        hm.logging();
    }

    @Test
    public void Remove() {
        for(int i = 0; i<= 2; i++){
            st.getRandomLink().click();
            log.info(st.itemCount());
        }
        if (st.itemCount() == 3){
            st.goToCar();
            sc.clearCart();
        }
    }
}
