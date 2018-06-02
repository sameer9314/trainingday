package com.bridgLabz.oops;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgLabz.oops.StockAccount;

public class UserAccount {
	JSONArray userSharesObjectArray=new JSONArray();
	String userName;
	int amount=10000;
	int shareCount=0;
	//int status;
	StockAccount account;
	UserAccount(String userName){
		this.userName=userName;
		account=new StockAccount(userName);
	}
	 @SuppressWarnings("static-access")
	void transaction(JSONObject symbol) {
		account.display();
		account.buy(UserHandle.user.amount,symbol);
		System.out.println("User left amount "+amount);
		account.userFileCreation(symbol);
		
//		account.sell(amount,userName);
//		account.save(fileName);
//		account.printReport();
	}
	
}
