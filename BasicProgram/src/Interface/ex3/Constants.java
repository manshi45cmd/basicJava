package Interface.ex3;

public class Constants {
	
	public  final static  double PI = 3.14;
	public  double radious;
	int area;
	
	public  final static double calculateArea(double radious ) {
		return   PI* radious *radious;	 
	}
	
		public static void main(String[] args) {
		System.out.println(calculateArea(5));
	} 
}


