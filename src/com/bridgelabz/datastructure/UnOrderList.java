package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgeLabz.Utility.Utility;
 
/******************************************************************************
*  Purpose: To read from file the list of words and take user input to search a text.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class UnOrderList { 
	public static void main(String[] args) {
		Utility obj=new Utility();
		File f= new File("/home/administrator/eclipse-workspace/Funtional_Programs/sameer.txt");
		FileReader fr=null;
		int count=0;
		MyLinkedList l=MyLinkedList.list();
		BufferedReader br=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String word=br.readLine();
			//System.out.println(word);
			while((word!=null)) {
				String [] str=word.split(",");
				for(int i=0;i<str.length;i++) {
					count++;
					l.add(str[i]);
				}
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Displaying List");
		l.display();
		System.out.println();
		System.out.println("Enter the String you want to search");
		String enteredString=Utility.getString();
		if(l.search(enteredString)==true) {
			l.remove(enteredString);
		}
		System.out.println("Displaying list after remove");
		l.display();
		System.out.println();
		if(l.search(enteredString)==false){
			l.add("saurabh");
		}
		System.out.println("Displaying list after add");
		l.display();
		
		String temp="";
		while(l.size()>0) {
			temp=l.pop()+","+temp;
		}
		//System.out.println(" Printing string "+temp);
		try {
			fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(temp);
			bw.flush();
			System.out.println();
			System.out.println("File updated successfully");
		}catch(Exception e) {
			e.printStackTrace();
			}
		
	}

}
