package string;
import java.util.*;
public class StringBuilderSB {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Hello");
	System.out.println(str);
	
	 str.setCharAt(0,'m');
	 System.out.println(str);
	 
//	 str.append(false);
//	 System.out.println(str);
	 
	 str.append('o');
	 System.out.println(str);
	 
	 str.insert(3, 'y');
	 System.out.println(str);
	 
	 str.deleteCharAt(0);
	 System.out.println(str);
	 
	 StringBuilder str1 = new StringBuilder("Manshii");
	 
	 System.out.println(str1);
	 
	 str1.reverse();
	 System.out.println(str1);
	 
	 str.delete(2, 4);
	 System.out.println(str);
	 
	}

}
