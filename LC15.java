import java.util.Stack;

/* 
 * 	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.	
 * 
 */

//Valid Parentheses
public class LC15 {
	
	public static void main(String args[]) {
		
		String s = "({)}[]";
		
		System.out.println(isValid(s));
		
		
	}
public static boolean isValid(String s) {
        
        if(s == null)
            return false;
        
        Stack<Character> st = new Stack<Character>();
        
        char[] arr = s.toCharArray();
        
        for(int i=0; i< arr.length; i++) {
            
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                    st.push(arr[i]);
            } else if(arr[i] == ')'){
                    if(st.peek() == '(')
                        st.pop();
                    else
                        return false;
                
            } else if(arr[i] == '}') {
                    if(st.peek() == '{')
                    	st.pop();
                    else
                        return false;
                
                
            } else if(arr[i] == ']') {
                    if(st.peek() == '[')
                    	st.pop();
                    else
                        return false;
                
            } else
                return false;
            
        }
        
        if(st.empty())
            return true;
        else
            return false;
        
    }
	
}	