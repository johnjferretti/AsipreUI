package com.aspire.basic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurProductsPage {
	
    WebDriver driver;
	
    @FindBy(className = "btn-v3") public WebElement getAspiration;
	
    public OurProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
	public int cardCount() {
		int menuItems =  driver.findElements(By.className("plan")).size();
		return menuItems;
	}
	
	public WebElement buttonOption(int cardNo) {
		List<WebElement> cards =  driver.findElements(By.className("btn-v3"));
		return cards.get(cardNo);
	}


}
