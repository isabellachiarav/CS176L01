import java.text.NumberFormat;
import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double sale = 0, paymentAmount = 0;
		final int SENTINEL = -1;
		boolean purchaseLoop = true;
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		final double DISCOUNT = .10, MINIMUMPURCHASE = 50;
		
		//create a CashRegister object
		CashRegister register1 = new CashRegister();
		
		
		//use a loop to accept purchases from the screen until a SENTINEL value of -1 is typed
		while (sale != -1) {
			register1.recordPurchase(sale);
			System.out.print("Enter a purchase amount (type '-1' to stop): ");
			sale = scan.nextDouble();
		}
		
		//calculate discount
		register1.calcDiscount(DISCOUNT, MINIMUMPURCHASE);
		
		//accept payment for the purchases
		System.out.print("Enter payment: ");
		paymentAmount = scan.nextDouble();
		register1.receivePayment(paymentAmount);
		
		//calculate and print the amount of change due to the customer 
		System.out.println("Your change: " + fmt.format(register1.giveChange()));

	}

}
