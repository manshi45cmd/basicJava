package collectionFrame;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkDlist {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Neha");
		list.add("manu");
		list.add("roshan");
		list.add("geeta");
		 
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
	}

}
