package com.bridgelabz.datastructure;
/******************************************************************************
*  Purpose: To create a method of Queue Linked List.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class StackLinkedList {
	MyLinkedList l=MyLinkedList.list();
	public static StackLinkedList stack(){
		return new StackLinkedList();
	} 
	
	public void push(Comparable item){
	l.insert(item,0);
	}
	Comparable pop(){
		return l.pop(0);
	}
	
	public void display(){
		l.displayln();
		}
	
	public Comparable peek(){
		return l.peek();
	}
	public boolean isEmpty(){
	return l.isEmpty();
	} 
	int size(){
		return l.size();
	}
	}

