package com.bridgelabz.datastructure;

public class StackLinkedListTest {

	public static void main(String[] args) {
		StackLinkedList stackList=StackLinkedList.stack();
		
		stackList.push(10);
		stackList.push(20);
		stackList.push(30);
		stackList.push(40);
		stackList.push(50);
		System.out.println(stackList.isEmpty());
		System.out.println(stackList.size());
		stackList.display();
		System.out.println();
		System.out.println(stackList.peek());
		
		System.out.println(stackList.pop());
		stackList.display();
		System.out.println();
		System.out.println(stackList.pop());
		stackList.display();
		System.out.println();
		System.out.println(stackList.pop());
		stackList.display();
		System.out.println();
		System.out.println(stackList.pop());
		stackList.display();
		System.out.println();
		System.out.println("sadfadfcasdfvasdfasfdsa");
		System.out.println(stackList.peek());
		System.out.println(stackList.pop());
		stackList.display();
		System.out.println(stackList.size());
		System.out.println(stackList.isEmpty());
		
	}

}
