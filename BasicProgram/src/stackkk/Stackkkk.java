package stackkk;
import java.util.*;
public class Stackkkk {
	 
	static final int MAX = 1000;
	
	int top; 
	int arr[] = new int [MAX];
	boolean isEmpty() {
//		if(top  < 0) {
//			return true;
//			
//		} else {
//			return false;
//		}
		
	return top <0;
		
	}
	 
	Stackkkk() {
		top = -1;
	 
	}
	
	boolean push(int x) {
		
		if(top>=MAX) {
			System.out.println("stacll overflow ");
			
			return false;
		}
		top++;
		arr[top] = x;
		System.out.println("Value pushed into stack successfuly ");
      return true;		
	}

	int pop() {
		if(top<0) {
			System.out.println("stack under flow");
			return 0;
		}
		return arr[top--];
	}
	
	int peek() {
		return arr[top];
	}
	
	void print () {
		for(int i = top; i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
		 
	}

 
	public static  void main(String[] args) {
		
		Stackkkk st = new Stackkkk();
		
		st.push(12);
		st.push(34);
		st.push(33); 
		st.push(78);
		st.push(98);
		//stackimplimentation using using LinkedList 
		
		System.out.println(st.pop());
		System.out.println("top element "+ st.peek());
		
		st.print();
	}

}
