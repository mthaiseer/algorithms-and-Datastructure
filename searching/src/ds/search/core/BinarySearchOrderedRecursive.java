package ds.search.core;

public class BinarySearchOrderedRecursive {

	public static void main(String[] args) {
		int[] orderedListBsr = { 1, 2, 4, 6, 10, 15 };
		System.out.println("binarySearchOrderedRecursiveWay : "
				+ binarySearchOrderedRecursiveWay(orderedListBsr, 4, 0, orderedListBsr.length - 1));

	}

	/**
	 * Time complexity : O(log n)
	 * 
	 * @param values
	 * @param searchItem
	 * @param start
	 * @param end
	 * @return
	 */
	public static int binarySearchOrderedRecursiveWay(int[] values, int searchItem, int start, int end) {

		int mid = (start + end) / 2;

		if (values[mid] == searchItem) {
			return mid;
		} else if (searchItem < values[mid]) {
			return binarySearchOrderedRecursiveWay(values, searchItem, start, mid - 1);
		} else {
			return binarySearchOrderedRecursiveWay(values, searchItem, mid + 1, end);
		}

	}

}
