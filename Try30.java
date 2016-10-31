import java.util.Arrays;
import java.util.List;

public class Try30 {

	public static void main(String []argh) {	
		
		String s = "3,100";
		List<String> range = Arrays.asList(s.split(","));
		int a = Integer.parseInt(range.get(0));
		int b = Integer.parseInt(range.get(1));
		int flag;
		int count = 0;
		int swap;
		
		if(a > b){
			swap = a;
			a = b;
			b = swap;
		}	
		
		if(a < 2)
			a = 2;
			
		
		  for(int i = a; i <= b; i++)
		  {
		      flag=0;
		      for(int j = 2; j <= i/2; j++)
		      {
		    	if(i == 0 || i == 1)  
		    		continue;
		        if(i%j == 0)
		        {
		          flag = 1;
		          break;
		        }
		      }
		      if(flag == 0)
		        count++;
		  }		
		

		  System.out.println(count);
		
	}

}
