package com.bridgelabz.datastructure;

import com.bridgeLabz.Utility.Utility;

public class DequeueLinkedListTest {

	public static void main(String[] args) {
		DequeueLinkedList dequeue = new DequeueLinkedList();
		Utility obj=new Utility();
		System.out.println("Enter the string to check the palindrome");
		String s=Utility.getString();
		//char array[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			dequeue.addFront(s.charAt(i));
		}
		int size=dequeue.size();
		boolean palindrome=true;
		for(int i=1;i<=size/2;i++) {
			if(dequeue.removeFront().compareTo(dequeue.removeRear())==0) {
				palindrome=true;
			}
			else {
				palindrome=false;
			}
		}
		if(palindrome==true) {
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
