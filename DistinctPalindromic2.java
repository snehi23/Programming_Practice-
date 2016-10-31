import java.math.BigInteger;

public class DistinctPalindromic2 {

public static void main(String[] args) {

	String[] arr = {"abaaax","x"};
	DistinctPalindromic2.mystery(arr);

}

public static void mystery(String[] letter) {
	
	BigInteger[] minoparr  = new BigInteger[letter.length];
	
	for(int i = 0; i < letter.length; i++) {
		
		if(checkPalindrome(letter[i]))
			minoparr[i] = BigInteger.valueOf(0);
		else 
			minoparr[i] = fixPalindrome(letter[i]);	
	}
	
	for(int i = 0; i < minoparr.length; i++)
		System.out.println(minoparr[i]);

}
 

static boolean checkPalindrome(String s1) {
	
	StringBuilder storeString = new StringBuilder();
	StringBuilder str = new StringBuilder();
	StringBuilder revStr = new StringBuilder();
	
	storeString.append(s1);
	str.append(s1);
	revStr.append(storeString.reverse());
	
	if(str.toString().equals(revStr.toString()))
		return true;
	return false;
	
}

static BigInteger fixPalindrome(String s1) {
	
	StringBuilder storeString = new StringBuilder();
	StringBuilder str = new StringBuilder();
	StringBuilder revStr = new StringBuilder();
	BigInteger count = BigInteger.valueOf(0);
	
	storeString.append(s1);
	str.append(s1);
	revStr.append(storeString.reverse());
	
	for(int i = 0;i < str.length()/2;i++) {
		if(str.charAt(i) <= revStr.charAt(i))
			count = BigInteger.valueOf(revStr.charAt(i) - str.charAt(i)).add(count);
		else
			count = BigInteger.valueOf(26 + revStr.charAt(i) - str.charAt(i)).add(count);		
	}
	return count;	
	
}

}