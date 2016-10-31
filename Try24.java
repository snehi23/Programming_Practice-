import java.util.Arrays;

public class Try24 {

	public static void main(String []argh) {	
		
		int [] given_arr = {1,3,7,2,5,8};
		
		int sum = 13;
		
		find_sum(sum, given_arr);

	}
	
	static void find_sum(int sum, int [] given_arr) {
		
		Arrays.sort(given_arr);
		
		int first_val = given_arr[0]; 
			
			int start_pt = 1;
			int end_pt= given_arr.length - 1;
			
			while(start_pt < end_pt) {
				
				if((given_arr[start_pt] + given_arr[end_pt] + first_val) == sum ) {
					System.out.println(given_arr[start_pt]+","+given_arr[end_pt]+","+first_val);
					break;
				}	
				else if((given_arr[start_pt] + given_arr[end_pt] + first_val) < sum)
					start_pt++;
				else 
					end_pt--;
			}
		
	}

	
}
