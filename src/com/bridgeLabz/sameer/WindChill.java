package com.bridgeLabz.sameer;

/******************************************************************************
 * 
 *  Purpose: Determine the wind chill.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class WindChill {
	public static void main(String[] args) {
		// Creating Utility object
		Utility obj=new Utility();
		
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		obj.findWindChill(t,v);
   }
}
