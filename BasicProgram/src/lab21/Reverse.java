package lab21;
 
public class Reverse {

	public static class Node{
		int data;
		Node next;
		Node( int data){
			this.data = data;
			
		}
	}
	
	public static void display(Node head) {
		if(head == null) {
			return ;
		} 
		System.out.print(head.data+" ");
		display(head.next);
	}
	
 	public static void reverse(Node head) {
		if(head == null) {
			return;
		}
		reverse(head.next);
		System.out.print(head.data+" ");
	 
	}
	public static void main(String[] args) {
		
		Node a = new Node(2);
		Node b = new Node(21);
		Node c = new Node(5);
		Node d = new Node(1);
		Node e = new Node(24);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		System.out.println("original Linked List ");
		display(a);
		
		System.out.println();
		
		System.out.println("Reverse Linked List ");
		reverse(a);
		
	}
}
	 
		 
