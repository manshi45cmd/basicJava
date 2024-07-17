package collectionFrame;

import java.util.HashSet;
import java.util.Iterator;

public class Sett {
 public static void main(String[] args) {
	
	 HashSet<String> ss = new HashSet<String>();
	 
	 ss.add("shubham");
	 ss.add("shubham");
	 ss.add("shubham");
	 ss.add( null);
	 ss.add( null);
	 ss.add("poajaa");
	 ss.add("neel");
	 
	// ss.addAll(ss);
	 
  
	 for(String hh:ss) {
		 System.out.println(hh);
 	

	 }
 }

}
