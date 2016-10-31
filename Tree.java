import java.util.LinkedList;
import java.util.List;

public class Tree {

	Object data;
	Tree left, right;
	
	public Tree(Object data, Tree left, Tree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	static List<Integer> list = new LinkedList();	
	
	static int count = 0;
	static int k = 6;
	
	public static void main(String []args) {	
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
		//Create Tree
//		Tree left = new Tree(new Integer(1), null, null);
//		Tree right = new Tree(new Integer(3), null, null);
//		Tree root = new Tree(new Integer(5), left, right);
//		
//		System.out.println(Total(root));
//		
//		Preorder(root);
//		Inorder(root);
//		Postorder(root);
//		
//		System.out.println(Height(root));
//		
//		System.out.println(isIdentical(root.left,root.right));
//		
		Tree newRoot = arrayToBST(arr,0,arr.length - 1);
		
		//Inorder(newRoot);
		
		InorderModified(newRoot);
		
		System.out.println(list.toString());
		
		
	}

	public static Integer Total(Tree root){
		if(root == null) return 0;
		Integer data = (Integer)root.data;
		return data + (Integer) Total(root.left)+ (Integer)Total(root.right);
	}
	
	public static void Preorder(Tree root) {
		if(root == null) return;
		System.out.println(root.data+" ");
		Preorder(root.left);
		Preorder(root.right);		
	}
	
	public static void Inorder(Tree root) {
		if(root == null) return;
		Inorder(root.left);
		System.out.println(root.data+" ");	
		Inorder(root.right);
		
	}
	
	public static void InorderModified(Tree root) {
		if(root == null) return;
		InorderModified(root.left);
		//list.add((Integer)root.data);	
		count++; 
		if(count == k)
			System.out.println(root.data);
		InorderModified(root.right);
		
	}
	
	public static void Postorder(Tree root) {
		if(root == null) return;
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data+" ");	
	}
	
	public static Integer Height(Tree root) {
		if(root == null) return 0;
		return 1 + Max(Height(root.left), Height(root.right)); 
		
	}
	
	public static Integer Max(Integer a, Integer b) {
		
		return (a > b) ? a : b; 
	}
	
	public static boolean isIdentical(Tree a, Tree b) {
		
		if(a == null && b == null) return true;
		
		if(a != null && b != null)
			return (a.data == b.data) && isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
		
		return false;
	}
	
	public static Tree arrayToBST(int[] arr, int start, int end) {
		
		if(start > end) return null;
		
		int mid = (start + end) / 2;
		
		Tree root = new Tree(new Integer(arr[mid]), null, null);
		
		root.left = arrayToBST(arr, start, mid-1);
		root.right = arrayToBST(arr, mid+1, end);
		
		return root;
		
	}
	
	public static int kthSmallest(Tree root, int k) {
		
		return 0;
	}
}
