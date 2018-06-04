package com.bridgLabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.*;
public class UserHandle {
	@SuppressWarnings("static-access")
	static UserAccount user;
	static MyLinkedList userNameList=MyLinkedList.list();
	static UserAccount[] userAccountList=new UserAccount[3];
	//static MyLinkedList userObjectList=StockAccount.objectCreation();
	static MyLinkedList userObjectList=MyLinkedList.list();;
	static int itemIndex=0;
	static JSONArray jsonArray;
	static int choice;
	public static void main(String[] args) {
		new Utility();
		JSONParser parser = new JSONParser();
		 JSONObject ob=null;
		 int index=0;
		
		 boolean applicationStatus=true;
		while(applicationStatus==true) { 
		System.out.println("Enter your name");
		String userName=Utility.getString();
		
		System.out.print("Searching user name on the list..");
		System.out.println(" status is "+userNameList.search(userName));
		
		if(userNameList.search(userName)==false) {
			System.out.println("User name not found  : ");
			userNameList.add(userName);
			
			System.out.println("User name added in the list");
			itemIndex=index;
			
			userAccountList[itemIndex]=new UserAccount(userName);
			 index++;
			 
		}else {
			System.out.println("User name founded ");
			itemIndex=userNameList.index(userName)-1;
		}
		 try {
				Object b=parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json"));
				jsonArray=(JSONArray)b;
				boolean userTransanctionStatus=true;
				while(userTransanctionStatus==true) {
				StockAccount.availableStocks();	
				System.out.println("Choose your share");
			    choice=Utility.getInt();
				//ob=(JSONObject) jsonArray.get(choice-1);
				ob=(JSONObject)(new JSONParser().parse(StockAccount.objectCreation().get(choice-1).toString()));
				
				userAccountList[itemIndex].transaction(ob);
				
				System.out.println("Enter 1 to continue transaction");
				System.out.println("Enter 0 to exit transaction");
				int transactionChoice=Utility.getInt();
				if(transactionChoice==0) {
					userTransanctionStatus=false;
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		System.out.println("Enter 1 to continue using the stock market");
		System.out.println(" Enter 0 to exit the stock market ");
		int exitChoice=Utility.getInt();
		if(choice==0) { 
			applicationStatus=false;}
		}
	}

}
