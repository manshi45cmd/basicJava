package july8.collection;

import java.util.ArrayList;

public class Example {
	public static void main(String[] args) {
		
	
	
	ArrayList<String> array = new ArrayList();
	array.add("Apple");
	array.add("Banana");
	array.add("Cherry");
	array.add("Date");
	array.add("Elderberry");
	
	for(String aa:array) {
		System.out.println(aa);
	 
	}
	System.out.println( "size of array :"+array.size());
	
	System.out.println("After modify array");
	String  removed = array.remove(2);
	array.add(2, "Fig");
	
	
		System.out.println(removed);
	}
	
	
	} 

