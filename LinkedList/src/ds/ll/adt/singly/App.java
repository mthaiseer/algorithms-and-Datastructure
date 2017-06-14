package ds.ll.adt.singly;

public class App {

	public static void main(String[] args) {
	
		List list = new LinkedList();
		list.traverse();
		
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		
		list.traverse();
		System.out.println(list.size());
		
		list.insertAtTail(100);
		list.traverse();
		System.out.println(list.size());
		
		list.insertAt(40, 4);
		list.traverse();
		
		list.remove(100);
		list.traverse();
		System.out.println(list.size());
		

	}

}
