import java.util.HashMap;
import java.util.Map;

/* 
 * 	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   	You may assume that each input would have exactly one solution.
   
   	Example:
   	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 * 
 * 
 */


public class LC1 {
	
	public static void main(String args[]) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] index = twoSum(nums,target);
		
		System.out.println(index[0]);
		System.out.println(index[1]);
		
	}
	
	
	// Brute Force TC : O(n^2) SC : O(1) 	
//	public static int[] twoSum(int[] nums, int target) {
//        
//        for(int i=0; i < nums.length; i++) {
//            for(int j=0; j <nums.length; j++) {
//                if(i==j)
//                    continue;
//                if(nums[i] + nums[j] == target)
//                    return new int[] {i,j};   
//            }
//        }
//        throw new IllegalArgumentException("Never sum to given target");
//        
//    }
	
	// Two pass hash table TC : O(n) SC : O(n) 	
//	public static int[] twoSum(int[] nums, int target) {
//        
//		HashMap<Integer, Integer> map = new HashMap<>(); 
//		
//		for(int i=0; i < nums.length; i++)
//			map.put(nums[i],i);
//		
//		for(int i=0; i <nums.length; i++) {
//			
//			int complement = target - nums[i];
//			if(map.containsKey(complement) && map.get(complement) != i)
//					return new int[] {i, map.get(complement)};
//			
//		}
//        
//        throw new IllegalArgumentException("Never sum to given target");
//        
//    }
//	
	// One pass hash table TC : O(n) SC : O(n) 	
	public static int[] twoSum(int[] nums, int target) {
        
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		for(int i=0; i <nums.length; i++) {
			
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i)
					return new int[] {i, map.get(complement)};
			
			map.put(nums[i],i);
			
		}
        
        throw new IllegalArgumentException("Never sum to given target");
        
    }
	
	
	

}
