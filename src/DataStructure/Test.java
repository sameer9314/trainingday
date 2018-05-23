package DataStructure;

public class Test {

	public static void main(String[] args) {
		MyLinkedList l=new MyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println("Size is : ");
		System.out.println(l.size());
		
		//display
		System.out.println("Display");
		l.display();
	
		// Search
		System.out.println("Search");
		System.out.println(l.search(10));
		System.out.println(l.search(20));
		System.out.println(l.search(30));
		System.out.println(l.search(40));
		System.out.println(l.search(50));
		System.out.println(l.search(60));
		
		System.out.println();
		
		System.out.println("Is Empty");
		System.out.println(l.isEmpty());
		
		System.out.println();
		
		System.out.println("Index");
		System.out.println(l.index(10));
		System.out.println(l.index(20));
		System.out.println(l.index(30));
		System.out.println(l.index(40));
		System.out.println(l.index(50));
		System.out.println(l.index(60));
		
		l.add(70);
		
		l.append(80);
		l.add(90);
//		l.append(80);
		System.out.println("Size is : ");
		System.out.println(l.size());
		
		//display
		System.out.println();
		l.display();		
		
				// Search
				System.out.println("Search");
				System.out.println(l.search(10));
				System.out.println(l.search(20));
				System.out.println(l.search(30));
				System.out.println(l.search(40));
				System.out.println(l.search(50));
				System.out.println(l.search(60));
				System.out.println(l.search(70));
				System.out.println(l.search(80));
				System.out.println(l.search(90));
				
				System.out.println("Index");
				System.out.println(l.index(10));
				System.out.println(l.index(20));
				System.out.println(l.index(30));
				System.out.println(l.index(40));
				System.out.println(l.index(50));
				System.out.println(l.index(60));
				System.out.println(l.index(70));
				System.out.println(l.index(80));
				System.out.println(l.index(90));
				
				//display
				System.out.println();
				l.display();	
				
				//remove
				System.out.println();
				l.remove(40);
				
				System.out.println("Size is : ");
				System.out.println(l.size());
				
				//display
				System.out.println();
				l.display();		
	}

}
