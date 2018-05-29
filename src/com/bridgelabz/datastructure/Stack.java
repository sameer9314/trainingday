package com.bridgelabz.datastructure;
/******************************************************************************
*  Purpose: To create a method of Stack and its implementation using array.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class Stack {
	Comparable array[]=new Comparable[1000];	
	static Stack stack(){
		return new Stack();
	} 
	static int top=0;
	void push(Comparable item){
		if(size()==1000) {
			System.out.println("Stack is full");
			return;
		}
		array[top]=item;
		top++;
	}
	Comparable pop(){
		int newIndex=top-1;
		top--;
		return array[newIndex];
	}
	void display(){
		if(size()==0) {
			System.out.println("Stack is empty,Nothing to display");
		}
		for(int i=size()-1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}
	Comparable peek(){
		return array[size()-1];
	}
	boolean isEmpty(){
		if(size()==0) return true;
		return false;
	} 
	int size(){
		return top;
	}
}
