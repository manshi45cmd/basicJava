package linkedList;
import java.util.*;
public class LinkedListt {
public 	class Node {
		
		int data ;
		Node  next;

		Node(int d){
			data = d;
			next = null;
		}
		
		
		pu
		
		public static Node reverse(Node head) {
			return null;
		}
	
public static void main(String[] args) {
 
	
	Node n4 = new Node(66);
	Node n = new Node(22);
	Node n2 = new Node(54);
	Node n3 = new Node(55);
	Node head = new Node(23);
	
	
	
	head.next = n2 ;
	head.next.next = n3 ;
	head.next.next.next = n4;
	head.next = new Node(123);
	
	Node temp =head.next;
	head.next = head;
	temp.next = head;
	
	
//n.next = n2 ;
//n.next.next = n3 ;
//n.next.next.next = n4;
//n4.next = new Node(123);


Node curr = head;
if(curr.next == null) {
	System.out.println(curr.data);
}

while(curr.next != null) {
	curr = curr.next; 
}

System.out.println(curr.data);
}
}
}
