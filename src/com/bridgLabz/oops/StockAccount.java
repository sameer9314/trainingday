package com.bridgLabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;

public class StockAccount {
	static File f;
	StockAccount(String fileName){
		  f=new File("/home/administrator/eclipse-workspace/Funtional_Programs/UserDetailFolder/"+fileName);
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 void display() {
		 System.out.println("User name is :"+UserHandle.userAccountList[UserHandle.itemIndex].userName);
		System.out.println("User amount is : "+UserHandle.userAccountList[UserHandle.itemIndex].amount);
	}
//	
	static void buy(int amount,JSONObject symbol) {
		System.out.println(" Displaying Company details : ");
		System.out.println("Company Name : "+symbol.get("Share Name"));
		System.out.println("Share Price : "+symbol.get("Share Price"));
		System.out.println("Available shares : "+symbol.get("Number of shares"));
		System.out.println(" How many shares you want to buy ");
		int n=Utility.getInt();
		UserHandle.userAccountList[UserHandle.itemIndex].amount=amount-( (Integer.parseInt(symbol.get("Share Price").toString())) *n );
		symbol.get("Number of shares");
		String s="Share Name : "+symbol.get("Share Name")+"\n"+
				 "Number of share purchased : "+n +"\n"+
		         "Total number of shares : "+(UserHandle.userAccountList[UserHandle.itemIndex].userTotalShare+=n)+"\n"+
		         "Remaining Balance : "+UserHandle.userAccountList[UserHandle.itemIndex].amount+"\n"+"\n";
		save(s,f);
		
		JSONObject obc=new JSONObject();
		obc.put("Share Name",symbol.get("Share Name"));
		obc.put("Share Price",symbol.get("Share Price"));
		obc.put("Number of shares",( Integer.parseInt(symbol.get("Number of shares").toString())-n ));
		UserHandle.userObjectList.display();
		UserHandle.userObjectList.pop(UserHandle.choice);
		UserHandle.userObjectList.insert(obc.toString(),UserHandle.choice);
		System.out.println();
		UserHandle.userObjectList.display();
		
	}
	
//	@SuppressWarnings("unchecked")
//	static void userFileCreation(String userName,JSONObject symbol){
//		JSONObject obj=new JSONObject();
//		obj.put("User Name is",userName);
//		obj.put("Share Name",symbol.get("Share Name"));
//		obj.put("Number of shares",++UserHandle.userObjectList[UserHandle.itemIndex].userTotalShare);
//		System.out.println(obj);
//		UserHandle.userObjectList[UserHandle.itemIndex].userSharesObjectArray.add(obj);
//	}
//	static void sell(int amount,String symbol) {}
	static void save(String s,File f) {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(f.getAbsoluteFile(),true));
			bw.write(s);
			bw.flush();
			System.out.println();
			System.out.println("File updated successfully");
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
//	static void printReport() {}
	//static double valueOf() {
//		return 0.0;
//	}
	
	static void availableStocks() {
		System.out.println(" Displaying the Name list of Company ");
		for(int i=0;i<UserHandle.jsonArray.size();i++) {
			JSONObject ob=(JSONObject) UserHandle.jsonArray.get(i);
			System.out.println((i+1)+"."+ob.get("Share Name"));
		}
	}
	
	static MyLinkedList objectCreation() {
		for(int i=0;i<UserHandle.jsonArray.size();i++) {
			
		JSONObject ob=	(JSONObject)UserHandle.jsonArray.get(i);
		UserHandle.userObjectList.add(ob.toJSONString());			
		}
		return UserHandle.userObjectList;
	}
	
	public static void stockUpdate(MyLinkedList out) throws ParseException {
		 JSONArray tempArray=new JSONArray();
		// out.display();
         System.out.println("Updating json");
         while(!out.isEmpty())
         {
           tempArray.add((JSONObject) new JSONParser().parse((String) out.pop(0)));          
          }
         try {
             BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(new File(
                     "/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json")));
             bufferedwriter.write(tempArray.toString());
             bufferedwriter.close();
             System.out.println("File written succesfully");
         } catch (IOException e) {
             e.printStackTrace();
         }
	}
	

}
