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
public void setFirstName(String firstName) {
	
	this.firstName=firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
//	System.out.println(" Enter your address");
	this.address=address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	//System.out.println(" Enter your city ");
	this.city=city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	//System.out.println(" Enter your State ");
	this.state=state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	//System.out.println(" Enter your zip code ");
	this.zip=zip;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	//System.out.println(" Enter your phone number");
	this.phoneNumber=phoneNumber;
}

}
