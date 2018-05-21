package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To print the number of distinct triplets and
*  		    print the distinct triplets. 
*  
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   17-05-2018
*
******************************************************************************/
public class DistinctTriplets {
	public static void main(String[] args) {
	//Utility object created
	Utility obj=new Utility();
	System.out.println("Enter the value of N number of integers");
	int numberOfIntegers=Utility.getInt();
	int array [] = new int[numberOfIntegers];
	
	System.out.println("Enter the elements of an Array");
	Utility.arrayInit(array);
	Utility.displayArray(array);
	
	System.out.println();
	obj.findDistinctTriplet(array);
		
	}
	
}
