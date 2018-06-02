package com.bridgLabz.oops;

import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.bridgeLabz.Utility.Utility;


public class StockAccount {
	StockAccount(String fileName){
		 File f=new File("/home/administrator/eclipse-workspace/Funtional_Programs/UserDetailFolder/"+fileName);
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 void display() {
		System.out.println("Hello");
	}
//	
	static void buy(int amount,JSONObject symbol) {
		System.out.println(" How many shares you want to buy ");
		int n=Utility.getInt();
		UserHandle.user.amount=amount-( (Integer.parseInt(symbol.get("Share Price").toString())) *n );
	}
	
	@SuppressWarnings("unchecked")
	static void userFileCreation(JSONObject symbol){
		JSONObject obj=new JSONObject();
		obj.put("Share Name",symbol.get("Share Name"));
		obj.put("Number of shares",++UserHandle.user.shareCount);
		System.out.println(obj);
		UserHandle.user.userSharesObjectArray.add(obj);
	}
//	static void sell(int amount,String symbol) {}
//	static void save(String fileName) {}
//	static void printReport() {}
	//static double valueOf() {
//		return 0.0;
//	}

}
