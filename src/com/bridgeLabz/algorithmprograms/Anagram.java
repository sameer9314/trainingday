package com.bridgeLabz.algorithmprograms;

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
		
		
		Utility.checkAnagram(firstString,secondString);
	}
}

