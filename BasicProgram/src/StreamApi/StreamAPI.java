package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<Integer> num =  new ArrayList<>();
		num.add(12);
		num.add(23);
		num.add(33);
		Stream s = num.stream();
		
		s.forEach( X ->System.out.println(X)); // i am using this stream
	
		  
		System.out.println("Streams data");
		Stream<Integer> newnums = num.stream().map(n->{
			System.out.println("  map function");
			System.out.println(n);
			return n*n;
		}).filter(c ->{
			System.out.println("  filter function");
			System.out.println(c);
			return c%
					2 == 0;
			
		});
		
		try {
			Thread.sleep(7000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		List<Integer> listlist = newnums.collect(Collectors.toList());
				for(Integer j:listlist) {
					System.out.println(j);
				}
	}

}
