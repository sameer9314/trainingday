package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

public class Test {

	public static void main(String[] args) {
	Utility obj=new Utility();
	int a[]= {5,10,1,4,15,3,20};	
	Utility.insertionSort(a);
	Utility.displayArray(a);
	System.out.println();
	System.out.println();
	String name="sameer";
	System.out.println("After insertion :"+Utility.insertionSort(name));
	
	System.out.println();
	System.out.println();
	System.out.println("Testing Binary Search Method of integer");
	Utility.binarySearch(a,0,a.length-1,5);
	Utility.binarySearch(a,0,a.length-1,10);
	Utility.binarySearch(a,0,a.length-1,15);
	Utility.binarySearch(a,0,a.length-1,20);
	Utility.binarySearch(a,0,a.length-1,21); 
	
	
	System.out.println();
	System.out.println();
	char c='s';
	System.out.println("Testing Binary Search Method of String");
	Utility.binarySearch(name,0,name.length()-1,c);
	Utility.binarySearch(name,0,name.length()-1,'a');
	Utility.binarySearch(name,0,name.length()-1,'m');
	Utility.binarySearch(name,0,name.length()-1,'e');
	
	Utility.binarySearch(name,0,name.length()-1,'f');
	String[] s= {"sameer","kunal","rohit","prakash","nawaz","saket"};	
	Utility.mergeSort(s,0,(s.length-1));
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
	}

}
