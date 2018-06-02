/******************************************************************************

 *  
 *  Purpose: 
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgeLabz.Utility;

import java.util.Scanner;

import com.bridgeLabz.FunctionalPrograms.CoupanNumber;
import com.bridgeLabz.FunctionalPrograms.Gambler;
import com.bridgeLabz.FunctionalPrograms.Tic­Tac­Toe;
import com.bridgeLabz.algorithmprograms.BinaryToDecimal;
import com.bridgelabz.datastructure.Calendar;

import java.util.Arrays;
import java.util.Random;

public class Utility {

	private static Scanner scnObj = null;

	public Utility() {
		scnObj = new Scanner(System.in);
	}

	/**********************************
	 * Head vs Tails
	 **********************************/
	/**
	 * Function to calculate the Percentage of Heads vs Tails.
	 *
	 * @param n the integer to flip the coins for n times.
	 */
	public void findPercentage(int n) {
		int tails = 0;
		int heads = 0;
		for (int i = 1; i <= n; i++) {
			double value = Math.random();
			if (value < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}
		double per = (heads * 100) / n;
		System.out.println("PERCENTAGE OF HEAD vs TAILS is : " + per);
		scnObj.close();
	}

	/*************************************
	 * Leap Year
	 ************************************/
	/**
	 * Function to find whether year is leap or not.
	 *
	 * @param year the integer to find the leap year.
	 */
	public void findLeapYear(int year) {
		if (year > 999 && year <= 9999) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
				System.out.println("Leap Year");
			} else {
				System.out.println("NOT A LEAP YEAR");
			}
		} else {
			System.out.println("NOT A VALID YEAR");
		}
		scnObj.close();
	}

	/*************************************
	 * Power of table 2
	 *************************************/
	/**
	 * Function to print the power of table 2.
	 *
	 * @param n the intger to print the power of table 2 till n.
	 */
	public void generateTableOfPower2(int n) {
		int value = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				value *= 2;
			}
			System.out.println(value);
			value = 1;
		}
	}

	/***********************************
	 * Harmonic Value
	 ***********************************/
	/**
	 * Function to find the harmonic value of nth term.
	 *
	 * @param n the integer to find the harmonic value till n.
	 */
	public void findHarmonicValue(int n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}
		System.out.print(n + "th HARMONIC VALUE IS : " + sum);
		scnObj.close();
	}

	/**************************************
	 * Prime Factor
	 *************************************/
	/**
	 * Function to find the Prime factors of given number.
	 *
	 * @param num the integer to find the prime factor.
	 */
	public void findPrimeFactor(int num) {
		String s = "";
		int newNum = num;
		for (int i = 2; i * i <= newNum; i++) {
			while (num % i == 0) {
				num = num / i;
				s += i + " ";
			}
		}
		if (num > 1) {
			s += num;
		}
		System.out.println("PRIME FACTOR(S) OF " + newNum + " : " + s);
		scnObj.close();
	}

	/****************************************
	 * Play Gambler Game
	 ****************************************/
	/**
	 * Function is written to determines number of times of Wins and Percentage of
	 * Win And Loss
	 *
	 * @param stake the integer to take the stake input.
	 * 
	 * @param goal the integer to take the goal input.
	 * 
	 * @param numberOfTimes the integer to take the input for number Of Times to
	 * play.
	 */
	public void playGambler(int stake, int goal, int numberOfTimes) {
		for (int i = 1; i <= numberOfTimes; i++) {
			double generatedRandomNumber = Math.random();
			if (generatedRandomNumber > 0.5) {
				Gambler.mstakeWinCount++;
				stake++;
			} else {
				Gambler.mstakeLossCount++;
				stake--;
			}
			if (stake == goal) {
				break;
			} else if (stake == 0) {
				break;
			}
		}
		System.out.println("Number of wins are : " + Gambler.mstakeWinCount);
		System.out.println("Number of Loss are : " + Gambler.mstakeLossCount);
		System.out.println("Wins percentage is : " + ((Gambler.mstakeWinCount * 100) 
				/ numberOfTimes));
		System.out.println("Loss percentage is : " + ((Gambler.mstakeLossCount * 100) 
				/ numberOfTimes));
		scnObj.close();
	}

	/*************************************
	 * Generate Coupan Number
	 *************************************/
	/**
	 * Function is written to get the total number of times random number method
	 * needed to call to store distinct random number in given array size.
	 *
	 * @param distinctCoupanNumber the integer is to get how many distinct coupan
	 * needed to generate.
	 */
	public void generateCoupan(int distinctCoupanNumber) {
		System.out.println("distinctCoupanNumber is : " + distinctCoupanNumber);
		Random rand = new Random(distinctCoupanNumber);
		int a[] = new int[distinctCoupanNumber];
		int rand_int;
		int arrayIndex = 0; 
		int totalRandomNumber = 0;
		while (CoupanNumber.distinctElementcount < distinctCoupanNumber) {
			totalRandomNumber++;
			rand_int = rand.nextInt();
			if (CoupanNumber.distinctElementcount == 0) {
				a[arrayIndex] = rand_int;
				arrayIndex++;
				CoupanNumber.distinctElementcount++;
			} else {
				if ((Utility.checkDistinctElement(a, CoupanNumber.distinctElementcount, rand_int) == true)) {
					CoupanNumber.distinctElementcount++;
					a[arrayIndex] = rand_int;
					arrayIndex++;
				}
			}
		}
		System.out.println("Total random number needed to store " + distinctCoupanNumber
				+ " distinct random numbers in array is : " + totalRandomNumber);
		scnObj.close();
	}

	/*************************************
	 * Check Distinct element in Array
	 *************************************/
	/**
	 * Function is written to whether the generated random number is distinct or
	 * not.
	 *
	 * @param array the integer array to get currently initialised elements in
	 * array.
	 * 
	 * @param distinctElementcount the integer to know number of distinct element
	 * added in array.
	 * 
	 * @param randInt the integer is generate random number.
	 */
	public static boolean checkDistinctElement(int a[], int distinctElementcount, int randInt) {
		for (int i = 0; i < distinctElementcount; i++) {
			if (a[i] == randInt) {
				return false;
			}
		}
		return true;
	}

	/*****************************************
	 * Generate one Integer
	 *****************************************/
	/**
	 * Function is written to generate one integer number.
	 */
	public static int getInt() {
		return scnObj.nextInt();
	}

	/****************************************
	 * Generate one String
	 ****************************************/
	/**
	 * Function is written to generate one String.
	 */
	public static String getString() {
		return scnObj.next();
	}
	
	/**
	 * Function is written to generate one String.
	 */
	public static String getStringLine() {
		return scnObj.nextLine();
	}

	/*****************************************
	 * Generate one character value
	 *****************************************/
	/**
	 * Function is written to generate one Char.
	 */
	public static char getChar() {
		return scnObj.next().charAt(0);
	}

	/*************************************
	 * 2-D Array Initialisation
	 **************************************/
	/**
	 * Function is written to initialise 2D- Array index with integer value.
	 *
	 * @param array the 2-D integer Array to initialise its element.
	 */
	public static void arrayInit(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = Utility.getInt();
			}
		}
	}

	/*************************************
	 * 2-D Array Display
	 *************************************/
	/**
	 * Function is written to display 2D- Array elements
	 * 
	 * @param array the 2-D integer Array to display its elemnts.
	 */
	public static void displayArray(int[][] a) {
		System.out.println("Displaying your Array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}

	/****************************************
	 * 1-D Array Initialisation
	 ****************************************/
	/**
	 * Function is written to initialise Array index with integer value.
	 *
	 * @param array the 1-D integer array to initiaise its element.
	 */
	public static void arrayInit(int[] a) {
		System.out.println("Enter the elements of an array ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Utility.getInt();
		}
	}

	/*********************************************
	 * 1-D Array Display
	 *********************************************/
	/**
	 * Function is written to display Array elements
	 * 
	 * @param array the 1-D integer array to display its element.
	 */
	public static void displayArray(int[] a) {
		System.out.println("Displaying your Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/****************************************
	 * Distinct triplet
	 ****************************************/
	/**
	 * Function is written to find the number of triplets whose sum is equal to
	 * zero. And to display triplets combinations and number of triplets.
	 * 
	 * @param array the 1-D Array to find all the distinct triplets element in the
	 * array.
	 */
	public void findDistinctTriplet(int[] array) {
		System.out.println("Finding the combination of triplets whose sum is equal to zero......");
		int tripletCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 2) {
				for (int j = i + 1; j < array.length - 1; j++) {
					for (int k = j + 1; k < array.length; k++) {
						if (array[i] + array[j] + array[k] == 0) {
							tripletCount++;
							System.out.println(array[i] + " " + array[j] + " " + array[k] + " = " + 0);
						}
					}
				}
			}
		}
		if (tripletCount == 0)
			System.out.println("No triplet combination found : ");
		else
			System.out.println("Combination found : ");
		System.out.println("Total number of triplets found is : " + tripletCount);
	}

	/*******************************************
	 * Euclidean Distance
	 *******************************************/
	/**
	 * Function is written to find the Euclidean distance from the given point (x,y)
	 * . And to display Euclidean distance from the given point.
	 * 
	 * @param x and y the integers to get the find the distance from the origin.
	 */
	public void findDistance(int x, int y) {
		System.out.println("Euclidean distance from the given point(" + x + "," + y + ") is : "
				+ Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	/*****************************************
	 * Roots of the quadratic equation
	 *****************************************/

	/**
	 * Function is written to find the roots of the quadratic equation. And to
	 * display Euclidean distance from the given point.
	 * 
	 * @param a,b,c the integers number.
	 */
	public void findQuadraticRoots(int a, int b, int c) {
		double delta = b * b - 4 * a * c;

		double roots1 = (-b + Math.sqrt(delta)) / (2 * a);
		double roots2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("Root 1 of x is :" + roots1);
		System.out.println("Root 2 of x is :" + roots2);
	}

	/*********************************************
	 * Wind Chill
	 *********************************************/

	/**
	 * Function is written to find the wind chill.
	 *
	 * @param t the integer input for temperature.
	 * 
	 * @param v the integer input for wind speed.
	 */
	public void findWindChill(double t, double v) {
		if (t < 50 && v < 120 && v > 3) {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Given temperature is : " + t);
			System.out.println("Given wind speed is : " + v);
			System.out.println("Wind chill is : " + w);
		} else {
			System.out.println("Wrong Inputs");
		}
	}

	/*****************************************
	 * Elapsed time
	 ******************************************/
	/**
	 * Function is written to find the elapsed time between starting time and
	 * ennding time.
	 *
	 * @param t the integer input for temperature.
	 * 
	 * @param v thr integer input for wind speed.
	 */
	public void findElapsedTime(int choice) {
		long startTime = 0;
		long endTime = 0;
		int flag = 0;
		while (flag == 0) {
			switch (choice) {
			case 1:
				startTime = System.nanoTime(); // Get the current system time in nano second.
				System.out.println("Press 0 to stop the Stopwatch");
				choice = Utility.getInt();
				break;

			case 0:
				endTime = System.nanoTime(); // Get the current system time in nano second.
				flag = 1;
			}
		}
		System.out.println("Start time is : " + startTime);
		System.out.println("End time is : " + endTime);
		System.out.println("Elapsed Time is : " + (endTime - startTime)/1000000000+" s");
	}

	/*******************************************
	 * Replace String
	 *******************************************/
	/**
	 * Function is written to replace the <<username>> from the given template.
	 * board[0][0]='x'; board[0][0]='x';
	 * 
	 * @param userName the String input for <<username>>.
	 * 
	 * @return templates after
	 * replacihttps://github.com/sameer9314/trainingday.gitng the <<userName>> from
	 * the template with the entered String.
	 */
	public String replaceString(String userName) {
		String template = "Hello <<username>>, How are you?";
		String output = "";
		if (userName.length() < 3) {
			System.out.println("username should contain minimum three character atleast !");
		} else {
			output = template.replaceAll("<<username>>", userName);
		}
		return output;
	}

	/************************************************
	 * String Permutation
	 ************************************************/
	/**
	 * Function is written to find all permutation of a given String.
	 *
	 * @param inputString the String input to permute the String.
	 * 
	 */
	public void findStringPermutation(String inputString) {
		findStringPermutation("", inputString);
	}

	static void findStringPermutation(String permute, String inputString) {
		if (inputString.length() == 0) {
			System.out.println(permute);
		} else {
			for (int i = 0; i < inputString.length(); i++) {
				Utility.findStringPermutation(permute + inputString.charAt(i),
						inputString.substring(0, i) + inputString.substring(i + 1, inputString.length()));
			}
		}
	}

	/********************************************
	 * Tic-Tac-Toe
	 ********************************************/
	// Assigning n as a null to the elements of the array.
	public static void defaultBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Tic­Tac­Toe.board[i][j] = ' ';
			}
		}
	}

	/***********************************************************************************************************************************/
	public static void printBoard(char board[][]) {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("| " + board[i][j] + " ");
			}
			System.out.println("|");
			System.out.print("-------------");
			System.out.println();
		}
	}

	/*************************************************************************************************************************************/
	public static void playGame() {
		// char user=Utility.getChar();
		Utility obj = new Utility();
		System.out.println("Enter 1 for 'x'");
		System.out.println("Enter 2 for 'o'");
		int choice = Utility.getInt();

		// conditon to decide the choice choosen by the user.
		if (choice == 1) {
			System.out.println("User is x");
			System.out.println("Comp is o");
			Tic­Tac­Toe.user = 'x';
			Tic­Tac­Toe.comp = 'o';
		} else {
			System.out.println("User is o");
			System.out.println("Comp is x");
			Tic­Tac­Toe.comp = 'x';
			Tic­Tac­Toe.user = 'o';
		}

		// condition to decide who will start the game
		if (Math.random() > 0.5) {
			System.out.println("User win the toss");
			System.out.println("User will start the game");
			Utility.userTurn(Tic­Tac­Toe.user);
		} else {
			System.out.println("Computer win the toss");
			System.out.println("Computer will start the game");
			Utility.compTurn(Tic­Tac­Toe.comp);
		}

	}

	/**************************************************************************************************************************************/
	public static void userTurn(char user) {
		if (Tic­Tac­Toe.countValueEntered < 9) {
			while (Tic­Tac­Toe.valueEntered == false) {
				System.out.println("Enter the row");
				int row = Utility.getInt();
				System.out.println("Enter the column");
				int col = Utility.getInt();
				if (Utility.checkEmptyIndex(row, col) == true) {
					Tic­Tac­Toe.countValueEntered++;
					Tic­Tac­Toe.board[row][col] = user;
					Utility.findWinner(Tic­Tac­Toe.board);
					Tic­Tac­Toe.valueEntered = true;
					Utility.printBoard(Tic­Tac­Toe.board);
					System.out.println();
					if (Tic­Tac­Toe.countValueEntered != 9)
						System.out.println("Computer turn");
				} else {
					System.out.println("Entered index is not empty");
					Utility.printBoard(Tic­Tac­Toe.board);
					System.out.println("Please enter the empty index for row and col");
				}
			}
			Tic­Tac­Toe.valueEntered = false;
			if (Tic­Tac­Toe.countValueEntered < 9) {
				while (Tic­Tac­Toe.winStatus == false) {
					Utility.compTurn(Tic­Tac­Toe.comp);
				}
			} else if (Tic­Tac­Toe.countValueEntered == 9) {
				System.out.println("Game is Draw");
			}
		} else {
			System.exit(0);
		}
	}

	/******************************************************************************************************************************************/
	public static void compTurn(char comp) {

		if (Tic­Tac­Toe.countValueEntered < 9) {
			while (Tic­Tac­Toe.valueEntered == false) {
				Random randomNumber = new Random();
				int row = randomNumber.nextInt(3);
				int col = randomNumber.nextInt(3);
				if (Utility.checkEmptyIndex(row, col) == true) {
					Tic­Tac­Toe.countValueEntered++;
					Tic­Tac­Toe.board[row][col] = comp;
					Utility.findWinner(Tic­Tac­Toe.board);
					Tic­Tac­Toe.valueEntered = true;
					Utility.printBoard(Tic­Tac­Toe.board);
					if (Tic­Tac­Toe.countValueEntered != 9)
						System.out.println("User turn");
				}
			}
			Tic­Tac­Toe.valueEntered = false;

			if (Tic­Tac­Toe.countValueEntered < 9) {
				while (Tic­Tac­Toe.winStatus == false) {
					Utility.userTurn(Tic­Tac­Toe.user);
				}
			} else {
				System.out.println("Game is Draw");
			}
		} else {
			System.exit(0);
		}
	}

	/******************************************************************************************************************************************/
	public static boolean checkEmptyIndex(int row, int col) {
		if (Tic­Tac­Toe.board[row][col] == ' ') {
			return true;
		} else {
			return false;
		}
	}

	/******************************************************************************************************************************************/
	// To check winning criteria.
	public static void findWinner(char board[][]) {

		if (board[0][0] == Tic­Tac­Toe.user && board[0][1] == Tic­Tac­Toe.user && board[0][2] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[0][0] == Tic­Tac­Toe.comp && board[0][1] == Tic­Tac­Toe.comp
				&& board[0][2] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}

		if (board[1][0] == Tic­Tac­Toe.user && board[1][1] == Tic­Tac­Toe.user && board[1][2] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[1][0] == Tic­Tac­Toe.comp && board[1][1] == Tic­Tac­Toe.comp
				&& board[1][2] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}

		if (board[2][0] == Tic­Tac­Toe.user && board[2][1] == Tic­Tac­Toe.user && board[2][2] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[2][0] == Tic­Tac­Toe.comp && board[2][1] == Tic­Tac­Toe.comp
				&& board[2][2] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		}
		/************************************************************************************************/
		if (board[0][0] == Tic­Tac­Toe.user && board[1][0] == Tic­Tac­Toe.user && board[2][0] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);

		} else if (board[0][0] == Tic­Tac­Toe.comp && board[1][0] == Tic­Tac­Toe.comp
				&& board[2][0] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}

		if (board[0][1] == Tic­Tac­Toe.user && board[1][1] == Tic­Tac­Toe.user && board[2][1] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[0][1] == Tic­Tac­Toe.comp && board[1][1] == Tic­Tac­Toe.comp
				&& board[2][1] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}

		if (board[0][2] == Tic­Tac­Toe.user && board[1][2] == Tic­Tac­Toe.user && board[2][2] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[0][1] == Tic­Tac­Toe.comp && board[1][2] == Tic­Tac­Toe.comp
				&& board[2][2] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}
		/*******************************************************************************************/
		if (board[0][0] == Tic­Tac­Toe.user && board[1][1] == Tic­Tac­Toe.user && board[2][2] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[0][0] == Tic­Tac­Toe.comp && board[1][1] == Tic­Tac­Toe.comp
				&& board[2][2] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}
		/*******************************************************************************************/
		if (board[0][2] == Tic­Tac­Toe.user && board[1][1] == Tic­Tac­Toe.user && board[2][0] == Tic­Tac­Toe.user) {
			Utility.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		} else if (board[0][2] == Tic­Tac­Toe.comp && board[1][1] == Tic­Tac­Toe.comp
				&& board[2][0] == Tic­Tac­Toe.comp) {
			Utility.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}
		return;
	}

	/**************************
	 * Tic-Tac-toe Ends
	 **************************/

	/*******************************************
	 * Algorith Programs
	 *******************************************/

	/****************************************
	 * Bubble Sort for String
	 ****************************************/
	/**
	 * Function is written to sort the string using bubble sort algorithm.
	 * 
	 * @param firstString to sort the the given string.
	 * 
	 * @returntype s is a String after sorting.
	 */
	public static String bubbleSort(String firstString) {
		char a[] = firstString.toCharArray();
		String s = "";
		for (int i = 0; i < firstString.length() - 1; i++) {
			for (int j = 0; j < firstString.length() - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					char temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < firstString.length(); i++) {
			s += a[i];
		}
		return s;
	}

	/****************************************
	 * Bubble Sort method for integer
	 ****************************************/
	/**
	 * Function is written to sort the integer array by using bubble sort algorithm.
	 * 
	 * @param a is integer array to sort the the given string.
	 * 
	 * @returntye a is integer array after sorting the array.
	 */
	public static int[] bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	/****************************************
	 * Match String
	 ****************************************/
	/**
	 * Function is written to match the two String
	 * 
	 * @param firstString and secondString to match both the string.
	 * 
	 */

	public static void matchString(String firstString, String secondString) {
		for (int i = 0; i < firstString.length(); i++) {
			if (firstString.charAt(i) == secondString.charAt(i)) {
				continue;
			} else {
				System.out.println("Entered String is Not Anagram");
				return;
			}
		}
		System.out.println("Entered String is Anagram");
	}

	/****************************************
	 * Remove Space
	 ****************************************/
	/**
	 * Function is written to remove the spaces from the string.
	 *
	 * @param firstString to remove the space from the entered string.
	 * 
	 * @returntype t is String after removing the spaces.
	 */
	public static String removeSpace(String secondString) {
		String t = "";
		for (int i = 0; i < secondString.length(); i++) {
			if (secondString.charAt(i) != ' ') {
				t += secondString.charAt(i);
			}
		}
		return t;
	}

	/****************************************************************/
	/**
	 * Function is written to covert the String into Lower case.
	 *
	 * @param str is String to covert the entered String into Lower case .
	 * 
	 * @returntype str is String after converting string into lower case;.
	 */
	public static String convertLowerCase(String str) {
		String s = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				s += (char) (ch[i] + 32);
			} else {
				s += ch[i];
			}
		}
		return s;
	}

	/****************************************
	 * find Prime Number
	 ****************************************/
	/**
	 * Function is written to find the Prime Number
	 *
	 * @param a is integer to find the entered number is Prime or Not.
	 * 
	 * @returntype true id number is Prime pr false if number is Not Prime.
	 */
	public static boolean findPrimenNumber(int a) {
		if (a == 0 || a == 1) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	/****************************************
	 * check Palindrome
	 ****************************************/
	/**
	 * Function is written to find the number is Palindrome or Nt.
	 *
	 * @param num integer to find the number is Palindrome or Not.
	 * 
	 * @returntype true id number is Prime pr false if number is Not Prime.
	 */
	public static boolean checkPalindrome(int num) {
		int sum = 0;
		int newNum = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (newNum == sum) {
			return true;
		} else {
			return false;
		}
	}

	/****************************************
	 * Insertion sort for integer
	 ****************************************/
	/**
	 * Function is written to perform the insertion sort on the integer array.
	 *
	 * @param a is array to sort the entered array.
	 * 
	 * @returntype a is integer array after sorting.
	 */
	public static int[] insertionSort(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int pivoteElement = a[i];
			int pivoteElementIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < pivoteElement) {
					pivoteElement = a[j];
					pivoteElementIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[pivoteElementIndex];
			a[pivoteElementIndex] = temp;
		}
		return a;
	}

	/****************************************
	 * Insertion sort for String
	 ****************************************/
	/**
	 * Function is written to perform the insertion sort on the string array.
	 *
	 * @param enteredSTring is string array to sort the entered array.
	 * 
	 * @returntype s is string after sorting.
	 */
	public static String insertionSort(String enteredSTring) {
		char[] a = enteredSTring.toCharArray();
		String s = "";
		for (int i = 0; i < a.length - 1; i++) {
			int pivoteElement = a[i];
			int pivoteElementIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < pivoteElement) {
					pivoteElement = a[j];
					pivoteElementIndex = j;
				}
			}
			char temp = a[i];
			a[i] = a[pivoteElementIndex];
			a[pivoteElementIndex] = temp;
		}
		for (int i = 0; i < enteredSTring.length(); i++) {
			s += a[i];
		}
		return s;
	}

	/****************************************
	 * Binary Search for integer
	 ****************************************/
	/**
	 * Function is written to perform the binary search on integer array.
	 *
	 */
	public static void binarySearch(int arr[], int first, int last, int key) {
		// Utility.displayArray(arr);
		Arrays.sort(arr);
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Elements is not found");
		}
	}

	/****************************************
	 * Binary Search for String
	 ***************************************/
	public static void binarySearch(String s, int first, int last, char key) {
		System.out.println("Entered String is : " + s);
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Elements is not found");
		}
	}

	/*************************************************
	 * Convert Temperature
	 **************************************************/
	/**
	 * Function is written to convert the celsius into fahrenheit and vice versa.
	 * 
	 * @param celsius,fahrenheit is integer to get the input from user.
	 */
	public static void temperatureConversion(int celsius, int fahrenheit) {
		if (fahrenheit == 0) {
			System.out.println("Temperature in Fahrenheit is : " + (((celsius * 9) / 5) + 32));
		} else if (celsius == 0) {
			System.out.println("Temperature in Celsius is : " + (((fahrenheit - 32) * 5) / 9));
		}
	}

	/*************************************************
	 * Newtons method to find square root
	 *************************************************/
	/**
	 * Function is written to find the square root of the entered number with the help of Newton method.
	 * 
	 * @param c is double the number to find the square root.
	 * 
	 */
	public static void findSquareRoot(double c) {
		double t;
		t = c;
		double epsilon = Math.pow(Math.E, -15);
		while (Math.abs(t - (c / t)) > epsilon * t) { 
			t = ((c / t) + t) / 2;
		}

		System.out.println("Entered Number is : " + c);
		System.out.println("Square root of the number is : " + t);
	}

	/*************************************************
	 * Guessing Number
	 ****************************************************************************************/
	/**
	 * Function is written to guess the number of user by Binary search algorithm.
	 */
	public static void guessNumber(int array[], int first, int last) {
		int mid = (first + last) / 2;
		System.out.println("Is Your Number present between " + first + " and " + last + "?");
		System.out.println("Enter y if present or n if not present");
		char choice = Utility.getChar();

		if (choice == 'y') {
			while (first <= last) {
				System.out.println("Is Your Number is " + array[mid]);
				System.out.println("Enter y if Yes or n if not");
				choice = Utility.getChar();
				if (choice == 'y') {
					System.out.println("Your Number is : " + array[mid]);
					return;
				} else if (choice == 'n') {
					System.out.println("Is your number is present after " + array[mid]);
					System.out.println("Enter y if present or n if not present");
					choice = Utility.getChar();
					if (choice == 'y') {
						first = mid + 1;
					} else if (choice == 'n') {
						last = mid - 1;
					}
					mid = (first + last) / 2;
				}
			}
		} else if (choice == 'n') {
			System.out.println("Your Number is not present ");
		}

	}

	/*************************************************
	 * Decimal to Binary
	 **************************************************/
	public static String toBinary(int deciamlValue) {
		String s = "";
		String out = "";
		int count = 0;
		while (deciamlValue > 0) {
			count++;
			int rem = deciamlValue % 2;
			s = rem + s;
			deciamlValue = deciamlValue / 2; 
		}
		for (int i = 0; i < 8 - count; i++) { 
			out += 0;
		} 
		s = out + s;
		return s;
	}

	/****************************************************************************************/
	public static int findNibbles(String s) {

		String nibble1 = "";
		String nibble2 = "";
		int l = s.length();
		int l1 = l / 2;
		int l2 = l - l1;

		for (int i = 0; i < l1; i++) {
			nibble1 += s.charAt(i); 
		}
		for (int i = l2; i < l; i++) {
			nibble2 += s.charAt(i);
		}
		return Utility.toDecimal(nibble2 + nibble1);
	}

	public static int toDecimal(String enteredString) {
		int num = Integer.parseInt(enteredString);
		int sum = 0;
		for (int i = 0; i < enteredString.length(); i++) {
			int rem = num % 10;
			sum += (rem * (Math.pow(2, i)));
			num = num / 10;
		}
		return sum;
	}

	/****************************************************************************************/

	public static final int binarySearchStringArray(String[] ar, String word) {

		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		int first = 0;
		int last = ar.length - 1;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;
			if (word.compareTo(ar[mid]) > 0) {
				first = mid + 1;
			} else if (word.compareTo(ar[mid]) < 0) {
				last = mid - 1;
			} else {
				System.out.println("<" + word + ">" + " is found at location " + (mid + 1));
				return mid;
			}
			if (first > last) {
				System.out.println(word + "is not found.\n");
			}
		}
		return mid;
	}

	/*******************************
	 * Generic Binary Search
	 *****************************/

	public static <T extends Comparable<T>> void binarySearchGeneric(T arr[], int first, int last, T key) {
		Arrays.sort(arr);
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid].compareTo(key) < 0) {
				first = mid + 1;
			} else if (arr[mid].compareTo(key) == 0) {
				System.out.println("element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Elements is not found");
		}
	}

	/*******************************
	 * Generic Bubble Search *
	 ****************************/
	public static <T extends Comparable<T>> T[] bubbleSortGeneric(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/*******************************
	 * Generic Insertion Sort *
	 ***************************/
	public static <T extends Comparable<T>> T[] insertionSortGeneric(T[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			T pivoteElement = a[i];
			int pivoteElementIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(pivoteElement) < 0) {
					pivoteElement = a[j];
					pivoteElementIndex = j;
				}
			}
			T temp = a[i];
			a[i] = a[pivoteElementIndex];
			a[pivoteElementIndex] = temp;
		}
		return a;
	}

	/***********************************
	 * Day of Week
	 * Function is written to validate the enterd date.
	 * 
	 * @param d,m,y is integer to get the input for the day,month,year from the user and validate it.
	 * *********************************/
	public static String dateValidate(int d, int m, int y) {
		if ((m == 4 || m == 6 || m == 9 || m == 11)) {
			Calendar.monthEndDate = 30;
			if ((d >= 30)) {
				return "SORRY!!!The month you have entered doesn't have 31 days";
			}
		} else if (m == 2) {
			if (y % 100 == 0) {
				if (y % 400 != 0) {
					Calendar.monthEndDate = 28;
					if (d > 28) {
					return "This year is not a leap year......last date is 28 for this month!!";
					}
				} else if (y % 400 == 0) {
					Calendar.monthEndDate = 29;
					if (d > 29) {
						return "SORRY!! The year you've entered is a leap year so FEBRUARY has 29 days... ";
					}
				} else {
					return "The day is " + findDay(d, m, y);
				}
			}
            if (y % 100 != 0) {
                if (y % 4 != 0 ) {
                	Calendar.monthEndDate = 28;
                	if(d > 28) {
                    return "This year is not a leap year......last date is 28 for this month!!";
                	}
                	} else if (y % 4 == 0) {
                		Calendar.monthEndDate = 29;
                		if( d > 29) {
                    return "SORRY!! The year you've entered is a leap year so FEBRUARY has 29 days... ";
                		}
                		} else {
                  return "The day is " + findDay(d, m, y);
                }
            }
        } else if (d > 31) {
           return "SORRY!!! No month has " + d + "  days";
        } else {
        	Calendar.monthEndDate=31;
            return "The day is " + findDay(d, m, y);
        }
		return "not valid input";
    }
	/***********************************
	 * get Day
	 * Function is written to find the day on the particular entered date after validation.
	 * 
	 * @param d,m,y is integer to get the input for the day,month,year from the user.
	 * 
	 * @returntype out is a String which shows the day of the particular date.
	 * *********************************/
	 public static String findDay(int d, int m, int y) {
	        String[] week = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	        String day = "";
	        int y0 = y - (14 - m) / 12;
	        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31 * m0) / 12) % 7;
	        for (int i = 0; i < week.length; i++) {
	            if (d0 == i) {
	            	Calendar.weekDay=i;
	                day = week[i];}
	        }
	        return day;
	    }
	 
	 
	 	/**
	     * Function to perform Merge Sort.
	     * @param first index and highest index of an array.
	     */
	        public static final void mergeSort(String[]array,int low,int high) {
	            if(low<high) {
	                int mid=low+(high-low)/2;
	                mergeSort(array,low,mid);
	                mergeSort(array,mid+1, high);
	                merge(array,low,mid,high);
	            }
	        }
	        public static void merge(String array[],int low,int mid,int high) 
	        { 
	            int i, mid1, k=0, low1; 
	            String[] temp= new String[50];
	            low1 = low; 
	            i = low; 
	            mid1 = mid + 1; 
	            while ((low1 <= mid) && (mid1 <= high)) 
	            { 
	                if (array[low1].compareToIgnoreCase(array[mid1])<=0 ) 
	                { 
	                    temp[i] = array[low1]; 
	                    low1++; 
	                } 
	                else 
	                { 
	                    temp[i] = array[mid1]; 
	                    mid1++; 
	                } 
	                i++; 
	            } 
	            if (low1 > mid) 
	            { 
	                for (k = mid1; k <= high; k++) 
	                { 
	                    temp[i] = array[k]; 
	                    i++; 
	                } 
	            } 
	            else 
	            { 
	                for (k = low1; k <= mid; k++) 
	                { 
	                     temp[i] = array[k]; 
	                     i++; 
	                } 
	            } 
	          
	            for (k = low; k <= high; k++) 
	            { 
	                array[k] = temp[k]; 
	            }
	        }
	        
	        /**
	         * this function check prime numbers are anagram or not
	         * @param string1
	         * @param string2
	         * @return true false boolean value after checking the anagram condition
	         */
	        public static boolean isAnagram(String firstString,String secondString) {

	            if (firstString.length()==secondString.length()) {
	            	firstString = Utility.bubbleSort(firstString);
	            	secondString = Utility.bubbleSort(secondString);
	                if (firstString.equals(secondString)) {
	                    return true;
	                } else {
	                    return false;
	                }
	            } else
	                return false;
	        }
	        
	        /**
	         * this function is written to check whether entered String is Anagram or not.
	         * @param firstString 
	         * @param secondString
	         */
	        public static void checkAnagram(String firstString,String secondString ) {
	        	firstString=Utility.removeSpace(firstString);
	    		secondString=Utility.removeSpace(secondString);
	    		
	    		if(firstString.length()==secondString.length()) {
	    			
	    			firstString=Utility.convertLowerCase(firstString);
	    			secondString=Utility.convertLowerCase(secondString);
	    			
	    			firstString=Utility.bubbleSort(firstString);
	    			secondString=Utility.bubbleSort(secondString);
	    			
	    			Utility.matchString(firstString,secondString);
	    		}
	    		else {
	    			System.out.println("Enterd String is Not Anagram");
	    		}
	        }
	        
	        /**
	         * this function is written to find the number of binary search tree using catalan formula.
	         * @param n is the integer which denotes the number of nodes.
	         * @returntype n is the number of binary search tree of a given number of nodes..
	         */
	        public static long catalanMethod(int n) {
	    		return  fact(2*n) / (fact(n+1)*fact(n));
	    	}
	    	
	        /*
	         * this function is written to find the factorial of the given number.
	         * @param n is the entered number to find the factorial.
	         * @returntype is the factorial of a given number.
	         */
	        public static long fact(int n) {
	    		if(n==0) return 1;
	    		return n*(fact(n-1));
	    	}
}
