package com.bridgeLabz.sameer;

/******************************************************************************
*  Purpose: To find the Euclidean distance from the given point (x,y) .	    		 	
* 			And to display Euclidean distance from the given point.
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   17-05-2018
*
******************************************************************************/
public class Distance {
	public static void main(String[] args) {
		//Utility object created
		Utility obj=new Utility();
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		obj.findDistance(x,y);
	}
	
}
