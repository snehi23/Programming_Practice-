import java.util.Scanner;

// utopian tree
public class Try8 {
	

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] print_height = new int[t];
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(); 
            print_height[a0]= treeHeight(n);
        }
        
        for(int a0 = 0; a0 < t; a0++)
        	System.out.println(print_height[a0]);
        
	}
	
	static int treeHeight(int n) {
		if(n == 0) return 1;
		if(n % 2 == 0)
			return treeHeight(n-1)+1;
		else
			return treeHeight(n-1)*2;
	}
}
