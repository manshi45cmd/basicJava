package linkedList;

public class NthNodeFromEnd {
	
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			 this.data = data;
		}
	}
	
	public static Node nthNode(Node head , int n) {
		
		int size = 0;
		Node temp = head;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		
		int m= size - n +1;
		//mth node from start
		
		temp = head;
		for(int i = 1; i<=m-1;i++) {
			
		}
		return temp;
	}
	
	
//	 find nth node from last in one travasal
public static Node nthNode2(Node head, int n) {
	
	Node slow = head;
	Node fast = head;
	
	for(int i =1;i<=2;i++) {
		fast = fast.next;
	}
	
	while(fast != null) {
		slow = slow.next;
		fast = fast.next;
	}
	return slow;
}
//	 remove nthnode from end of linked list

public static Node removeNthNode(Node head, int n) {
	
	Node slow = head;
	Node fast = head;
	
	for(int i =1;i<=n;i++) {
		fast = fast.next;
	}
	if(fast == null) {
		head = head.next;
		 return fast ;
	}
	
	while(fast.next != null) {
		slow = slow.next;
		fast= fast.next;
	}
	return slow;
}

public static void display(Node head) {
	
	Node temp =head;
	while(temp != null) {
		System.out.print(temp.data + " ");
	}
	temp = temp.next;
}
	
	public static void main(String[] args) {
		Node a =new Node(100);
		Node b =new Node(13);
		Node c =new Node(4);
		Node d =new Node(5);
		Node e =new Node(12);
		Node f =new Node(10);
		
		a.next =b;
		b.next=c;
		c.next = d;
		d.next = e;
	    e.next = f;
	    
	    Node q = nthNode(a,3);
	    
	    System.out.println(q.data);
	    
	    Node q1 = nthNode2(a,6);
	    
	    System.out.println(q1.data);
	    
//	    Node nn = nthNode2(a,1);
//	    System.out.println(nn.data);
	    display(a);
	}

}
