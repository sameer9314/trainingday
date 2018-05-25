package com.bridgelabz.datastructure;

public class MylinkedListTest {

	public static void main(String[] args) {
		MyLinkedList l=MyLinkedList.list();
		 
		l.add(14);
		l.add(16);
		l.add(11);
		l.add(8);
		l.add(90);
		l.display();
		
		System.out.println(l.search(14));
		System.out.println(l.search(11));
		System.out.println(l.search(8));
		System.out.println(l.search(90));
		l.add(88);
		System.out.println("Display");
		l.display();
		
		System.out.println(l.pop(0));
	}

}
