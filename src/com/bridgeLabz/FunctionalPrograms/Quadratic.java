package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
 * 
 *  Purpose: Determines the roots of the Quadratic equation.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class Quadratic {
	public static void main(String[] args) {
		// Creating Utility object
		Utility obj=new Utility();
		System.out.println("Enter the value of a");
		int a=Utility.getInt();
		System.out.println("Enter the value of b");
	    int b=Utility.getInt();
	    System.out.println("Enter the value of c");
	    int c=Utility.getInt();

	   obj.findQuadraticRoots(a,b,c);

	}
	
	
}
