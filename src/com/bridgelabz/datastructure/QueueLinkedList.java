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
	public static QueueLinkedList queue() {
		return new QueueLinkedList();
	}
	public void enqueue(Comparable item) {
		l.add(item);
	}
	public void display() {
	l.displayln();
	}
	public Comparable dequeue() {
		return(l.pop(0));
	}
	public int size() {
		return l.size();
	}
	public boolean isEmpty() {
		return l.isEmpty();
	}
	
}
