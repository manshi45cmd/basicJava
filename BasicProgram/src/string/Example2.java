package string;

public class Example2 {

	public static void main(String[] args) {
		 
		String s= "manshi ";
		String s2 = "keha";
//		s= s.toUpperCase();
//		System.out.println(s);
		
//		int len =s.length();	 
//		System.out.println(len);
//		
//		System.out.print("CharAt() :");
//		System.out.println(s.charAt(3));
//		
//		System.out.println("indexOf : ");
//		System.out.println(s.indexOf('h'));
		
		//System.out.println(s.compareTo(s2));
//		System.out.println(s.contains("n"));
        System.out.println(s.startsWith("col"));
        System.out.println(s.startsWith(s, 0));
        System.out.println(s.endsWith("hi"));	
        System.out.println(s.concat(s2));
	}

}
