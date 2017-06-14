package stack.dynamic.array;

public class Stack {

	//stack values
	private int[] values;
	//top element
	private int top = -1;
	//default size, will increase 2N basis
	private int size = 2;

	public Stack() {
		values = new int[size];
	}

	/**
	 * Add element into queue 
	 * stack will automatically expand if size meet threshold 
	 * @param data
	 */
	public void push(int data) {

		if (isFull()) {
			size = size * 2;
			expand(size);
		}
		values[++top] = data;

	}

	/**
	 * Retreiving element from the top and decrease position 
	 * stack will automatically shrink if number of elements is low 
	 * @return
	 */
	public int pop() {
		shrink();
		if (isEmpty()) {
			System.out.println("stack is empty...");
			return -1;
		}
		int itemPopped = values[top];
		--top;
		return itemPopped;
	}

	/**
	 * Retrieving top element without removing it
	 * @return
	 */
	public int peek(){
		if (isEmpty()) {
			System.out.println("stack is empty...");
			return -1;
		}
		
		return values[top];
	}

	/**
	 * Shrink stack size
	 */
	private void shrink() {

		if (size > 0 && top == size / 4) {
			this.size = size / 2;
			System.out.println("Shrinking size with less length " + size);
			shrink(this.size);

		}

	}

	/**
	 * Expand stack size if stack is full
	 * @param newSize
	 */
	private void expand(int newSize) {

		System.out.println("expanding with new size of " + newSize);

		int[] tempArray = new int[newSize];

		for (int i = 0; i < values.length; i++) {
			tempArray[i] = values[i];

		}
		this.values = tempArray;
		tempArray = null;

	}
	/**
	 * Shrink utility method
	 * @param newSize
	 */
	private void shrink(int newSize) {

		System.out.println("expanding with new size of " + newSize);

		int[] tempArray = new int[newSize];

		for (int i = 0; i < newSize; i++) {
			tempArray[i] = values[i];

		}
		this.values = tempArray;
		tempArray = null;

	}

	/**
	 * Check stack is full
	 * @return
	 */
	public boolean isFull() {
		return top >= size - 1;
	}

	/**
	 * Check stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return top < 0;
	}

	/**
	 * Get stack size
	 * @return
	 */
	public int size() {
		return top+1;
	}

}
