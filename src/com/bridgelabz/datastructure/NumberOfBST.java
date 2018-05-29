package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;
/******************************************************************************
*  Purpose: To find the number of binary search tree of the given number of nodes.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   29-05-2018
*
******************************************************************************/
public class NumberOfBST {

	public static void main(String[] args) {
		Utility obj=new Utility();
		System.out.println("Enter the number of test cases : ");
		int noOfTestCases=Utility.getInt();
		int [] array=new int[noOfTestCases];
		for(int i=0;i<noOfTestCases;i++) {
			System.out.println("Enter  test case "+(i+1));
			array[i]=Utility.catalanMethod(Utility.getInt());
		}
		System.out.println("Number of binary search tree of the entered test cases are as follows : ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	
}
