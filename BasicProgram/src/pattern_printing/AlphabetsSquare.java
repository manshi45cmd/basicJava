package pattern_printing;

public class AlphabetsSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 5;
//		char ch;
//         for(int i=1;i<=n;i++) {
//        	    ch = 'A';
//        	 for(int j=1;j<=n;j++) {
//        		 System.out.print( ch +" ");
//        		   ch++;
//        	 }
//        	 System.out.println();
//         }
		int n= 5;
		int a;
		for(int i= 1;i<=n;i++) {
			a= 1;
			for(int j = 1; j<=n;j++) {
				 int d = a+64;
				 char ch=(char)d;
				 System.out.print(ch +" ");
				 a++;
			}
			System.out.println();
		}
	}

}
