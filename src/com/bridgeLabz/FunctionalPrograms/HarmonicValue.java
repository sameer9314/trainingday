package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************

 *  
 *  Purpose: To print the harmonic value of nth term..
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class HarmonicValue {
	public static void main(String[] args) {
	   // Utility object created	
	   Utility obj=new Utility();
	   System.out.println("ENTER THE VALUE OF N TO FIND THE HARMONIC VALUE");
	   int n=Utility.getInt();
	   obj.findHarmonicValue(n);
	}

}
