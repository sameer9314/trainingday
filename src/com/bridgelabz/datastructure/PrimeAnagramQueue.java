package com.bridgelabz.datastructure;

import java.util.ArrayList;
/******************************************************************************
*  Purpose: To print a Prime and Anagram number between 0 and 1000 in Queue.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   28-05-2018
*
******************************************************************************/

import com.bridgeLabz.Utility.*;
import com.bridgeLabz.algorithmprograms.PrimeNumber;
public class PrimeAnagramQueue {

	public static void main(String[] args) {
		QueueLinkedList q=QueueLinkedList.queue();
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
	                    q.enqueue(l.get(i));
	                    q.enqueue(l.get(j));
	                }
	            }
	        }
	        q.display();
	    }

}
