package com.bridgelabz.simpleaddressbook;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeLabz.Utility.Utility;

public class FileMenu {

	static Utility obj = new Utility();
	static String[] list;
	public static void main(String[] args) {
		
		System.out.println(" Welcome to the Address Book Application ");
		list=retrieveFileList();
		//System.out.println("List length "+list.length);
		if(list!=null) {
		recoveringData();}
		boolean status = true;
		while (status == true) {
			System.out.println(" Select the option : ");
			System.out.println(" Enter 1 to create new Address Book : ");
			System.out.println(" Enter 2 to open Existing Address book : ");
			System.out.println(" Enter 3 to save Address Book : ");
			System.out.println(" Enter 4 to quit Address Book : ");
			//System.out.println(" Enter 5 to quit Address Book  : ");
			int option=Utility.getInt();
//			boolean optionStatus=true;
//			while(optionStatus==true) {
//			try {
//				option = Utility.getInt();}
//			catch(Exception e) {
//				System.out.println("Wrong input ,Option should be a integer");
//				
//			}
//			optionStatus=true;
//		}
			switch (option) {
			case 1:
				FileMenu.newAddressBook();
				break;
			case 2:
				FileMenu.open();
				break;
				
			case 3:
				FileMenu.save();
				break;
			case 4:
				FileMenu.quit();
				break;
//			case 5:
//				FileMenu.close();
//				break;
			default:
				System.out.println(" Entered option is wrong ");
			}
		}
	}
/****************************************************************************************************/
	static void newAddressBook() {
		AddressBookManager.createNewAddressBook();
	}
/****************************************************************************************************/
	static void open() {
		AddressBookManager.openExistingAddressBook();
	}
/*****************************************************************************************************/
//	static void close() {
//		AddressBookManager.closeAddressBook();
//	}
///*****************************************************************************************************/
	static void save() {
		AddressBookManager.saveAddressBook();
	}
/*****************************************************************************************************/
//	static void saveAs() {
//		AddressBookManager.saveAddressBookAs();
//	}
/******************************************************************************************************/
	static void quit() {
		AddressBookManager.quitAddressBook();
	}
	
	static void recoveringData(){
		
		
		JSONParser parser=new JSONParser();
		for(int i=0;i<list.length;i++) {
			System.out.println("Displaying "+(i+1)+ "Address Book Name from the Address Book List ");
			System.out.println(list[i]);
			AddressBookManager.addressBookNameList.add(list[i]);
			AddressBookManager.addressBookObject=new AddressBook();
			AddressBookManager.addressBookList.add(AddressBookManager.addressBookObject);
			
			
			try {
				JSONArray a=(JSONArray) parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgelabz/simpleaddressbook/"+list[i]+".json"));
				
				System.out.println("Printing json array of"+list[i]);
				System.out.println(a);
				System.out.println();
				for(int j=0;j<a.size();j++) {
					Persons p=new Persons();
					JSONObject ob=	(JSONObject) a.get(j);
				System.out.println("Printing json object of"+list[i]+","+j);
				System.out.println(ob);
					p.setFirstName(ob.get("firstName").toString());
					p.setLastName(ob.get("lastName").toString());
					p.setAddress(ob.get("address").toString());
					p.setState(ob.get("city").toString());
					p.setState(ob.get("state").toString());
					p.setZip(ob.get("zip").toString());
					p.setPhoneNumber(ob.get("phoneNumber").toString());

					AddressBookManager.addressBookList.get(i).l.add(p);
					AddressBookManager.addressBookList.get(i).personsNameList.add(p.getPhoneNumber());
					
					//System.out.println("Printing available phone number list of the users");
					//System.out.println(AddressBookManager.addressBookList.get(i).personsNameList.get(j));
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			AddressBook.printEntries(AddressBookManager.addressBookList.get(i).l);
		}
		}

	
	
	static String [] retrieveFileList(){
		File f=new File("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgelabz/simpleaddressbook/fileList");
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		String [] str=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String word=br.readLine();
			while(word!=null) {
			str=word.split(" ");
			break;
			}
		//	br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Displaying all the address book name from the file List ");
		if(str!=null) {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}}
		return str;
	}
}
