package recursion;

public class RecursionBasics {
	public static int factrorialFind(int g) {
		
		if(g == 0 ) {
			return 1;
		}
		else {
			return g*factrorialFind(g-1);
		}
	}
	public static void main(String[] args) {
		
	 
		int ans = factrorialFind(5);
		
		System.out.println(ans);
	}

}
 