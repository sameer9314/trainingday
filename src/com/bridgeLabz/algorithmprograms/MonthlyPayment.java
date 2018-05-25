package com.bridgeLabz.algorithmprograms;

/******************************************************************************
*  Purpose: To find the Monthly payments.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class MonthlyPayment {

	public static void main(String[] args) {
		 double p=Integer.parseInt(args[0]);
		 double y=Integer.parseInt(args[1]);
		 double r=Integer.parseInt(args[2]);
		  
		 double n=12*y;
		 double r0=r/(12*100);
		 
		double payment=( (p*r0)/( 1-Math.pow((1+r0),(-n)) ) );
		
		System.out.println("Monthly Payments : "+payment);
				 
	}

}
