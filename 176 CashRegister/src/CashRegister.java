import java.text.NumberFormat;

public class CashRegister {

	private double payment;
	private double purchase;
	double change, purchaseDiscount;
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	//constructor to create a cash register with purchase = 0 and payment = 0
	public CashRegister() {
		purchase = 0;
		payment = 0;
	}
	
	//recordPurchase will record a sale and add the new sale amount to purchase
	public void recordPurchase(double sale) {
		purchase += sale;
	}
	
	//receivePayment will receive the amount paid by the customer into payment
	public void receivePayment(double paymentAmount) {
		payment += paymentAmount;
	}
	
	//giveChange will calculate and return the amount of change due to the customer 
	public double giveChange() {
		return change = payment - purchase;
	}
	
	public void calcDiscount(final double DISCOUNT, final double THRESHOLD) {
		if (purchase >= THRESHOLD) {
			purchaseDiscount = purchase * DISCOUNT;
			System.out.println("Your total purchases were " + fmt.format(purchase) + " and because you spent at least " + fmt.format(THRESHOLD) 
				+ ", you are entitled to a " + (DISCOUNT * 100) + " discount of " + fmt.format(purchaseDiscount) + " reducing your balance to " 
				+ fmt.format(purchase - purchaseDiscount) + ".");
		}
	}
	
	
}
