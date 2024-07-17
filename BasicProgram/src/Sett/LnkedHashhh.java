package Sett;
import java.util.*;
public class LnkedHashhh {
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		
		map.put(null, null);
		map.put("neha", 101);
		map.put("vasu",  111);
		map.put(null, null);
		
		 for(Map.Entry<String, Integer> ee:map.entrySet()){
			 
			 System.out.println(ee.getKey()+"-->"+ee.getValue());

		 }
	 
	}
	 
}
