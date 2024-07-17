package Sett;
import java.util.*;

public class FrecquenceOfNumbers {

	public static void main(String[] args) {
		
	int	[] arr =   {1,2,4,5,6,3,2,5,2,1,4,6,3,1,1};
	
	HashMap<Integer,Integer> map = new HashMap<>();
	  
      
	for(int aa:arr) {
//		 if(map.containsKey(aa)) {
//			 map.put(aa, map.get(aa)+1);
//			 
//		 } else { 
//			 map.put(aa, 1);
//		 }

			map.put(aa,map.getOrDefault(aa, 0)+1);	 
	}
	
//	map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
	for(Map.Entry<Integer,  Integer>   pp1:map.entrySet()) {
	
 
		System.out.println(   pp1.getKey() +" -->"+ pp1.getValue());
	}
	}

}
