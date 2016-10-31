import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* 
 * 	Sort HashMap by String Values
 * 
 */


public class SortHashMapByValues {
	
	public static void main(String args[]) {
	
		Map<Integer, Character> map = new HashMap<>();
		map.put(0, 'x');
		map.put(1, 'd');
		map.put(2, 's');
		map.put(3, 'b');
		map.put(4, 'f');
		map.put(5, 't');
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(0, "snehal");
		map1.put(1, "abd");
		map1.put(2, "abf");
		map1.put(3, "snd");
		map1.put(4, "rty");
		map1.put(5, "bgp");
		
		sortHashMapByValues(map1);	
		
	}
	
	// Generic Solution
	public static <K extends Comparable<? super K>,T extends Comparable<? super T>> void sortHashMapByValues(Map<K, T> map) {
		
		List<Entry<K, T>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<K, T>>(){

			@Override	
			public int compare(Entry<K, T> o1, Entry<K, T> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		Map<K,T> sortedMap = new LinkedHashMap<K,T>(); 
		
		for (Entry<K,T> entry : list) {
			
			sortedMap.put(entry.getKey(), entry.getValue());
			
		}
		
		for (Entry<K,T> entry : sortedMap.entrySet()) {
			
			System.out.println(entry.getKey()+ " - " + entry.getValue());
			
		}	
		
	}
	
	
}
