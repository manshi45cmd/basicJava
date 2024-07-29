package unittesting;

public class Demoo {
	
	public  static int doCalculation(int a, int b) {
		 int c = a+b;
		 return c;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int ans = 30;
		
		if(ans == Demoo.doCalculation(a, b)) {
			System.out.println("test pass");
		}else
			{
			System.out.println("test fale");
			} 
		
	}
	
	
}