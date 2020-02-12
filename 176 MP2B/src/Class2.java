import java.util.Scanner;

public class Class2 {
	
	Scanner in = new Scanner(System.in);
	int arrayLength = 0;
	int[] userArray;

	//constructor to make array of strings
	public Class2(int length) {
		arrayLength = length;
	}

	//load method for user to input strings
	public void load() {
		int [] integers = new int[arrayLength];
		System.out.print("Enter an integer, type Q to quit: ");
		arrayLength = 0;
		for (int i = 0; i < integers.length; i++) {
			if(in.hasNextInt()) {
				integers[i] = in.nextInt();
				System.out.print("Enter an integer, type Q to quit: ");
				arrayLength++;
			}
		}
		userArray = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			userArray[i] = integers[i];
		}
	}

	//returns true if inNum is in the array and false if it is not
	public boolean search(int inNum) {
		boolean ifInNum = false;
		for (int i = 0; i < arrayLength; i++) {
			if (inNum == userArray[i]) {
				ifInNum = true;
			}
		}
		return ifInNum;
	}
	
	
	//returns the maximum value in the array
	public int findMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arrayLength; i++) {
			if (userArray[i] > max) {
				max = userArray[i];
			}
		}
		return max;
	}
	
	//returns the smallest value in the array
	public int findMin() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arrayLength; i++) {
			if (userArray[i] < min) {
				min = userArray[i];
			}
		}
		return min;
	}
	
	//returns the index position of the largest number in the array
	public int findMaxPos() {
		int max = Integer.MIN_VALUE;
		int maxPos = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (userArray[i] > max) {
				max = userArray[i];
				maxPos = i;
			}
		}
		return maxPos;
	}
	
	//returns the index position of the smallest number in the array
	public int findMinPos() {
		int min = Integer.MAX_VALUE;
		int minPos = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (userArray[i] > min) {
				min = userArray[i];
				minPos = i;
			}
		}
		return minPos;
	}

}
