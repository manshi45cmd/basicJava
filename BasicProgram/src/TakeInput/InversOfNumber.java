package TakeInput;

import java.util.*;

public class InversOfNumber {
  public static void main(String[] args) {
	  
	  System.out.println("enter a digiths of numbers : ");
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
	int inv = 0;
	int op = 1;
	while(n != 0) {
		int od = n %10;
		int id = op;
		int ip = od;
		
		inv = inv + id * (int)Math.pow(10,ip-1);
		
		n = n/10;
		op++;
		
	}
	System.out.println(inv);
}
}
