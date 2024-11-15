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

    //@FindBy (className = "btn btn_primary btn_small btn_inventory ")
    //List<WebElement> links;


    public Store(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d,this);
    }

    //public WebElement getRandomLink() {
    //    WebElement randomLink = links.get(random.nextInt(links.size()));
    //    return randomLink;
    //}

}
