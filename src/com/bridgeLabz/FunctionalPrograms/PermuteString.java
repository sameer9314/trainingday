package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To permute the given String.    		 	
* 
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   17-05-2018
*
******************************************************************************/
public class PermuteString {

	public static void main(String[] args) {
		//Creating Utility object
		Utility obj=new Utility();
		
		System.out.println("Enter the String you want to permute");
		obj.findStringPermutation(Utility.getString());
	}

}
