import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Try29 {

	public static void main(String []argh) {	
		
		String s = "15.93;16.00";
		Map<Double, String> values = new HashMap<Double, String>();
		values.put(.01,"PENNY");
		values.put( .05,"NICKEL");
		values.put(.10,"DIME");
		values.put(.25,"QUARTER");
		values.put(.50,"HALF DOLLAR");
		values.put(1.00,"ONE");
		values.put(2.00,"TWO");
		values.put(5.00,"FIVE");
		values.put(10.00,"TEN");
		values.put(20.00,"TWENTY");
		values.put(50.00,"FIFTY");
		values.put(100.00,"ONE HUNDRED");
		
		List<String> priceList = Arrays.asList(s.split(";"));
		List<String> output = new ArrayList<String>();
	
			Double PP = Double.parseDouble(priceList.get(0));
			Double CH = Double.parseDouble(priceList.get(1));
		
		if(PP > CH)
			System.out.println("ERROR");
		else if(PP.equals(CH))
			System.out.println("ZERO");
		else {
			
			Double diff = CH - PP;
			diff = Math.round(diff*100.0)/100.0;
			
			if(values.containsKey(diff))
				System.out.println(values.get(diff));
			else {
				while(diff > 0.00d) {
					Double getVal = findValue(values, diff);
					output.add(values.get(getVal));
					diff = diff - getVal;
					diff = Math.round(diff*100.0)/100.0;
				}
				Iterator<String> it = output.iterator();
				if (it.hasNext()) {
				    System.out.print(it.next());
				}
				while (it.hasNext()) {
				    System.out.print("," + it.next());
				}
						
			}
			
			
		}
			
		
	}
	
	static Double findValue(Map<Double, String> values, Double diff) {

		ArrayList<Double> intKeys = new ArrayList<Double>(values.keySet());
		Collections.sort(intKeys);
		
		Double value = Math.round(diff*100.0)/100.0;
		for(int i = intKeys.size() - 1; i >= 0; i--) {
			
			int j = Double.compare(value, intKeys.get(i));
				
			if( j >= 0)
				return intKeys.get(i);
	
		}
		return 0.0;
	}	
		
	}
