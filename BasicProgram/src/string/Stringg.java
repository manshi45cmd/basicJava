package string;

public class Stringg {
	
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "java";
		
		System.out.println("length of string :"+ str1.length()+str2.length());
		 
		 if(str1.compareTo(str2) > 0) {
			 System.out.println("Yes");
		 }else {
			 System.out.println("No");
		 }
	 
		 
	 System.out.println(capitalizeFirst(str1) + " "+capitalizeFirst(str2));
	}

	private static String capitalizeFirst(String str1) {
		// TODO Auto-generated method stub
		
		if(str1.length() == 0) {
			return str1;
		}
		return str1.substring(0,1).toUpperCase()+ ""+ str1.substring(1);
		 
	}

}
