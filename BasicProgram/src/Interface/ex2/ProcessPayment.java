package Interface.ex2;

public class ProcessPayment {
	
	public static void main(String[] args) {
		 
		CreditCardGateway ccg = new CreditCardGateway();
		
		ccg.processPayment();
		//ccg.toString();
		
		PayPalGateway pp = new PayPalGateway();
		
		pp.processPayment();
		
		//PaymentGateway pg = new PaymentGateway();
		
		
		
	}
		 
		
	

}
