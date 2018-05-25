package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

public class GenericTest {

	public static void main(String[] args) {
		Utility obj = new Utility();
		Integer[] a = { 9, 5, 8 };
		String[] b = { "abhi", "sam", "rohan" };
		Character[] c = { 's', 'a', 'm' };
		// Bubble Sort
		System.out.println("Bubble sort");
		Utility.bubbleSortGeneric(c);
		Utility.bubbleSortGeneric(b);
		a = Utility.bubbleSortGeneric(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) { 
			System.out.print(c[i]);
		}
		System.out.println();
		System.out.println();
		
		// insertion sort
		Integer[] d = { 19, 25, 68 };
		String[] e = { "abhi", "sam", "rohan" };
		Character[] f = { 'a', 'n', 'e' };
		System.out.println("Insertion sort");
		Utility.insertionSortGeneric(d);
		Utility.insertionSortGeneric(e);
		Utility.insertionSortGeneric(f);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]);
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]);
		}
		System.out.println();
		System.out.println();
	
		// Binary Search
		System.out.println("Binary Search");
		Integer [] h = {39,25,68};
		String[] i = { "abhi", "sam", "rohan" };
		Character[] j = { 'a', 'n', 'e' };
		Utility.binarySearchGeneric(h,0,h.length-1,25);
		Utility.binarySearchGeneric(i,0,i.length-1,"rohan");
		Utility.binarySearchGeneric(j,0,j.length-1,'e');
	}

}
