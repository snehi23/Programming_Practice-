import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.naming.spi.DirStateFactory.Result;


public class Try21 {

	public static void main(String []argh) {	
	 
		String str= "13+62*7+*";
		System.out.println(solution(str));
	}
	
	public static int solution(String str) { 
		
		char[] A = str.toCharArray();
		
		Stack st = new Stack();
		
		int result = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			if(A[i] == '0' ||A[i] == '1'||A[i] == '2'||A[i] == '3'||A[i] == '4'||A[i] == '5'||A[i] == '6'||A[i] == '7'||A[i] == '8'||A[i] == '9')
				st.push(A[i]);
			else {	
				int a = Character.getNumericValue((char)st.pop());
				int b = Character.getNumericValue((char)st.pop());
				if(A[i] == '+') {
					result = a + b;
					st.push(result);
				}	
				if(A[i] == '-') {
					result = a - b;
					st.push(result);
				}	
				if(A[i] == '*') {
					result = a * b;
					st.push(result);
				}	
				if(A[i] == '/') {
					result = a / b;		
					st.push(result);
				}	
			}	
			
		}
		
		return result;
	}
	
}
