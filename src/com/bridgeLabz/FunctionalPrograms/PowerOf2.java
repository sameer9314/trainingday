package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
 *  
 *  Purpose: Print the power of table 2 till n.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class PowerOf2 {
	public static void main(String[] args) {
	  //Creating Utility Object	
	  Utility obj=new Utility();       
      int n=Integer.parseInt(args[0]);
      obj.generateTableOfPower2(n);
    }
}


