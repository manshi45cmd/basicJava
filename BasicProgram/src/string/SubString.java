package string;

public class SubString {

	public static void main(String[] args) {
		 
		String s = new String("neha");
		String s1 = "Shrivastava";
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(4));
		
		String str = "physics";
		for(int i=2;i<5;i++) {
			System.out.print(str.substring(i));
		}
		System.out.println();
		
		String s2= "abcd";
		for(int i =0;i<s2.length();i++) {
			for(int j=i+1;j<=s2.length();j++) {
				System.out.print(s2.substring(i,j)+" ");
			}
			
			System.out.println();
 
		}

//	intering and how to avoid intering using new keyword;
		
		String ss = "hello"; // same heap memory
		String sb = "hello"; /// smae heap memmory
		
		sb = "mello";// not change in ss 
		
		String sc = new  String( "hello"); // different heap memory
		System.out.println(ss);
		
		

	}

}
