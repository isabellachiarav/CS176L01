import edu.monmouth.cs176.s1284564.mp2.Class1;

public class Tester1 {

	public static void main(String[] args) {

		Class1 class1test = new Class1(100);

		class1test.load();
		class1test.search("abc");
		class1test.findMax();
		class1test.findMin();
		class1test.findLongest();
		class1test.findShortest();

		System.out.println("Search found?: " + class1test.search("abc"));
		System.out.println("Highest Lexicographically: " + class1test.findMax());
		System.out.println("Lowest Lexicographically: " + class1test.findMin());
		System.out.println("Longest Length: " + class1test.findLongest());
		System.out.print("Shortest Length: " + class1test.findShortest());

	}

}
