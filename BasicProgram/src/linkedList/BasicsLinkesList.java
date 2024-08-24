package linkedList;

public class BasicsLinkesList {
	
	public static class Node{
		int data;// value
		Node next;// address of next node
		
		Node(int data){
			this.data = data;
		}
		
	}
	
	public static void display(Node head) {
	 
		while(head != null) {
			System.out.print(head.data+" " );
			head = head.next;
		}
	}
	
	public static void displayr(Node head) {
		if( head== null) return;
		
		System.out.print(head.data+" ");
		
		displayr(head.next );
	}
	
	public static void displayreverce(Node head) {
		if( head== null) return;
		displayreverce(head.next );
 		System.out.print(head.data+" ");
		 
	}
	
	public static int length(Node head) {
		int count = 0;
		while(head !=null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Node a = new Node(5);
		Node a3 = new Node(3);
		Node a4 = new Node(9);
		Node a5 = new Node(8);
		Node a6= new Node(16);
		
		
		a.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		System.out.println(length(a));
		
		display(a);
		System.out.println();
		displayr(a);
		System.out.println();
		displayreverce(a);
		
		
//		
//		Node temp = a;
//		 while(temp != null) { // printing the list
//			 System.out.print(temp.data+" ");
//			 temp= temp.next;
//		 }
//		 
	}
 
}
