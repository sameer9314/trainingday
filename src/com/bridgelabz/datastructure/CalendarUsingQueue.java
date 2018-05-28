package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;

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
		int enteredMonth = Utility.getInt();
		int enteredyear = Utility.getInt();

		Utility.findDay(day, enteredMonth, enteredyear);

		System.out.println("week day " + Calendar.weekDay);
		Utility.dateValidate(1, enteredMonth, enteredyear);
		// System.out.println(Calendar.monthEndDate);
		int dateCount = 1;
		int j;
		int count=Calendar.weekDay;
		for (int i = 1; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
				queueList[i][k].enqueue(" ");
			}
		}
		for (int i = 0; i < 6; i++) {
			for (j = Calendar.weekDay; j < 7; j++) {
				if (dateCount < Calendar.monthEndDate || (dateCount == Calendar.monthEndDate)) {
					if (dateCount < 10 )
						queueList[i][j].enqueue(" " + dateCount);
					else
						queueList[i][j].enqueue("" + dateCount);
					dateCount++;
				}
			}
			Calendar.weekDay = 0;
		}
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("java calendar " + enteredMonth + " " + enteredyear);
		System.out.println(month[enteredMonth - 1] + "  " + enteredyear);
		System.out.println("   S    M    T    W   TH    F   S");
		for (int i =0; i <= (count*3)-2; i++) {
			System.out.print("  ");
		}
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
				queueList[i][k].display();
			}
			System.out.println();
		}
	}
}
