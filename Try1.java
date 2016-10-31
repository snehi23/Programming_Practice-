import java.util.Scanner;

public class Try1 {
	
	public static void main(String[] args){
	      
		long sum =0;
		Scanner s=new Scanner(System.in);
	
	    int n=s.nextInt();
	
	    int arr[]=new int[n];
	
	    for(int i=0;i<n;i++) {
	        arr[i]=s.nextInt();
	        sum += arr[i]; 
	        	
	    }
	    
	    System.out.println(sum);
	
	 } 
}
