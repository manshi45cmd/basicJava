package TakeInput;

import java.util.*;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter numbers of digiths");
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 while(n>0) {
			 int div = n %10;
			 n = n /10;
			 System.out.println(div);
		 }

		  

	}	

}
