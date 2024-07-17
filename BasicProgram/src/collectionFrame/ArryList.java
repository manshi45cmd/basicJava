package collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		 
		 Iterator <Integer> itr1 = arr.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }
		
		
		
	}

}

