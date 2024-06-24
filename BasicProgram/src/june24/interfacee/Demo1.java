package june24.interfacee;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccount ca = new CheckingAccount(0, 0);
         ca.balance = 454500.00;
         ca.monthlyFee = 18000;
//         ca.calculateInterest();
         System.out.println(ca);
	}

}
