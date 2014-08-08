package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupCreationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupDate group = new GroupDate();
    group.name = "group.name1";
    group.header = "header1";
    group.footer = "footer1";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation2() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupDate("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
  }
  

  private void returnToGroupsPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  private void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  private void fillGroupForm(GroupDate group) {
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(group.name);
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(group.header); 
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(group.footer);
  }

  private void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  private void gotoGroupsPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  private void openMainPage() {
    driver.get(baseUrl + "/addressbookv4.1.4/group.php");
  }

  @After
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
}
