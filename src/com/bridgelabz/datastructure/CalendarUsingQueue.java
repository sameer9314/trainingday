package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To print a calendar for the entered month and year by using Queue.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   28-05-2018
*
******************************************************************************/
public class CalendarUsingQueue {

	public static void main(String[] args) {
	
		QueueLinkedList queueList[][] = new QueueLinkedList[6][];
		for (int i = 0; i < 6; i++) {
			queueList[i] = new QueueLinkedList[7];
			for (int j = 0; j < 7; j++) {
				queueList[i][j] = new QueueLinkedList();
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
				queueList[i][k].enqueue("");
			}
		}
		for (int i = 0; i < 6; i++) {
			for (j = Calendar.weekDay; j < 7; j++) {
				if (dateCount < Calendar.monthEndDate || (dateCount == Calendar.monthEndDate)) {
					if (dateCount < 10 )
						{queueList[i][j].dequeue();
						queueList[i][j].enqueue(" " + dateCount);}
					else
					{	queueList[i][j].dequeue();
						queueList[i][j].enqueue("" + dateCount);}
					dateCount++;
				}
			}
			Calendar.weekDay = 0;
		}
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("   java calendar " + enteredMonth + " " + enteredyear);
		System.out.println("   "+month[enteredMonth - 1] + "  " + enteredyear);
		System.out.println("   S   M   T   W  TH   F   S");
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
			String date=(String)queueList[i][k].dequeue();
				if(date.equals("")==true) {
					System.out.print("    ");}
				else
					System.out.print("  "+date);
				}
			System.out.println();
			}
		}
	}

