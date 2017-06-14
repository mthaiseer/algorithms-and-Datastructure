package queue.list;

public class Queue {

	private Node front;
	private Node rear;
	private int size;

	public boolean isEmpty() {
		return size <= 0;
	}

	public void enQueue(int data) {

		Node oldRear = rear;
		Node tempRear = new Node(data);
		rear = tempRear;

		if (isEmpty()) {
			this.front = tempRear;
		} else {
			oldRear.setNextNode(rear);

		}
		size++;
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		int data = front.getData();
		front = front.getNextNode();
		size--;
		return data;
	}

	public int size() {
		return size;
	}

}
