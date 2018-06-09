package com.bridgelabz.simpleaddressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;

public class AddressBookManager {
	static Utility obj=new Utility(); 
	static AddressBook addressBookObject;
	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	static LinkedList<AddressBook> addressBookList = new <AddressBook>LinkedList();
	static MyLinkedList addressBookNameList=new MyLinkedList();
/********************************************************************************************/	
	@SuppressWarnings("static-access")
	static void createNewAddressBook() {
		System.out.println("Printing address Book Name List");
		AddressBookManager.addressBookNameList.display();
		System.out.println();
		System.out.println(" Enter the name for new Address Book ");
		String addressBookName=Utility.getString();
		addressBookNameList.add(addressBookName);
		addressBookObject = new AddressBook();
		addressBookList.add(addressBookObject);
		addressBookObject.manager();
	}
	
/***********************************************************************************************/
	@SuppressWarnings("static-access")
	static void openExistingAddressBook() {
		System.out.println("Printing address Book Name List");
		AddressBookManager.addressBookNameList.display();
		System.out.println();
		System.out.println(" Enter the Existing Addrress Book Name ");
		String searcheAddressBook=Utility.getString();
		
		if(addressBookNameList.search(searcheAddressBook)==true) {
			addressBookObject=addressBookList.get(addressBookNameList.index(searcheAddressBook)-1);
			addressBookObject.manager();
		}
	}
/*********************************************************************************************/
	@SuppressWarnings("unchecked")
	static void saveAddressBook() {
		System.out.println(" Enter the  Addrress Book Name to save  ");
		String addressBookName=Utility.getString();
		if(addressBookNameList.search(addressBookName)==true) {
		int index=addressBookNameList.index(addressBookName);
		System.out.println("Index "+index);
		JSONArray ar=new JSONArray();
		for(int i=0;i<AddressBookManager.addressBookList.get(index-1).l.size();i++) {
			JSONObject ob=new JSONObject();
		ob.put("firstName", AddressBookManager.addressBookList.get(index-1).l.get(i).getFirstName());
		ob.put("lastName", AddressBookManager.addressBookList.get(index-1).l.get(i).getLastName());
		ob.put("address", AddressBookManager.addressBookList.get(index-1).l.get(i).getAddress());
		ob.put("city", AddressBookManager.addressBookList.get(index-1).l.get(i).getCity());
		ob.put("state", AddressBookManager.addressBookList.get(index-1).l.get(i).getState());
		ob.put("zip", AddressBookManager.addressBookList.get(index-1).l.get(i).getZip());
		ob.put("phoneNumber", AddressBookManager.addressBookList.get(index-1).l.get(i).getPhoneNumber());
		
		ar.add(ob);
		}
		System.out.println("Saving "+addressBookName+"...");
		File f = new File("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgelabz/simpleaddressbook/"+addressBookName+".json");
		try {
			System.out.println(f.createNewFile());
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(f));
			bufferedwriter.write(ar.toString());
			bufferedwriter.close();
			System.out.println(addressBookName+"File updated succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	}
	
/**********************************************************************************************/
	static void quitAddressBook() {
		String addressBookName="";
		for(int i=0;i<AddressBookManager.addressBookNameList.size();i++) {
		addressBookName+=AddressBookManager.addressBookNameList.get(i).toString()+" ";}
		File f = new File("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgelabz/simpleaddressbook/fileList");
		try {
			f.createNewFile();
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(f));
			bufferedwriter.write(addressBookName);
			bufferedwriter.close();
			System.out.println("Address book  File updated succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

}
