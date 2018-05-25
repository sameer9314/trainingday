package com.bridgeLabz.algorithmprograms;

import com.bridgeLabz.Utility.Utility;

/*******************************************************************
 * Purpose: To find the day at the particular entered Date.
 * 
 * @author Sameer Saurabh
 *	@version 1.0
 *  @since   23-05-2018
 *******************************************************************/
public class DayofWeek { 
	public static void main(String[] args) {
		  int day=Integer.parseInt(args[0]);
		  int month=Integer.parseInt(args[1]);
		  int year=Integer.parseInt(args[2]);
		  Utility.dateValidate(day,month,year);
	}
}
