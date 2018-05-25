package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To get the total number of times
*		    random number method  needed to call
*		    to store distinct random number in given array size.		 	
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   17-05-2018
*
******************************************************************************/
public class CoupanNumber {
	/*
	 * Static Variable is declared to count the number of distinct elements added to array.
	 */
	public static int distinctElementcount=0;
	public static void main(String[] args) {
    	// Utility object created
		Utility obj=new Utility(); 
		
		System.out.println("Enter the value of Distinct coupan numbers");
	    int distinctCoupanNumber=Utility.getInt();
		obj.generateCoupan(distinctCoupanNumber);
	 }
}
