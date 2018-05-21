package com.bridgeLabz.sameer;

/******************************************************************************

 *  
 *  Purpose: Determines Number of Wins and the Percentage of Win and Loss.
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
public class Gambler {
	
	/*
	 * Static Variable is declared to count the number of times of Wins.
	 */
	static double mstakeWinCount=0;
	
	/*
	 * Static Variable is declared to count the number of times of Loss.
	 */
	static double mstakeLossCount=0;
	public static void main(String[] args) {
		// Utility object created
		Utility obj=new Utility();
		
		System.out.println("Enter Your Stake");
		int stake=Utility.getInt();
		System.out.println("Enter Your Goal");
		int goal=Utility.getInt();
		System.out.println("Mention how many times you want to play this game");
		int numberOfTimes=Utility.getInt();
		
		obj.playGambler(stake,goal,numberOfTimes);
	}

}
