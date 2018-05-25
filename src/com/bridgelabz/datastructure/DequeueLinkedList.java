package com.bridgelabz.datastructure;

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
