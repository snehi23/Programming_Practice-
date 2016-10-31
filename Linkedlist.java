
public class Linkedlist {

	public static void main(String []argh) {	
		
		Node head = new Node(10);
		head.next = new Node(85);
		head.next.next = new Node(15);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(20);
		head.next.next.next.next.next = null;
		
		Node reverseList = reverse(head);
		System.out.println(reverseList);
		
		DoubleNode dhead = new DoubleNode(1);
		dhead.next = new DoubleNode(2);
		dhead.prev = null;
		dhead.next.next = new DoubleNode(3);
		dhead.next.prev = dhead;
		dhead.next.next.next = new DoubleNode(4);
		dhead.next.next.prev = dhead.next;
		dhead.next.next.next.next = new DoubleNode(5);
		dhead.next.next.next.prev = dhead.next.next;
		dhead.next.next.next.next.next = null;
		dhead.next.next.next.next.prev = dhead.next.next.next;
		
		DoubleNode doubleReverseList = reverse(dhead);
		System.out.println(doubleReverseList);
		
	}
	
	public static Node reverse(Node head) {
		
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;	
		}
		head = prev;
		return head;
			
		
	}
	
	public static DoubleNode reverse(DoubleNode head) {
		
		DoubleNode temp = null;
		DoubleNode current = head;
		
		while(current != null) {
			
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
			
		}
		
		if(temp != null)
			head = temp.prev;
		
		return head;
		
	}
	
	
	
}

class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

class DoubleNode {
	
	int data;
	DoubleNode next;
	DoubleNode prev;
	
	public DoubleNode(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}
