package june12.override;

public class BankMain {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println( "Bank "+b.rate());
		
		SBI sb = new SBI();
		System.out.println("SBI "+sb.rate());
		
		Axis a = new Axis();
		System.out.println("Axis "+a.rate());
	}

}
