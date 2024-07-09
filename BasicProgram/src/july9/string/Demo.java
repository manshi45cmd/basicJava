package july9.string;

public class Demo {

	public static void main(String[] args) {
		 String s = "kiran"; // literal
		 
		 System.out.println(s);
		 
		 String kk = new String ("rasmi");// by using new keyword
		 
		 // String are immutable in  java
		 // heap area ---- sare object bante hai
		 
		 s = s+ "sighnaiya";
		 
		 System.out.println(s);
		 
		String a = "Virat";
		a.concat("Kohli");
		System.out.println(a);
	}

}