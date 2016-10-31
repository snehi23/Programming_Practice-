import java.util.Arrays;

public class Try26 {

	public static void main(String []argh) {	
		
//		String str = "aabbaa";
//		StringBuffer cs = new StringBuffer();	
//		char element = str.charAt(0);
//		
//		int count = 1;
//		
//		for(int i = 1; i < str.length(); i++) {
//			
//			if(str.charAt(i) == element)
//				count++;	
//			else {
//				cs.append(element);
//				cs.append(count);
//				count = 1;
//				element = str.charAt(i);
//			}
//			
//		}
//		cs.append(element);
//		cs.append(count);
//		
//		System.out.println(cs);
		
		String str="";
		if(!str.isEmpty()) {
			str = str.toLowerCase();
	        char[] chars = str.toCharArray();
	        Arrays.sort(chars);
	        str = new String(chars);
			
			StringBuffer cs = new StringBuffer();	
			char element = str.charAt(0);
			
			int count = 1;
			
			for(int i = 1; i < str.length(); i++) {
				
				if(str.charAt(i) == element)
					count++;	
				else {
					cs.append(element);
					cs.append(count);
					count = 1;
					element = str.charAt(i);
				}
				
			}
			cs.append(element);
			cs.append(count);
			
			System.out.println(cs);
	    }
	}

	
}
