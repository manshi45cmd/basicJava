package singleInheritance;

public class SmartPhone extends Device{
	
	   String operatingSystem;
	     String camraResolution;
	
	public void takePhoto() {
		System.out.println("click photo");
	}
	
	@Override
	public void display()
	{
		System.out.println("brand is "+super.brand);
		
		System.out.println("model is "+ super.model);
		
		System.out.println("operatingSystem is "+ this.operatingSystem);
		System.out.println("camraResolution is "+ this.camraResolution);
	}

}
