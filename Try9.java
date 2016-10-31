import java.util.Scanner;

// find digits
public class Try9 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] find_digits = new int[t];
        int count = 0;
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(); 
            int length = String.valueOf(n).length();
            int[] digits = new int[length];
            digits = seperate_digits(n);
            	
            for(int b0 = 0; b0 < digits.length; b0++){
            	if(digits[b0] != 0)
            		if(n % digits[b0] == 0)
            			count++;
            }
            find_digits[a0] = count;
            count = 0;
        }
        
        for(int a0 = 0; a0 < t; a0++){
        	System.out.println(find_digits[a0]);
        }
        
	}
	
	static int[] seperate_digits(int n) {
		
		int length = String.valueOf(n).length();
		int[] digits = new int[length];
		
		for( int i =0; i < length; i++) {
				digits[i] = n % 10;
				n = n / 10;
		}
		return digits;
	}
	
}
