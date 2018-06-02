package com.bridgLabz.oops;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Purpose : To create inventory object from JSON file.
 * @author : Sameer Saurabh
 * @version : 1.0
 * @since : 1/06/2018
 */
public class InventoryFacotory {
	static JSONObject jsonObject;
	public static void m() {
		JSONParser parser=new JSONParser();
		try {
			Object b=parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/inventory.json"));
			 jsonObject=(JSONObject)b;
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	
}
