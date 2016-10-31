import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Try15 {

	public static void main(String []argh) {	
	        Scanner in = new Scanner(System.in);
		    int tern=in.nextInt();
	        
		    while(tern > 0) {
		    	
			    int n=in.nextInt();
			    if(n == 0) 
			    	System.out.print("0");
			    else {
				    int bit, quotient,i = 0;
			        int [] arr = new int [32]; 
			        while(n > 0) {
			            bit = n % 2;
			            quotient = n / 2;
			            arr[i++] = bit;
			            n = quotient;
			        }
			        for( int j = i - 1; j >= 0; j--)
			        	System.out.print(arr[j]);
			    }    
		        System.out.println();
		        tern--;
		    }
	   }
	
}
