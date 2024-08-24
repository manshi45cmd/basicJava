package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class MeyhodOfStream {
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Anlit");
		name.add("Abhi");
		name.add("Abhinab");
		name.add("Durgesh");
		name.add("Mukesh");
		name.add("Basu");
	 
		List<String> st = name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(st);
		
		List<Integer> numbers = List.of(12,4,6,15,16);
		
		 List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		 
		 System.out.println("Squre of numbers:" + newNumbers);
		 
		 
		 name.stream().forEach(e ->{
			 System.out.println(e);
		 });
		 
		 newNumbers.stream().forEach(null);
		 
		 numbers.stream().sorted().forEach(System.out:: println);
		  Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
		  System.out.println("min "+integer);
		  
		  Integer integer1 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
		  System.out.println("max " +integer1);
		 
		 
		  
	}

}
