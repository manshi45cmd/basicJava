package javaBean;

public class VehicleBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle();
		v1.setVehNumber("MP040004");
		v1.setVehModel("Pulser");
		v1.setVehPrice(150000);
        
		System.out.println(v1.getVehModel());
		System.out.println(v1.getVehNumber());
		System.out.println(v1.getVehPrice());
	}

}
