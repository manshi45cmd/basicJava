    package lab19.Assignment3;
 
public class Example {

	
//	 define a static method 
	public static int squareOfNum(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		// use a method reference to call static method  
		Squre s  = Example :: squareOfNum;
		
		 // perform calculation using  method reference
		int ans = s.calculate(12);
		
		System.out.println("The square of Number is :" + ans);
	}
}
