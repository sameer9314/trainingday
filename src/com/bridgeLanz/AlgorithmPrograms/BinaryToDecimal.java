package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To convert Binary to Decimal.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class BinaryToDecimal {

	public static void main(String[] args) {
		Utility obj = new Utility();

		System.out.println("Enter the number ");
		int num = Utility.getInt();

		String s = Utility.toBinary(num);
		
		System.out.println("Decimal format of entered Binary number after swapping nibbles  is :"+ (Utility.findNibbles(s)) );
	}

	

}
