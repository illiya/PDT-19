package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group.name2";
    group.header = "header2";
    group.footer = "footer2";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation2() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupData parameterObject = new GroupData();
    parameterObject.name = "group.name3";
    parameterObject.header = "header3";
    parameterObject.footer = "footer3";
	fillGroupForm(parameterObject);
    submitGroupCreation();
    returnToGroupsPage();
  }
}
