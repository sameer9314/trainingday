package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To find the number of currencies by the help of Vending Machine .
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   22-05-2018
*
******************************************************************************/
public class VendingMachine {
	static int count = 0;

	public static void main(String[] args) {
		Utility obj = new Utility();
		System.out.println("Enter the amount in Rs to withdraw from your Account ");
		int amount = Utility.getInt();
		int noteCount = 1;
		int a[] = { 1, 2, 5, 10,20, 50, 100, 500, 1000,2000 };
		for (int i = a.length - 1; i >= 0; i--) {
			count = 0;
			if (amount != 0) {
				if (findingMaxCurrencyNote(a[i], amount) == true) {
					while ((a[i] * noteCount) <= amount) {
						++noteCount;
					}
					amount = amount - a[i] * (noteCount - 1);
					System.out.println("Number of "+a[i] + " note  is : " + (noteCount - 1));
				}
			}
			noteCount = 1;
		}
	}

	public static boolean findingMaxCurrencyNote(int a, int amount) {
		if (count == a)
			return true;
		amount--;
		count++;
		if (amount != 0) {
			findingMaxCurrencyNote(a, amount);
		}
		if (count != a)
			return false;
		else {
			return true;
		}
	}
}
