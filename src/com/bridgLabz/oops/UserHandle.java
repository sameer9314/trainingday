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

public class UserHandle {
	@SuppressWarnings("static-access")
	static UserAccount user;
	public static void main(String[] args) {
		new Utility();
		for(int j=1;j<=2;j++) {
		System.out.println("Enter your name");
		String userName=Utility.getStringLine();
		JSONParser parser = new JSONParser();
		 user=new UserAccount(userName);
		 JSONObject ob=null;
		 try {
				Object b=parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json"));
				JSONArray jsonArray=(JSONArray)b;
				for(int i=1;i<=3;i++) {
				System.out.println("Choose your share");
				int choice=Utility.getInt();
				ob=(JSONObject) jsonArray.get(choice);
				System.out.println("Printing choosen object");
				System.out.println(ob);
				user.transaction(ob);
				}
				System.out.println(UserHandle.user.userSharesObjectArray);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

}
