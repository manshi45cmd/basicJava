package string;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		 
		String s = "Manshi ";
		String ss = "Neha";
		String ss2 = "neha";


		s= s+" Shrivastav";
		System.out.println(s);
		
		s= s.toUpperCase();
		System.out.println("UperCase : " +s);
		
		System.out.println("Caontains value : "+ s.contains(s));
		
		System.out.println("length of String : "+ s.length());
		
		System.out.println("trim :"+ s.trim());
		
		System.out.println("split : "+s.split(s, 3));
		
		//System.out.println("reverse of string : "+s);
		
		System.out.println("subString : " + s.substring(3));
		System.out.println("repalce of character : " + s.replace(ss, s));
		
		System.out.println("compare two string :" +s.equals(ss));
		System.out.println("compare two Strings ignoring case : "+ ss.equalsIgnoreCase(ss2));
		
		System.out.println(s.codePointCount(0, 6));
		
	 

	}

}
