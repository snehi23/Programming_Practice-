
public class Try18 {

	public static void main(String []args) {	
	 
		System.out.println(isitpossible(1,4,5,9));
	}
	
	static String isitpossible(int a, int b, int c, int d) {
        
		if(a < c)
			isitpossible(a+b, b, c, d);
		
		if(b < d)
			isitpossible(a, b+a, c, d);

		if(a == c && b == d)
			return "Yes";

		return "No";

	}
	
}
