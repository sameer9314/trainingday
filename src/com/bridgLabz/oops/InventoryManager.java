package com.bridgLabz.oops;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.Utility.Utility;

/**
 * Purpose : To use the inventory object and print the details of an entered object.
 * @author : Sameer Saurabh
 * @version : 1.0
 * @since  : 1/06/2018
 */
public class InventoryManager {
	public static void main(String[] args) {
		Utility obj=new Utility();
		InventoryFacotory.m();
		System.out.println("Enter your choice to print the datails of an Object");
		System.out.println("Enter 1 to print the details of Rice ");
		System.out.println("Enter 2 to print the details of Pulses ");
		System.out.println("Enter 3 to print the details of Wheat ");
		int choice=Utility.getInt();
		switch(choice) 
		{
		case 1 : System.out.println(InventoryManager.createInventoryObject((JSONArray)(InventoryFacotory.jsonObject.get("Rice")),"Rice"));
		break;
		case 2 : System.out.println(InventoryManager.createInventoryObject((JSONArray)(InventoryFacotory.jsonObject.get("Pulses")),"Pulses"));
		break;
		case 3 : System.out.println(InventoryManager.createInventoryObject((JSONArray)(InventoryFacotory.jsonObject.get("Wheats")),"Wheats"));
		break;
		default : System.out.println("Wrong Input");
		}
	}
	/**
	 * This function is written to return the details of an Object entered by the user. 
	 * @param ar
	 * @param s
	 * @returntype JSONObject 
	 */
	@SuppressWarnings("unchecked")
	static JSONObject createInventoryObject(JSONArray ar,String s) {
		int totalWeight=0;
		int totalPrice=0;
		String itemName=s;
		for(int i=0;i<ar.size();i++) {
			JSONObject b=(JSONObject) ar.get(i);
			totalWeight+=Integer.parseInt((b.get("weight").toString()));
			totalPrice+=Integer.parseInt((b.get("weight").toString()))*Integer.parseInt((b.get("pricePerKg").toString()));
				}
		JSONObject ob=new JSONObject();
		ob.put("Item name is", itemName);
		ob.put("Item totalWeight is" , totalWeight);
		ob.put("Item total price is" , totalPrice);
		return ob;
	}
}
