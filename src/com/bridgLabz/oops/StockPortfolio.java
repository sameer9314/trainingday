package com.bridgLabz.oops;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Purpose : To print the Stock report of the n number of Stocks from the JSON file.
 * @author Sameer Saurabh
 * @version : 1.0
 * @since : 1/06/2018
 */
public class StockPortfolio {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONParser parser=new JSONParser();
		int totalStockValue=0;
		try {
			Object b=parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json"));
			JSONArray jsonArray=(JSONArray)b;
			int jsonArrayLength=jsonArray.size();
			
			JSONArray shareObjectArray=new JSONArray();
			for(int i=0;i<jsonArrayLength;i++) {
			JSONObject ob=	(JSONObject) jsonArray.get(i);
			JSONObject shareObject=new JSONObject();
			shareObject.put("Share Name",ob.get("Share Name"));
			shareObject.put("Total stock value ",( (Integer.parseInt(ob.get("Share Price").toString()))*(Integer.parseInt(ob.get("Share Price").toString()))));
			totalStockValue+=( (Integer.parseInt(ob.get("Share Price").toString()))*(Integer.parseInt(ob.get("Share Price").toString())));
			
			shareObjectArray.add(shareObject);
			}
			JSONObject shareObject=new JSONObject();
			shareObject.put("Total stock price",totalStockValue);
			shareObjectArray.add(shareObject);
			
			System.out.println(shareObjectArray);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
