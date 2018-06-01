package com.bridgLabz.oops;

import com.bridgeLabz.Utility.Utility;

public class Island {

	public static void main(String[] args) {
		Utility obj=new Utility();
		System.out.println("Enter the row size of an array");
		int row=Utility.getInt();
		System.out.println("Enter the row size of an array");
		int col=Utility.getInt();
		int[][] array=new int[row][col];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=Utility.getInt();
			}
		}
		Utility.displayArray(array);
		int count=0;
		for(int i=1;i<row-1;i++) {
			for(int j=1;j<col-1;j++) {
				if(array[i-1][j-1]==0 && 
						array[i-1][j]==0 &&
						array[i-1][j+1]==0 &&
						
						array[i][j-1]==0 &&
						array[i][j+1]==0 &&
						
						array[i+1][j-1]==0 &&
						array[i+1][j]==0 &&
						array[i+1][j+1]==0 ) {
					count++;
				}
			}
		}
		System.out.println("Number of islands are : "+count);
	}

}
