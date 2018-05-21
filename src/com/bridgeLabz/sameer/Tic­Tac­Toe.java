package com.bridgeLabz.sameer;

/******************************************************************************

 *  
 *  Purpose: To make Tic Tac Toe Game
 *
 *  @author  Sameer Saurabh
 *  @version 1.0
 *  @since   18-05-2018
 *
 ******************************************************************************/
import java.util.Random;
public class Tic­Tac­Toe {
	//Utility object created.
	Utility obj=new Utility();
	
	final static char board[][]=new char[3][3];
	static boolean winStatus=false;
	static boolean valueEntered=false;
	static char user;
	static char comp;
	static int countValueEntered;
	static boolean breakPoint=false;
	
	public static void main(String[] args) {
		System.out.println("Placing new board to play : ");
		System.out.println();
		Tic­Tac­Toe.defaultBoard();
		Tic­Tac­Toe.printBoard(board);
		System.out.println();
		Tic­Tac­Toe.playGame();
	}
/*************************************************************************************************************************************/	
	// Assigning n as a null to the elements of the array.
	static void defaultBoard() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]='n';
			}
		}
	}
/***********************************************************************************************************************************/	
	static void printBoard(char board[][]) {
		System.out.println("-------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("| "+board[i][j]+" ");
			}
			System.out.println("|");
			System.out.print("-------------");
			System.out.println();
		}
	}
/*************************************************************************************************************************************/	
	static void playGame() {
//		char user=Utility.getChar();
		Utility obj=new Utility();
		System.out.println("Enter 1 for 'x'");
		System.out.println("Enter 2 for 'o'");
		int choice=Utility.getInt();
		
		// conditon to decide the choice choosen by the user.
		if(choice==1){
			System.out.println("User is x");
			System.out.println("Comp is o");
			user='x';
			comp='o';
		}
		else {
			System.out.println("User is o");
			System.out.println("Comp is x");
			comp='x';
			user='o';
		}
		
		// condition to decide who will start the game
		if(Math.random()>0.5) {
			System.out.println("User win the toss");
			System.out.println("User will start the game");
			Tic­Tac­Toe.userTurn(user);
			}
		else 
		if(countValueEntered==9){
			System.out.println("Computer win the toss");
			System.out.println("Computer will start the game");
			Tic­Tac­Toe.compTurn(comp);
		}
		
	}
/**************************************************************************************************************************************/	
	static void userTurn(char user){
//		if(countValueEntered==9) {
//			System.out.println("Game is Draw");
//			breakPoint=true;
//		}
		if(countValueEntered<9) {
		while(valueEntered==false) {
			System.out.println("Enter the row");
			int row = Utility.getInt();
			System.out.println("Enter the column");
			int col=Utility.getInt();
			if(Tic­Tac­Toe.checkEmptyIndex(row,col)==true) {
				countValueEntered++;
				board[row][col]=user;
				Tic­Tac­Toe.findWinner(board);
				valueEntered=true;
				Tic­Tac­Toe.printBoard(board);
				System.out.println();
				if(countValueEntered!=9) System.out.println("Computer turn");
			}
			else {
			System.out.println("Entered index is not empty");
			Tic­Tac­Toe.printBoard(board);
			System.out.println("Please enter the empty index for row and col");
			}
		}
		valueEntered=false;
		// && breakPoint==false
		//System.out.println("countValueEntered : "+countValueEntered);
		if(countValueEntered<9) {
			while(winStatus==false) {
				Tic­Tac­Toe.compTurn(comp);
			}
		}
		else 
		if(countValueEntered==9){
			System.out.println("Game is Draw");
		}
		}
		else {
		 System.exit(0);
		}
	}	
/******************************************************************************************************************************************/	
static void compTurn(char comp) {
//	if(countValueEntered==9) {
//		System.out.println("Game is Draw");
//		breakPoint=true;
//	}
	if(countValueEntered<9) {
	while(valueEntered==false) {
		Random randomNumber=new Random();
		int row=randomNumber.nextInt(3);
		int col=randomNumber.nextInt(3);
		if(Tic­Tac­Toe.checkEmptyIndex(row,col)==true) {
			countValueEntered++;
			board[row][col]=comp;
			Tic­Tac­Toe.findWinner(board);
			valueEntered=true;
			Tic­Tac­Toe.printBoard(board);
			if(countValueEntered!=9)  System.out.println("User turn");
		}
	}
	valueEntered=false;
	// && breakPoint==false
	//System.out.println("countValueEntered : "+countValueEntered);
	if(countValueEntered<9) {
		while(winStatus==false) {
			Tic­Tac­Toe.userTurn(user);
		}
	}
	else {
		System.out.println("Game is Draw");
	}
	}
	else {
		 System.exit(0);
	}
}
/******************************************************************************************************************************************/	
	 static boolean checkEmptyIndex(int row,int col) {
		 if(board[row][col]=='n') {
			return true;
		 }
		 else {
			return false;
		 }
	}
/******************************************************************************************************************************************/	
	// To check winning criteria.
	static void findWinner(char board[][]) {

		
	if(board[0][0]==user && board[0][1]==user && board[0][2]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else 
		if(board[0][0]==comp && board[0][1]==comp && board[0][2]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}	
	
	if(board[1][0]==user&& board[1][1]==user && board[1][2]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else
		if(board[1][0]==comp && board[1][1]==comp && board[1][2]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}
	
	if(board[2][0]==user && board[2][1]==user && board[2][2]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else
		if(board[2][0]==comp && board[2][1]==comp && board[2][2]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		}
/************************************************************************************************/	
	if(board[0][0]==user && board[1][0]==user && board[2][0]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else 
		if(board[0][0]==comp && board[1][0]==comp && board[2][0]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}	
	
	if(board[0][1]==user && board[1][1]==user && board[2][1]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else
		if(board[0][1]==comp && board[1][1]==comp && board[2][1]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("Computer wins");
			System.exit(0);
		}
	
	if(board[0][2]==user && board[1][2]==user && board[2][2]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else
		if(board[0][1]==comp && board[1][2]==comp && board[2][2]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		}	
/*******************************************************************************************/	
	if(board[0][0]==user && board[1][1]==user && board[2][2]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else
		if(board[0][0]==comp && board[1][1]==comp && board[2][2]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		}
/*******************************************************************************************/	
	if(board[0][2]==user && board[1][1]==user && board[2][0]==user) {
		Tic­Tac­Toe.printBoard(board);
		System.out.println("User wins");
		System.exit(0);
	}
	else
		if(board[0][2]==comp && board[1][1]==comp && board[2][0]==comp) {
			Tic­Tac­Toe.printBoard(board);
			System.out.println("User wins");
			System.exit(0);
		}	
	return;
	}
}
