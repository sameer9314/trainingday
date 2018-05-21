package com.bridgeLabz.FunctionalPrograms;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int j=0;
		for(int i=0;i<=a.length;i++) {
			a[j]=0;
			j++;
			for(int k=0;k<=i;k++) {
				if(j==a.length) {
					break;
				}
				a[j]=sc.nextInt();
				j++;
				
				}
			if(j==a.length) {
				break;
			}
			}
		
		System.out.println("*************************************************");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
//		char x;
//		char y;
//		int row=0;
//		boolean userstatus=true;
//		boolean compstatus=true;
//		for(int col=0;col<2;col++) {
//			if(board[row][col]=='x') {
//				userstatus=true;
//			}
//			else {
//				userstatus=false;
//			}
//			if(board[row][col]=='o') {
//				compstatus=true;
//			}
//			else {
//				compstatus=false;
//			}
//			
//			if(userstatus==false) {
//				return;
//			}
//			if(compstatus==false) {
//				return;
//			}
//			row++;
//		}
//		if(userstatus==true)
//		{
//			System.out.println("User Wins");
//			System.exit(0);
//		}
//		else if(compstatus=true)
//		{
//			System.out.println("Computer Wins");
//			System.exit(0);
//		}
//		
///*****************************************************************************************************/		
//		int col=0;
//		for(row=0;row<2;row++) {
//			if(board[row][col]=='x') {
//				userstatus=true;
//			}
//			else {
//				userstatus=false;
//			}
//			if(userstatus==false) {
//				return;
//			}
//			
//			if(board[row][col]=='o') {
//				compstatus=true;
//			}
//			else {
//				compstatus=false;
//			}
//			if(compstatus==false) {
//				return;
//			}
//			col++;
//		}
//		if(userstatus==true)
//		{
//			System.out.println("User Wins");
//			System.exit(0);
//		}
//		else if(compstatus=true)
//		{
//			System.out.println("Computer Wins");
//			System.exit(0);
//		}
///****************************************************************************************/		
//		
//		row=0;
//
//		for(row=0;row<2;row++) {
//			
//				if(board[row][row]=='x') {
//					userstatus=true;
//				}
//				else
//				{
//					userstatus=false;
//				}
//				if(userstatus==false) {
//					return;
//				}
//				
//				
//				if(board[row][row]=='o') {
//					compstatus=true;
//				}
//				else
//				{
//					compstatus=false;
//				}
//				if(compstatus==false) {
//					return;
//				}
//			
//		}
//		if(userstatus==true)
//		{
//			System.out.println("User Wins");
//			System.exit(0);
//		}
//		else if(compstatus==true)
//		{
//			System.out.println("Computer Wins");
//			System.exit(0);
//		}
	}
}
