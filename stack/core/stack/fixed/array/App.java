package stack.fixed.array;

public class App {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		//fail
		stack.pop();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Current size :"+stack.size());
		
		System.out.println("popped :"+stack.pop());
		System.out.println("Current size :"+stack.size());
		
		System.out.println("popped :"+stack.peek());
		System.out.println("Current size :"+stack.size());
	}

}
