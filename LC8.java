/* 
 * 	Determine whether an integer is a palindrome. Do this without extra space.
 * 
 */

//Palindrome Number
public class LC8 {
	
	public static void main(String args[]) {
		
		int num =  100102001; 	
		System.out.println(isPalindrome(num));
	}
	
	public static boolean isPalindrome(int x) {
        
        double i = 1;
        int j = 10;
        
        while(x >= i) {
            i *= 10;
        }    
        
        if(x < 0) 
        	return false;
        
        while(i > 10) {
            
        	if(x == 0)
        		return true;
            if(Integer.compare((int) (x / (i / 10)), x % j) != 0) {
                return false;
            } else {
            	i = i / 10;
                x = (int) (x % i);
                x = x / j;
                i = i / 10;
                
            }    
                
        }
        
        return true;
            
    }
	

	
	
}
