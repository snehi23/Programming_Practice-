import java.util.Scanner;

public class Try4 {
	
	public static void main(String[] args){
	   
		int i;
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		StringBuilder old_str = new StringBuilder("");
		
//		 for(i=0;i<n;i++) {
//			 old_str.append(" "); 		    	
//		 }
//		 
//		 for(i= n-1; i>=0;i--) {
//	    	old_str.setCharAt(i, '#');
//	    	System.out.println(old_str);
//		 }
		 
		 
		 for(int j=n - 1; j >= 0; j--) {
		        
		        for(int k=0; k < n; k++) {

		            if(k>=j) 
		                System.out.print("#");
		            else
		                System.out.print(" ");
		        }
		        System.out.println("");
		        
		   }
	 } 
}
