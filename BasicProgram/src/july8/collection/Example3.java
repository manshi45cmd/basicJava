package july8.collection;
import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println("original ArrayLlist" );
		System.out.println(arr);
		
		System.out.println("Sort the ArrayList in ascending order");
		Collections.sort(arr);
		System.out.println(arr);
		
		System.out.println("reverse the ArrayList ");
		
	     Collections.reverse(arr);
	     System.out.println(arr);
	     
	}

}
