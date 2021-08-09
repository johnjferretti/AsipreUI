package com.aspire.basic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AspirationPage {
	
    public AspirationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    WebDriver driver;

    @FindBy(id = "join-waitlist-input") public WebElement emailInput;
    @FindBy(className = "close") public WebElement getOut;
   
    
}
