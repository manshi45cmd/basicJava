package collectionFrame;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.add(11);
		st.add(21);
		st.add(31);
		st.add(41);
		st.add(51);
 
		 st.pop();
		 st.peek();
		 st.push(66);
		 
		 Iterator <Integer> itr1 = st.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }
	}

}
