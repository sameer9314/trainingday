package com.bridgelabz.simpleaddressbook;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Iterator;
import java.util.LinkedList;

import org.json.simple.JSONObject;

import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;

public class AddressBook {

	
	LinkedList <Persons>l=new LinkedList <Persons>();
	MyLinkedList personsNameList=new MyLinkedList();
	Test t=new Test();
	
/****************************************************************************************************/	
// @SuppressWarnings({ "unchecked" })
void addPerson() {
	 	Persons p=new Persons();
	 	System.out.println("Enter your first name");
		p.setFirstName(Utility.getString());
		System.out.println("Enter your last name");
		p.setLastName(Utility.getString());
		System.out.println("Enter your address");
		p.setAddress(Utility.getString());
		System.out.println("Enter your city name");
		p.setCity(Utility.getString());
		System.out.println("Enter your state name");
		p.setState(Utility.getString());
		System.out.println("Enter your zip code");
		p.setZip(Utility.getString());
		System.out.println("Enter your Phone Number");
		p.setPhoneNumber(Utility.getString());
		
		AddressBookManager.addressBookObject.l.add(p);
		
		AddressBookManager.addressBookObject.personsNameList.add(p.getPhoneNumber());
		
}
/*************************************************************************************************/ 
 void editPersonInfo(String phoneNumber) {
	 System.out.println("Searching number");
	 System.out.println(AddressBookManager.addressBookObject.personsNameList.search(phoneNumber));
	 if(AddressBookManager.addressBookObject.personsNameList.search(phoneNumber)==true) {
	 int index=AddressBookManager.addressBookObject.personsNameList.index(phoneNumber);
	 
	 System.out.println("Enter your address");
	 AddressBookManager.addressBookObject.l.get(index-1).setAddress(Utility.getString());
	 
	 System.out.println("Enter your city name");
	 AddressBookManager.addressBookObject.l.get(index-1).setCity(Utility.getString());
	
	 System.out.println("Enter your state name");
	 AddressBookManager.addressBookObject.l.get(index-1).setState(Utility.getString());
	
	 System.out.println("Enter your zip code");
	 AddressBookManager.addressBookObject.l.get(index-1).setZip(Utility.getString());
	
	 System.out.println("Enter your Phone Number");
	 AddressBookManager.addressBookObject.l.get(index-1).setPhoneNumber(Utility.getString());
	 
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
//	static void sortEntriesByLastName(LinkedList<Persons> l) {
//		
//		Comparator <Persons> PersonLastNameComparator = new Comparator <Persons>() {
//			public int compare(Persons p1, Persob.get("First Name");
//			ob.get("Last Name");
//			ob.get("Address");
//			ob.get("City");
//			ob.get("State");
//			ob.get("Zip");
//			ob.get("Phone Number");ons p2) {
//
//				String p1Name = p1.getLastName().toUpperCase();
//				String p2Name = p2.getLastName().toUpperCase();
//
//				// ascending order
//				return p1Name.compareTo(p2Name);
//
//				// descending order
//				// return fruitName2.compareTo(fruitName1);
//			}
//
//};
// }
	
 // void sortEntriesByLastName() {
	// JSONArray bookArray = addressBook.readFromFile(filePath);
	 
//     ArrayList list=new ArrayList();
//     for(int i=0;i< AddressBookManager.addressBookObject.l.size();i++)
//     {
//         String temp=AddressBookManager.addressBookObject.l.get(i).getLastName();
//         list.add(temp);
//     }
//      for(int i=0 ; i<list.size()-1;i++) {
//             for(int j=i+1; j<list.size();j++) {
//                 String key1 = list.get(i).toString();
//                // String key1 = (String) jsonObject1.get("Last Name");
//               
//                 String key2 = list.get(j).toString();
//                 //String key2 = (String) jsonObject2.get("Last Name");
//               
//                 if (key1.compareTo(key2)>0) {
//                     String temp =key1;
//                     list.set(i,key2);
//                     list.set(j,temp);
//                     }
//                 }
//             }
//      list.iterator();
//      for(int i=0;i<list.size();i++) {
//    	  System.out.println(list.get(i));
//      }
	  
	   void  sortEntriesByLastName(LinkedList l) {
		   System.out.println("Sorted by Last Name");
		  ArrayList list=new ArrayList();
		  System.out.println(list);
		  System.out.println(l.size());
	     for(int i=0;i< AddressBookManager.addressBookObject.l.size();i++)
	     {
	    	 System.out.println("Hello");
	         String temp=AddressBookManager.addressBookObject.l.get(i).getLastName();
	         list.add(temp);
	         System.out.println(list.get(i));
	     }
          for (int j = 0; j < list.size()-1; j++) {
              String a= list.get(j).toString();
              String b= list.get(j+1).toString();
              if(a.compareToIgnoreCase(b)>0){
                  String temp=a;
                  a=b;
                  b=temp;
                  list.set(j, a);
                  list.set(j+1, b);
              }
          }
          for(int i=0;i<list.size();i++) {
        	  System.out.println(list.get(i));
          }
  }
	  
  	
/*****************************************************************************************************/	
 void sortEntriesByZipCode() {}
 //void printEntries() {}
 /*****************************************************************************************************/
 public static void printEntries (LinkedList L) {
	// for(int j=0;j<AddressBookManager.addressBookList.size();j++) {
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
//	 }
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
		case 2 : System.out.println("Enter the number of the person to edit the information "); 
				 String phoneNumber=Utility.getString();
				 AddressBookManager.addressBookObject.editPersonInfo(phoneNumber);
				 AddressBook.printEntries(AddressBookManager.addressBookObject.l);
		break;	
		case 3 : System.out.println("Enter the number of the person to delete the person from the"
				+ "Address Book ");
				  phoneNumber=Utility.getString();
				  AddressBookManager.addressBookObject.deletePerson(phoneNumber);
				  AddressBook.printEntries(AddressBookManager.addressBookObject.l);
		break;	
		case 4 : 
	//		System.out.println("Enter the name of the Address Book to sort the people information"
//				+"by Last Name ");
//		         String searcheAddressBook=Utility.getString();
		         AddressBookManager.addressBookObject.sortEntriesByLastName(AddressBookManager.addressBookObject.l);
//		break;	
//		case 5 :System.out.println("Enter the name of the Address Book to sort the people information"
//				+"by Last Name ");
//        		String zipCode=Utility.getString(); 
//		break;
		default : System.out.println(" Entered option is wrong ");
		}
 }
//private void deletePersonInfo(String phoneNumber) {
//	// TODO Auto-generated method stub
//	
//}
}
