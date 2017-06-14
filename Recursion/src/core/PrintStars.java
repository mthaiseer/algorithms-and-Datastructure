package core;

/**
 * print * 1, 2, 3, n-2, n-1, n  which is n(n+1)/2
 * if n=5 then 5(6)/2 = 15 times
 * @author mohamed.thaiseer
 *
 */
public class PrintStars {
	
	public static void main(String[] args) {
        algorithm(5);
	}

	public static void algorithm(int n) {
		int i = 0;
		if (n > 0) {
			algorithm(n - 1);
		}

		for (int j = i; j < n; j++) {
			System.out.print(" " + "*");

		}
		System.out.println();

	}

}
