
/* 
 * 	Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.	
 * 
 */

//Convert Sorted List to Binary Search Tree
public class LC14 {
	
	public static void main(String args[]) {
		
		ListNode1 head = null, p = null, l = null;
		p = new ListNode1(1);
		l = p;
		head = l;
		p = new ListNode1(2);
		l.next = p;
		l = l.next;
		p = new ListNode1(3);
		l.next = p;
		l = l.next;
		p = new ListNode1(4);
		l.next = p;
		l = l.next;
		p = new ListNode1(5);
		l.next = p;
		l = l.next;
		
		TreeNode node = sortedListToBST(head);
		
		System.out.println(node);
		
	}
	
	public static TreeNode sortedListToBST(ListNode1 head) {
        
		if(head == null)
			return null;
		
		int size = 0;
		
		ListNode1 current;
		
		current = head;
		
		while(current != null) {
	
			current = current.next;
			size++;
			
		}	
		
		return inorderHelper(head,0, size - 1);
		
    }
	
	public static TreeNode inorderHelper(ListNode1 head,int start, int end) {
		
		if(start > end)
			return null;
		
		int mid = start + (end - start) / 2;
		
		TreeNode left = inorderHelper(head,start, mid - 1);
		
		TreeNode node = new TreeNode(head.val);
		
		node.left = left;
		
		head = head.next;
		
		TreeNode right = inorderHelper(head,mid + 1, end);
		
		node.right = right;
		
		return node;
		
		
	}
	
}

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) { val = x; }
}

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
