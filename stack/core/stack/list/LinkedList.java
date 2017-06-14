package stack.list;

public class LinkedList {
	
	private Node root;
	private int size;
	
	public void add(int data){
		
		if(root == null){
			root = new Node(data);
			size++;
			
		}else{
			Node tempNode = new Node(data);
			tempNode.setNextNode(root);
			root = tempNode;
			size++;
		}
	}
	
	public int get(){
		
		if(size == 0){
			System.out.println("stack is empty");
			return -1;
		}
		int headData =  root.getData();
		root = root.getNextNode();
		size--;
		return headData;
	}
	
	public int peek(){
		
		if(size == 0){
			System.out.println("stack is empty");
			return -1;
		}

		return root.getData();
	}
	
	public boolean isEmpty(){
		return size >0;
	}
	
	public int size(){
		return size;
	}
	

}
