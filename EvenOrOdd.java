/* 
 * how would you find even or odd number without using divide. 
 * 
 */

public class EvenOrOdd {
	
	public static void main(String args[]) {
	
		int a = 1;
		
		System.out.println("Is Even? "+evenOrOdd(a));	
	}
	
//	public static boolean evenOrOdd(int a) {
//		
//		if((a & 1) == 0)
//			return true;
//		else
//			return false;
//		
//	}
	
	public static boolean evenOrOdd(int a) {
		
		if((a << 1)>>1 == a)
			return true;
		else
			return false;
		
	}
	
	
}
