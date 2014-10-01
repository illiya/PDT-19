package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {

	private static WebDriver driver;
	private static String baseUrl;
	private static boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	protected void returnToGroupsPage() {
	    driver.findElement(By.linkText("group page")).click();
	  }

	protected void submitGroupCreation() {
	    driver.findElement(By.name("submit")).click();
	  }

	protected void fillGroupForm(GroupData group) {
	    driver.findElement(By.name("group_name")).clear();
	    driver.findElement(By.name("group_name")).sendKeys(group.name);
	    driver.findElement(By.name("group_header")).clear();
	    driver.findElement(By.name("group_header")).sendKeys(group.header); 
	    driver.findElement(By.name("group_footer")).clear();
	    driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	  }

	protected void initGroupCreation() {
	    driver.findElement(By.name("new")).click();
	  }

	protected void gotoGroupsPage() {
	    driver.findElement(By.linkText("groups")).click();
	  }

	protected void openMainPage() {
	    driver.get(baseUrl + "/addressbookv4.1.4/group.php");
	  }

	@AfterTest
	public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	private String closeAlertAndGetItsText() {
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

	protected void submitAddressCreation() {
	    driver.findElement(By.name("submit")).click();
	  }

	protected void fillAddresssForm(ContactData parameterObject) {
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

	protected void initAddressCreation() {
	    driver.findElement(By.linkText("add new")).click();
	  }

	protected void gotoAddAddressPage() {
	    driver.get(baseUrl + "//addressbookv4.1.4/edit.php");
	  }

}
