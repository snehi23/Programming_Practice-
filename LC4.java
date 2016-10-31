import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
 * 	Given an integer, convert it to a roman numeral.

	Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 
 */

//Integer to Roman
public class LC4 {
	
	public static void main(String args[]) {
		
		System.out.println(intToRoman(2001));
		
	}
	
//	public static String intToRoman(int num) {
//        
//	    Map<Integer,String> map = new HashMap<Integer,String>();
//	    List<Double> splitInt = new ArrayList<Double>();
//	    String romanStr = "";
//	    
//	    map.put(1,"I");
//	    map.put(2,"II");
//	    map.put(3,"III");
//	    map.put(4,"IV");
//	    map.put(5,"V");
//	    map.put(6,"VI");
//	    map.put(7,"VII");
//	    map.put(8,"VIII");
//	    map.put(9,"IX");
//	    map.put(10,"X");
//	    map.put(20,"XX");
//	    map.put(30,"XXX");
//	    map.put(40,"XL");
//	    map.put(50,"L");
//	    map.put(60,"LX");
//	    map.put(70,"LXX");
//	    map.put(80,"LXXX");
//	    map.put(90,"XC");
//	    map.put(100,"C");
//	    map.put(200,"CC");
//	    map.put(300,"CCC");
//	    map.put(400,"CD");
//	    map.put(500,"D");
//	    map.put(600,"DC");
//	    map.put(700,"DCC");
//	    map.put(800,"DCCC");
//	    map.put(900,"CM");
//	    map.put(1000,"M");
//	    map.put(2000,"MM");
//	    map.put(3000,"MMM");
//
//	    
//	    if(map.containsKey(num))
//	        return map.get(num);
//	    else {
//	     
//	     int i = 0;
//	     while(num != 0) {
//	         
//	        int remainder = num % 10;
//	        splitInt.add(remainder * Math.pow(10,i));
//	        num = num / 10;
//	        i++;
//	         
//	     }
//	     
//	     Collections.reverse(splitInt);
//	     
//	     for (Double val : splitInt) {
//	         if(val == 0.0)
//	            continue;
//	    	 romanStr +=  map.get(val.intValue());
//	     } 
//	     
//	        return romanStr;
//	    }    
//	        
//	 }
	
	//optimal solution
	public static String intToRoman(int num) {
		
		String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String M[] = {"","M","MM","MMM"};
		
		return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
		
	}
	
}
