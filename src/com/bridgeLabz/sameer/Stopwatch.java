package com.bridgeLabz.sameer;

/******************************************************************************
 * 
 *  Purpose: Determines the Elapsed time.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
class Stopwatch {
    public static void main(String[] args) {
    	
    	// Creating Utility object
    	Utility obj=new Utility();
    	
    	System.out.println("Press 1 to start the Stopwatch");
    	int choice=Utility.getInt();
    	obj.findElapsedTime(choice);
    }
}