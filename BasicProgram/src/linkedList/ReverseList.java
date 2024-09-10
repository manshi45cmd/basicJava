package linkedList;

import lab21.Reverse.Node;

public class ReverseList {
	
	public static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
			next = null;
		}
		  
	}
	public static void display(Node head) {
		if(head == null ) { // base case
			
			System.out.println();
			return; }
		
			System.out.print(head.val+" ");//work
			display(head.next);//call
		}
	public static Node reverse(Node head) {
		if(head.next == null) {
			return head;
		}
		Node newHead =  reverse(head.next);
		
		 head.next.next = head;// Interchanging the connections
		head.next = null;
		 return newHead;
		 
	}
	
	public static void disreverse(Node head) {
		if(head == null) {
			 
			return;
		}
		disreverse(head.next);
		System.out.print(head.val+" ");
	 
	}
	public static void main(String[] args) {
		Node a = new Node(11);
		Node b = new Node(4);
		Node c = new Node(22);
		Node d = new Node(8);
		Node e = new Node(33);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		 
		display( a);
		Node r = reverse(a);
	 
		a= reverse(a);
		display(r);
		
	}
	 
}
