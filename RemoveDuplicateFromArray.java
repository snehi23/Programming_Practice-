import java.util.HashMap;
import java.util.Map;

/* 
 * 	Remove Duplicates from Array
 * 
 */


public class RemoveDuplicateFromArray {
	
	public static void main(String args[]) {
	
		Integer [] arr = {1,2,2,3,4,5,6,8,9,2,6,0};
		
		System.out.println(removeDuplicateFromArray(arr).toString());	
		
	}
	
	public static Integer[] removeDuplicateFromArray(Integer[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int i = 0;
		
		for(int el: arr)
			map.put(el, i++);
		
		return map.keySet().toArray(new Integer[0]);		
	}
	
	
}
