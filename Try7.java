import java.util.Scanner;

// sherlock and beast
public class Try7 {
	

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        StringBuilder[] sb = new StringBuilder[t];
        
        for(int a0 = 0; a0 < t; a0++) {
	        int n = in.nextInt();
	        int pivot = getPivot(n);
	        sb[a0] = new StringBuilder("");
	        if(pivot < 0)
	        	sb[a0].append("-1");
	        else {
	        	
	        	int repeat = pivot / 3;
	        	while(repeat!=0){ 
	        		sb[a0].append("555");
	        		repeat--; 
	        	}	
	        	repeat = (n - pivot)/5; 
	        	while(repeat!=0){
	        		sb[a0].append("33333");
	        		repeat--; 
	        	}	
	        }
        }
        
        for(int a0 = 0; a0 < t; a0++)
        	System.out.println(sb[a0]);
        
	} 
	
	static int getPivot(int n) {
		
		while( n > 0) {
			 if (n % 3 == 0) 
				 break;
			 else
				 n -=5;
		}
		return n;
	}
}
