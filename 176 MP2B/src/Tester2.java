import edu.monmouth.cs176.s1284564.mp2.Class2;

public class Tester2 {

	public static void main(String[] args) {
		
		Class2 class2test = new Class2(100);

		class2test.load();
		class2test.search(1);
		class2test.findMax();
		class2test.findMin();
		class2test.findMaxPos();
		class2test.findMinPos();

		System.out.println("Search found?: " + class2test.search(1));
		System.out.println("Maximum Value: " + class2test.findMax());
		System.out.println("Minimum Value: " + class2test.findMin());
		System.out.println("Maximum Value Index Position: " + class2test.findMaxPos());
		System.out.print("Minimum Value Index Position: " + class2test.findMinPos());

	}

}
