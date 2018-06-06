package com.bridgelabz.simpleaddressbook;

import com.bridgeLabz.Utility.Utility;

public class Persons {
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private String zip;
private String phoneNumber;
Utility obj=new Utility();
public String getFirstName() {
	return firstName;
}
public void setFirstName() {
	System.out.println(" Enter your first name ");
	
	firstName=Utility.getString();
}
public String getLastName() {
	return lastName;
}
public void setLastName() {
	System.out.println(" Enter your last name ");
	lastName=Utility.getString();
}
public String getAddress() {
	return address;
}
public void setAddress() {
	System.out.println(" Enter your address");
	address=Utility.getString();
}
public String getCity() {
	return city;
}
public void setCity() {
	System.out.println(" Enter your city ");
	city=Utility.getString();
}
public String getState() {
	return state;
}
public void setState() {
	System.out.println(" Enter your State ");
	state=Utility.getString();
}
public String getZip() {
	return zip;
}
public void setZip() {
	System.out.println(" Enter your zip code ");
	zip=Utility.getString();
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber() {
	System.out.println(" Enter your phone number");
	phoneNumber=Utility.getString();
}

}
