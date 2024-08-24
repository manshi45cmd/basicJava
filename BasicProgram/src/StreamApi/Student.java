package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	
	public static void main(String[] args) {
		
		  List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(11);
		list.add(67);
		list.add(87);
		list.add(128);
		list.add(122);
		
//		 without Stream 
	 List<Integer> listEven = new ArrayList<>();
		for(int i: list) {
			if(i% 2 ==0 ) {
				listEven.add(i);
			}
		}
		System.out.println(list);
		System.out.println(listEven);
		
//		using stream 
		
		Stream<Integer> stream = list.stream();
		List<Integer> newList =stream.filter( i-> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(newList);
		
		List<Integer> newList2 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(newList2);
		
		// sorted 
		
		
	} 

}
