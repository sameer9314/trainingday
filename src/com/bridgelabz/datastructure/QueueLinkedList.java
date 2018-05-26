package com.bridgelabz.datastructure;

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
