package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut2 {

    private WebDriver driver;
    @FindBy(id = "finish")
    private WebElement finishBtn;

    public CheckOut2(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }

    public void finishing(){
        finishBtn.click();
    }
}
