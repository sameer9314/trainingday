package com.bridgelabz.simpleaddressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;

public class AddressBookManager {
	static Utility obj=new Utility(); 
	static AddressBook addressBookObject;
	static LinkedList<AddressBook> addressBookList = new <AddressBook>LinkedList();
	static MyLinkedList addressBookNameList=new MyLinkedList();
/********************************************************************************************/	
	static void createNewAddressBook() {
		System.out.println(" Enter the name for new Address Book ");
		String addressBookName=Utility.getString();
		addressBookNameList.add(addressBookName);
		addressBookObject = new AddressBook();
		addressBookList.add(addressBookObject);
		addressBookObject.manager();
	}
/***********************************************************************************************/
	static void openExistingAddressBook() {
		System.out.println(" Enter the Existing Addrress Book Name ");
		String searcheAddressBook=Utility.getString();
		if(addressBookNameList.search(searcheAddressBook)==true) {
			addressBookObject=addressBookList.get(addressBookNameList.index(searcheAddressBook)-1);
			addressBookObject.manager();
		}
	}
/*********************************************************************************************/
//	static void saveAddressBook() {
//		System.out.println(" Enter the  Addrress Book Name to save  ");
//		String searcheAddressBook=Utility.getString();
//		if(addressBookNameList.search(searcheAddressBook)==true) {
//			;
////			addressBookObject.manager();
//			JSONArray tempArray = new JSONArray();
//			System.out.println("Updating json");
//			for(int i=0;i<addressBookList.size();i++) {
//				tempArray.add((JSONObject) new JSONParser().parse( (String) addressBookList.get(0)) );
//			}
//			try {
//				BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(new File(
//						"/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json")));
//				bufferedwriter.write(tempArray.toString());
//				bufferedwriter.close();
//				System.out.println("Stock File updated succesfully");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
/**********************************************************************************************/
	static void saveAddressBookAs() {
	}
/**********************************************************************************************/
	static void closeAddressBook() {
	}
/**********************************************************************************************/
	static void quitAddressBook() {
		System.exit(0);
	}

}
