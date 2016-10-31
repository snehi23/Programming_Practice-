/* 
 * 	
 * 
 * Given an input string, reverse the string word by word.

	For example,
	Given s = "the sky is blue",
	return "blue is sky the".
 * 
 */

//Reverse Words in a String
public class LC10 {
	
	public static void main(String args[]) {
		
		String s = " 1";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s) {
        
		if(s == "" || s == null)
            return s;
        
        String[] strArr = s.split(" ");
        StringBuffer sb = new StringBuffer();

        for(int i=strArr.length - 1; i >= 0; i--) {
            
        	if(strArr[i].length() != 0 && strArr[i] != null) {
	            if(i == 0)
	                sb.append(strArr[i]);
	            else    
	                sb.append(strArr[i]+" ");
        	}   
            
        }
        
        return sb.toString().trim();
		    
    }
	
}
