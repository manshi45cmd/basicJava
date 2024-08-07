package designPattern;

public class Test {
	
 public static void main(String[] args) {
	 
	 
		SingleDesignPattern s =   SingleDesignPattern.getInstance();
		
		SingleDesignPattern s2 = SingleDesignPattern.getInstance();
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}

}
