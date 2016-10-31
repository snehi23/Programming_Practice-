import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* 
 * 	Maximum difference between two elements such that larger element appears after the smaller number
 * 
 */

public class ReverseString {
	
	public static void main(String args[]) {
	
		String str = "snehal";
		
		System.out.println(reverseString(str));	
	}
	
	public static String reverseString(String str) {
		
		TreeMap<Integer, Character> map = new TreeMap<Integer, Character>();
		
		int index = 0;
		
		for (char i : str.toCharArray())	
			map.put(index++, i);
		
		NavigableMap<Integer, Character> nmap= map.descendingMap();
		
		StringBuffer sb = new StringBuffer(); 
		
		for (Character ch : nmap.values())
			sb.append((ch));
		
		return sb.toString();
		
		
	}
	
	
}
