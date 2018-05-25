package com.bridgelabz.datastructure;

public class QueueLinkedListTest {

	public static void main(String[] args) {
		QueueLinkedList q=QueueLinkedList.queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.display();

		q.dequeue();
		
		System.out.println("Display");
		q.display();
		System.out.println(q.isEmpty());
	}

}
