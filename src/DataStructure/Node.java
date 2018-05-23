package DataStructure;


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
