package July1.ex1;

public class Demo {

	public static void main(String[] args) {
		
		Bank bb = new Bank();
		//unchecked execption 
		try {
			bb.withDraw(10);
		}catch(LowBalanceException e) {
			System.out.println(e);
		}
  // checked exception 
		try {
			bb.deposite(2222222);
		}catch (TooMuchAmountException e) {
			e.printStackTrace();
			
		}
		System.out.println("done....");
	}

}
