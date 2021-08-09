package com.aspire.basic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AspirationPlusPage {
	
    public AspirationPlusPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    WebDriver driver;

    @FindBy(className = "option") public WebElement getOut;
   
	public WebElement aspirationPlusOption(int optionNo) {
		List<WebElement> plusOptions =  driver.findElements(By.className("option"));
		return plusOptions.get(optionNo);
	}

    
}
