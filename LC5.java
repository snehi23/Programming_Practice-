import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
 * 	Given "abcabcbb", the answer is "abc", which the length is 3.
	Given "bbbbb", the answer is "b", with the length of 1.
	Given "pwwkew", the answer is "wke", with the length of 3. 
	Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * 
 */

//Longest Substring Without Repeating Characters
public class LC5 {
	
	public static void main(String args[]) {
		
		System.out.println(lengthOfLongestSubstring("bacadcbb"));
	}
	
	//Brute Force [Time Limit Exceeded]
//	public static int lengthOfLongestSubstring(String s) {
//        
//        char[] strToChar = s.toCharArray();
//        Set<Character> uniqueCharSet = new HashSet<Character>();
//        int maxLength = 1;
//        int currentLength = 1;
//        int j = 0;
//        
//        if(strToChar == null || strToChar.length == 0)
//            return 0;
//        
//        for(int i=0; i < strToChar.length;) {
//            
//            if(!uniqueCharSet.contains(strToChar[i])) {
//                uniqueCharSet.add(strToChar[i]);
//                i++;
//            } else {
//                       
//               currentLength = uniqueCharSet.size();                
//               if (maxLength < currentLength)       
//                    maxLength = currentLength;   
//               uniqueCharSet.clear();
//               i = j+1;
//               j = i;      
//            }
//            
//        }
//        
//        if(uniqueCharSet.size() != 0) {
//            currentLength = uniqueCharSet.size();                
//               if (maxLength < currentLength)       
//                    maxLength = currentLength; 
//        }
//            
//        return maxLength;
//        
//    }
	
	// Time: O(2n)=O(n) Space: O(min(m,n))
//	public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
	
	// Time: O(n) Space: O(min(m,n))
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
	
}
