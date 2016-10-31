/* 
 * 	
 * 
 */

//Fibonacci Series
public class Fibo {
	
	public static void main(String args[]) {
		
		int n = 6;
		System.out.println(findFibbo(n));
	}
	
//	public static long findFibbo(int n) {
//        
//		if(n == 0)
//			return 0;
//		
//		if(n == 1)
//			return 1;
//		
//		return findFibbo(n-1) + findFibbo(n-2);
//		
//            
//    }
	//Using DP: Memorization
	public static long findFibbo(int n) {
        
		int[] a = new int[n+1];
		
		int i = 2;
		
		a[0] = 0;
		a[1] = 1;
		
		while(i<=n) {
			
			a[i] = a[i-1] + a[i-2];
			i++;
			
		}
		
		return a[n];
		
		
            
    }
	
	
}
