

/* 
 * 	
 * 	Add Two Numbers
 * 	You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 * 
 * 
 */
public class LC2 {
	
	
	public static void main(String args[]) {
		
		ListNode2 head1 = null;
		ListNode2 p = null;
		ListNode2 l1 = null;
		p = new ListNode2(1);
		l1 = p;
		head1 = l1;
//		p = new ListNode2(4);
//		l1.next = p;
//		l1 = l1.next;
//		p = new ListNode2(3);
//		l1.next = p;
//		l1 = l1.next;
		l1.next = null;
		
		ListNode2 head2 = null;
		p = null;
		ListNode2 l2 = null;
		p = new ListNode2(9);
		l2 = p;
		head2 = l2;
		p = new ListNode2(9);
		l2.next = p;
		l2 = l2.next;
//		p = new ListNode2(4);
//		l2.next = p;
//		l2 = l2.next;
		l2.next = null;
		
		ListNode2 l3 = addTwoNumbers(head1, head2);
		
		while(l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}
		
		
	}
	
	// time complexity: max(m,n) space complexity: max(m,n) + 1
	public static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
     
		ListNode2 l3 = null;
		ListNode2 p = null;
		ListNode2 head3 = null;
		int remainder = 0;
		
		if(l1 == null && l2 == null)
		    return head3;
		
		if(l1 == null)
		    return l2;
		  
		if(l2 == null)
		    return l1;
		    
		p = new ListNode2((l1.val + l2.val) % 10);
		l3 = p;
		head3 = l3;
		remainder = (l1.val + l2.val) / 10;
		l1 = l1.next;
		l2 = l2.next;
		
		while(l1 != null || l2 != null) {
			
			if(l1 == null) {
			    p = new ListNode2((l2.val + remainder) % 10);
			    remainder = (l2.val + remainder) / 10;
			    l3.next = p;
			    l2 = l2.next;
			    l3 = l3.next;
			    continue;
			}   
			
			if(l2 == null) {
			    p = new ListNode2((l1.val + remainder) % 10);
			    remainder = (l1.val + remainder) / 10;
			    l3.next = p;
			    l1 = l1.next;
			    l3 = l3.next;
			    continue;
			}
			
			if(l1 != null && l2 != null) {
    			p = new ListNode2((l1.val + l2.val+ remainder) % 10);
    			remainder = (l1.val + l2.val + remainder) / 10;
    			l3.next = p;
    			l1 = l1.next;
    			l2 = l2.next;
    			l3 = l3.next;
    			continue;
			}
			
		}
	
		if(remainder > 0) {
		    
		    p = new ListNode2(remainder);
		    l3.next = p;
		    l3 = l3.next;
		    
		}
		
		return head3;
		
    }

}
 
class ListNode2 {
	
	int val;
	ListNode2 next;
	ListNode2(int x) {
		val = x;
	}
	
}
