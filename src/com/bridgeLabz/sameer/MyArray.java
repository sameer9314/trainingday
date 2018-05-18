package com.bridgeLabz.sameer;

/******************************************************************************
*  Purpose: To initialise 2D- Array index with integer value
*  And display the elemnts in Matrix Format		    		 	
* 
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   17-05-2018
*
******************************************************************************/
public class MyArray {
     public static void main(String[] args) {  
	 //Utility object created
     Utility obj=new Utility();
	
	 System.out.println("Enter the value of row");
	 int row=Utility.getInt();             
	 System.out.println("Enter the value of column");
	 int column=Utility.getInt(); 
	 int[][] array =new int[row][column];
	  
	 obj.arrayInit(array);
	 obj.displayArray(array);
   }
   
}
