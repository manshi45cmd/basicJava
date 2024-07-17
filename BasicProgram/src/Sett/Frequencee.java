package Sett;

 
import java.util.*;
import java.lang.*;
 

public class Frequencee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ascassppc";
		//a-2 c-2 s-3 p-2 c
		//count the frequency of character; 
		
		char[] arr = s.toCharArray();
		
//		HashMap<Character,Integer> map = new HashMap<>();
		HashMap <Character , Integer> map = new HashMap<>();
		
		System.out.println(Arrays.toString(arr));
		
		for(char c:arr) {
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
				 
			 } else { 
				 map.put(c, 1);
			 }
			 
		}
		for(Map.Entry<Character,Integer >  pair:map.entrySet()) {
			System.out.println(pair.getKey() +"-->"+pair.getValue());
		}
 
	}

}
