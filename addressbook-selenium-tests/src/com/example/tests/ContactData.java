package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String mobtelefon;
	public String email;
	public String date;
	public String month;
	public String year;
	public String groupname;
	public String address2;
	public String home2;
	
	public ContactData() {}

	public ContactData(String firstname, String lastname, String address,
			String mobtelefon, String email, String date, String month,
			String year, String groupname, String address2, String home2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.mobtelefon = mobtelefon;
		this.email = email;
		this.date = date;
		this.month = month;
		this.year = year;
		this.groupname = groupname;
		this.address2 = address2;
		this.home2 = home2;
	}
}