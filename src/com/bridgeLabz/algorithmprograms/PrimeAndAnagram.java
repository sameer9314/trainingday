package com.bridgeLabz.algorithmprograms;

import java.util.ArrayList;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find the Prime Number and its Anagram between 0 and 1000.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   24-05-2018
*
******************************************************************************/
public class PrimeAndAnagram {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<=1000;i++) { 
			if(PrimeNumber.validatingNumber(i)==true) {
				l.add(i);
			}
		}
		 System.out.println("Prime Anagram Numbers are: ");
	        for (int i = 0; i < l.size()-1; i++) {
	            for (int j = i + 1; j < l.size(); j++) {
	                if (Utility.isAnagram( (""+l.get(i)),(""+l.get(j)) ) ){
	                    System.out.println(l.get(i)+ " and " +l.get(j) + " are Anagram");
	                }
	            }
	        }
	    }
	}


