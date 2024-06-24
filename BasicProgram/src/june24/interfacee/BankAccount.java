package june24.interfacee;

 
	//Question 3: Create an abstract class called BankAccount with an abstract
	//method calculateInterest(). Then, create two concrete classes SavingsAccount and CheckingAccount that extend 
//	the BankAccount class and implement the calculateInterest() method.
  
	public abstract class BankAccount {
		  public  double balance;

		  public BankAccount(double balance) {
		    this.balance = balance;
		  }

		  public abstract double calculateInterest();

		  public double getBalance() {
		    return balance;
		  }
		}
