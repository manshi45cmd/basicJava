package interfacee.ex4;

public class Test {

	public static void main(String[] args) {
		 
		Bankk b = new SBI();
		System.out.println("Rate of Interest :" +b.rateOfInterest());

		  Bankk b2 = new PNB();
		  System.out.println("Rate of Interest :" +b2.rateOfInterest());
	}

}
