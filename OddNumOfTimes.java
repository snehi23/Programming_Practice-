import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* 
 * 	Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.	
 * 
 */

//How to find a number which exist odd times in a list
public class OddNumOfTimes {
	
	public static void main(String args[]) {
		
		int[] arr = {6,5,5,6,6,7,7};
		
		System.out.println(oddNumOfTimes(arr));
		
	}
	
	// better solution
//	public static Integer oddNumOfTimes(int[] arr) {
//        
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		for(int i=0; i< arr.length; i++) {
//			
//			Integer count = map.get(arr[i]); 
//			
//			if(count == null)
//				map.put(arr[i], 1);
//			else
//				map.put(arr[i], count + 1);
//			
//		}
//		
//		for(Entry<Integer, Integer> entry : map.entrySet()) {
//			
//			if(entry.getValue() % 2 != 0)
//				return (int) entry.getKey();
//			
//		}
//		
//		return null; 
//		
//		
//    }
	
	// best solution (works only for all even and one odd elements)
	public static Integer oddNumOfTimes(int[] arr) {
        
		int xor = 0;
		
		for(int i =0; i < arr.length; i++) {
			
			xor = xor ^ arr[i];
			
		}
		
		return xor;
		
    }
	
}

