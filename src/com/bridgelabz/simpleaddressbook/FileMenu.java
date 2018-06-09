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
		
		System.out.println("        _______________________________________           ");
		System.out.println("        Welcome to the Address Book Application           ");
		System.out.println("        _______________________________________           ");
		System.out.println();
		list=retrieveFileList();
		//System.out.println("List length "+list.length);
		if(list!=null) {
		recoveringData();}
		boolean status = true;
		while (status == true) {
			System.out.println(" _________________________");
			System.out.println(" Address Book Manager Menu");
			System.out.println(" _________________________\n");
			System.out.println(" Select the option : ");
			System.out.println(" Enter 1 to create new Address Book : ");
			System.out.println(" Enter 2 to open Existing Address book : ");
			System.out.println(" Enter 3 to save Address Book : ");
			System.out.println(" Enter 0 to quit Address Book : ");
			int option=Utility.getInt();
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
			case 0:
				FileMenu.quit();
				break;
			default:
				System.out.println(" Entered option is Wrong ");
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
	static void save() {
		AddressBookManager.saveAddressBook();
	}
/*****************************************************************************************************/
	static void quit() {
		AddressBookManager.quitAddressBook();
	}
/***************************************************************************************************/	
	static void recoveringData(){
		JSONParser parser=new JSONParser();
		for(int i=0;i<list.length;i++) {
			AddressBookManager.addressBookNameList.add(list[i]);
			AddressBookManager.addressBookObject=new AddressBook();
			AddressBookManager.addressBookList.add(AddressBookManager.addressBookObject);
			
			try {
				JSONArray a=(JSONArray) parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgelabz/simpleaddressbook/"+list[i]+".json"));
				for(int j=0;j<a.size();j++) {
					Persons p=new Persons();
					JSONObject ob=	(JSONObject) a.get(j);
					p.setFirstName(ob.get("firstName").toString());
					p.setLastName(ob.get("lastName").toString());
					p.setAddress(ob.get("address").toString());
					p.setCity(ob.get("city").toString());
					p.setState(ob.get("state").toString());
					p.setZip(ob.get("zip").toString());
					p.setPhoneNumber(ob.get("phoneNumber").toString());

					AddressBookManager.addressBookList.get(i).l.add(p);
					AddressBookManager.addressBookList.get(i).personsNameList.add(p.getPhoneNumber());
					
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		}
	
	static String [] retrieveFileList(){
		File f=new File("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgelabz/simpleaddressbook/fileList");
		FileReader fr=null;
		BufferedReader br=null;
		String [] str=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String word=br.readLine();
			while(word!=null) {
			str=word.split(" ");
			break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Retrieving All Address Book files....\n");
		System.out.println("Displaying all the address book name from the Data Base ");
		if(str!=null) {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}}
		System.out.println();
		return str;
	}
}
