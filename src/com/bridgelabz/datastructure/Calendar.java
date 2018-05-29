package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;
/******************************************************************************
*  Purpose: To print a calendar for the entered month and year by using 2D-Array.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   28-05-2018
*
******************************************************************************/
public class Calendar {

	public static int weekDay;
	public static int monthEndDate;

	public static void main(String[] args) {
		Utility obj = new Utility();
		int day = 1;
		System.out.println("Enter month");
		int enteredMonth = Utility.getInt();
		System.out.println("Enter year");
		int enteredyear = Utility.getInt();
		System.out.println();
		Utility.findDay(day, enteredMonth, enteredyear);

	    String[][] calendar = new String[7][7];

		calendar[0][0] = "S ";
		calendar[0][1] = "M ";
		calendar[0][2] = "T ";
		calendar[0][3] = "W ";
		calendar[0][4] = "TH";
		calendar[0][5] = "F ";
		calendar[0][6] = "S ";
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("java calendar " + enteredMonth + " " + enteredyear);
		System.out.println(month[enteredMonth - 1] + "  " + enteredyear);
		System.out.print(" " + calendar[0][0] + "  ");
		System.out.print(calendar[0][1] + "  ");
		System.out.print(calendar[0][2] + "  ");
		System.out.print(calendar[0][3] + "  ");
		System.out.print(calendar[0][4] + "  ");
		System.out.print(calendar[0][5] + "  ");
		System.out.print(calendar[0][6] + "  ");
		System.out.println();

		Utility.dateValidate(1, enteredMonth, enteredyear);
		int dateCount = 1;
		int j;
		for (int i = 1; i < 7; i++) {
			for (int k = 0; k < 7; k++) {
				calendar[i][k] ="";
			}
		}
		for (int i = 1; i < 7; i++) {
			for (j = Calendar.weekDay; j < 7; j++) {
				if (dateCount < Calendar.monthEndDate || (dateCount == Calendar.monthEndDate)) {
					if (dateCount < 10)
						calendar[i][j] = " " + dateCount;
					else
						calendar[i][j] = "" + dateCount;
					dateCount++;
				}
			}
			Calendar.weekDay = 0;
		}
		for (int i = 1; i < 7; i++) {
			for (int k = 0; k < 7; k++) {
				if (calendar[i][k].equals("") == true) {
					System.out.print("  ");
				}
				System.out.print(calendar[i][k] + "  ");
			}
			System.out.println();
		}
	}
}
