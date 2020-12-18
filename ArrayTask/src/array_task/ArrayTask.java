package array_task;

import java.util.Random;

public class ArrayTask {
	
	public static void main(String args[]) {
		// Create an array
		Random rand = new Random();
		int arrSize = 10;
		int arr[] = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			arr[i] = rand.nextInt(50) + 1;
		}
		
		// Task 1: print array in reverse order
		System.out.println("Original Array");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println("\nReversed Array");
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		// Task 2: Delete specific element from an array.
		int removeIndex = 3;
		int[] newArr = new int[arrSize - 1];
		for(int i = 0, j = 0; i < arr.length; i++) {
			if(i == removeIndex) {
				continue;
			}
			newArr[j++] = arr[i];
		}
		
		System.out.println("\nNew Array with missing element");
		for(int x : newArr) {
			System.out.print(x + " ");
		}
		
		// Task 3: find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
		int[] evenArray = new int[arrSize];
		int[] oddArray = new int[arrSize];
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				evenCount++;
				evenArray[i] = arr[i];
			}else {
				oddCount++;
				oddArray[i] = arr[i];
			}
		}
		
		int[] evenNums = new int[evenCount];
		int[] oddNums = new int[oddCount];
		
		for(int i = 0, j = 0; i < evenArray.length; i++) {
			if(evenArray[i] == 0) {
				continue;
			}
			evenNums[j++] = evenArray[i];
		}
		for(int i = 0, j = 0; i < oddArray.length; i++) {
			if(oddArray[i] == 0) {
				continue;
			}
			oddNums[j++] = oddArray[i];
		}
		
		System.out.println("\nEven Array");
		for(int x : evenNums) {
			System.out.print(x + " ");
		}
		System.out.println("\nOdd Array");
		for(int y : oddNums) {
			System.out.print(y + " ");
		}
		
		//Task 4: Find the sum of all even and odd numbers separately and print the max out of it. (max sum of even vs odd)
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int x : evenNums) {
			sumEven += x;
		}
		for(int y : oddNums) {
			sumOdd += y;
		}
		if(sumEven > sumOdd) {
			System.out.println("\nMax sum was the Even Array: " + sumEven);
		}else {
			System.out.println("\nMax sum was the Odd Array: " + sumOdd);
		}
		
		//Task 5: Find the minimum and the maximum element in an array.
		int minNum = arr[0];
		int maxNum = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minNum) {
				minNum = arr[i];
			}else if(arr[i] > maxNum){
				maxNum = arr[i];
			}
		}
		System.out.println("Minimum number: " + minNum);
		System.out.println("Maximum number: " + maxNum);
		
		//Task 6: Find all Palindrome numbers in an array.
		int[] tempArr = new int[arrSize];
		int tempCount = 0;
		for(int i = 0; i < tempArr.length; i++) {
			if(arr[i]%11 == 0) {
				tempCount++;
				tempArr[i] = arr[i];
			}
		}
		int[] palindromeArr = new int[tempCount];
		for(int i = 0, j = 0; i < tempArr.length; i++) {
			if(tempArr[i] == 0) {
				continue;
			}
			palindromeArr[j++] = tempArr[i];
		}
		System.out.println("Palindrome Array");
		for(int x : palindromeArr) {
			System.out.print(x + " ");
		}
	}
}
