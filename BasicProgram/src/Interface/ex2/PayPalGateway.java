package Interface.ex2;

public class PayPalGateway extends PaymentGateway{
	
	public void processPayment() {
		System.out.println(" processing PayPal Payment");
		
		System.out.println("payment successfull !!!");
	}

}
