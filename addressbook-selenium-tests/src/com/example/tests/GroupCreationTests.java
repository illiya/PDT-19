package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupDate group = new GroupDate();
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
    GroupDate group = new GroupDate();
    group.name = "group.name3";
    group.header = "header3";
    group.footer = "footer3";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }
}
