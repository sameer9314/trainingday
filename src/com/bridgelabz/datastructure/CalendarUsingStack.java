package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;
/******************************************************************************
*  Purpose: To print a calendar for the entered month and year by using Stack.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   29-05-2018
*
******************************************************************************/
public class CalendarUsingStack {

	public static void main(String[] args) {
		StackLinkedList stackList1[][]=new StackLinkedList[6][];
		StackLinkedList stackList2[][]=new StackLinkedList[6][];
		for (int i = 0; i < 6; i++) {
			stackList1[i]=new StackLinkedList[7];
			stackList2[i]=new StackLinkedList[7];
			for (int j = 0; j < 7; j++) {
				stackList1[i][j]=new StackLinkedList();
				stackList2[i][j]=new StackLinkedList();;
			}
		}
		Utility obj = new Utility();
		int day = 1;
		System.out.println("Enter month");
		int enteredMonth = Utility.getInt();
		System.out.println("Enter year");
		int enteredyear = Utility.getInt();
		System.out.println();
		Utility.findDay(day, enteredMonth, enteredyear);
		Utility.dateValidate(1, enteredMonth, enteredyear);
		int dateCount = 1;
		int j;
		int count=Calendar.weekDay;
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
				stackList1[i][k].push("");
			}
		}
		for (int i = 0; i < 6; i++) {
			for (j = Calendar.weekDay; j < 7; j++) {
				if (dateCount < Calendar.monthEndDate || (dateCount == Calendar.monthEndDate)) {
					if (dateCount < 10 )
						{stackList1[i][j].pop();
						stackList1[i][j].push(" " + dateCount);}
					else
					{	stackList1[i][j].pop();
						stackList1[i][j].push("" + dateCount);}
					dateCount++;
				}
			}
			Calendar.weekDay = 0;
		}
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
					stackList2[i][k].push(stackList1[i][k].pop());
				}
			}
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("   java calendar " + enteredMonth + " " + enteredyear);
		System.out.println("   "+month[enteredMonth - 1] + "  " + enteredyear);
		System.out.println("   S   M   T   W  TH   F   S");
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
			String date=(String)stackList2[i][k].peek();
				if(date.equals("")==true) {
					System.out.print("    ");}
				else
					System.out.print("  "+date);
				}
			System.out.println();
			}
		}
		
	}


