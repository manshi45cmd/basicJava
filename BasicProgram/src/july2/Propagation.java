package july2;

public class Propagation {

//	Write a Java program to demonstrate exception propagation
//	from a called method to the calling method.
	
	public static void add() {
		int a = 190;
		int b = 0;
		
		try {
		int c = a/b;
		} catch(ArithmaticException e){
			System.out.println(e);
			
		}
		
		
		
	}
	
	
}
