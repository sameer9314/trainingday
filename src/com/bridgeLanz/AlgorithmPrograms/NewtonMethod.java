package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find the square root using NewtonMethod.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class NewtonMethod {

	public static void main(String[] args) {
		Utility obj=new Utility();
		System.out.println("Enter the number to find the square root ");
		double c=Utility.getInt();
		
		Utility.findSquareRoot(c);
	}
	
	

}
