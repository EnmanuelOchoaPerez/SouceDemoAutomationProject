package com.globant;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Unit test for simple Home.
 */
public class HomeTest {

        private WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
        }

        @Test
        public void openGoogle() {
            driver.get("https://www.google.com");

            String expectedTitle = "Google";
            String actualTitle = driver.getTitle();
            assertEquals(actualTitle, expectedTitle, "El título de la página no coincide.");
        }

        @AfterClass
        public void tearDown() {
            // Cerrar el navegador
            if (driver != null) {
                driver.quit();
            }
        }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
