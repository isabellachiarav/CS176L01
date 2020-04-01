
import java.util.Random;
import java.util.Scanner;

class Characteristics {

	public String[] characteristic;

	public Characteristics(String[] ch) {
		characteristic = new String[5];
		characteristic = ch;
	}
}

class FamilyExpressions extends Characteristics {

	public String[][] expression;
	public String[] combination;

	public FamilyExpressions(String[] ch, String[][] exp, String[] comb){
		super(ch);
		expression = new String[5][4];
		expression = exp;
		combination = new String[4];
		combination = comb;
	}

}

class Mother extends FamilyExpressions {

	public String[] mGene;
	public String mFirstName;

	public Mother(String[] ch, String[][] exp, String[] comb) {
		super(ch, exp, comb);
		mGene = new String[5];
	}

	public void changeMother(String[] m) {
		mGene = m;
	}
	
	public void setName(String inName) {
		mFirstName = inName;
	}
	
	public String getName() {
		return mFirstName;
	}

}

class Father {

	public String[] fGene;
	public String fFirstName;

	public Father() {
		fGene = new String[5];
	}

	public void changeFather(String[] f) {
		fGene = f;
	}
	
	public void setName(String inName) {
		fFirstName = inName;
	}
	
	public String getName() {
		return fFirstName;
	}

}

public class Child {
	public static void main(String[] args) {  
		
		Scanner sc = new Scanner(System.in);
		String inName, childName, gender, pronoun, childEyes, childHair, childHeight, childVision, another = "y";
		Random gene = new Random();
		String[] m = new String[5];
		String[] f = new String[5];
		String [] noValues = new String[5];
		int geneRandom = 0;
		String [] [] exp = {{"brown","blue","green","grey"},{"brown","black","blonde","red"},{"male","female","female","male"},{"6.5","6.0","5.5","5.0"},{"normal","nearsighted","farsighted","colorblind"}};
		String [] comb = {"DD","RR","DR","RD"};
		String [] ch = {"eyes", "hair", "sex", "height", "vision"};
		boolean end = false;

		Mother mother = new Mother(ch, exp, comb);
		Father father = new Father();

		while (end == false) {
			System.out.print("Enter the mother's name: ");
			inName = sc.nextLine();
			mother.setName(inName);
			System.out.print("Enter the father's name: ");
			inName = sc.nextLine();
			father.setName(inName);
			for (int i = 0; i < m.length; i++) {
				geneRandom = gene.nextInt(100) + 1;
				if (geneRandom >= 50) {
					m[i] = "R";
				}
				else {
					m[i] = "D";
				}
			}
			for (int i = 0; i < f.length; i++) {
				geneRandom = gene.nextInt(100) + 1;
				if (geneRandom >= 50) {
					f[i] = "R";
				}
				else {
					f[i] = "D";
				}
			}
			if((m[2] + f[2]).equals(comb[0]) || (m[2] + f[2]).equals(comb[3])) {
				gender = mother.expression[2][0];
				pronoun = "He";
			}
			else {
				gender = mother.expression[2][1];
				pronoun = "She";
			}
			System.out.println();
			System.out.print("The child is a " + gender + ". Please enter the name of the child: ");
			childName = sc.nextLine();
			System.out.println();
			System.out.print(childName + " is the child of " + mother.getName() + " and " + father.getName() + ". ");
			if ((m[0] + f[0]).equals(comb[0])){
				childEyes = mother.expression[0][0];
			}
			else if ((m[0] + f[0]).equals(comb[1])){
				childEyes = mother.expression[0][1];
			}
			else if ((m[0] + f[0]).equals(comb[2])){
				childEyes = mother.expression[0][2];
			}
			else {
				childEyes = mother.expression[0][3];
			}
			System.out.print(pronoun + " was born with " + childEyes + " " + mother.characteristic[0] + ", ");
			if ((m[1] + f[1]).equals(comb[0])){
				childHair = mother.expression[1][0];
			}
			else if ((m[1] + f[1]).equals(comb[1])){
				childHair = mother.expression[1][1];
			}
			else if ((m[1] + f[1]).equals(comb[2])){
				childHair = mother.expression[1][2];
			}
			else {
				childHair = mother.expression[1][3];
			}
			System.out.print(childHair + " " + mother.characteristic[1] + ", ");
			if ((m[3] + f[3]).equals(comb[0])){
				childHeight = mother.expression[3][0];
			}
			else if ((m[3] + f[3]).equals(comb[1])){
				childHeight = mother.expression[3][1];
			}
			else if ((m[3] + f[3]).equals(comb[2])){
				childHeight = mother.expression[3][2];
			}
			else {
				childHeight = mother.expression[3][3];
			}
			System.out.print("will grow to a " + mother.characteristic[3] + " of " + childHeight + ", ");
			if ((m[4] + f[4]).equals(comb[0])){
				childVision = mother.expression[4][0];
			}
			else if ((m[4] + f[4]).equals(comb[1])){
				childVision = mother.expression[4][1];
			}
			else if ((m[4] + f[4]).equals(comb[2])){
				childVision = mother.expression[4][2];
			}
			else {
				childVision = mother.expression[4][3];
			}
			System.out.print("and will have " + childVision + " " + mother.characteristic[4] + ".");
			System.out.println();
			System.out.println();
			System.out.print("Would you like to do another simulation? (y/n): ");
			another = sc.nextLine();
			if (another.equalsIgnoreCase("y")) {
				end = false;
			}
			else if (another.equalsIgnoreCase("n")) {
				end = true;
				System.out.println();
				System.out.println("The simulation has ended.");
			}
			else {
				System.out.print("Invalid input. Enter y/n: ");
				another = sc.nextLine();
				if (another.equalsIgnoreCase("y")) {
					end = false;
				}
				else if (another.equalsIgnoreCase("n")) {
					end = true;
					System.out.println();
					System.out.println("The simulation has ended.");
				}
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}
}
