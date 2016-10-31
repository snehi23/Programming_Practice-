import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Try14 {

	public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	       
	      Map<String, Integer> phone_diary = new HashMap<String, Integer>(); 
	      String [] output = new String[100];
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         phone_diary.put(name,phone); 
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         Integer contact = phone_diary.get(s);
	         	if (contact == null)
	         		System.out.println("Not found");
	         	else
	         		System.out.println(s+"="+phone_diary.get(s));
	      }
	   }
	
}
