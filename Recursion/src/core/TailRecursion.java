package core;

/**
 * Tail recursion means it perform recursion call first then perform data operation
 * 
 * Here sequence will be 1, 2,3,....10
 * 
 * @author mohamed.thaiseer
 *
 */
public class TailRecursion {

	public static void main(String[] args) {
		tailRecursion(10);
	}

	public static void tailRecursion(int value) {

		// base case
		if (value == 0) {
			return;
		}
		// recursion call
		tailRecursion(value - 1);
		// tail recursion
		System.out.print(" " + value);

	}

}
