package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckOut1 {
    private WebDriver driver;

    public CheckOut1(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }
}
