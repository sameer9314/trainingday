package com.bridgelabz.datastructure;

public class Stack {
	Comparable array[]=new Comparable[100];	
	static Stack stack(){
		return new Stack();
	} 
	static int index=0;
	void push(Comparable item){
		if(size()==100) {
			System.out.println("Stack is full");
			return;
		}
		array[index]=item;
		index++;
	}
	Comparable pop(){
		int newIndex=index;
		index--;
		return array[newIndex];
	}
	void display(){
		if(size()==0) {
			System.out.println("Stack is empty,Nothing to display");
		}
		for(int i=0;i<size();i++) {
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
		return index;
	}
}
