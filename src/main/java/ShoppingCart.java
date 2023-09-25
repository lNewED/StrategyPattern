
public class ShoppingCart {
	private PaymentStrategy paymentStrategy;
	
	public ShoppingCart() {
		this.paymentStrategy = new CashPayment();
	}
	
	public void serPaymentStrategy(PaymentStrategy strategy) {
		this.paymentStrategy = strategy;
	}
	

	public void checkout (int amount) {
		paymentStrategy.pay(amount);
	}
	
	
}
