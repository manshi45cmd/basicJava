package recursion;

public class Numm {
	
//	public static void print(int n) {
//		if(n > 0) {
//			print(n -1);
//			System.out.println(n + " ");
//		}
//		
//	}
	
	public static int sum(int nn) {
		
		return nn = nn%10+ sum(nn/10);
	}
	
	public static void main(String[] args) {
		 
		 int nn = 123;
		 
		 sum(nn);
		 
//		 print(5);
	}

}
 