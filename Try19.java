import java.math.BigInteger;

public class Try19 {

	public static void main(String []args) {	
	 
		long[] array = {3,5,6,7,345674478};
		solution(array);
	}
	
	public static void solution(long[] A) { 
		
		BigInteger[] maxProducts = new BigInteger[A.length];
		
		for(int i = 0; i < A.length; i++) { 
			
			long sum = A[i];
			BigInteger maxProduct = BigInteger.valueOf(0);
			for(int j = 1; j <= sum/2; j++) {
				long x = sum - j;
				long y = j;
				BigInteger product = BigInteger.valueOf(x*y);
				if(maxProduct.longValue() < product.longValue())
					maxProduct = product;
				
			}
			maxProducts[i] = maxProduct;		
		} 

		for(int i = 0; i < maxProducts.length; i++)
			System.out.println(maxProducts[i]);
		
		
	}
	
}
