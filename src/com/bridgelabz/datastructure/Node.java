package com.bridgelabz.datastructure;

/******************************************************************************
*  Purpose: To create a Node Class store the data and the address of next node.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   26-05-2018
*
******************************************************************************/
public class Node {
	Comparable data;
	public Node next;
	Node(Comparable e){
		data=e;
	}
	Node(Comparable e,Node n){
		data=e;
		next=n;
	}
}
