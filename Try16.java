
public class Try16 {

	public static void main(String []argh) {	
	 
		int[] array = {1,-4,5,2,-6,7};
		System.out.println(solution(array));
	}
	
	public static int solution(int[] A) {
	    int maxEndingHere = A[0];
	    int maxSoFar = A[0];
	    for(int i = 1; i < A.length; i++){
	        maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
	        maxSoFar = Math.max(maxSoFar, maxEndingHere);
	    }
	    return maxSoFar;
	}
	
}
