package ds.sorting.n2.selection;
/**
 * 
 * In each iteration find min among the set and swap to beginning 
 * 
 * Worst case Complexity : O(N2)
 * Space complexity : O(1)
 * 
 * @author mohamed.thaiseer
 *
 */
public class SelectionSort {

	private static int[] values = { 5, 6, 9, 2, 1, 3 };

	public static void main(String[] args) {
		traverse();
		sort();
		traverse();
	}

	/**
	 * Sort method
	 */
	public static void sort() {
		int min = -1;

		for (int i = 0; i < values.length - 1; i++) {
			min = i;

			for (int j = i + 1; j < values.length; j++) {
				if (values[j] < values[min]) {
					min = j;
				}
			}
			swap(min, i);
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
