import java.util.LinkedList;
import java.util.List;

public class Try25 {

	public static void main(String []argh) {	
		
		String str = "abcdweq";
		
		System.out.println(isUnique(str));

	}
	
	static boolean isUnique(String str) {
		
		List<Character> storeIt = new LinkedList<>();
		
		for(char s : str.toCharArray()) {
			
			if(storeIt.contains(s)) 
				return false;
			else
				storeIt.add(s);
			
		}
			return true;
			
	}

	
}
