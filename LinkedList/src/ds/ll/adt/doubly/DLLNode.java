package ds.ll.adt.doubly;

public class DLLNode {

	private int data;
	private DLLNode next;
	private DLLNode previous;

	public DLLNode(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public DLLNode(int data, DLLNode previous, DLLNode next) {
		this.data = data;
		this.previous = previous;
		this.next = next;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	public DLLNode getPrevious() {
		return previous;
	}

	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}

}
