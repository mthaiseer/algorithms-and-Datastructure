package core;

/**
 * Generate binary represenation of a digit
 * @author mohamed.thaiseer
 *
 */
public class GenerateBinaryNumbers {

	public static void main(String[] args) {
		binary(21);
	}

	public static void binary(int val) {
		if (val == 0) {
			return;
		}

		binary(val / 2);
		System.out.print(val % 2);
	}
}
