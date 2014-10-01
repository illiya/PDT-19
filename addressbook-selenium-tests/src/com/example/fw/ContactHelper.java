package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initAddressCreation() {
	    manager.driver.findElement(By.linkText("add new")).click();
	  }

	public void fillAddresssForm(ApplicationManager applicationManager, TestBase testBase, ContactData parameterObject) {
	    manager.driver.findElement(By.name("firstname")).sendKeys(parameterObject.firstname);
	    manager.driver.findElement(By.name("lastname")).sendKeys(parameterObject.lastname);
	    manager.driver.findElement(By.name("address")).sendKeys(parameterObject.address);
	    manager.driver.findElement(By.name("mobile")).sendKeys(parameterObject.mobtelefon);
	    manager.driver.findElement(By.name("email")).sendKeys(parameterObject.email);
	    new Select(manager.driver.findElement(By.name("bday"))).selectByVisibleText(parameterObject.date);
	    new Select(manager.driver.findElement(By.name("bmonth"))).selectByVisibleText(parameterObject.month);
	    manager.driver.findElement(By.name("byear")).sendKeys(parameterObject.year);
	    new Select(manager.driver.findElement(By.name("new_group"))).selectByVisibleText(parameterObject.groupname);
	    manager.driver.findElement(By.name("address2")).sendKeys(parameterObject.address2);
	    manager.driver.findElement(By.name("phone2")).sendKeys(parameterObject.home2);
	  }

	public void submitAddressCreation() {
	    manager.driver.findElement(By.name("submit")).click();
	  }

}
