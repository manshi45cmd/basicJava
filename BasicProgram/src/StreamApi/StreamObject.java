package StreamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StreamObject {

	public static void main(String[] args) {
//	1.	Create balk stream with the help of emptyStream 
		 Stream<Object> emptyStream = Stream.empty();
		 emptyStream.forEach( e ->{
			 System.out.println(e);
		 });
//		2 . array , object , collection  
	String name[] = {"rahul ","kunal","gaurab","gujral"};
	
	Stream<String> st = Stream.of(name);
	
	st.forEach( e -> {
		System.out.println(e);
	});
//	3. builder pattren
	
	Stream<Object> streamBuilder =Stream.builder().build();

	// 4. String method of array 
	
	IntStream streamm = Arrays.stream(new int [] {1,2,3,4,5}); // anonymous arry
	streamm.forEach(e -> {
		System.out.println(e);
	});
	
//	5. List, set object pr call kerege stream method 
	
	 List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(11);
		list.add(67);
		list.add(87);
		list.add(128);
		list.add(122);
		
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(e ->{
			System.out.println(e);
		});
		 
	}
}
