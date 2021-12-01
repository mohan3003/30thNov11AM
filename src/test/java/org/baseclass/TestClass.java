package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClass extends BaseClass  {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		loadurl("https://www.facebook.com/");
		//printCurrentUrl();
		//printTitle();
		//WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		//sendValue(username, "mohansacet07@gmail.com");
//		printText(username);
//		WebElement password = driver.findElement(By.id("pass"));
//		sendValue(password, "1234567");
//		printAttribute(password);
//		WebElement clkbtn = driver.findElement(By.name("login"));
//		clickBtn(clkbtn);
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		sendValue(username, getData(2, 0, "sheet1", "Book2"));
		WebElement password = driver.findElement(By.id("pass"));
	sendValue(password, getData(2, 5, "sheet1", "Book2"));
	}
}
