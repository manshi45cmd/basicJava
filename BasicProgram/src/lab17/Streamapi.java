package lab17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {
	public static void main(String[] args) {
		 // creat a list of String
		List<String> s = new ArrayList<String>();
		
		
		s.add("neha");
		s.add("neha");
		s.add("pojaa");
		s.add("mahi");
		s.add("kunal");
		s.add("aashi");
		s.add("aashi");
		
		// use Stream Api to remove duplicate String 
		List<String>  ss  = s.stream().distinct().collect(Collectors.toList());
		System.out.println(" original list "+s);
		System.out.println(" remove duplicate string "+ss ); // print the result
                 
		
	}

}
