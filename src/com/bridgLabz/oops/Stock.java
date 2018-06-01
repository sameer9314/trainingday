package com.bridgLabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.Utility.Utility;

/**
 * Purpose : To create n numbers of JSON object and write it to the JSON file.
 * @author : Sameer Saurabh
 * @version : 1.0
 * @since : 1/06/2018
 *
 */
public class Stock {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Utility u=new Utility();
		
		System.out.println("Enter the number of stocks");
		int noOfStocks=Utility.getInt();
		
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<noOfStocks;i++) {
			JSONObject obj=new JSONObject();
			System.out.println("Enter the name of Share");
			String shareName=Utility.getString();
			System.out.println("Enter number of share");
			int noOfShare=Utility.getInt();
			System.out.println("Enter the price of share");
			int sharePrice=Utility.getInt();
			
			obj.put("Share Name",shareName);
			obj.put("Number of shares",noOfShare);
			obj.put("Share Price",sharePrice);
			jsonArray.add(obj);
		}
		System.out.println(jsonArray);
		String jsonArrayString=jsonArray.toString();
		System.out.println(jsonArrayString);
		FileWriter fw=null;
		try {
			fw=new FileWriter(new File("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json"));
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(jsonArrayString);
			bw.flush();
			System.out.println();
			System.out.println("File updated successfully");
		}catch(Exception e) {
			e.printStackTrace();
			}
	}

}
