package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find the Guessed number by the user with the help of Binary search algorithm.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class GuessingGame {
	
	public static void main(String[] args) {
		//Creating Utility object
		 Utility obj=new Utility();
		 
		 int num=Integer.parseInt(args[0]);
		 num=(int)Math.pow(2,num);
		 int array[]=new int[num];
		 for(int i=0;i<num;i++) {
			 array[i]=i;
		 }
		 Utility.guessNumber(array,0,array.length-1);
	}
}
