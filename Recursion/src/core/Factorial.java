package core;


/**
 * This class demonstrate finiding factorial using recursion 
 * 
 * call sequence goes as 
 * 
 * 5 * (5-1)
 * 4 * ( 4-1)
 * 3 * (3-1)
 * 2 * (2-1)
 * 
 * if 1 return 1
 * 
 * 1 * 2 = 2
 * 2 * 3 = 6 
 * 6 * 4 = 24
 * 24 * 5 = 120
 * 
 * @author mohamed.thaiseer
 *
 */
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}

		return num * factorial(num - 1);
	}

}
