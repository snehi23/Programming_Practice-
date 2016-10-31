import java.io.IOException;
import java.util.Arrays;

public class Try {

	
	public static void main(String [] args) throws IOException {
		
		int ch,range, diff,x, i = 0, j = 0, count = 0;
		
		System.out.println("Enter the range: ");
		ch = System.in.read();
		range = Character.getNumericValue((char) ch);
		
		int arr[] = new int[range];
		
		System.out.println("Enter the difference: ");
		ch = System.in.read();
		diff = Character.getNumericValue((char) ch);
		
		System.out.println("Enter the numbers: ");
		
		while ((ch = System.in.read()) != '\n') {
			
			x = Character.getNumericValue((char) ch);
			arr[i++] = x;
				
		}			
		Arrays.sort(arr);
		
		for (i = 0; i < arr.length - 1; i++) {
			j = i+1;	
			if(arr[i] + diff == arr[j]) {		
				count++;				
			}		
		}
		System.out.println("Number with "+diff+" is: "+count);		
	}
	
}
