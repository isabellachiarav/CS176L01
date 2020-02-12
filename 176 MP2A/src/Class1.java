import java.util.Scanner;

public class Class1 {

	Scanner in = new Scanner(System.in);
	int arrayLength = 0;
	String [] userArray;

	//constructor to make array of strings
	public Class1(int length) {
		arrayLength = length;
	}

	//load method for user to input strings
	public void load() {
		String [] strings = new String[arrayLength];
		System.out.print("Enter a string, type Q to quit: ");
		arrayLength = 0;
		for (int i = 0; i < strings.length; i++) {
			strings[i] = in.nextLine();
			if(strings[i].equals("Q")) {
				break;
			}
			System.out.print("Enter a string, type Q to quit: ");
			arrayLength++;
		}
		userArray = new String[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			userArray[i] = strings[i];
		}
	}

	//returns true if inWord is in the array and false if it is not
	public boolean search(String inWord) {
		boolean ifInWord = false;
		for (int i = 0; i < arrayLength; i++) {
			if (inWord.equals(userArray[i])) {
				ifInWord = true;
			}
		}
		return ifInWord;
	}

	//returns the string in the array which has the highest position in the lexicographic ordering
	public String findMax() {
		String highest = userArray[0];
		int lexicographic = 0;
		for (int i = 0; i < arrayLength - 1; i++) {
			if (highest.compareTo(userArray[i+1]) == lexicographic) {
				highest += ", " + userArray[i+1];
			}
			if (highest.compareTo(userArray[i+1]) > lexicographic) {
				lexicographic = highest.compareTo(userArray[i+1]);
				highest = userArray[i];
			}
		}
		return highest;
	}

	//returns the string in the array which has the lowest position in the lexicographic ordering
	public String findMin() {
		String lowest = userArray[0];
		int lexicographic = 0;
		for (int i = 0; i < arrayLength - 1; i++) {
			if (lowest.compareTo(userArray[i+1]) == lexicographic) {
				lowest += ", " + userArray[i+1];
			}
			if (lowest.compareTo(userArray[i+1]) < lexicographic) {
				lexicographic = lowest.compareTo(userArray[i+1]);
				lowest = userArray[i];
			}
		}
		return lowest;
	}

	//returns the longest string in the array
	public String findLongest() {
		String longest = null;
		int compare = Integer.MIN_VALUE;
		for (int i = 0; i < arrayLength; i++) {
			if (userArray[i].length() == compare) {
				longest += ", " + userArray[i];
			}
			else if (userArray[i].length() >= compare) {
				longest = userArray[i];
				compare = userArray[i].length();
			}
		}
		return longest;
	}

	//returns the shortest string in the array
	public String findShortest() {
		String shortest = null;
		int compare = Integer.MAX_VALUE;
		for (int i = 0; i < arrayLength; i++) {
			if (userArray[i].length() == compare) {
				shortest += ", " + userArray[i];
			}
			else if (userArray[i].length() <= compare) {
				shortest = userArray[i];
				compare = userArray[i].length();
			}
		}
		return shortest;
	}

}
