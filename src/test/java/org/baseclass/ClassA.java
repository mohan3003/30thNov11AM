package org.baseclass;

import java.io.IOException;

import org.testng.annotations.Test;

public class ClassA extends BaseClass {

	@Test
	private void tc1() throws IOException {
		launchBrowser();
		loadurl("https://www.facebook.com/");
		PojoLogin p=new PojoLogin();
		sendValue(p.getUsername(), getData(1, 2, "sheet1", "Book2"));
		sendValue(p.getPswrd(), getData(2, 1, "sheet1", "Book"));

	}
	@Test
	private void tc2() {
		System.out.println("Test case 2 passed");
		System.out.println("Testing");
	}
	
}
