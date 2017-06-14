package ds.search.core;

public class BinarySearchOrderedIterative {

	public static void main(String[] args) {
		int[] orderedListBs = { 1, 2, 4, 6, 10, 15 };
		System.out.println("binarySearchOrderedIterativeWay : " + binarySearchOrderedIterativeWay(orderedListBs, 5));

	}

	/**
	 * Time complexity : O(log n)
	 * 
	 * @param values
	 * @param searchItem
	 * @return
	 */
	public static int binarySearchOrderedIterativeWay(int[] values, int searchItem) {

		int start = 0;
		int end = values.length - 1;

		while (start < end) {

			int mid = (start + end) / 2;

			if (values[mid] == searchItem) {
				return mid;
			} else if (searchItem > values[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;
	}

}
