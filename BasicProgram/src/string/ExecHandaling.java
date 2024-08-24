package string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecHandaling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		try {
			System.out.println("enter 1st number:");
			int a = sc.nextInt();
			System.out.println("enter 2nd number:");
			int b = sc.nextInt();
			if(b== 0) {
				throw new ArithmeticException("/ by zero");
			}
			else { 
				int result = a/b;
				System.out.println(result);
			} 
		} catch(InputMismatchException e) {
			
			System.out.println(e);
        } catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
