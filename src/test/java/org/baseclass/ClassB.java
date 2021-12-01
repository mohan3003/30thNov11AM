package org.baseclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassB extends BaseClass {

	
	@Test
	private void newOne() {
		WebElement Search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Search.sendKeys("Tshirts");
	}
	
	@BeforeClass
	private void browser() {
		launchBrowser();
		loadurl("https://www.myntra.com/");
}	
	@AfterClass
	private void endBrowser() {
		driver.close();

	}

	}

