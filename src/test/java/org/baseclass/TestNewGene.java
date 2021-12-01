package org.baseclass;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNewGene extends BaseClass{

	//@Test(invocationCount=3)
	private void tc4() {
		System.out.println("Test case4 passed");
}
	@Test(enabled=false)
	private void tc1() {
		System.out.println("Test case1 passed");
}
	@Test
	private void tc2() throws IOException {
		//System.out.println("Test case2 passed");
}
	@Test
	private void tc3() throws IOException {
		//loadurl("https://www.facebook.com/");
		PojoLogin p=new PojoLogin();
		sendValue(p.getUsername(), getData(4, 2, "sheet1", "Book2"));
		sendValue(p.getPswrd(), getData(1, 1, "sheet1", "Book"));
		//System.out.println("Test case3 passed");
}
	@BeforeMethod
	private void startTime() {
		Date d=new Date();
		System.out.println(d);
}
	@AfterMethod
	private void endTime() {
		Date d=new Date();
		System.out.println(d);
}
	@BeforeClass
	private void browserOpen(){
		launchBrowser();
		loadurl("https://www.facebook.com/");
		
		System.out.println("Browser Launched");

}
	@AfterClass
	private void close() {
		System.out.println("Close browser");
		driver.close();

	}
	
	
	
	
	
	
	
}