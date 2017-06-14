package ds.sorting.nlogn.merge;

public class MergeSort {

	
	private static int[] values = { 5, 6, 9, 2, 1, 3 };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
