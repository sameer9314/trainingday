package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;

public class Prime2DArray {

	public static void main(String[] args) {

		MyLinkedList array[][] = new MyLinkedList[11][];
		for (int i = 0; i < 10; i++) {
			array[i] = new MyLinkedList[100];
			for (int j = 0; j < 100; j++) {
				array[i][j] = new MyLinkedList();
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 100 * i; j < 100 * (i + 1); j++) {
				int k = 0;
				if (Utility.findPrimenNumber(j) == true) {
					array[i][k].add(j);
					k++;
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
