package july8.vector;
import java.util.*;
public class Example2 {
	
	public static void main(String[] args) {
		
		Vector< Integer> v = new Vector<>();
		
		v.add(10 );
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
	 
		System.out.println("orignoal vactor");
		for(int vac:v) {
		 System.out.println(v);
		}
		 v.remove(2);
		 System.out.println(v);
		 
		 System.out.println("add new element");
		 v.add(2,  30);
		 System.out.println(v);
	 
		
		 boolean contains40 = v.contains(40) ;
		 System.out.println("vector contains the element 40");
		 System.out.println(v);
		 
		 v.removeAll(v);
		 System.out.println(v);
			 
		 }
	}


 