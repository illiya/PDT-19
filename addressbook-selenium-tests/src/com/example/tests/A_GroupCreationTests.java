package com.example.tests;

import org.testng.annotations.Test;

public class A_GroupCreationTests extends TestBase {

  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.gotoGroupsPage();
    app.groupHelper.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name1";
    group.header = "header1";
    group.footer = "footer1";
	app.groupHelper.fillGroupForm(group);
    app.groupHelper.submitGroupCreation();
    app.groupHelper.returnToGroupsPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation2() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.gotoGroupsPage();
    app.groupHelper.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name2";
    group.header = "header2";
    group.footer = "footer2";
	app.groupHelper.fillGroupForm(group);
    app.groupHelper.submitGroupCreation();
    app.groupHelper.returnToGroupsPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation3() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.gotoGroupsPage();
    app.groupHelper.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name3";
    group.header = "header3";
    group.footer = "footer3";
	app.groupHelper.fillGroupForm(group);
    app.groupHelper.submitGroupCreation();
    app.groupHelper.returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.gotoGroupsPage();
    app.groupHelper.initGroupCreation();
    app.groupHelper.fillGroupForm(new GroupData("", "", ""));
    app.groupHelper.submitGroupCreation();
    app.groupHelper.returnToGroupsPage();
  }
}
