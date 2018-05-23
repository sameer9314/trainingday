package DataStructure;

public class MyLinkedList {
	private Node first;
	int count;

	public void add(Comparable item) {
		if (first == null) {
			first = new Node(item,null);
			count++;
			return;
		}
		Node last = first;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(item,null);
		count++;
	}
	
	public void display() {
		Node last= first;
		for(int i=1;i<=size();i++) {
			System.out.println(last.data);
			last=last.next;
		}
	}
	public void insert(Comparable item, int pos) {
		if (pos >= count)
			throw new IndexOutOfBoundsException();
		if (pos == 0) {
			first = new Node(item, first);
			count++;
			return;
		}
		Node temp = first;
		for (int i = 1; i <= pos; i++) {
			temp = temp.next;
		}
		temp.next = new Node(item, temp.next);
		count++;
	}

	public int size() {
		return count;
	}

	public boolean search(Comparable item) {
		Node last = first;
		while (last.next != null) {
			if (last.data.compareTo(item) == 0)
				last = last.next;
				return true;
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

	public boolean isEmpty() {
		if (first == null)
			return true;
		return false;
	}
	
	public void append(Comparable item) {
		Node last=first;
		while (last.next != null) {
			last=last.next;
		}
		last.next=new Node(item,last.next);
		count++;
	}
	
	public void remove(Comparable item) {
		Node last=first;
		for(int i=1;i<=size();i++) {
			if(last.data.compareTo(item)==0) {
				last.next=last.next.next;
				count--;
				return;
			}
			last=last.next;
		}
		
	}

}
