package string;
import java.util.*;
import java.lang.*;
public class Palin {
	
	public static  boolean isPalindrom(String s) {

int i  =0  ;
int  j  = s.length()-1 ;
 

while(i<j) {
	 if(s.charAt(i) !=s.charAt(j)) {
       return false;
	 }
	 i++ ;
	 j-- ;
}
      return true ;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palin p = new Palin();
     String s = "naman";
     System.out.println(p.isPalindrom(s));

  
 

}

}
