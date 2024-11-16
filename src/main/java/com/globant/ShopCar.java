package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShopCar {
    private WebDriver driver;
    @FindBy(css = ".cart_button.btn_secondary")
    private List<WebElement> articulos;
    @FindBy(id = "checkout")
    private WebElement checkBtn;


    public ShopCar(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }
    public void clearCart(){
        for(WebElement we : articulos){
            we.click();
        }
    }
    public void checkOut(){
        checkBtn.click();
    }
}
