package Interface.ex2;

public class CreditCardGateway extends PaymentGateway {
	
	@Override
	
	public void processPayment() {
		System.out.println("processing creditcard Payment");
	    
		System.out.println("payment successfull !!!");
	
	}

}
