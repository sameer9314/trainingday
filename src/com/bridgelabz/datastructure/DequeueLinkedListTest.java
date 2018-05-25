package com.bridgelabz.datastructure;

public class DequeueLinkedListTest {

	public static void main(String[] args) {
		DequeueLinkedList dq = new DequeueLinkedList();

		dq.addFront("radar");
		dq.addFront("toot");
		dq.addFront("madam");
		
//		System.out.println(dq.removeFront());
//		System.out.println(dq.removeFront());
//		System.out.println(dq.removeFront());
		// String s="sameer";
		// StringBuilder sb=new StringBuilder(s);
		// sb.reverse();
		// System.out.println(sb.toString());
		//
	 System.out.println(dq.size());

//		for (int i = 1; i <= dq.size(); i++) {
//			String s = (String) dq.removeFront();
//			System.out.println(s);
//			StringBuilder sb = new StringBuilder(s);
//			sb.reverse();
//			System.out.println(sb.toString());
//			if (s.compareTo(sb.toString()) == 0) {
//				System.out.println("String is palindrome");
//			}
//			else {
//				System.out.println("String is not palindrome");
//			}
//		}
	 int count=0;
	 for (int i = 1; i <= dq.size(); i++) {
		 count++;
		 String s = (String) dq.removeFront();
		 System.out.println(dq.isEmpty());
		 System.out.println(s);
	 }
	 System.out.println(count);
	}

}
