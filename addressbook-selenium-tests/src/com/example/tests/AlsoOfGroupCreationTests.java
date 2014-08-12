package com.example.tests;

import org.testng.annotations.Test;

public class AlsoOfGroupCreationTests extends TestBase {

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
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupDate("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
  }
}
