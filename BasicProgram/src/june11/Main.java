package june11;

public class Main  {
	public static void main(String[] args) {
		
		Appliance a = new Appliance();
		a.setBrandName("Voltes");
		a.setPrice(300000);
		System.out.println(a);
		
		Television t1 = new Television(); // default cons.
		t1.setBrandName("Acer");
		t1.setLoudness("60db");
		t1.setPrice(300000);
		t1.setSize( 30);
		
		System.out.println(t1);
		t1.changeChanel();
		t1.mainFunction();
		
	
		Television t2 = new Television(40,"40db");
		
		Television t3 = new Television("samsung",40000, 40,"50db");
		
		//WashingMatchine  w1 new = WashingMatchine();
		//w1.getBrandName("LG");
		
				
		
		
	}

//	public Main() {
//		super();
//	}

}
