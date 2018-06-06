package com.bridgelabz.simpleaddressbook;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;

public class AddressBook {

	
	LinkedList <Persons>l=new LinkedList <Persons>();
	MyLinkedList personsNameList=new MyLinkedList();
	Test t=new Test();
	
/****************************************************************************************************/	
 @SuppressWarnings({ "unchecked" })
void addPerson() {
	 	Persons p=new Persons();
		p.setFirstName();
		p.setLastName();
		p.setAddress();
		p.setCity();
		p.setState();
		p.setZip();
		p.setPhoneNumber();
		
		AddressBookManager.addressBookObject.l.add(p);
		
		AddressBookManager.addressBookObject.personsNameList.add(p.getPhoneNumber());
		
}
/*************************************************************************************************/ 
 void editPersonInfo(String phoneNumber) {
	 System.out.println("Searching number");
	 System.out.println(AddressBookManager.addressBookObject.personsNameList.search(phoneNumber));
	 if(AddressBookManager.addressBookObject.personsNameList.search(phoneNumber)==true) {
	 int index=AddressBookManager.addressBookObject.personsNameList.index(phoneNumber);
	 AddressBookManager.addressBookObject.l.get(index-1).setAddress();
	 AddressBookManager.addressBookObject.l.get(index-1).setCity();
	 AddressBookManager.addressBookObject.l.get(index-1).setState();
	 AddressBookManager.addressBookObject.l.get(index-1).setZip();
	 AddressBookManager.addressBookObject.l.get(index-1).setPhoneNumber();
	 
	 AddressBookManager.addressBookObject.personsNameList.removeAt(index-1);
	 AddressBookManager.addressBookObject.personsNameList.insert(l.get(index-1).getPhoneNumber(),index-1);
	 
	 System.out.println("Displaying Phone number list after edition");
	 AddressBookManager.addressBookObject.personsNameList.display();
	 }else {
		 System.out.println(" Entered user number not found ");
	 }
	
 }
 
 /*************************************************************************************************/
 void deletePerson(String phoneNumber){
	 System.out.println("Searching number");
	 System.out.println(AddressBookManager.addressBookObject.personsNameList.search(phoneNumber));
	 if(AddressBookManager.addressBookObject.personsNameList.search(phoneNumber)==true) {
	 int index=AddressBookManager.addressBookObject.personsNameList.index(phoneNumber);
	 System.out.println("persons found at : "+index);
	 AddressBookManager.addressBookObject.l.remove(index-1);
	 AddressBookManager.addressBookObject.personsNameList.removeAt(index-1);
	 }else
	 {
		 System.out.println(" Entered user number not found ");
	 }
}
 /*************************************************************************************************/
	static void sortEntriesByLastName(LinkedList<Persons> l) {
		
		Comparator <Persons> PersonLastNameComparator = new Comparator <Persons>() {
			public int compare(Persons p1, Persons p2) {

				String p1Name = p1.getLastName().toUpperCase();
				String p2Name = p2.getLastName().toUpperCase();

				// ascending order
				return p1Name.compareTo(p2Name);

				// descending order
				// return fruitName2.compareTo(fruitName1);
			}

};
 }
	
	
/*****************************************************************************************************/	
 void sortEntriesByZipCode() {}
 //void printEntries() {}
 /*****************************************************************************************************/
 public static void printEntries (LinkedList L) {
	 for(int i=0;i<AddressBookManager.addressBookObject.l.size();i++) {
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getFirstName());
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getLastName());
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getAddress());
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getCity());
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getState());
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getZip());
	 System.out.println(AddressBookManager.addressBookObject.l.get(i).getPhoneNumber());
	 
	 System.out.println();
	}
}
/******************************************************************************************************/ 
 public static void manager() {
	 System.out.println(" Select the option : ");
		System.out.println(" Enter 1 to add new Person in the address book : ");
		System.out.println(" Enter 2 to edit existing Person Information in the Address Book : ");
		System.out.println(" Enter 3 to delete existing Person in the Address Book : ");
		System.out.println(" Enter 4 to Sort Entries By Last Name : ");
		System.out.println(" Enter 5 to Sort Enries By ZipCode  : ");
		int option=Utility.getInt();
		switch(option) {
		case 1 : AddressBookManager.addressBookObject.addPerson();
				 AddressBook.printEntries(AddressBookManager.addressBookObject.l);	
		break;	
		case 2 :
		break;	
		case 3 :
		break;	
		case 4 :
		break;	
		case 5 :
		break;
		default : System.out.println(" Entered option is wrong ");
		}
 }
}
