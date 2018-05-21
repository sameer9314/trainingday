package com.bridgeLanz.AlgorithmPrograms;

public class MonthlyPayment {

	public static void main(String[] args) {
		 double p=Integer.parseInt(args[0]);
		 double y=Integer.parseInt(args[1]);
		 double r=Integer.parseInt(args[2]);
		  
		 double n=12*y;
		 double r0=r/(12*100);
		 
		double payment=( (p*r)/( 1-Math.pow((1+r),(-n)) ) );
		
		System.out.println("Monthly Payments : "+payment);
				 
	}

}
