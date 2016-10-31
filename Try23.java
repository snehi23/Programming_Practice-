import java.util.HashMap;
import java.util.Map;

public class Try23 {

	public static void main(String []argh) {	
		
		String str1 = "aaba";
		String str2 = "xxyx";
		System.out.println(isIsomorphic(str1,str2));		

	}
	
	static Boolean isIsomorphic(String str1, String str2) {
		
		Map<Character, Boolean> mapping = new HashMap<Character, Boolean>();
		
		for(int i = 0; i < str1.length(); i++) {
			
			if(mapping.containsKey(str1.charAt(i)) && mapping.containsKey(str2.charAt(i)))
				continue;
			else if(!mapping.containsKey(str1.charAt(i)) && !mapping.containsKey(str2.charAt(i))) {
				mapping.put(str1.charAt(i), true);
				mapping.put(str2.charAt(i), true);
			}	
			else
				return false;
			
		}
		return true;
		
	}
	

	
}
