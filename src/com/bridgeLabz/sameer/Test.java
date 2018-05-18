package com.bridgeLabz.sameer;
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
	}
}
