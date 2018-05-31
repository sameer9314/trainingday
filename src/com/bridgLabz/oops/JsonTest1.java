package com.bridgLabz.oops;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JsonTest1 {
	public static void main(String[] args) {
	//	JSONParser parser=new JSONParser();
		JSONObject students=new JSONObject();
		students.put("Name","sameer");
		students.put("Age","25");
		System.out.println(students.get("Name"));
		System.out.println(students.get("Age"));
		System.out.println(students);
//		JSONArray s= new JSONArray();
//		s.put(students);
    
//		try{
//    	Object obj1 = parser.parse(s);
//       System.out.println(obj);
//    }catch(ParseException pe){
//		
//       System.out.println("position: " + pe.getPosition());
//       System.out.println(pe);
//    }
//		  for (Object o : a)
//		  {
//		    JSONObject Student = (JSONObject) o;
//
//		    String name = (String) Student.get("name");
//		    System.out.println(name);
//
//		    String city = (String) Student.get("city");
//		    System.out.println(city);
//
//		    String job = (String) Student.get("job");
//		    System.out.println(job);
//		  }
		//Iterator it=stud.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		/*******************************************************************************/
//		for(int i=0;i<Rice.size();i++) {
//		JSONObject a=(JSONObject)Rice.get(i);
//					System.out.println("Name : "+a.get("name"));
//					System.out.println("Weight :"+a.get("weight"));
//					System.out.println("Price per Kg :"+a.get("pricePerKg"));
//		}
 }
}
