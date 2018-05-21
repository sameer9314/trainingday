package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

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
	
	static boolean  validatingNumber(int i){
		if(Utility.findPrimenNumber(i)==true) {
				return true;
		}
		else {
			return false;
		}
			
	}
}

