package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find whether the entered String is Anagram or Not.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   21-05-2018
*
******************************************************************************/
public class Anagram {
	public static void main(String[] args) {
		//Creating Utility object.
		Utility obj=new Utility();
		
		System.out.println("Enter the first String");
		String firstString=Utility.getString();
		System.out.println("Enter the second String");
		String secondString=Utility.getString();
		
		firstString=Utility.removeSpace(firstString);
		secondString=Utility.removeSpace(secondString);
		
		
		
		if(firstString.length()==secondString.length()) {
			
			firstString=Utility.convertLowerCase(firstString);
			secondString=Utility.convertLowerCase(secondString);
			
			firstString=Utility.bubbleSort(firstString);
			secondString=Utility.bubbleSort(secondString);
			
			Utility.matchString(firstString,secondString);
		}
		else {
			System.out.println("Enterd String is Not Anagram");
		}
	}
}

