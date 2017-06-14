package stack.fixed.array;

public class Stack {

	private int[] data;
	// index starts from 0 to 9
	private int size = 9;
	private int numberOfItems = -1;

	/**
	 * Default constructor
	 */
	public Stack() {
		data = new int[size];
	}

	/**
	 * Customer sized constructor
	 * @param size
	 */
	public Stack(int size) {
		this.size = size - 1;
		data = new int[this.size];
	}

	/**
	 * Adding new item o the stack
	 * @param value
	 */
	public void push(int value) {

		if (isFull()) {
			System.out.println("stack is full...");
			return;
		}

		data[++numberOfItems] = value;

	}
	
	
	/**
	 * Removing top item from the stack
	 * @return
	 */
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty....");
			return -1;
		}
		
		int itemPopped =  data[numberOfItems];
		--numberOfItems;
		return itemPopped;
		
		
	}
	
	/**
	 * Retriving top item from stack without removing it. 
	 * @return
	 */
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack is empty....");
			return -1;
		}

		return data[numberOfItems];
		
		
	}

	/**
	 * Check stack is full or not
	 * @return
	 */
	public boolean isFull() {
		return numberOfItems >= size;
	}
	
	/**
	 * Check stack is empty or not
	 * @return
	 */
	public boolean isEmpty(){
		return numberOfItems <0;
	}
	
	/**
	 * fetch stack current size
	 * @return
	 */
	public int size(){
		return numberOfItems+1;
	}

}
