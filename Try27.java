
public class Try27 {

	public static void main(String []argh) {	
		
		int a = 1104;
		int b = 1119;
		int storeA = 1104;
		int StoreB = 1119;
		int gcd = 0; 
		
		if(a == 0 || b == 0)  // base case
			gcd = 0;
		else {	
			while(a!=0 && b!=0) // until either one of them is 0
			  {
			     int c = b;
			     b = a%b;
			     a = c;
			  }
			gcd = a+b;
		}	
		System.out.println(storeA/gcd+"/"+StoreB/gcd);
		
	}

	
}
