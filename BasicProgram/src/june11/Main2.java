package june11;

public class Main2 {
	public static void main(String[] args) {
		
		Appliance a = new Appliance();
		a.setBrandName("Samsung");
		a.setPrice(300000);
		System.out.println(a);
		
		 WashingMatchine w1 = new  WashingMatchine();
		 w1.setCapacity( "15L");
		 w1.setPrice(25000);
		 w1.setBrandName("LG");
		 w1.setSize(19);
		
		 WashingMatchine w2 = new  WashingMatchine(29,"sony");
		 
		 System.out.println(w1);
		 System.out.println(w2);
		 
		
	}

	

}
