package lab7;

public class Calculator {
	
	public static int calculatoeSum (int a, int b) {
		return a + b ;
		
	}
	
	public static double calculateSum(double a, double b, double c) {
		return a + b + c ;
		
	}
  
	public static int calculateSum(int[] array) {
		int sum = 0;
		for(int num: array) {
			sum  += num;
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(Calculator.calculatoeSum(2,3 ));
		System.out.println(Calculator.calculateSum(1.2,2.3,3.4));
		System.out.println(Calculator.calculateSum(new int[] {1,2,3,4,5}));
	}
}
