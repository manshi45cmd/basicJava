package pattern_printing;

public class oddNumberTriangle {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1; i<=9;i=i+2) {
//			for(int j=1;j<=i;j=j+2) {
//				System.out.print( j );
//				 
//			}
//			System.out.println();
//		}
    int n = 5;
    for(int i=1;i<=n;i++) {
		int a = 1;
    	for(int j=1;j<=i;j++) {
    		System.out.print(j);
    		a=a+2;
    	}
    	System.out.println();
    }
	}

}
