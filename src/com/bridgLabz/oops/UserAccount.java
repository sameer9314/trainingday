package com.bridgLabz.oops;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgLabz.oops.StockAccount;

public class UserAccount {
	static JSONArray userSharesObjectArray=new JSONArray();
	String userName;
	int amount=10000;
	int userTotalShare=0;
	//int status;
	StockAccount account;
	UserAccount(String userName){
		this.userName=userName;
		account=new StockAccount(userName);
	}
	 @SuppressWarnings("static-access")
	void transaction(JSONObject symbol) throws ParseException {
		System.out.println("Displaying user details : ");
		account.display();
		//System.out.println("Symbol is "+symbol);
		//System.out.println("amount"+UserHandle.userObjectList[UserHandle.itemIndex].amount);
		account.buy(UserHandle.userAccountList[UserHandle.itemIndex].amount,symbol);
		System.out.println("User left amount "+amount);
		
		StockAccount.stockUpdate(UserHandle.userObjectList);
//		account.userFileCreation(UserHandle.userObjectList[UserHandle.itemIndex].userName,symbol);
		
//		account.sell(amount,userName);
//		account.save(fileName);
//		account.printReport();
	}
	
}
