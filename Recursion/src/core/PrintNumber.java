package core;

/**
 * 
 * @author mohamed.thaiseer
 *
 */
public class PrintNumber {

	public static void main(String[] args) {
		printFunction(5);
		System.out.println();
		
	}
	
	/**
	 * num =5 then   5 4 3 2 1 1 2 3 4 5
	 * @param num
	 */
	public static  void printFunction(int num){
		if(num<1){
			return;
		}
		
		System.out.print(" "+num );
		printFunction(num-1);
		System.out.print(" "+num );
	}
	


}
