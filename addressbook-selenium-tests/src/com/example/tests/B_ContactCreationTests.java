package com.example.tests;

import org.testng.annotations.Test;

public class B_ContactCreationTests extends TestBase {
  

  @Test
  public void testNonEmptyAddressCreation() throws Exception {
	gotoAddAddressPage();
    app.contactHelper.initAddressCreation();
    ContactData parameterObject = new ContactData();
    parameterObject.firstname = "firstname1";
    parameterObject.lastname = "lastname1";
    parameterObject.address = "address1";
    parameterObject.mobtelefon = "mobfone1";
    parameterObject.email = "email1";
    parameterObject.date = "31";
    parameterObject.month = "February";
    parameterObject.year = "year1";
    parameterObject.groupname = "group.name1";
    parameterObject.address2 = "��� ����������";
    parameterObject.home2 = "��� ���, ��� ���� �������?";
	app.contactHelper.fillAddresssForm(app, this, parameterObject);
    app.contactHelper.submitAddressCreation();
    gotoAddAddressPage();
  }
  
  @Test
  public void testNonEmptyAddressCreation2() throws Exception {
	gotoAddAddressPage();
    app.contactHelper.initAddressCreation();
    ContactData parameterObject = new ContactData();
    parameterObject.firstname = "firstname2";
    parameterObject.lastname = "lastname2";
    parameterObject.address = "address2";
    parameterObject.mobtelefon = "mobfone2";
    parameterObject.email = "email2";
    parameterObject.date = "1";
    parameterObject.month = "May";
    parameterObject.year = "year2";
    parameterObject.groupname = "";
    parameterObject.address2 = "�� ����, ��� ��� ��������";
    parameterObject.home2 = "home, sweat home";
	app.contactHelper.fillAddresssForm(app, this, parameterObject);
    app.contactHelper.submitAddressCreation();
    gotoAddAddressPage();
  }
  
  @Test
  public void testNonEmptyAddressCreation3() throws Exception {
	gotoAddAddressPage();
    app.contactHelper.initAddressCreation();
    ContactData parameterObject = new ContactData("firstname3", "lastname3", "address3", "mobfone3", "email3", "22", "September", "year3", "group.name1", "��� ����������", "��� ���, ��� ���� �������?");
    parameterObject.firstname = "firstname3";
    parameterObject.lastname = "lastname3";
    parameterObject.address = "address3";
    parameterObject.mobtelefon = "mobfone3";
    parameterObject.email = "email3";
    parameterObject.date = "22";
    parameterObject.month = "September";
    parameterObject.year = "year3";
    parameterObject.address2 = "�����, �����, �����";
    parameterObject.home2 = "��� ��� - ��� ��������";
	app.contactHelper.fillAddresssForm(app, this, parameterObject);
    app.contactHelper.submitAddressCreation();
    gotoAddAddressPage();
  }
  
}