package com.bridgelabz.datastructure;
/******************************************************************************
*  Purpose: To create a method of Queue Linked List.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class QueueLinkedList {

	MyLinkedList l=MyLinkedList.list();
	static QueueLinkedList queue() {
		return new QueueLinkedList();
	}
	void enqueue(Comparable item) {
		l.add(item);
	}
	void display() {
	l.display();
	}
	Comparable dequeue() {
		return(l.pop(0));
	}
	int size() {
		return l.size();
	}
	boolean isEmpty() {
		return l.isEmpty();
	}
	
}
