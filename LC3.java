/* 
 * 	There are two sorted arrays nums1 and nums2 of size m and n respectively.
	Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
   
   	Example:
   	nums1 = [1, 2]
	nums2 = [3, 4]

	The median is (2 + 3)/2 = 2.5
 * 
 * 
 */

//Median of Two Sorted Arrays
public class LC3 {
	
	public static void main(String args[]) {
		
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		System.out.println(findMedianSortedArrays(nums1,nums2));
		
	}
	
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums3 = new int[nums1.length + nums2.length];
        int i=0,j=0,k=0;
        
        for(; (i < nums1.length && j < nums2.length);k++) {
            
            if(nums1[i] < nums2[j]){ 
                nums3[k] = nums1[i];
                i++;
            }    
            else {
                nums3[k] = nums2[j];
                j++;
            }    
            
        }
        
        if(i < nums1.length) {
            
            while(i<nums1.length)
                nums3[k++] = nums1[i++];
            
        }
            
        if(j < nums2.length) {
            
            while(j<nums2.length)
                nums3[k++] = nums2[j++];
            
        }
        
        if(nums3.length % 2 == 0) {
            int mid1 = nums3.length / 2;
            int mid2 = mid1 - 1;
            return (nums3[mid1] + nums3[mid2]) / 2.0;
            
        } else {
            int mid1 = nums3.length / 2;    
            return nums3[mid1] / 1.0;
        }
        
    }
	
	
	

}
