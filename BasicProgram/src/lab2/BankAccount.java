package lab2;

public class BankAccount {

 public double balance;

   public BankAccount() {
	this.balance = 0.0;
	    }
  public void deposit(double amount) {
	    if (amount > 0) {
	     this.balance += amount;
	   }
	    else {
	    System.out.println("Deposit amount must be positive.");
	        }
	    }
 // @Override
	public void deposit(double amount, String description )
	{
		deposit (amount);
		if(amount > 0) {
			System.out.println(" deposited " + amount );
		}
	}
	
	public void deposit(BankAccount fromAccount,double amount) {
		if(fromAccount.balance >= amount) {
			fromAccount.balance -= amount;
			balance += amount;
			System.out.println("transferred "+ amount);
		}else {
			System.out.println("not transferred ");
		}
	}
	
	public double getBalance() {
		return balance;
 
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && this.balance >= amount) {
			
		} else {
			System.out.println("whithrawal failed ..");
		}
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account .deposit(100);
		System.out.println("Balance "+account.getBalance());
	
	BankAccount account2 = new BankAccount();
	account2.deposit(50,"Salary");
	System.out.println("Balance "+account2);
	
	BankAccount account1= new BankAccount();
	 
	account1.deposit(account1, 50);
	System.out.println("Balance " + account1.getBalance());
	
}

}
	

