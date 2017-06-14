package ds.ll.adt.singly;

/**
 * This class implements all operations related to linked list
 * 
 * @author mohamed.thaiseer
 * @Date : 05-June-2017
 * @version : 1.0
 *
 */
public class LinkedList implements List {

	private Node head;
	private int length;

	public LinkedList() {
		this.length = 0;
	}

	/**
	 * This method is used to add Node at beginning If head is null, else set
	 * new node as head
	 * 
	 * Before : 10->20->30 insertAtHead(1) : 1->10->20-30
	 */
	@Override
	public void insertAtHead(int data) {

		if (head == null) {
			this.head = new Node(data);
			incrementSize();
			return;
		}

		Node newNode = new Node(data);
		newNode.setNext(head);
		this.head = newNode;
		incrementSize();

	}

	/**
	 * This method is used to add Node at end If head is null, else set new node
	 * as head
	 * 
	 * Before : 10->20->30 insertAtTail(40) : 10->20-30->40
	 */

	@Override
	public void insertAtTail(int data) {

		if (head == null) {
			this.head = new Node(data);
			incrementSize();
			return;
		}
		Node lastNode = head;
		while (lastNode.getNext() != null) {
			lastNode = lastNode.getNext();
		}

		Node newNode = new Node(data);
		lastNode.setNext(newNode);
		incrementSize();

	}
	
	/**
	 * Insert data at given position 
	 * Before : 10->20->30
	 * insertAt(100, 2) -> 10->100->20->30
	 */

	@Override
	public void insertAt(int data, int position) {

		if (position < 0) {
			position = 0;
		}

		if (position >= length) {
			position = length - 1;
		}

		if (head == null) {
			head = new Node(data);
			return;
		}

		if (position == 0) {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;

		} else {
			Node tempNode = head;

			for (int i = 0; i < position; i++) {

				tempNode = tempNode.getNext();

			}
			Node newNode = new Node(data);

			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);

		}
		incrementSize();

	}
	
	/**
	 * Method used to remove node from head position
	 */

	@Override
	public boolean removeFromHead() {

		Node lastHead = head;
		if (lastHead != null) {
			head = lastHead.getNext();
			lastHead = null;
			decrementSize();
			return true;
		}
		return false;
	}
	
	/**
	 * Method used to remove node from tail
	 */

	@Override
	public boolean removeFromTail() {

		Node previous = head;
		Node next = null;

		if (head == null) {
			return false;
		}

		if (head != null && head.getNext() == null) {
			head = null;
			decrementSize();
			return true;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				previous = lastNode;
				next = lastNode.getNext();
			}
			previous.setNext(null);
			decrementSize();
			return true;
		}

	}
	
	/**
	 * Remove node from list if data found, else return false
	 */

	@Override
	public boolean remove(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			decrementSize();
			return true;
		}

		Node parent = head;
		Node nextNode = null;

		while ((nextNode = parent.getNext()) != null) {
			if (data == nextNode.getData()) {
				parent.setNext(nextNode.getNext());
				decrementSize();
				return true;
			}

			parent = nextNode;
		}
		return false;
	}
	
	/**
	 * Method used to remove node from a given position 
	 */

	@Override
	public boolean removeAt(int position) {
		if (head == null) {
			return false;
		}

		if (position < 0) {
			position = 0;

		}

		if (position >= length) {
			position = length - 1;
		}

		if (position == 0) {
			head = head.getNext();
			decrementSize();
			return true;

		} else {
			Node tempNode = head;
			for (int i = 0; i < position; i++) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
			decrementSize();
			return true;
		}
	}

	/**
	 * return current list size
	 */
	@Override
	public int size() {
		return length;
	}

	/**
	 * Delete all elements in list
	 */
	@Override
	public void deleteAll() {

		head = null;
		length = 0;

	}

	/**
	 * utility method to increment size on each insertion
	 */
	private void incrementSize() {
		this.length++;
	}

	/**
	 * utility method to decrement size on each deletion
	 */
	private void decrementSize() {
		this.length--;
	}

	@Override
	public void traverse() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node tempNode = head;

		while (tempNode != null) {
			System.out.print("-> " + tempNode.getData());
			tempNode = tempNode.getNext();
		}
		System.out.println();

	}

}
