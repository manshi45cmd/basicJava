package singleInheritance;

public class Demo  {
	
	public static void main(String[] args) {
		
		SmartPhone d = new SmartPhone();
		 d.brand = "samsang";
		 d.model = "s23";
		 d. operatingSystem = "AOX";
	     d.camraResolution = "500px";
	     
	     d.display();
	     d.powerOff();
	     d.powerOn();
	     
	}
}
