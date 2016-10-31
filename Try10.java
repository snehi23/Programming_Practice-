import java.util.Scanner;

// sherlock and squares
public class Try10 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i,count = 0;
        int[] find_digits = new int[t];
        
        for(int a0 = 0; a0 < t; a0++){
            int start = in.nextInt(); 
            int stop = in.nextInt();
            
            for(i=0; i*i < start;i++);
            while(i*i <= stop) {
            	count++; i++;
            }
            find_digits[a0] = count;
            count = 0;
        }
        
        for(int a0 = 0; a0 < t; a0++)
        	System.out.println(find_digits[a0]);
        
	}
	
}
