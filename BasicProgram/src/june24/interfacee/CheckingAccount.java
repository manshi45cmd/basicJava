package june24.interfacee;

public class CheckingAccount  extends BankAccount {
	public double monthlyFee;
 public double balance;
	
	public CheckingAccount(double balance,double monthltyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
		
	}
	public  double calculateInterest() {
		balance -= monthlyFee;
	    return -monthlyFee;
		
	}	

}
