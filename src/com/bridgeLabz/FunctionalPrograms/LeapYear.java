package com.bridgeLabz.FunctionalPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************

 *  
 *  Purpose: Determines whether year is leap or not.
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class LeapYear {
	public static void main(String[] args) {
		//Creating Utility Object
	    Utility obj=new Utility();
	    System.out.println("Enter the year to check");
		int year=Utility.getInt();
	    obj.findLeapYear(year);
	}
}

