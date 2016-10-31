import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try28 {

	public static void main(String []argh) {	
		
		ArrayList<String> output = new ArrayList<String>();
		String [] data = {"4/6","160/28"};
		 
        for(int i = 0; i < data.length; i++) {
            String input = data[i];
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(input);
            Integer y = 0;
            Integer z = 0;
            while (m.find()) {
            	y = Integer.parseInt(m.group(1));         
            }	
            while (m.find()) {
            	z = Integer.parseInt(m.group(2));         
            }
                Integer storeY = 0;
                Integer storeZ = 0;
        
                while(y!=0 && z!=0)
  			  	{
                	int s = z;
                	z = y%z;
                	y = s;
  			  	}
                int gcd = y+z;
                output.add(storeY/gcd+"/"+storeZ/gcd);  
        }

        }  
		
	}
