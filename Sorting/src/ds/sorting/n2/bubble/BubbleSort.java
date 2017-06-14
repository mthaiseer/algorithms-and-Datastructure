package ds.sorting.n2.bubble;
/**
 * Bubble sort always bubble highest item on the top 
 * 
 * Worst case Complexity : O(N2)
 * Space complexity : O(1)
 * 
 * 
 * @author mohamed.thaiseer
 *
 */
public class BubbleSort {

	private static int[] values = { 5, 6, 9, 2, 1, 3 };
	
	public static void main(String[] args) {
		traverse();
		sort();
		traverse();
	}

	public static void sort() {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length -1- i; j++) {

				if (values[j] > values[j+1]) {
					swap(j, j+1);
				}
			}
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
