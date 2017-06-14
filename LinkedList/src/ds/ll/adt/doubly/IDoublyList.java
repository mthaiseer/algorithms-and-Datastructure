package ds.ll.adt.doubly;

public interface IDoublyList {
	
	public void insertAtBegining(int data);
	public void insertAtEnd(int data);
	public void insertAt(int data, int position);
	public void traverse();
	 
	public  int size();
	public boolean removeFromHead();
	public boolean removeTail();
	public boolean removeFrom(int position);
	public void deleteAll();
	
	
	

}
