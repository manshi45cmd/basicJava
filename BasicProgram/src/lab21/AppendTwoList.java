package lab21;
 
public class AppendTwoList {
	
	public static class Node{
		int data =0;
		Node next;
		Node head;
	 
		Node(int data){
			this.data = data;
			next = null;
		 
		}
		
		
		public void appendList( Node a2) {
			 if (head == null) {
		            head = a2.head;
		        } else {
		            
		            Node last = head;
		            while (last.next != null) {
		                last = last.next;
		            }
  
		            last.next = a2.head;
		        }
		}
	}
	public static void display(Node head) {
		if(head == null) {
			return ;
		} 
		System.out.print(head.data+" ");
		display(head.next);
	}
	
	  
	
	public static void main(String[] args) {
		 
		Node a = new Node(22);
		Node b = new Node(33);
		Node c = new Node(44);
		Node d = new Node(55);
	  
		a.next = b;
		b.next = c;
		c.next = d;
		 
		Node a2 = new Node(66);
		Node b2 = new Node(77);
		Node c2 = new Node(88);
		Node d2 = new Node(99);
	  
		a2.next = b2;
		b2.next = c2;
		c2.next = d2;
	 
		
		System.out.println(" List 1 ");
		display(a);
		System.out.println();
		System.out.println("List 2");
		display(a2);
		
		 a.appendList(a2);
		 System.out.println();
		 System.out.println("list 1 after appending");
		display(a);
		 
		 
	}
	}

 
	 
