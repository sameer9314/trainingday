package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgeLabz.Utility.Utility;
import com.bridgeLabz.algorithmprograms.PrimeNumber;

public class PrimeAnagramStack {

	public static void main(String[] args) {
		Stack s=Stack.stack();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<=1000;i++) { 
			if(PrimeNumber.validatingNumber(i)==true) {
				l.add(i);
			}
		}
		 System.out.println("Prime Anagram Numbers are: ");
	        for (int i = 0; i < l.size()-1; i++) {
	            for (int j = i + 1; j < l.size(); j++) {
	                if (Utility.isAnagram( (""+l.get(i)),(""+l.get(j)) )==true ){
	                   // System.out.println(l.get(i)+ " and " +l.get(j) + " are Anagram");
	                   s.push(l.get(i));
	                   s.push(l.get(j));
	                }
	            }
	        }
	       // System.out.println(s.size());
	        s.display();
	    }

	}


