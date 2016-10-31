/* 
 * 	Merge Sort
 * 
 */

//Merge Sort
public class MergeSort {
	
	static int[] nums = {0,1,2,3,6,5,0};
	
	public static void main(String args[]) {
		
		mergeSort(nums,0,nums.length - 1);
		
		for (int el : nums) {
			System.out.println(el);
		}
	}
	
	public static void mergeSort(int[] nums,int start, int end) {
        
        int mid = (start + end) / 2;
        
        if(start < end) {
        	mergeSort(nums, start, mid);
        	mergeSort(nums, mid + 1, end);
        	merge(nums,start, mid, end);
        }
        
        
    }
	
	static void merge(int[] nums, int start, int mid, int end) {
	
		int i = 0, j = 0; 
		int k = start;
		
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		int [] a = new int[n1];
		int [] b = new int[n2]; 
		
		while(i<n1) {
			a[i] = nums[start+i];
			i++;
		}	
		
		while(j<n2) {
			b[j] = nums[mid+ 1 +j];
			j++;
		}	
		
		i = 0; j = 0; 
		
		while(i < n1 && j < n2) {
			
			if(a[i] < b[j])
				nums[k++] = a[i++];
			else
				nums[k++] = b[j++];
			
		}
		
		while(i < n1) 
			nums[k++] = a[i++];
		
		while(j < n2)
			nums[k++] = b[j++];
		
	}
	
	
}
