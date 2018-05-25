package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find the number which is Prime and Palindrome between 0 and 1000.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class PrimeAndPalindrome extends PrimeNumber { 
	public static void main(String[] args) {
		for(int i=0;i<=1000;i++) {
			if(PrimeNumber.validatingNumber(i)==true) {
				if( Utility.checkPalindrome(i)==true) {
					System.out.println(i);
				}
			}
		}
		
	}
}
