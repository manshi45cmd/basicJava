package collectionFrame;
 import java.util.*;

public class LinkedList {
	
	Node head;
	  static class Node{
		  
		int data;
		Node next;
		
		Node(int da){
			this.data = da;
			next = null;
		}
	}
	 
public static LinkedList insert(LinkedList list , int data) {
	
	Node new_Node = new Node(data);
	if(list.head == null) {
		list.head = new_Node;
	}
	else {
		Node last = list.head;
		//12,13,14,15
		while(last.next != null) {
			last = last.next;
			
		}
		last.next = new_Node;
	}
	return list;
}
public static void printList(LinkedList list) {
	
	Node currentnode = list.head ;
	System.out.println("linked list ");
	while(currentnode != null) {
		System.out.println(currentnode.data);
		currentnode = currentnode.next;
	}
 
}



public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.insert(list, 12);
	list.insert(list, 13);
	list.insert(list, 14);
	list.insert(list, 15);
	
	
	printList(list);
	
//	LinkedList<Integer> li = new LinkedList<Integer>();
//	li.add(121);
}
public void addNode(int i) {
	// TODO Auto-generated method stub
	
}
}