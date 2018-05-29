package com.bridgelabz.datastructure;

public class QueueLinkedListTest {

	public static void main(String[] args) {
		QueueLinkedList queue=QueueLinkedList.queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();

		System.out.print(queue.dequeue());
		System.out.println("Display");
		queue.display();
		queue.dequeue();
		System.out.println("Display");
		queue.display();
		queue.dequeue();
		System.out.println("Display");
		queue.display();
		queue.dequeue();
		System.out.println("Display");
		queue.display();
		queue.dequeue();
		System.out.println("Display");
		queue.display();
		System.out.println(queue.isEmpty());
	}
}
