package string;
import java.util.*;

public class Plandromm {
	public static void main(String[] args) {
		
	
	StringBuilder str = new StringBuilder("naman");
	
	StringBuilder gtr =   new StringBuilder(str);
	gtr.reverse(); 
	
     boolean flag = false ;
	if(str.equals(gtr)) flag = true;
		
	
		//System.out.println("palindrome");
//		
//	else {
//		  flag = false;
////		System.out.println("not palindrome");
//	}
   System.out.println(flag);
}
}
