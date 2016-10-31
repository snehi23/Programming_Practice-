
// Binary Search
public class BS {

	
	public static void main(String[] args){
		
	boolean found;
	int[] elements = new int[]{1,2,3,4,5,6,34,78,90};
	
	int search_for_it = 5; 
	
	found = BinarySearch(elements,0,elements.length - 1,search_for_it);
	
	System.out.println(found);
        
	}
	
	static boolean BinarySearch(int[] elements,int start,int end, int search_for_it) {
		
		if (start <= end) {
		
		int mid = (start + end) / 2;
		
		if (elements[mid] == search_for_it) 
			return true;
		
		if (search_for_it < elements[mid]) 
			return BinarySearch(elements,start,mid -1,search_for_it);
		
		return BinarySearch(elements,mid + 1,end,search_for_it);
		
		}
		
		return false;
	}
	
}
