package linkedList;
 
public class MiddleElement<ListNode> {
	 
		
		public static class ListNode{
			int data;// value
			ListNode next;// address of next node
			
			ListNode(int data){
				this.data = data;
			}
			
		}
		
		public static void display(ListNode head) {
		 
			while(head != null) {
				System.out.print(head.data+" " );
				head = head.next;
			}
		}
		 
		public static   ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			
			while(   fast != null   &&  fast.next!=null ) {
				 
				slow = slow.next;
				fast = fast.next.next;
				 
			}
			
			return slow;
			
			
		}
		 
		public static void main(String[] args) {
			ListNode a = new ListNode(5);
			ListNode a3 = new ListNode(3);
			ListNode a4 = new ListNode(9);
			ListNode a5 = new ListNode(8);
			ListNode a6= new ListNode(16);
			
			
			a.next = a3;
			a3.next = a4;
			a4.next = a5;
			a5.next = a6;
			 
			display(a);
			middleNode(a);
			
 		 
		}
	 
	}

 
