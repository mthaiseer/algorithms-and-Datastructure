package ds.sorting.other.shell;
/**
 * 
 * Shell sort works on by reducing gap till it reaches gap by 1
 * once gap reduce to 1, it perform a selection sort 
 * 
 * Time complexity : O(n2)
 * Space complexity : O(n)
 * 
 * @author mohamed.thaiseer
 *
 */
public class ShellSort {

	private static int[] values = { 34, -3, 0, 2, 14, 8, -1, 24 };

	public static void main(String[] args) {

		traverse();
		sort();
		traverse();

	}

	public static void sort() {

		for (int gap = values.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < values.length; i++) {
				
				int j = i;
				while ((j >= gap) && (values[j - gap] > values[j])) {
					swap(j, j - gap );
					j = j - gap;
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
