package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppEnd {
    private WebDriver driver;

    @FindBy(className = "complete-header")
    public static WebElement ty;


    public ShoppEnd(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }
}
