package com.bridgLabz.oops;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonTest {
	  
	public static void main(String[] args)  {
		JSONParser parser = new JSONParser();

		try {
		Object b= parser.parse(new FileReader("/home/administrator/eclipse-workspace/Funtional_Programs/test.json"));
		JSONObject obj=(JSONObject)b;
		JSONArray Rice=(JSONArray) obj.get("Rice");

		for(int i=0;i<Rice.size();i++) {
			JSONObject a=(JSONObject)Rice.get(i);
			System.out.println(a.get("name"));
		}
		  }catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}
}
