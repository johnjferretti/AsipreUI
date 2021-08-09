package com.aspire.basic;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import com.aspire.basic.pages.*;

public class Demo {
	

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\johnf\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePage homePage = new HomePage(driver);
		OurProductsPage ourProductsPage = new OurProductsPage(driver);
		AspirationPage aspirationPage = new AspirationPage(driver);
		AspirationPlusPage aspirationPlusPage = new AspirationPlusPage(driver);
		
		driver.get("https://aspiration.com/");
		homePage.headerItem(3).click();
		System.out.println("Checking Our Products Page has 2 cards available...");
		int cardCount = ourProductsPage.cardCount();
		System.out.println("OurProducts Page card count: " + cardCount);
		assertTrue(cardCount == 2, "ERROR! Card count ");
		System.out.println("Checking Aspiration Page for Email Signup dialog...");
		ourProductsPage.buttonOption(1).click();
		assertTrue(aspirationPage.emailInput.getAttribute("name").contains("email"), "Error! Email input missing!");
		aspirationPage.getOut.click();
		System.out.println("Checking Aspiration Plus Page for Monthly and Yearly options...");
		ourProductsPage.buttonOption(2).click();
		assertTrue(aspirationPlusPage.aspirationPlusOption(0).getText().contains("yearly"), "Error! Yearly Option Missing!");
		assertTrue(aspirationPlusPage.aspirationPlusOption(1).getText().contains("monthly"), "Error! Monthly Option Missing!");
		System.out.println("Checking Aspiration Plus Page for payment amounts...");
		assertTrue(aspirationPlusPage.aspirationPlusOption(0).getText().contains("$71.88 paid once yearly"), "Error! Yearly Option Missing!");
		assertTrue(aspirationPlusPage.aspirationPlusOption(1).getText().contains("$7.99 paid monthly"), "Error! Monthly Option Missing!");

		driver.close();
		driver.quit();
	}

}
