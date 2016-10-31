import java.awt.RenderingHints.Key;
import java.util.Arrays;

public class Try20 {

	public static void main(String []args) {	
	 
		int[] A = {1,3,2,1};
		int[] B = {4,2,5,3,2};
		solution(A,B);
	}
	
	public static int solution(int[] A, int[] B) {
        		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i < A.length; i++) { 
			
			int key = A[i]; 
			
			if(Arrays.binarySearch(B, key) != -1)
				return key;
			
		}
		return -1;
		
    }
}
