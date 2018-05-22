package com.bridgeLabz.FunctionalPrograms;

/******************************************************************************

 *  
 *  Purpose: To make Tic Tac Toe Game
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   18-05-2018
 *
 ******************************************************************************/
//import java.util.Random;

import com.bridgeLabz.Utility.Utility;
public class Tic­Tac­Toe {
	//Utility object created.
	Utility obj=new Utility();
	
	public final static char board[][]=new char[3][3];
	public static boolean winStatus=false;
	public static boolean valueEntered=false;
	public static char user;
	public static char comp;
	public static int countValueEntered;
	public static boolean breakPoint=false;
	
	public static void main(String[] args) {
		Utility obj=new Utility();
		System.out.println("Placing new board to play : ");
		System.out.println();
		Utility.defaultBoard();
		Utility.printBoard(board);
		System.out.println();
		Utility.playGame();
	}
	
}
