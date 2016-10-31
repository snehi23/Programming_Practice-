
public class Try12 {

	public static void main(String[] args){
		
		String str1 = "aaba";
		char[] charArray1 = str1.toCharArray();
		String str2 = "xxrx";
		char[] charArray2 = str2.toCharArray();
		int i;
		
		
		for (i = 1; i < str1.length(); i++) {
			
			if ((charArray1[i-1] == charArray1[i] && charArray2[i-1] == charArray2[i]) || (charArray1[i-1] != charArray1[i] && charArray2[i-1] != charArray2[i]))
				continue;
			else 
				System.out.println("Not Isomorphic");
		}
		
		
        
	}
	
}
