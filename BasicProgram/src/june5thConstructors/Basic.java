package june5thConstructors;

public class Basic {
	public static void main(String[] args) {
		Car scorpio = new Car();
		scorpio.tyre = 4;
		scorpio.brand = "Mahindra";
		scorpio.modelname = "s11";
		
		System.out.println(scorpio.giveHorn() );
		
		System.out.println(scorpio.speed());
		
		System.out.println("scorpio object  ki puri jaankari " 
		+ "brand -->" +scorpio.brand + " model " +scorpio.modelname);
	}

}
