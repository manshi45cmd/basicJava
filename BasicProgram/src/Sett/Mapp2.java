package Sett; 
import java.util.*;
public class Mapp2 {

	public static void main(String[] args) {
		 
		HashMap<String,Boolean> map = new HashMap<>();
		
		map.put("Que 1.", true);
		map.put("Que 2.", true);
		map.put("Que 3.", false);
		map.put("Que 4.", true);
		map.put("Que 5.", false);
		
		//Set<Map.Entry<String, Boolean>> st = null ;
		
		for(Map.Entry<String, Boolean> e:map.entrySet()) {
			
			 System.out.println(e);
		}
		

	}

}
