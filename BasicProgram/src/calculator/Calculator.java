package calculator;
import java.util.*;

public class Calculator {
	
	 
	 
	Scanner sc = new Scanner(System.in);
	public void entervalue() {
		System.out.println(" Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
	}
 
	
	public static void main(String[] args) {
		
		System.out.println("Hello !!!! ");
		System.out.println("Welcome to Calculator.....");
		
	}
		 
		 public void calculator() {
			 
		 
		 while(true) {
			 System.out.println(" + for Addition \n - for Subtraction \n * for Multiplication \n / for Divison" );
			 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice: ");
				 
				int s = sc.nextInt();
		 
		
		 
		switch(s) { 
		case 1:
			 
			int addition = a+b;
			System.out.println(addition);
			break;
			
		case 2 :
			int subtraction = a-b;
			System.out.println("subtraction");
			break;
		
		case 3 :
			  int multiplation = a*b;
			  System.out.println("multiplation");
			  break;
		case 4 :
			double divion = a/b;
			System.out.println("divion");
			break;
			
		case 5 :
			break;
 
		  default :
			  System.out.println("You Enter a invalid choice ");
			
		}
		 }
		 
		 
	}
	

}
