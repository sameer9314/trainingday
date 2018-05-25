package com.bridgeLabz.FunctionalPrograms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		
		int n=r.nextInt(3); 
		System.out.println(n);
	}

}
