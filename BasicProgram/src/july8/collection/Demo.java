package july8.collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList();
		array.add("Virat");
		array.add("Rohit");
		array.add("Hardik");
		array.add("Surya");
		array.add("Mohan");
		array.add(" Kuldeep");
		  
		for(String aa:array) {
			System.out.println(aa);
		}
		
		array.remove(0);
		array.remove(array.lastIndexOf(array));
		
	 
		
	}
}
  