package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find the Prime Number between 0 and 1000.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class PrimeNumber {
	public static void main(String[] args) {
		//Creating Utility obj 
		Utility obj=new Utility();
		
		System.out.println("Printing all the Prime numbers between 0 and 1000");
		
		for(int i=0;i<=1000;i++) {
			if(PrimeNumber.validatingNumber(i)==true) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean  validatingNumber(int i){
		if(Utility.findPrimenNumber(i)==true) {
				return true;
		}
		else {
			return false;
		}
			
	}
}

