package string;
import java.util.*;
import java.lang.*;

public class Toggle {

 public static void main(String[] args) {
		 
		
 Scanner sc= new Scanner(System.in);
 StringBuilder str = new StringBuilder(sc.nextLine());
	int a = sc.nextInt();
 System.out.println(str);
 
for(int i =0;i<str.length();i++) {
	boolean flag = true;  // ture -> capital
	char ch = str.charAt(i);//A
	if(ch == a) continue;
	
	int asci = (int)ch; //65
	if(asci >= 97) flag = false; //small
	if(flag == true) {  //capital
	asci +=32;
	char dh =  (char)asci;
	 str.setCharAt(i, dh);
	
	}
	else {
		   asci =-32;
		   char dh = (char)asci;
		   str.setCharAt(i, dh);
	}
  
}	System.out.println(str);	

	}

}
