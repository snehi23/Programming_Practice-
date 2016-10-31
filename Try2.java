import java.util.Scanner;

public class Try2 {
	
	public static void main(String[] args){
	    
		int i,j, sum_primary_diagonal = 0, sum_secondary_diagonal = 0;
		Scanner s = new Scanner(System.in);
		 int size = s.nextInt();
		
		int [][] mat = new int [size][size];
		
		for (i = 0; i < mat.length; i++)
			for (j = 0; j < mat[i].length; j++)
				mat[i][j] = s.nextInt();
		
		s.close();
	
		for (i = 0; i < mat.length; i++)
			sum_primary_diagonal += mat[i][i];
		
		for (i = 0; i < mat.length; i++) 
			sum_secondary_diagonal += mat[i][mat.length - i - 1];	
		
		System.out.println(Math.abs(sum_primary_diagonal - sum_secondary_diagonal));
		
	 } 
}
