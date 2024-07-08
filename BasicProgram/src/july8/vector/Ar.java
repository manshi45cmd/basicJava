package july8.vector;
import java.util.*;
public class Ar {

	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("Rohan");
		v.add("Ram");
		v.add("Raju");
		
		int len = v.size();
		System.out.println( "Size of Vactor : "+len);
		for(String vv:v) {
			System.out.println(vv);
		}
		
		 
		Stack<String > st = new Stack<String> ();
		st.add("Math");
		st.add("Hindi");
		st.add("So.Study");
		st.add("physic");
		
		st.pop();
		 
		System.out.println(st.peek());
		 st.pop();
		System.out.println(st);
st.push("English");
		System.out.println(st.push("English"));
		System.out.println(st);
	}
}
