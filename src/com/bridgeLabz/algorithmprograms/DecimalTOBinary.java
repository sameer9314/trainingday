package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To convert Decimal to Binary. 
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class DecimalTOBinary {

	public static void main(String[] args) { 
		Utility obj=new Utility();
		System.out.println("Enter the value in Decimal");
		int deciamlValue=Utility.getInt();
		System.out.println(Utility.toBinary(deciamlValue));
		
	}

} 
