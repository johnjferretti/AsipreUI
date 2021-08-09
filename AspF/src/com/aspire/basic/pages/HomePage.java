package com.aspire.basic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    WebDriver driver;

	public WebElement headerItem(int number) {
		List<WebElement> menuItems =  driver.findElements(By.className("Flex-sc-1kj10zc-0"));
		return menuItems.get(number);
	}


}
