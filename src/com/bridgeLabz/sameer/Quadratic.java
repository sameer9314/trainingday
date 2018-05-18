package com.bridgeLabz.sameer;

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
		int a=Utility.getInt();
	    int b=Utility.getInt();
	    int c=Utility.getInt();

	   obj.findQuadraticRoots(a,b,c);

	}
	
	
}
