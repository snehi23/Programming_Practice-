import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
 * 	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 *  Find all unique triplets in the array which gives the sum of zero.
 * 
 */

//3Sum
public class LC7 {
	
	public static void main(String args[]) {
		
		int[] arr = {0,7,-4,-7,0,14,-6,-4,-12,11,4,9,7,4,-10,8,10,5,4,14,6,0,-9,5,6,6,-11,1,-8,-1,2,-1,13,5,-1,-2,4,9,9,-1,-3,-1,-7,11,10,-2,-4,5,10,-15,-4,-6,-8,2,14,13,-7,11,-9,-8,-13,0,-1,-15,-10,13,-2,1,-1,-15,7,3,-9,7,-1,-14,-10,2,6,8,-6,-12,-13,1,-3,8,-9,-2,4,-2,-3,6,5,11,6,11,10,12,-11,-14};
		
		System.out.println(threeSum(arr).toString());
	}
	
//	public static List<List<Integer>> threeSum(int[] nums) {
//        
//        int arrSize = nums.length;
//        Map<Integer, List<Set<Integer>>> twoSumContainer = new HashMap<Integer, List<Set<Integer>>>();
//        int sum = 0;
//        
//        for(int i=0; i<arrSize; i++) {
//            
//            for(int j=i+1; j<arrSize; j++) {
//                
//                sum = nums[i] + nums[j];
//                Set<Integer> pair = new HashSet<Integer>();
//                pair.add(i);
//                pair.add(j);
//                List<Set<Integer>> listofPairs = twoSumContainer.get(sum); 
//                if(listofPairs == null)
//                	listofPairs = new ArrayList<Set<Integer>>();
//                listofPairs.add(pair);
//                twoSumContainer.put(sum, listofPairs);
//                
//            }
//            
//        }
//        
//        Set<Integer> uniquesPairs;
//        Set<Set<Integer>> listOfUniquesPairs = new HashSet<Set<Integer>>();
//        
//        for(int i=0; i<arrSize; i++) {
//            
//        	List<Set<Integer>> listOfPairs = new ArrayList<Set<Integer>>();
//        	
//            if(nums[i] == 0)
//            	listOfPairs = (twoSumContainer.get(nums[i])); 
//            else 
//            	listOfPairs = (twoSumContainer.get(-nums[i]));
//            
//            if(listOfPairs != null) {
//	            for(Set<Integer> pair : listOfPairs) {
//	            
//	                if(!pair.contains(i)) {
//	                	Set<Integer> p = new HashSet<>();
//	                	p.addAll(pair);
//	                	p.add(i);
//	                    uniquesPairs = new HashSet<Integer>();
//	                    uniquesPairs.addAll(p);
//	                    listOfUniquesPairs.add(uniquesPairs);
//	                }    
//	                
//	            }
//            }
//        } 
//        
//        Set<List<Integer>> n = new HashSet<List<Integer>>();
//       
//        for (Set<Integer> m : listOfUniquesPairs) {
//        	
//        	List<Integer> d = new ArrayList<>(); 
//        	for (Integer integer : m) {
//        		
//        		d.add(nums[integer]);
//				
//			}  	
//        	Collections.sort(d);
//        	n.add(d);
//		}
//        
//        
//        return new ArrayList<List<Integer>>(n);
//        
//    }
	
	//Optimal Solution
	public static List<List<Integer>> threeSum(int[] nums) {
	
		Arrays.sort(nums);
		
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		
		for(int i = 0; i < nums.length - 2; i++) {
			
			int low = i+1, high = nums.length - 1, sum = 0 - nums[i];
			while(low < high) {
				
				if(nums[low] + nums[high] == sum) {
					listOfList.add(Arrays.asList(nums[i],nums[low],nums[high]));
					while(nums[low] == nums[low + 1]) low++;
					while(nums[high] == nums[high - 1]) high--;
					low++; high--;
				} 
				else if(nums[low] + nums[high] < sum) low++;
				else high--;
				
			}
		}
		
		return listOfList;
		
			
	}
	
	
}
