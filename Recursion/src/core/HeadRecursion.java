package core;

/**
 * Head recursion means it perform data operation then perform recursion
 * 
 * Here sequence will be 10, 9, 8....1
 * 
 * @author mohamed.thaiseer
 *
 */
public class HeadRecursion {

	public static void main(String[] args) {

		headRecursion(10);

	}

	public static void headRecursion(int value) {

		// base case
		if (value == 0) {
			return;
		}
		// head recursion
		System.out.print(" " + value);
		// recursion call
		headRecursion(value - 1);

	}

}
