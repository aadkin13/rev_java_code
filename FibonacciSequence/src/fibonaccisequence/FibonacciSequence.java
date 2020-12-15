package fibonaccisequence;

public class FibonacciSequence {
	public static void main(String args[]) {
		int k = 0, a = 1, b = 1; // initializing variables
		System.out.print("1 1 "); // print the starting numbers
		while(k <= 20) {
			k = a + b; // add the 2 previous number together
			System.out.print(k + " "); // print k
			a = b; // switching number to the next iteration
			b = k;
		}
	}
}
