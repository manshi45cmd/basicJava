package singleInheritance;

public class Device {
	
	 protected String brand ;
	protected String model;
	 
	public void display() {
		System.out.println("brand is " + this.brand);
		System.out.println("model is "+ this.model);
	}
	
	
	
	public void  powerOn() {
		System.out.println(" devoce is getting on ");
		
	}
	public void powerOff() {
		System.out.println("device is getting off");
	}

}

