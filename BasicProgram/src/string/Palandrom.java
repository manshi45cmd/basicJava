package string;
import java.util.*;

public class Palandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "naman";
		 
		 
        int i  =0  ;
        int  j  = s.length()-1 ;
        boolean flg = true ;
       
        while(i<j) {
       	 if(s.charAt(i) ==s.charAt(j)) {
       		 i++ ;
       		 j-- ;
       	 }else {
       		 System.out.println("not palindrom");
       		 flg = false ;
       		 break ;
       	 }
        }
       
        if(flg) {
       	 System.out.println("palindrom");
        }
 
	}

}