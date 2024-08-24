package lab21;

import collectionFrame.LinkedList;

public class Reverse {

	class Node{
		int data;
		Node next;
		Node( int data){
			this.data = data;
			
		}
	}
	
	Node head;
	
	public void reverse() {
		Node prev = null ;
		Node curr = head;
		Node next = null;
		
		 
