package stack.list;

public class App {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Current Size "+stack.size());
		
		System.out.println("Popped item "+stack.pop());
		System.out.println("Popped item "+stack.pop());
		System.out.println("Popped item "+stack.pop());
		System.out.println("Popped item "+stack.pop());
		System.out.println("Current Size "+stack.size());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Current Size "+stack.size());
		

	}

}
