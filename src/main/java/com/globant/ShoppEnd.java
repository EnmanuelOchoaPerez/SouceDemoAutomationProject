package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppEnd {
    private WebDriver driver;

    public ShoppEnd(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }

}
