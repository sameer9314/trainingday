package com.bridgelabz.datastructure;

public class OrderLinkedList {

	private Node first;
	int count;
	
	public static OrderLinkedList  orderedlist() {
		return new OrderLinkedList();
	}
	public void add(Comparable item) {
		Node newNode=new Node(item);
		if (first == null || first.data.compareTo(newNode.data)>=0 ) {
			newNode.next=first;
			first=newNode;
			count++;
			return;
		}
		
		Node current=first;
		while(current.next!=null && current.next.data.compareTo(newNode.data)<0)
		{
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
		count++;
	}
	
	public void display() {
		if(size()==0) {System.out.println("Nothing to display , List is empty");}
		Node last= first;
		for(int i=1;i<=size();i++) {
			System.out.println(last.data);
			last=last.next;
		}
	}
	
	public int size() {
		return count;
	}
	
	public void remove(Comparable item) {
		if(first.data.compareTo(item)==0) {
			first=first.next;
			count--;
			return;
		}
		Node last=first;
		Node temp;
			while(last.next!=null) {
				temp=last;
				last=last.next;
				if(last.data.compareTo(item)==0) {
					temp.next=temp.next.next;
					count--;
				}
			}
	}
	public boolean isEmpty() {
		if (first == null)
			return true;
		return false;
	}
	public boolean search(Comparable item) {
		Node last = first;
		while (last.next != null) {
			if (last.data.compareTo(item) == 0) {
				return true;}
			last = last.next;
			if (last.data.compareTo(item) == 0) {
				return true;}
		}
		return false;
	}
	public int index(Comparable item) {
		Node last = first;
		int count = 1;
		if (last.data.compareTo(item) == 0) return count;
		while (last.next != null) {
			if (last.data.compareTo(item) == 0) {
				return count;
			}
			count++;
			last=last.next;
			if(count==size()) {
				return count;
			}
		}
		return -1;
	}
	public Comparable pop(int pos) {
		
		if(pos==0) {
			Node temp=first;
			first=first.next;
			count--;
			return temp.data;
		}
		if(pos==size()) {
			Node last=first;
			for(int i=1;i<size()-1;i++) {
				last=last.next;
			}
			Node temp=last.next;
			last.next=null;
			count--;
			return temp.data;
		}
		Node last=first;
		for(int i=1;i<pos-1;i++) {
			last=last.next;
		}
		Node temp=last.next;
		last.next=last.next.next;
		count--;
		return temp.data;
	}
	public Comparable pop() {
		Node last=first;
		if(first.next==null) {
			Comparable c=first.data;
			first=null;
			count--;
			return c;
		}
		for(int i=1;i<size()-1;i++) {
		last=last.next;
		}
		Node temp=last.next;
		last.next=null;
		count--;
		return temp.data;
			}

}
