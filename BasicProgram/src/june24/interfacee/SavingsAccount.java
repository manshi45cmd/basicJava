package june24.interfacee;

public class SavingsAccount extends BankAccount  {
	private double interestRate;;
	
	public SavingsAccount(double balance,double interfaceRate) {
		super(balance);
		this.interestRate = interestRate ;
	}

	@Override
	

	 public double calculateInterest() {
		 double interest = balance*interestRate;
		 balance += interest;
		 return interest;
		 
	 }

}
