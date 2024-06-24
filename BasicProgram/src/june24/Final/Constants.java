package june24.Final;
//Create a class called Constants with
//a final variable PI and
//a final method calculateArea().

public class Constants {
	
	public static final double PI = 3.145;
	
	public final double calculateArea(double radius) {
		return PI* radius *radius;
	}
	
	public static void main(String[] args) {
		Constants c = new Constants();
		
		 
	}
	

}
