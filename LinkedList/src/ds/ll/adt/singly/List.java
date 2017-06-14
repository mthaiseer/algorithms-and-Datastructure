package ds.ll.adt.singly;

public interface List {
	
	public void insertAtHead(int data);
	public void insertAtTail(int data);
	public void insertAt(int data, int position);
	public boolean removeFromHead();
	public boolean removeFromTail();
	public boolean remove(int data);
	public boolean removeAt(int position);
	public void traverse();
	public int size();
	public void deleteAll();
	
	

}
