/* 
 * 	Maximum difference between two elements such that larger element appears after the smaller number
 * 
 */

public class MaxDiff {
	
	public static void main(String args[]) {
	
		int[] A = {2,7,8,70,1};
		
		System.out.println(maxDiff(A));	
	}
	
	public static int maxDiff(int[] A) {
		
		int min_number = A[0];
		
		int max_diff = A[1] - A[0];
		
		for(int i=1; i < A.length; i++) {
			
			if(A[i] - min_number > max_diff)
				max_diff = A[i] - min_number;
			
			if(A[i] < min_number)
				min_number = A[i];
			
		}
		
		return max_diff;
		
		
	}
	
	
}
