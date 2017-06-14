package ds.ll.adt.doubly;

public class DoublyLinkedList implements IDoublyList {
	private int data;
	private DLLNode head;
	private DLLNode tail;
	private int length;

	public DoublyLinkedList() {
		head = new DLLNode(Integer.MIN_VALUE, null, null);
		tail = new DLLNode(Integer.MIN_VALUE, head, null);
		head.setNext(tail);
		this.length = 0;
	}

	@Override
	public void insertAtBegining(int data) {

		DLLNode newNode = new DLLNode(data, head, head.getNext());
		newNode.getNext().setPrevious(newNode);
		head.setNext(newNode);
		incrementSize();

	}

	@Override
	public void insertAtEnd(int data) {

		DLLNode newNode = new DLLNode(data, tail.getPrevious(), tail);
		newNode.getPrevious().setNext(newNode);
		tail.setPrevious(newNode);
		incrementSize();

	}

	@Override
	public void insertAt(int data, int position) {

		if (position < 0) {
			position = 0;
		}

		if (position > length) {
			position = length;
		}

		if (head == null) {
			head = new DLLNode(data);
			tail = head;
		} else if (position == 0) {
			DLLNode newNode = new DLLNode(data);
			newNode.setNext(head);
			head = newNode;
		} else {

			DLLNode tempNode = head;
			for (int i = 0; i < position; i++) {
				tempNode = tempNode.getNext();
			}

			DLLNode newNode = new DLLNode(data);
			newNode.setNext(tempNode.getNext());
			newNode.setPrevious(tempNode);
			tempNode.setNext(newNode);
			newNode.getNext().setPrevious(newNode);
		}
		incrementSize();

	}

	@Override
	public void traverse() {

		if (length == 0) {
			System.out.println("List is empty");
			return;
		}

		DLLNode temp = head.getNext();
		while (temp != tail) {
			System.out.print(" " + temp.getData());
			temp = temp.getNext();
		}
		System.out.println();

	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public boolean removeFromHead() {
		if (length == 0) {
			return false;
		}
		DLLNode save = head.getNext();
		head.setNext(save.getNext());
		save.getNext().setPrevious(head);
		decrementSize();
		return true;

	}

	private void incrementSize() {
		length += 1;
	}

	private void decrementSize() {
		length -= 1;
	}

	@Override
	public boolean removeTail() {
		if (length == 0) {
			return false;
		} else {
			DLLNode deleteNode = tail.getPrevious();
			tail.setPrevious(deleteNode.getPrevious());
			deleteNode.getPrevious().setNext(tail);
			decrementSize();
			return true;
		}

	}

	@Override
	public boolean removeFrom(int position) {
		if (head == null) {
			return false;
		}

		if (position < 0) {
			position = 0;
		}

		if (position > length) {
			position = length;
		}

		if (position == 0) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			}
		} else {

			DLLNode deleteNode = head;
			for (int i = 0; i < position; i++) {
				deleteNode = deleteNode.getNext();
			}

			deleteNode.getNext().setPrevious(deleteNode.getPrevious());
			deleteNode.getPrevious().setNext(deleteNode.getNext());
			decrementSize();
			return true;

		}

		return false;
	}

	@Override
	public void deleteAll() {
		head = null;
		tail = null;
		length =0;
	}

}
