package com.bridgelabz.datastructure;
/******************************************************************************
*  Purpose: To create a method of Ordered Linked List.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class OrderLinkedList {

	private Node first;
	int count;
	MyLinkedList l=MyLinkedList.list();
	public static OrderLinkedList  orderedlist() {
		return new OrderLinkedList();
	}
	public void add(Comparable item) {
		l.addSort(item);
	}
	
	public void display() {
	l.display();
	}
	
	public int size() {
		return l.size();
	}
	
	public void remove(Comparable item) {
	l.remove(item);
	}
	public boolean isEmpty() {
		return l.isEmpty();
	}
	public boolean search(Comparable item) {
		return l.search(item);
	}
	public int index(Comparable item) {
	return l.index(item);
	}
	public Comparable pop(int pos) {
	 return l.pop(pos);
	}
	public Comparable pop() {
	return l.pop();
}
}
