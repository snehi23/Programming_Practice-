import java.text.DecimalFormat;
import java.util.Scanner;

public class Try3 {
	
	public static void main(String[] args){
	    
		int pos_count = 0, neg_count = 0, zero_count = 0;
		
		DecimalFormat df = new DecimalFormat("#.######");
		
		Scanner s = new Scanner(System.in);
	
	    int n = s.nextInt();
	
	    int arr[] = new int[n];
	
	    for(int i=0;i<n;i++) {
	        arr[i]=s.nextInt();
	        if (arr[i] == 0)
	        	zero_count++;
	        else if (arr[i] < 0)
	        	neg_count++;
	        else
	        	pos_count++;
	    }
	    
	    System.out.println(df.format((double) pos_count/ n));
	    System.out.println(df.format((double) neg_count / n));
	    System.out.println(df.format((double) zero_count / n));  
		
	 } 
}
