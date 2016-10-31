/* 
 * 	
 * 
 * Given an integer n, return the number of trailing zeroes in n!.
   Note: Your solution should be in logarithmic time complexity.
 * 
 */

//Factorial Trailing Zeroes
public class LC11 {
	
	public static void main(String args[]) {
		
		int n = 200;
		System.out.println(trailingZeros(n));
	}
	
	public static int trailingZeros(int n) {
        
		int trailingZeros = 0;
        Double divisor = 5.0;
        int i = 1;
        
        while((new Double(n / divisor).intValue()) > 0) {
                trailingZeros += (n / divisor);
                divisor = Math.pow(5,++i);
        }
        
        return trailingZeros;
		    
    }
	
}
