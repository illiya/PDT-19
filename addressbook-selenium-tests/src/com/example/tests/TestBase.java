package com.example.tests;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	protected ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	  }

	protected void openMainPage() {
	    app.driver.get(app.baseUrl + "/addressbookv4.1.4/group.php");
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	  }

	private boolean isAlertPresent() {
	    try {
	      app.driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	protected void gotoAddAddressPage() {
	    app.driver.get(app.baseUrl + "//addressbookv4.1.4/edit.php");
	  }

}
