package june12;



public class Shape {


	
	public  static double  rectangleArea( double length,double width) {
		 return length * width;
		
	}
	
	public static double circleArea(double radius) {
		double pi = 3.14;
		return pi*radius*radius;
	}
	
	public static double triangleArea(double base,double height) {
		return 0.5*base*height;
	}
	
	public static void main(String[] args) {
		
		System.out.println(rectangleArea(30,14));
		System.out.println(circleArea(5));
		System.out.println(triangleArea(15,9));
		
		
		
	}
	
 
	
}
