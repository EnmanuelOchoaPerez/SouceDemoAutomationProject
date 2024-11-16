package com.globant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Store {
    private WebDriver driver;
    Random random = new Random();

    @FindBy (css = ".btn_inventory.btn_primary")
    private List<WebElement> links;
    @FindBy (className = "shopping_cart_link")
    private WebElement shopCar;
    @FindBy (className = "shopping_cart_badge")
    private WebElement shopCarN;




    public Store(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }
    public WebElement getRandomLink() {
        WebElement randomLink = links.get(random.nextInt(links.size()));
        return randomLink;
    }
    public int itemCount() {
        int itemCount = Integer.parseInt(shopCarN.getText());
        return itemCount;
    }
    public void goToCar(){
        shopCar.click();
    }
}
