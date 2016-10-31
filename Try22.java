import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Try22 {

	public static void main(String []argh) {	
		
		Integer [] arr = {1,3,4,1,2,3,4,6,8,3};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		List<Integer> storeit = new LinkedList<Integer>();
		
		for(int i = 0; i< arr.length; i++)
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i],map.get(arr[i])+1);
		
		System.out.println(map.toString());
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			
			if(value % 2 == 0)
				storeit.add(key);			
		}
		
		System.out.println(storeit.toString());

	}

	
}
