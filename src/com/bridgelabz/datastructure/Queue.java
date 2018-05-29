package com.bridgelabz.datastructure;
/******************************************************************************
*  Purpose: To create a method of Queue and its implementation using array.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class Queue {
	Comparable[] array=new Comparable[100];
	int rear=0;
	int front=0;
	static Queue queue() {
		return new Queue();
	}
	
	void enqueue(Comparable item) {
		array[rear]=item;
		rear++;
	}
	
	void display() {
		if(size()==0) System.out.println("Queue is empty,Nothing to display");
		for(int i=front;i<rear;i++) {
			System.out.println(array[i]);
		}
	}
	Comparable dequeue() {
		int temp=front;
		front++;
		return array[temp];
	}
	int size() {
		return rear-front;
	}
	boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		return false;
	}
	
}
