package collectionFrame;

import java.util.Iterator;
import java.util.Vector;

public class Vectorr {
	public static void main(String[] args) {


	Vector<String> va = new Vector<String>();
	
	 va.add("shivam");
	 va.add("shivani");
	 va.add("rahul");
	 va.add("diksha");
	 
	 Iterator <String> itr = va.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 
	
	}
}
