import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
 * 	Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 * 
 */

//Longest Palindromic Substring
public class LC6 {
	
	public static void main(String args[]) {
		
		System.out.println(longestPalindrome("noonnon"));
	}
	
	public static String longestPalindrome(String s) {
        
        char[] inputCharArr = s.toCharArray();
        int start = 0, end = 1;
        int max = 0;
        String largestPalindrome = "";
        
        if(inputCharArr.length == 1) 
        	return String.valueOf(inputCharArr[0]);
        
        for(int position = 0; position < inputCharArr.length; position++) {
        	start = position;
	        end = start + 1;
	        while(end < inputCharArr.length) {
	            
	            if(isPalindrome(inputCharArr,position,end)) {
	                
	                if(max < (end - position)) {
	                    max = end - position;
	                    largestPalindrome = new String(inputCharArr, position, end - position + 1); 
	                }    
	                
	            }
	            if(end+1 < inputCharArr.length) {
		            if(isPalindrome(inputCharArr,position,end + 1)) {
		            	
		            	if(max < (end + 1 - position)) {
		                    max = end + 1 - position;
		                    largestPalindrome = new String(inputCharArr, position, end  + 1 - position + 1); 
		                } 
		            	
		            }
	            }
	            
	            start = start + 1; 
	            end = (start - position) + start + 1;
	            
	        }
        }
        return largestPalindrome;
        
    }
    
    static boolean isPalindrome(char[] inputCharArr, int position, int end) {
        
    	int start = position;
        while(start<=end) {
            
            if(inputCharArr[start++] != inputCharArr[end--])
                return false;
            
        }
        
        return true;
        
    }
	
}
