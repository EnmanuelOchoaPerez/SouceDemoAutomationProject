package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShopCar {
    private WebDriver driver;

    public ShopCar(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }
}
