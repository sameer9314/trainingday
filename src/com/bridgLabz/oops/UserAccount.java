package com.bridgLabz.oops;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgLabz.oops.StockAccount;
import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;

public class UserAccount {
	static JSONArray userSharesObjectArray = new JSONArray();
	String userName;
	int amount = 10000;
	int userTotalShare = 0;
	StockAccount account;

	UserAccount(String userName) {
		this.userName = userName;
		account = new StockAccount(userName);
	}

	MyLinkedList eachComopanyShareList = MyLinkedList.list();

	@SuppressWarnings("static-access")
	void transaction(JSONObject symbol) throws ParseException {
		// boolean b=true;
		// while(b==true) {
		System.out.println("Displaying user details : ");
		account.display();
		System.out.println("Enter your choice to select the features ");
		System.out.println("Enter 1 to buy shares");
		System.out.println("Enter 2 to sell shares");
		int n = Utility.getInt();
		switch (n) {

		case 1:
			account.buy(UserHandle.userAccountList[UserHandle.itemIndex].amount, symbol);
			System.out.println("User left amount " + amount);
			UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList.display();
			break;
		case 2:
			account.sell(UserHandle.userAccountList[UserHandle.itemIndex].amount, symbol);
			System.out.println("User left amount " + amount);
			UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList.display();
			break;
		// default : b=false;
		}
		// }
		// account.printReport();
	}

}
