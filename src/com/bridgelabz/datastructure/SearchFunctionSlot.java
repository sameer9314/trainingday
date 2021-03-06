package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgeLabz.Utility.Utility;
/******************************************************************************
*  Purpose: To implement a number chaining.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   28-05-2018
*
******************************************************************************/
public class SearchFunctionSlot {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {	
		
		Utility obj = new Utility();
		File f = new File("/home/administrator/eclipse-workspace/Funtional_Programs/numberSlotFile.txt");
		FileReader fr = null;
		int count = 0;
		MyLinkedList l = MyLinkedList.list();
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String word = br.readLine();
			System.out.println(word);
			while ((word != null)) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					count++;
					l.add((Integer.parseInt(str[i])));
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Displaying List");
		l.display();

		MyLinkedList array[]=new MyLinkedList[11];
		for(int i=0;i<11;i++) {
			array[i]=new MyLinkedList();
		}
		int listsize=l.size();
		for(int i=0;i<listsize;i++) {
			Integer item=(Integer)l.pop();
			Integer index=(item)%11;
			array[index].add(item);
		}
		
		String temp="";
		for(int i=0;i<listsize;i++) {
			int size=array[i].size();
			for(int j=0;j<size;j++) {
				temp+=array[i].pop()+" ";
			}
		}
		System.out.println("String "+temp);
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
