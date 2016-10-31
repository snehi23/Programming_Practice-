
/* 
 * 	
 	Reverse a linked list from position m to n. Do it in-place and in one-pass.

	For example:
	Given 1->2->3->4->5->NULL, m = 2 and n = 4,

	return 1->4->3->2->5->NULL.
 * 
 */

//Reverse Linked List II
public class LC12 {
	
	public static void main(String args[]) {
		
		ListNode2 head = null, p = null, l = null;
		p = new ListNode2(1);
		l = p;
		head = l;
		p = new ListNode2(2);
		l.next = p;
		l = l.next;
		p = new ListNode2(3);
		l.next = p;
		l = l.next;
		p = new ListNode2(4);
		l.next = p;
		l = l.next;
		p = new ListNode2(5);
		l.next = p;
		l = l.next;
		System.out.println(reverseBetween(head, 1, 5));
	}
	
public static ListNode2 reverseBetween(ListNode2 head, int m, int n) {
        
        if(n - m < 1)
            return head;
            
        ListNode2 current, next, previous;    
        
        ListNode2 dummy = new ListNode2(0);
        
        dummy.next = head;
        previous = dummy;
        
        for(int i =0; i < m-1; i++) 
        	previous = previous.next;
        
       current = previous.next;
       next = current.next;
            
       for(int i =0; i < n - m; i++) {
    	   
    	   current.next = next.next;
    	   next.next = previous.next;
    	   previous.next = next;
    	   next = current.next;
    	   
       }
       
       return dummy.next;
        
        
    }
	
}
