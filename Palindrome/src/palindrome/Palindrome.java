package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // setting up scanner
		String str;
		System.out.print("Input a string: ");
		str = input.next();
		boolean flag = true; // flag
		
		for(int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
			if(str.charAt(i) != str.charAt(j)) { //  check to see if the letters are not the same
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
