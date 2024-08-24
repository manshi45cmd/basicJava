package lab19;

import lab19.Assignment1.Calculation;

public class A {
	
//	 creating functional interface
	public interface Calculation {
		public  int calculate(int a , int b);

	}
	
	public class LamdaExperssion {
		public static void main(String[] args) {
			
//			uses lambda expression to perform arithmetic operations	
				Calculation sum = (a,b) -> a+b;
				Calculation sub = (a,b) -> a-b;
				Calculation multi = (a,b) -> a*b;
				Calculation div = (a,b) -> a/b;
				
				System.out.println("Sum : " + sum.calculate(30,5) ); // print addition of two number
				System.out.println("Subtaction : " + sub.calculate(30, 5) ); // print subtraction of two number  
				System.out.println("Multiply : " + multi.calculate(30, 5) ); // print multiplication of two number
				System.out.println("Divion : " + div.calculate(30, 5) ); //print division of two number
			}
	}
	
	

}
