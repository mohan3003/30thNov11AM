package org.stepdefinition;

import java.util.Date;

import org.baseclass.BaseClass;
import org.omg.CORBA.Current;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	@Before(order=11)
	public void browserOpen() {
		launchBrowser();
		loadurl("https://www.facebook.com/");
}
	@Before(order=12)
	private void browserLaunch() {
	System.out.println("Browser maximized");

}
	@Before(order=30)
	private void startTime() {
		Date d =new Date();
		System.out.println(d);
}
	@After(order=40)
	public void browserClose() {
		driver.close();
		System.out.println("Browser closed");
}
	@After(order=45)
	private void endTime() {
		Date d =new Date();
		System.out.println(d);
}
	@After(order=43)
	private void currentUrl() {
		String url = printCurrentUrl();
		System.out.println(url);
}

}

