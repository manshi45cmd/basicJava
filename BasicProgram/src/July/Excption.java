package July;

import java.util.*;
public class Excption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of a ");
        
        int a = scn.nextInt();
        
        System.out.println("Enter value of  b ");
        
        int b = scn.nextInt();
        try {     
            int c = a/b;
            System.out.println("out put od a/b " +c);
        }
           catch(ArithmeticException e) {
        	   System.out.println(e);
           }
      
        
        System.out.println("neha");
	
	
	
	int[]arr = new int[5];
	
	arr[0] = 2;
	arr[1]= 12;
	arr[2]= 22;
	arr[3]= 21;
	arr[4]= 31;
	
	try {
		System.out.println(arr[6]);
	}catch(AlreadyBoundException e) {
		//System.out.println(e);
	}
	
	}

}
