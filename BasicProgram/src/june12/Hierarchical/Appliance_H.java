package june12.Hierarchical;

public class Appliance_H {
	String brand ;
	String powerConsumption;
	
	public void powerOn() {
		System.out.println("power on");
	}
	public void powerOff() {
		System.out.println("power off");
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public void display() {
		
	}
	
	public Appliance_H() {};
	@Override
	public String toString() {
		return "Appliance_H [brand=" + brand + ", powerConsumption=" + powerConsumption + ", getBrand()=" + getBrand()
				+ ", getPowerConsumption()=" + getPowerConsumption() + "]";
	}
	

}
