
public class CashRegister {

	private double payment;
	private double purchase;
	double change;
	
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
	
	
}
