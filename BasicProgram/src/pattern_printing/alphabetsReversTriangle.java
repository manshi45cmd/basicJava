package pattern_printing;

public class alphabetsReversTriangle {
	public static void main(String[] args) {
		int n = 5;
		int a;
		for(int i = 1; i<=n;i++) {
			a = 1;
			for(int j=1;j<=n+1-i;j++) {
				int d = a+64;
				char ch = (char)d;
				System.out.print(ch+" ");
				a++;
			}
			System.out.println();
		}
	}

}
