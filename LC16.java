import java.util.Stack;

/* 
 * 	Given a binary tree, determine if it is a valid binary search tree (BST).

	Assume a BST is defined as follows:

	The left subtree of a node contains only nodes with keys less than the node's key.
	The right subtree of a node contains only nodes with keys greater than the node's key.
	Both the left and right subtrees must also be binary search trees.	
 * 
 */

//Validate Binary Search Tree
public class LC16 {
	
	public static void main(String args[]) {
		
		TreeNode root = new TreeNode(2);
		
		root.left = new TreeNode(1);
		
		root.right = new TreeNode(3);
		
		root.left.left = null;
		root.left.right = null;
		
		root.right.left = null;
		root.right.right = null;
		
		System.out.println(isValidBST(root));
		
		
	}
	
	public static boolean isValidBST(TreeNode root) {

		return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);	
        
    }
	
	public static boolean dfs(TreeNode root, long max, long min) {
		
		if(root == null) return true;
		
		if((root.val >= max) || (root.val <= min)) return false;
		
		return (dfs(root.left,root.val,min) && dfs(root.right,max,root.val));
		
		
	}
	
}	