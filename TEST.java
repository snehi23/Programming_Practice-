
public class TEST {
	
	public static void main(String args[]) {
		
		int n=2147483647;
		int trailingZeros = 0;
        Double divisor = 5.0;
        int i = 1;
        
        while((new Double(n / divisor).intValue()) > 0) {
                trailingZeros += (n / divisor);
                divisor = Math.pow(5,++i);
        }
        
        System.out.println(trailingZeros);
		
	}

}
