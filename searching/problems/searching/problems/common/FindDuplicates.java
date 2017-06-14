package searching.problems.common;

import java.util.Arrays;
/**
 * This issue says to find a array of values ranging 0 .. n-1 has contains duplicates or not
 * 
 * True = {1,2,4,5,1}
 * False ={1,2,3,4,5}
 * 
 * @author mohamed.thaiseer
 *
 */
public class FindDuplicates {

	public static void main(String[] args) {

		int[] values = { 1, 3, 4, 5, 8, 1 };
		System.out.println("hasDuplicatesON2 :"+hasDuplicatesON2(values));
		System.out.println("hasDuplicatesSorted :"+hasDuplicatesSorted(values));

	}

	/**
	 * Brute for approch to test a arrays contains duplicates
	 * 
	 * Time complexity : O(n2)
	 * 
	 * @param values
	 * @return
	 */
	public static boolean hasDuplicatesON2(int[] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] == values[j]) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Better solution, with sorting complexity reduced
	 * 
	 * Time complexity : O(n)
	 * 
	 * @param values
	 * @return
	 */
	public static boolean hasDuplicatesSorted(int[] values) {

		if (values == null || values.length <= 0) {
			return false;
		}

		Arrays.sort(values);
		for (int i = 0; i < values.length-1; i++) {
			if (values[i] == values[i + 1]) {
				return true;
			}
		}

		return false;
	}

}
