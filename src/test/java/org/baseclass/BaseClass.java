package org.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	Robot r;
	Alert a;
	TakesScreenshot ts;
//Browser launch
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
//Load Url
	public static void loadurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
}
//Get Current url
	public static String printCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
//Get Text
	public static void printText(WebElement ele) {
	
		String text = ele.getText();
		System.out.println(text);
	}
//Get Attribute
	public static void printAttribute(WebElement ele) {
		String getattribute = ele.getAttribute("value");
		System.out.println(getattribute);
	}
//Get Title
	public static void printTitle() throws Exception {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());
	}
//Send Keys
	public static void sendValue(WebElement ele, String value) {
		ele.sendKeys(value);
		
	}
//Click
	public static void clickBtn(WebElement ele) {
		ele.click();

	}
//Action
//Move to Element
	public static void movetoElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
//Double Click
	public static void dclick(WebElement username) {
		Actions a=new Actions(driver);
		a.doubleClick(username).perform();
	}
//Right Click
	public static void rclick(WebElement username) {
		Actions a=new Actions(driver);
		a.contextClick(username).perform();
	}
//Robot
//Key press 
	private void kpress() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
//Key Realease
	private void krelease() throws AWTException {
		r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
}
//alert 
//Accept
	private void accept() {
		a=driver.switchTo().alert();
		a.accept();
}
//Dismiss
	private void dismiss() {
		a=driver.switchTo().alert();
		a.dismiss();
}
//Alert Text
	private void atext(String value) {
		a=driver.switchTo().alert();
		a.sendKeys(value);
}
//Alert Get text
	private void agettext() {
		a=driver.switchTo().alert();
		a.getText();
}
//Screenshot
	private void screenshot(String value) throws IOException {
	ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\VIMALA\\eclipse-workspace\\MyProject"+value+".png");
	FileUtils.copyFile(src, dest);
	}
//Get data
	public static String getData(int rowNumber,int cellNumber,String sheet,String Book2) throws IOException {
		File f=new File("C:\\Users\\VIMALA\\eclipse-workspace\\MyProject\\datas\\Book2.xlsx");
		FileInputStream fin=new FileInputStream(f);

		Workbook w=new XSSFWorkbook(fin);
		
	Sheet s = w.getSheet(sheet);
		Row r = s.getRow(rowNumber);
		Cell c = r.getCell(cellNumber);
	
		int cellType = c.getCellType();
		String value="";
	if (cellType==1) {
		
		 value = c.getStringCellValue();
	System.out.println(value);
	}
	else if (cellType==0) {
		if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("MMMM-dd-yyyy");
		String format = sim.format(d);
		System.out.println(format);
		}
	else {
		double numValue = c.getNumericCellValue();
		long l=(long)numValue;
		value=String.valueOf(l);
		System.out.println(value);
		
}
	}
	return value;
	}}

	
