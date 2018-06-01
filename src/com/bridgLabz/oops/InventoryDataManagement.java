package com.bridgLabz.oops;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * Purpose : To create a JSON file having inventory details for Rice,Pulses and Wheats 
 * 			 with the properties name,weight,price per kg.	
 * @author : Sameer Saurabh
 * @version : 1.0
 * @since  : 31/05/2018
 */
public class InventoryDataManagement {
	static int TotalWeight;
	static int TotalPrice;
	static String itemName;

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object b = parser.parse(new FileReader(
					"/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/inventory.json"));
			JSONObject obj = (JSONObject) b;
			
			JSONArray item;
			System.out.print("[");
			for (int i = 1; i <= 3; i++) {

				if (i == 0) {
					item = (JSONArray) obj.get("Rice");
					itemName = "Rice";
				} else if (i == 1) {
					item = (JSONArray) obj.get("Pulses");
					itemName = "Pulses";
				} else {
					item = (JSONArray) obj.get("Wheats");
					itemName = "Wheats";
				}
				for (int j = 0; j < item.size(); j++) {
					JSONObject a = (JSONObject) item.get(j);
					TotalWeight += Integer.parseInt(a.get("weight").toString());
					TotalPrice += (Integer.parseInt(a.get("pricePerKg").toString())
							* Integer.parseInt(a.get("weight").toString()));
				}
				if (i < 3) {
					System.out.print("{ \"Name\" : " + "\"" + itemName + "\"" + "," + "\"Total weight is\"" + ": "
							+ TotalWeight + "," + "\"Total price is\"" + ": " + TotalPrice + "}" + ",");
				} else {
					System.out.print("{ \"Name\" : " + "\"" + itemName + "\"" + "," + "\"Total weight is\"" + ": "
							+ TotalWeight + "," + "\"Total price is\"" + ": " + TotalPrice + "}");
				}
				if (i < 3)
					System.out.println();
			}
			System.out.println("]");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
