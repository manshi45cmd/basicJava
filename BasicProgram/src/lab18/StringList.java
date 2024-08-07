package lab18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add(" manshi");
		list.add(" shrivastav");
		 
//		 using stream Api to concatenatedString
		String  stringconcat = list.stream()
                .collect( Collectors.joining());

        // Print the result
        System.out.println(stringconcat);
    }

	}


