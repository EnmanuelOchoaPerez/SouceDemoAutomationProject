package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckOut2 {

    private WebDriver driver;

    public CheckOut2(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }
}
