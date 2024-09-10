package aug30;

public class LinkedList {
	
	
	public class Node{
		int data;
		Node next = null;
		 
		 
	  
		Node(int data){
			this.data = data;
			this.next = null;
  
		}


 


		 
	  
	}
	
	public static void addNode( Node head , Node newNo) {
		 
		 
 		Node newNode = new Node(head, newNo);
 		 
		Node lastNode = null;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	 
	}
	
	public static void printList(Node head) {
	 
		Node temp =head;
		while( temp !=null) {
			System.out.print(temp.data+" ");
			
			
			temp = temp.next;
		}
	 
	} 
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		 
		
		a.next = b;
		b.next = c;
		c.next = d;
		 
		
		printList(a);
		
		 addNode(a,5);
		 
		 printList(a);
		
	 
}
	 

	
	}


