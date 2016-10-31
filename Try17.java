import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Try17 {

	public static void main(String []argh) {	
	 
		int[] array = {1,5,1,4,2,5};
		System.out.println(solution(array,7,3));
	}
	
	public static int solution(int[] A, int X, int D) { 
		
		ArrayList<Integer> storeIt = new ArrayList<Integer>();  
		int position = X;
		
		for(int i = 0; i < A.length; i++) { 
			
				if(A[i] == X)
					return 0;
				
				if(A[i] <= D) {
					storeIt.add(A[i]);
					position = position - Collections.max(storeIt);
				}
				
				if (position == 0)
					return i+1;	
		} 
		return -1;
		
		
		
		/*int noOfPositions = X; 
		boolean[] isVisited = new boolean[noOfPositions + 1]; 
		for(int i = 0; i < A.length; i++) { 
			if(!isVisited[A[i]]) { 
				isVisited[A[i]] = true; 
			    noOfPositions--; 
			} 
			if(noOfPositions == 0) 
				return i; 
		} 
		return -1; */
	}
	
}
