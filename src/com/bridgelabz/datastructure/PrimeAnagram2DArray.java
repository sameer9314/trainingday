package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;
import com.bridgeLabz.algorithmprograms.PrimeNumber;
/******************************************************************************
*  Purpose: To print a Prime and Anagram number between 0 and 1000 in 2D-Array.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   28-05-2018
*
******************************************************************************/
public class PrimeAnagram2DArray {
	public static void main(String[] args) {
		MyLinkedList array[][] = new MyLinkedList[11][];
		
		for (int i = 0; i < 10; i++) {
			array[i] = new MyLinkedList[100];
			for (int j = 0; j < 100; j++) {
				array[i][j] = new MyLinkedList();
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 100 * i; j < 100 * (i + 1) - 1; j++) {
				int k = 0;
				if (PrimeNumber.validatingNumber(j) == true) {
					for (int m = j + 1; m < 100 * (i + 1); m++) {
						if (Utility.isAnagram(("" +j), ("" + m)) == true) {
							array[i][k].add(j);
							k++;
						}
					}
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("");
			System.out.print(i+" "+" | ");
			for (int j = 0; j < 100; j++) {
				
				array[i][j].display();
			}
			System.out.println();
		}
	}
}
