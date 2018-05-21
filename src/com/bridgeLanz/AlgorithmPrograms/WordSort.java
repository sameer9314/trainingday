package com.bridgeLanz.AlgorithmPrograms;

import com.bridgeLabz.Utility.Utility;

public class WordSort {

	public static void main(String[] args) {
		Utility obj=new Utility();
		
		String line=Utility.getString();
		
		System.out.println("Entered String is "+line);
		
		int wordCount=wordCount(line);
		WordSort.stringArray(line,wordCount);
	}
	
	public static void stringArray(String line,int wordCount) {
		String s[]=new String[wordCount];
		String temp;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)!=' ' && line.charAt(i+1)!=' ')
			{
				 
			}
		}
	}
	
	public static int wordCount(String line) {
		int wordCount=0;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)!=' ' && line.charAt(i+1)!=' ') {
				wordCount++;
			}
		}
		wordCount=wordCount+1;
		return wordCount;
	}
}
