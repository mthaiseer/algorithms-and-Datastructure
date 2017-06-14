package ds.search.core;

public class UnOrderdListLinearSearch {

	public static void main(String[] args) {

		int[] unOrderedList = { 10, 20, 80, 40, 50 };
		System.out.println("linearSearchUnOrderedList : " + linearSearchUnOrderedList(unOrderedList, 20));

	}

	/**
	 * Time complexity : O(n)
	 * 
	 * @param values
	 * @param searchItem
	 * @return
	 */
	public static int linearSearchUnOrderedList(int[] values, int searchItem) {

		for (int i = 0; i < values.length; i++) {

			if (values[i] == searchItem) {
				return i;
			}

		}

		return -1;
	}

}
