import java.util.Arrays;
import java.util.Scanner;

public class Try13 {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int iter = in.nextInt();
        int i,j, sum = 0;
        
        int[][] output = new int[iter][];
        
        for (j = 0; j< iter; j++) {
        	int a = in.nextInt();
            int b = in.nextInt();
            int N = in.nextInt();
            output[j] = new int[N];
			for (i = 0; i < N; i++) {
				if(i == 0)
					sum = (a + (int) (b*Math.pow(2, i)));
				else
					sum += (int) (b*Math.pow(2, i));
				output[j][i] = sum;
			}
        }
        
        for(i = 0; i < iter; i++) {
        	for(j = 0;j < output[i].length;j++)
        		System.out.print(output[i][j]+" ");
        	System.out.println();
        }	
	}
	
}
