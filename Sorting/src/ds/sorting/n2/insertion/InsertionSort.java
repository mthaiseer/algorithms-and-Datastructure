package ds.sorting.n2.insertion;

/**
 * 
 * Each iteration item is places <=x x >=x position 
 * 
 * Worst case Complexity : O(N2)
 * Space complexity : O(1)
 * 
 * Input :  5 6 9 2 1 3
 * output : 1 2 3 5 6 9
 * @author mohamed.thaiseer
 *
 */
public class InsertionSort {

	private static int[] values = { 5, 6, 9, 2, 1, 3 };
	
	public static void main(String[] args) {
		traverse();
		sort();
		traverse();

	}
	
	public static void sort(){
		int j = 0;
		int nextMinVal = 0;
		for (int i = 1; i < values.length; i++) {
			
			j =i;
			nextMinVal =  values[j];
			
			while(j >=1 && values[j-1] >nextMinVal){
				values[j] = values[j-1];
				j--;
			}
			values[j] =  nextMinVal;
			
		}
	}
	
	/**
	 * private method to iterate arrays 
	 */
	private static void traverse() {
		for (int i = 0; i < values.length; i++) {
			System.out.print(" " + values[i]);
		}
		System.out.println();
	}

	/**
	 * Private method to swap method in a list
	 * @param previous
	 * @param next
	 */
	private static void swap(int previous, int next) {
		int temp = values[previous];
		values[previous] = values[next];
		values[next] = temp;
	}


}
