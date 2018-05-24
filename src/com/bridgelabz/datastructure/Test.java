package com.bridgelabz.datastructure;

public class Test {

	public static void main(String[] args) {
		MyLinkedList l=MyLinkedList.list();
		
		l.add("sameer");
		l.add("saket");
		l.add("saurabh");
		
		l.display();
		l.remove("saurabh");
		System.out.println(l.search("sameer"));
		System.out.println(l.search("saurabh"));
		l.display();
	}

}
