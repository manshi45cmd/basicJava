package TakeInput;

import java.util.*;

public class FibonacciNumber {
	
	public static void main(String[] args) {
		
		 System.out.print("enter a number : ");
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 int a = 0;
		 int b = 1;

		 for(int i=0;i<=n;i++) {
			 
			 System.out.println(a);
			 int c = a+b;
			 a=b;
			 b=c;
		 }
	}

}
