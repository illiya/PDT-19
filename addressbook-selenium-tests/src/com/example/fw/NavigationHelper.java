package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void gotoGroupsPage() {
	    manager.driver.findElement(By.linkText("groups")).click();
	  }

	public void openMainPage() {
	    manager.driver.get(manager.baseUrl + "/addressbookv4.1.4/group.php");
	  }

}
