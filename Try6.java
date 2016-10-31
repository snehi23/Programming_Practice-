import java.util.Scanner;


public class Try6 {
	
	public enum decision {YES,NO;}
	
	public static void main(String[] args){
		int count = 0;
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        decision[] output = new decision[t];
        
        for(int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            
            count = 0;
            
            for(int a_i=0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0)
                	count++;
            }
            
            if (count >= k)
            	output[a0] = decision.NO;
            else
            	output[a0] = decision.YES;   
        }
        
        for(int a0 = 0; a0 < t; a0++)
        	System.out.println(output[a0].name());
	} 
}
