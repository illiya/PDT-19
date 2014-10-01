package com.example.tests;

import org.testng.annotations.Test;

public class A_GroupCreationTests extends TestBase {

  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    app.gotoGroupsPage();
    app.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name1";
    group.header = "header1";
    group.footer = "footer1";
	app.fillGroupForm(this, group);
    app.submitGroupCreation();
    app.returnToGroupsPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation2() throws Exception {
	openMainPage();
    app.gotoGroupsPage();
    app.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name2";
    group.header = "header2";
    group.footer = "footer2";
	app.fillGroupForm(this, group);
    app.submitGroupCreation();
    app.returnToGroupsPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation3() throws Exception {
	openMainPage();
    app.gotoGroupsPage();
    app.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name3";
    group.header = "header3";
    group.footer = "footer3";
	app.fillGroupForm(this, group);
    app.submitGroupCreation();
    app.returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    app.gotoGroupsPage();
    app.initGroupCreation();
    app.fillGroupForm(this, new GroupData("", "", ""));
    app.submitGroupCreation();
    app.returnToGroupsPage();
  }
}
