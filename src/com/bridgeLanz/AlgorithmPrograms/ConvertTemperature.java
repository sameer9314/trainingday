package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

public class ConvertTemperature {
	public static void main(String [] args) {
		Utility obj=new Utility();
		System.out.println("Enter your choice");
		System.out.println("Enter 1 to convert Celsius to Fahrenheit ");
		System.out.println("Enter 2 to convert Fahrenheit to Celsius ");
		int choice=Utility.getInt();
		
		switch(choice) {
		case 1 : System.out.println("Enter the value of temperature in Celsius");
				 int celsius=Utility.getInt();
				 Utility.temperatureConversion(celsius,0);
				 break;
		case 2 : System.out.println("Enter the value of temperature in Fahrenheit");
				 int fahrenheit=Utility.getInt();	
			     Utility.temperatureConversion(0,fahrenheit);
				 break;
		default : System.out.println("Wrong choice");		 
		}
	}

}
