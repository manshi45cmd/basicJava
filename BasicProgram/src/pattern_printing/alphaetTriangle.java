package pattern_printing;

public class alphaetTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		char ch;
		for(int i =1;i<=n;i++) {
			ch = 'A';
			for(int j = 1; j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
