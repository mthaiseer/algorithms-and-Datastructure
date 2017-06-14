package ds.search.core;

public class OrderdListLinearSearch {

	public static void main(String[] args) {
		int[] orderedList = { 1, 2, 4, 6, 10, 15 };
		System.out.println("linearSearchOrderedList : " + linearSearchOrderedList(orderedList, 4));

	}

	/**
	 * Time complexity : O(n)
	 * 
	 * @param values
	 * @param searchItem
	 * @return
	 */
	public static int linearSearchOrderedList(int[] values, int searchItem) {

		for (int i = 0; i < values.length; i++) {

			if (values[i] == searchItem) {
				return i;
			} else if (values[i] > searchItem) {
				return -1;
			}

		}
		return -1;
	}

}
