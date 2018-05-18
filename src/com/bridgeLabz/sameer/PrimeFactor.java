package com.bridgeLabz.sameer;

/******************************************************************************

 *  
 *  Purpose: To find the Prime factors of given number.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class PrimeFactor {
	public static void main(String[] args) {
		// Utility object created
		Utility obj=new Utility();
		System.out.println("ENTER THE NUMBER TO FIND THE PRIME FACTORS");
		int num=Utility.getInt();
		obj.findPrimeFactor(num);
	}
}
