import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFiles{

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter name of input file: ");
			String fileName = in.next();
			File inName = new File(fileName);
			in.close();
			total(inName);
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

	public static void total(File inName) throws FileNotFoundException{
		double sum = 0;
		PrintWriter fileTotal = new PrintWriter("total.txt");
		Scanner in = new Scanner(inName);
		while(in.hasNext()) {
			sum += Double.parseDouble(in.nextLine());
		}
		fileTotal.println("Total Sum: " + sum);
		in.close();
		fileTotal.close();
	}

}
