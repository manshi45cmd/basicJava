package designPattern;

import java.lang.reflect.Constructor;
 
public class Test1 {
	
	
 public static void main(String[] args) throws Exception  {
	 
	 
		SingleDesignPattern s =   SingleDesignPattern.getInstance();
		 
		System.out.println(s.hashCode());
		
		Constructor<SingleDesignPattern> cons = SingleDesignPattern.getInstance().getDeclaredConstructors();
		cons.setAccessible(true);
				
		SingleDesignPattern s2 = cons.newInstance( );
		
		System.out.println(s2.hashCode());
		 
	}
 
}
