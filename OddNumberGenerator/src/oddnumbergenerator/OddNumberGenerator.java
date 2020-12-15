package oddnumbergenerator;

public class OddNumberGenerator {

	public static void main(String[] args) {
		int x = 50; // setting range
		for(int i = 0; i < x; i++) {
			if(i%2 != 0) { // testing whether it is divisible by 2
				System.out.println(i + " is an odd number");
			}
		}
	}

}
