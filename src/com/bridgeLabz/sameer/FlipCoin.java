package com.bridgeLabz.sameer;

/******************************************************************************
 * 
 *  Purpose: Determines Percentage of Heads vs Tails.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class FlipCoin {
	public static void main(String[] args) {
	   //Creating Utility Object
	   Utility obj=new Utility();
	   System.out.println("Enter the number , how many times you want to Flip the coin ?");
	   int n=Utility.getInt();
	   obj.findPercentage(n);
	}
}
