package com.example.fw;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class ApplicationManager {
	
	public static WebDriver driver;
	public static String baseUrl;
	public static boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	public ApplicationManager() {
		driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void stop() {
		driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}

	public void returnToGroupsPage() {
	    driver.findElement(By.linkText("group page")).click();
	  }

	public void submitGroupCreation() {
	    driver.findElement(By.name("submit")).click();
	  }

	public void initGroupCreation() {
	    driver.findElement(By.name("new")).click();
	  }

	public void gotoGroupsPage() {
	    driver.findElement(By.linkText("groups")).click();
	  }

	public boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	public String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

	public void fillAddresssForm(TestBase testBase, ContactData parameterObject) {
	    driver.findElement(By.name("firstname")).sendKeys(parameterObject.firstname);
	    driver.findElement(By.name("lastname")).sendKeys(parameterObject.lastname);
	    driver.findElement(By.name("address")).sendKeys(parameterObject.address);
	    driver.findElement(By.name("mobile")).sendKeys(parameterObject.mobtelefon);
	    driver.findElement(By.name("email")).sendKeys(parameterObject.email);
	    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(parameterObject.date);
	    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(parameterObject.month);
	    driver.findElement(By.name("byear")).sendKeys(parameterObject.year);
	    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(parameterObject.groupname);
	    driver.findElement(By.name("address2")).sendKeys(parameterObject.address2);
	    driver.findElement(By.name("phone2")).sendKeys(parameterObject.home2);
	  }

	public void submitAddressCreation() {
	    driver.findElement(By.name("submit")).click();
	  }

	public void initAddressCreation() {
	    driver.findElement(By.linkText("add new")).click();
	  }

	public void fillGroupForm(TestBase testBase, GroupData group) {
	   driver.findElement(By.name("group_name")).clear();
	   driver.findElement(By.name("group_name")).sendKeys(group.name);
	   driver.findElement(By.name("group_header")).clear();
	   driver.findElement(By.name("group_header")).sendKeys(group.header); 
	   driver.findElement(By.name("group_footer")).clear();
	   driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	  }

	

}
