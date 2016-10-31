import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.w3c.dom.events.EventTarget;

/* 
 * 	Finding Key associated with max Value in a Java Map
 * 
 */

public class MaxValueInHashMap {
	
	public static void main(String args[]) {
	
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		map.put(1, 4);
		map.put(2, 6);
		map.put(3, 3);
		map.put(4, 9);
		map.put(5, 2);
		
		System.out.println(maxValueInHashMap(map));	
	}
	
	public static Integer maxValueInHashMap(Map<Integer, Integer> map) {
		
		int maxValue = 0,maxKey = 0;
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();	
			}			
			
		}
	
		return maxKey;		
		
	}
	
	
}
