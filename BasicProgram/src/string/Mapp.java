package string;
import java.util.*;
public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// map ko direct traverse nhi kr sakte h;
		HashMap<String,Integer> mp = new HashMap<>();
		
		mp.put("Virat" , 120);
		mp.put("Rohit" , 82);
		mp.put("Dhoni" , 56);
		mp.put("SKY" , 100);
		mp.put(null , 120);
		
//		for(String s:mp) {
//			
//		}
		
		Set<Map.Entry<String, Integer>>  st  =  null;
		
		for(Map.Entry <String , Integer> ee :mp.entrySet()) {
			System.out.println( ee);
		}
		

	}

}
