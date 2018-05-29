package com.bridgelabz.datastructure;

/******************************************************************************
*  Purpose: To create a method of Dequeue Linked List.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class DequeueLinkedList {
	MyLinkedList l=MyLinkedList.list();
	static DequeueLinkedList dequeue(){
		return new DequeueLinkedList();
	}
	
	void addFront(Comparable item){
		l.insert(item,0);
	}
	
	void addRear(Comparable item){
		l.add(item);
	}
	Comparable removeFront(){
		return l.pop(0);
	}
	Comparable removeRear(){
		return l.pop();
	}
	boolean isEmpty() {
		return l.isEmpty();
	}
	int size(){
		return l.size();
	}
	void display() {
		l.display();
	}

}
