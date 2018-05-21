package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

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
