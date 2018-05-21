package com.bridgeLabz.sameer;

/******************************************************************************
*  Purpose: Replace the <<username>> from the given template.

*  @author  Sameer Saurabh
*  @version 1.0
*  @since   17-05-2018
*
******************************************************************************/
public class ReplaceString {
	public static void main(String[] args) {
		//Creating Utility object
		Utility obj=new Utility();
		
		System.out.println("Enter user name");
		String userName=Utility.getString();
		System.out.println(obj.replaceString(userName));
	}
}