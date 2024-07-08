package july8.stack;

import java.util.Stack;

public class Example {
	public static void main(String[] args) {
		
		
		Stack< Integer > st = new Stack<Integer> ();
		st.add( 10);
		st.add( 20);
		
System.out.println("orignoal Stack");
		
		System.out.println(st);
		
		System.out.println("after pushing");
        st.push(30);
        st.push(40);
        st.push(50);

		System.out.println(st);
		
		System.out.println("after pop");
		st.pop();
		 
		System.out.println(st);
		
		System.out.println("after peek");
		st.peek();
		System.out.println(st);
		
		System.out.println("check if the stack empty");
		st.clear();
		System.out.println(st);
		
		System.out.println("print the final stack");
		System.out.println(st);
		
	}

}
