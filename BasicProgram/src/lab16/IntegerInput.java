package lab16;
import java.util.*;
public class IntegerInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean validInput = false;
		int userInput = 0;
		
		while(!validInput) {
			try {
				System.out.println("Enter an integer: ");
				userInput = sc.nextInt();
				validInput = true;
				}
			catch(InputMismatchException e)
			{
			   System.out.println(" Invalid input please enter integer");	
			}
			break;
		}
		 
		
		System.out.println("you entered: " + userInput);
	}

}
