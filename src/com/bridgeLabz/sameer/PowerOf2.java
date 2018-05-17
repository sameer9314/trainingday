/******************************************************************************

 *  
 *  Purpose: Determines Percentage of Heads and Tails
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgeLabz.sameer;

public class PowerOf2 {
	/*
	 * The main function is to  print the table  of the power of 2
	 * 
	 */
   public static void main(String[] args) {
	  Utility obj=new Utility();       
      int n=Integer.parseInt(args[0]);
      obj.powerOf2Method(n);
      }
	}


