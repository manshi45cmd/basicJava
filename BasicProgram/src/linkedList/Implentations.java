package linkedList;

public class Implentations {
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static class LinkedListt{
		Node head = null;
		Node tail = null;
		
		 void insertAtEnd(int val) {
			 Node temp = new Node(val);
			 if(head == null) {
			 head = temp;
			 
			 }else {
				 tail.next = temp;
				
			 }
			 tail = temp;
		 }
		 
		 void display( ) {
			 Node temp = head;
			 
			 while (temp != null) {
				 System.out.print(temp.data+" ");
				 temp =temp.next;
			 }
		 } 
		 
		 int size() {
			 Node temp = head;
			 
			 int count = 0;
			 while(temp != null) {
				 count++;
				 temp = temp.next;
			 }
			 
			 return count;
		 }
		 
		 void insertAtHead(int val) {
			 Node temp = new Node(val);
			 if(head==null) {
				 head = tail = temp;
				 
			 }
			 else { // non empty list
				 temp.next = head;
				 head= temp;
			 }
		 }
		  
	}
	
	public static void main(String[] args) {
		
		LinkedListt ll = new LinkedListt();
		ll.insertAtEnd(11);
		ll.insertAtEnd(21);
		ll.insertAtEnd(31);
		ll.insertAtEnd(41);
		ll.insertAtEnd(51);
		ll.display();
		System.out.println();
		System.out.println(ll.size());
		
		ll.insertAtHead(1);
		ll.display();
		
	}

}
