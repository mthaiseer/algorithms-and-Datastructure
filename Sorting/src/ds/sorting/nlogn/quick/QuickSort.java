package ds.sorting.nlogn.quick;

/**
 * Time Complexity : O(n log n)
 * Space complexity : O(n)
 * @author mohamed.thaiseer
 *
 */
public class QuickSort {

	private static int[] values = { 12, 9, 7, 15, 10 };

	public static void main(String[] args) {

		traverse();
		sort(values, 0, values.length - 1);
		traverse();

	}

	/**
	 * Sort method, which takes pivot, sort recursively 
	 * @param values
	 * @param start
	 * @param end
	 */
	public static void sort(int[] values, int start, int end) {
		
		if(end > start){
			int pivot = partition(values, start, end);
			sort(values, start, pivot - 1);
			sort(values, pivot + 1, end);
		}

	}

	/**
	 * Partion method which takes random value( end value here) and make all X< Y > Z format
	 * @param values
	 * @param start
	 * @param end
	 * @return
	 */
	private static int partition(int[] values, int start, int end) {

		int selectedVal = values[end];
		int i = 0, j = 0;

		for (j = 0; j < values.length; j++) {

			if (values[j] < selectedVal) {

				swap(i, j);
				i++;
			}

		}
		swap(i, end);

		return i;
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
	 * 
	 * @param previous
	 * @param next
	 */
	private static void swap(int previous, int next) {
		int temp = values[previous];
		values[previous] = values[next];
		values[next] = temp;
	}

}
