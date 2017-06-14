package stack.list;

public class Stack {
	
	LinkedList list;
	public Stack(){
		 list = new LinkedList();
	}
	
	public void push(int data){
		list.add(data);
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.size();
	}
	
	public int pop(){
		return list.get();
	}
	
	public int peek(){
		return list.peek();
	}

}
