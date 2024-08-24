package recursion;

public class Factrorial {
	
	public  static int getfactrorial(int g) {
		
		if(  g == 0) {
			return 1;
		}else {
			return g * getfactrorial(g-1);
		}
		 
	}
	
	public static void main(String[] args) {
		
		int k = 5;
		
	}

}
