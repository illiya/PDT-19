package com.example.tests;

import org.testng.annotations.Test;

public class UserCreationTests extends TestBase {
  

  @Test
  public void testNonEmptyAddressCreation() throws Exception {
	gotoAddAddressPage();
    initAddressCreation();
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
    parameterObject.address2 = "Уже спрашивали";
    parameterObject.home2 = "Мне что, дом свой описать?";
	fillAddresssForm(parameterObject);
    submitAddressCreation();
    gotoAddAddressPage();
  }
  
  @Test
  public void testNonEmptyAddressCreation2() throws Exception {
	gotoAddAddressPage();
    initAddressCreation();
    ContactData parameterObject = new ContactData();
    parameterObject.firstname = "firstname2";
    parameterObject.lastname = "lastname2";
    parameterObject.address = "address2";
    parameterObject.mobtelefon = "mobfone2";
    parameterObject.email = "email2";
    parameterObject.date = "1";
    parameterObject.month = "May";
    parameterObject.year = "year2";
    parameterObject.groupname = "group.name2";
    parameterObject.address2 = "Не знаю, что тут написать";
    parameterObject.home2 = "home, sweat home";
	fillAddresssForm(parameterObject);
    submitAddressCreation();
    gotoAddAddressPage();
  }
  
  @Test
  public void testNonEmptyAddressCreation3() throws Exception {
	gotoAddAddressPage();
    initAddressCreation();
    ContactData parameterObject = new ContactData("firstname3", "lastname3", "address3", "mobfone3", "email3", "22", "September", "year3", "group.name1", "Уже спрашивали", "Мне что, дом свой описать?");
    parameterObject.firstname = "firstname3";
    parameterObject.lastname = "lastname3";
    parameterObject.address = "address3";
    parameterObject.mobtelefon = "mobfone3";
    parameterObject.email = "email3";
    parameterObject.date = "22";
    parameterObject.month = "September";
    parameterObject.year = "year3";
    parameterObject.groupname = "group.name3";
    parameterObject.address2 = "Адрес, адрес, адрес";
    parameterObject.home2 = "Мой дом - моя крепость";
	fillAddresssForm(parameterObject);
    submitAddressCreation();
    gotoAddAddressPage();
  }
  
}