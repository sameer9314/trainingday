package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgeLabz.Utility.Utility;

public class OrderedList {

	public static void main(String[] args) {
		Utility obj=new Utility();
		File f= new File("/home/administrator/eclipse-workspace/Funtional_Programs/unorderfile.txt");
		
		FileReader fr=null;
		int count=0;
		OrderLinkedList ol=OrderLinkedList.orderedlist();
		BufferedReader br=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String word=br.readLine();
			System.out.println(word);
			while((word!=null)) {
				String [] str=word.split(",");
				for(int i=0;i<str.length;i++) {
					count++;
					ol.add(str[i]);
				}
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the value you want to search and add");
		String enteredString=Utility.getString();
		if(ol.search(enteredString)==true) {
			ol.remove(enteredString);
		}
		else {
			ol.add(enteredString);
		}
		
		String temp="";
		while(ol.size()>0) {
			temp=ol.pop()+","+temp;
		}
		System.out.println(" Printing string "+temp);
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
