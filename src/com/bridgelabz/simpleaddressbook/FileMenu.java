package com.bridgelabz.simpleaddressbook;


import com.bridgeLabz.Utility.Utility;

public class FileMenu {

	static Utility obj = new Utility();

	public static void main(String[] args) {
		boolean status = true;
		while (status == true) {
			System.out.println(" Select the option : ");
			System.out.println(" Enter 1 to create new Address Book : ");
			System.out.println(" Enter 2 to open Existing Address book : ");
			System.out.println(" Enter 3 to save Address Book : ");
			System.out.println(" Enter 4 to save Address Book as : ");
			System.out.println(" Enter 5 to quit Address Book  : ");
			int option = Utility.getInt();
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

	static void newAddressBook() {
		AddressBookManager.createNewAddressBook();
	}

	static void open() {
		AddressBookManager.openExistingAddressBook();
	}

	static void close() {
		AddressBookManager.closeAddressBook();
	}

	static void save() {
	//	AddressBookManager.saveAddressBook();
	}

	static void saveAs() {
		AddressBookManager.saveAddressBookAs();
	}

	static void quit() {
	}
}
