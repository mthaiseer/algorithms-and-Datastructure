package ds.ll.adt.doubly;

public class App {

	public static void main(String[] args) {
		IDoublyList list = new DoublyLinkedList();
		list.insertAtBegining(10);
		list.insertAtBegining(20);
		list.insertAtBegining(30);
		list.insertAtBegining(40);
		
		list.traverse();
		System.out.println(list.size());
		
		list.insertAtEnd(100);
		list.traverse();
		System.out.println(list.size());
		
		list.insertAt(400, 2);
		list.traverse();
		System.out.println(list.size());
		
		list.removeFromHead();
		list.traverse();
		System.out.println(list.size());
		
		
		list.removeTail();
		list.traverse();
		System.out.println(list.size());
		
		list.removeFrom(2);
		list.traverse();
		System.out.println(list.size());

	}

}
