package queue.list;

public class App {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		
		System.out.println("Size :"+ queue.size());
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println("Size :"+ queue.size());

	}

}
