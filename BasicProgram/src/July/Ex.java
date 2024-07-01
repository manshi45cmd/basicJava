package July;

import java.util.Scanner;
import java.util.*;
public class Ex {

	public static void main(String[] args) {
		
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
      
        
        System.out.println("rest of code ");
	}
		 

	}


