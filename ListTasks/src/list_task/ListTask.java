package list_task;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class ListTask {

	public static void main(String[] args) {
		//Create LinkedList
		Random rand = new Random();
		int numOfElements = 10;
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < numOfElements; i++) {
			list.add(rand.nextInt(50) + 1);
		}
		//original list
		System.out.println("Original List");
		System.out.println(list);
		
		//sort list
		System.out.println("\nSorted list");
		List<Integer> sortedList = new LinkedList<>();
		for(Integer i : list) {// used this to keep the original list
			sortedList.add(i);
		}
		Collections.sort(sortedList);
		System.out.println(sortedList);
		
		//reverse order list
		System.out.println("\nReverse sorted list");
		List<Integer> reverseOrder = new LinkedList<>();
		reverseOrder = sortedList;
		Collections.reverse(reverseOrder);
		System.out.println(reverseOrder);
		
		//delete element from list
		List<Integer> removedIndexList = new LinkedList<>();
		int removeIndex = 3;
		for(Integer i : list) {
			removedIndexList.add(i);
		}
		removedIndexList.remove(removeIndex);
		System.out.println("\nRemoved Index List");
		System.out.println(removedIndexList);
		
		//Find all the even and odd numbers and put them in separate lists
		List<Integer> evenNumbers = new LinkedList<>();
		List<Integer> oddNumbers = new LinkedList<>();
		
		for(Integer i : list) {
			if(i%2 == 0) {
				evenNumbers.add(i);
			}else {
				oddNumbers.add(i);
			}
		}
		
		System.out.println("\nEven Numbers");
		System.out.println(evenNumbers);
		System.out.println("\nOdd Numbers");
		System.out.println(oddNumbers);
		
		//Find sum of all even and odd numbers and find the max sum
		int evenSum = 0;
		int oddSum = 0;
		
		for(Integer i : evenNumbers) {
			evenSum += i;
		}
		for(Integer i : oddNumbers) {
			oddSum += i;
		}
		
		if(evenSum > oddSum) {
			System.out.println("\nEven is the max: " + evenSum);
		}else {
			System.out.println("\nOdd is the max: " + oddSum);
		}
		
		//Find the minimum and the maximum element in the list
		int minNum = list.get(0);
		int maxNum = list.get(0);
		
		for(Integer i : list) {
			if(i < minNum) {
				minNum = i;
			}else if(i > maxNum){
				maxNum = i;
			}
		}
		
		System.out.println("\nMaximum Number in list: " + maxNum);
		System.out.println("\nMinimum Number in list: " + minNum);
		
		//Find all the Palindrome numbers in list
		List<Integer> palindromeList = new LinkedList<>();
		for(Integer i : list) {
			if(i%11 == 0) {
				palindromeList.add(i);
			}
		}
		System.out.println("\nPalindrome List");
		System.out.println(palindromeList);
	}
}
